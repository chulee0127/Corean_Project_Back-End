package com.corean.www.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.corean.www.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@PostMapping(value="/search/one")
	public ModelAndView boardListGet(@RequestBody HashMap<String, Object> params) {
		
		System.out.println("파라미터 전송 :: "+params);
		
		ModelAndView mav = new ModelAndView("jsonView");
		
		String resultCd = "0000";

		try {
			
			System.out.println("결과 ::: "+mainService.oneSearch(params));
			
		} catch (Exception ex) {
			resultCd = "9999";
			ex.printStackTrace();
		} finally {
			mav.addObject("resultCd", resultCd);
		}

		return mav;
	}
	
}
