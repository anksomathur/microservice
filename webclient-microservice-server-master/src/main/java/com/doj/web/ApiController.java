package com.doj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.feign.proxy.service.AccountServiceProxy;

@RestController	
public class ApiController {
	
	/*
	 * @Autowired AccountRepository accountRepository;
	 */
	
	  @Autowired
	  AccountServiceProxy accountServiceProxy;
	 
	
	
	
	@GetMapping("/accountListOnly")
	@ResponseBody
	public List<Account> getAccountList(){
		System.out.println("|||||||||||||||||||||||||||||||||||||||||");
		return accountServiceProxy.getAccountList();
	}

}
