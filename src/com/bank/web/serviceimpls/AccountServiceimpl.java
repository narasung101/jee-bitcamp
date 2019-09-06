package com.bank.web.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import com.bank.web.domains.AccountBean;
import com.bank.web.services.AccountService;


public class AccountServiceimpl implements AccountService {

	private List<AccountBean> accounts;
		
		
	public AccountServiceimpl() {
		
		accounts = new ArrayList<>();
		
	}

	@Override
	public void createAccount(int money) {
		AccountBean acc = new AccountBean();
		acc.setMoney(String.valueOf(money));
		acc.setAccountNum(createAccountNum());
		acc.setToday(findDate());
		System.out.println(acc.toString());
		accounts.add(acc);
	}
		
	
	@Override
	public String createAccountNum() {
		String accountNum = "";
		Random ran = new Random();
		for(int i = 0; i < 9 ; i++) {
			accountNum += (i==4)? "-" :ran.nextInt(10);
		}
		
		return accountNum;
	}

	@Override
	public List<AccountBean> findAll() {
			return accounts;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean acc = new AccountBean();
		for(AccountBean a : accounts) {
			if(accountNum.equals(a.getAccountNum())) {
				acc = a;
			}
		}
		return acc;
	}

	@Override
	public int countAccounts() {
			return accounts.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		AccountBean a = findByAccountNum(accountNum);
		return accounts.contains(a);
	}

	@Override
	public String findDate() {
				return new SimpleDateFormat("yyyy-MM-dd hh:mm")
				.format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		AccountBean a = findByAccountNum(param.getAccountNum());
		int budget = Integer.parseInt(a.getMoney()) + Integer.parseInt(param.getMoney());
		int index = accounts.indexOf(a);
		accounts.get(index).setMoney(String.valueOf(budget));
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		AccountBean a = findByAccountNum(param.getAccountNum());
		int budget = Integer.parseInt(a.getMoney()) - Integer.parseInt(param.getMoney());
		int index = accounts.indexOf(a);
		accounts.get(index).setMoney(String.valueOf(budget));
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		AccountBean a = findByAccountNum(accountNum);
		accounts.remove(a);
		
	}
	

}
