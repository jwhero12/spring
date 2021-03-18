package kr.ac.inhatc.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class num {
	@RequestMapping("num")
	public String num(int num) {      
		String temp = "";
		for (int i=1;i<10;i++){
			temp += num+"*"+i+"="+num*i+" ";
			}
		return temp;
		}
	}
