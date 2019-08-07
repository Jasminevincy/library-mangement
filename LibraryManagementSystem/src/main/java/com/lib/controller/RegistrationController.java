package com.lib.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lib.model.UserBean;
import com.lib.service.UserServiceImpl;


@Controller
public class RegistrationController {
	
	
	@RequestMapping("/LibrarianRegister")
	String Librarian() {
		return "LibrarianRegister";
	}
 
	UserServiceImpl userservice= new UserServiceImpl();
 
  
  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new UserBean());
    return mav;
  }
	
	
  @RequestMapping(value = "/LibrarianRegister", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("librarianregister") UserBean user) {
	  userservice.register(user);
	  ModelAndView mav= new ModelAndView("Welcome");
	  return mav;
  }
}
