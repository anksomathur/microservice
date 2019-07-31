package com.feign.proxy.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.cloud.openfeign.FeignClient;

import com.doj.web.Account;


@FeignClient("accounts-microservice")
public interface AccountServiceProxy {
	 @RequestMapping(method = RequestMethod.GET, value = "/accounts")
	  public List<Account> getAccountList();

}
