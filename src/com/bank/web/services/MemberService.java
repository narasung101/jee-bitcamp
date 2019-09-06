package com.bank.web.services;
import com.bank.web.domains.MemberBean;

import java.util.List;

import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;

public interface MemberService {
	public void join(CustomerBean param);
	public void register(EmployeeBean param);
	public List <CustomerBean> findAllCustomers();
	public List <EmployeeBean> findAllAdmins();
	public List <MemberBean> findByName(String name);
	public MemberBean findById(String id); 
	public CustomerBean login(MemberBean param);
	public int countCustomers(); 
	public int countAdmins(); 
	//public void register()
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public void deleteMember(MemberBean param);
}