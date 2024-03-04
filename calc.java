package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class calc {
              
	        @RequestMapping("add{num1}and{num2}")
	        public int add(@PathVariable int num1,@PathVariable int num2)
	        {
	        	return num1+num2;
	        }
	        
}
