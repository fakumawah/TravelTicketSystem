/**
 * 
 */
package com.hexa.tts.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fruaku
 * @date 08.09.2014 01:45:45
 */
//@Controller
public class LoginController
{
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	/**
	 * 
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("LoginController.home(..)");
		
		model.addAttribute("title", "Hexa HOME");
		model.addAttribute("message", "Some message" );
		
		return "index";
	}
	
	/**
	 * 
	 * @param model
	 * @param loginError
	 * @return
	 */
	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public String login(Model model, @RequestParam(required=false, value="login_error") String loginError) {
		System.out.println("*** GET PARAM WAS [" + loginError + "] ***");
		if ("1".equals(loginError)) {
			model.addAttribute("loginError", true);
		}
		return "login";
	}
	
	/**
	 * 
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		logger.info("HomeController.register(..)");
		
		model.addAttribute("title", "Hexa REGISTRATION");
		model.addAttribute("message", "UNSECURED AREA" );
		
		return "register";
	}
	
}
