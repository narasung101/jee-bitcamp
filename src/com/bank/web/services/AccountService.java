    
package com.bank.web.services;
import java.util.List;

import com.bank.web.domains.AccountBean;

public interface AccountService {
	public void createAccount(int money);
	public String createAccountNum();
	public List<AccountBean> findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccounts();
	public boolean existAccountNum(String accountNum);
	String findDate(); 
	public void depositMoney(AccountBean param);
	public void withdrawMoney(AccountBean param);
	public void deleteAccountNum(String accountNum);

}