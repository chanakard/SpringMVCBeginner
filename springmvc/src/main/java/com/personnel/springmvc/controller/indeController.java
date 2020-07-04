package com.personnel.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.personnel.springmvc.dao.FeedbackDAO;
import com.personnel.springmvc.entity.FeedBack;

@Controller
public class indeController {

	@Autowired
	FeedbackDAO objFeedbackDAO;
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/feedback")
	public String feedback()
	{
		return "feedback.jsp";
	}
	
	@RequestMapping("/addFeedback")
	public String addFeedBack(@ModelAttribute("feedback") FeedBack fb)
	{
		objFeedbackDAO.addFeedback(fb);
		return "";
	}
	
	@RequestMapping("/getFeedbacks")
	public ModelAndView getFeedbacks()
	{
		ModelAndView mv = new ModelAndView("feedbacks.jsp");
		
		mv.addObject("feedbacks",objFeedbackDAO.getFeedbacks());
		
		return mv;
	}
}
