/**
 * 
 */
package com.doj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping("/")
	public String home(){
		System.out.println("((((((((((((((((((((((((((((((((((((((((");
		return "index";
	}
	@RequestMapping("/accountList")
	public String accountList(Model model) {
		System.out.println("*********************************************");
		model.addAttribute("accounts", accountRepository.getAllAccounts());
		return "accountList";
	}
	
	@RequestMapping("/accountDetails")
	public String accountDetails(@RequestParam("number") String id, Model model) {
		model.addAttribute("account", accountRepository.getAccount(id));
		return "accountDetails";
	}
	
}
