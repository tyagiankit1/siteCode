package com.example.demo.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunCtrl {

	 @RequestMapping(value = "/testFunction" , method = RequestMethod.GET)
	 public String testJavaFun(){
		 return "Data Success Sent.......";
	 }
	 
}
