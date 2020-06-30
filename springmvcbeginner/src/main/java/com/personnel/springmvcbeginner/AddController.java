package com.personnel.springmvcbeginner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.personnel.springmvcbeginner.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("I am here");
		int val1 = Integer.parseInt(req.getParameter("val1"));
		int val2 = Integer.parseInt(req.getParameter("val2"));
		
		AddService objAS = new AddService();
		
		ModelAndView objMAV = new ModelAndView();
		objMAV.setViewName("Display.jsp");
		objMAV.addObject("result",objAS.add(val1, val2));
		return objMAV;
	}
}
