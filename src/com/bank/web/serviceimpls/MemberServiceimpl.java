package com.bank.web.serviceImpls;

import java.util.ArrayList;
import java.util.List;

import com.bank.web.daoImpls.MemberDaoImpl;
import com.bank.web.daos.MemberDao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.MemberService;


public class MemberServiceImpl implements MemberService{
	private MemberDao dao;
	
	public MemberServiceImpl() {
		dao = new MemberDaoImpl();
	}


	@Override
	public void join(CustomerBean param) {
		dao.insertCustomer(param);
	}
	
	@Override
	public CustomerBean login(CustomerBean param) {
		return dao.login(param);
	}

	
}
	
	
	
	
	/** private List<CustomerBean> customers;
	private List<EmployeeBean> employees;	
	
	public MemberServiceimpl() {
		
		customers = new ArrayList<>();
		employees = new ArrayList<>();
		
	}

	@Override
	public void join(CustomerBean param) {
		customers.add(param);
		
	}

	@Override
	public void register(EmployeeBean param) {
		employees.add(param);
		
	}

	@Override
	public List<CustomerBean> findAllCustomers() {
		
		return customers;
	}

	@Override
	public List<EmployeeBean> findAllAdmins() {
		
		return employees;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> members = new ArrayList<>();
		int count = 0;
		
		for(CustomerBean c : customers) {
			if(name.equals(c.getName())){
				count++;
			}
			
		}
		for(EmployeeBean e : employees) {
			if(name.equals(e.getName())){
				count++;
			}
		}
				int j = 0;
				for(CustomerBean c : customers) {
					if(name.equals(c.getName())) {
						members.add(c);
						j++;
						if(j==count) {
							return members;
						}
					}
									
				}
				for(EmployeeBean e : employees) {
					if(name.equals(e.getName())) {
						members.add(e);
						j++;
						if(j==count) {
							break;
							
						}
					}
				}
		return members;
				
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean m = new MemberBean();
		for(CustomerBean c : customers) {
			if(id.equals(c.getId())) {
				m = c;
				break;
			}
		}
		for(EmployeeBean e : employees) {
			if(id.equals(e.getId())) {
				m = e;
				break;
			}
		}
		return m;
	}

	@Override
	public CustomerBean login(MemberBean param) {
		
			
		return null;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return customers.size();
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return employees.size();
	}

	@Override
	public boolean existId(String id) {
		
		MemberBean m = findById(id);
		
		return (employees.contains(m) || customers.contains(m));
	}

	@Override
	public void updatePass(MemberBean param) {
		String id = param.getId();
		String oldPw = param.getPw().split(",")[0];
		String newPw = param.getPw().split(",")[1];
		MemberBean m = findById(id);
		int idx = (employees.contains(m))
				?employees.indexOf(m)
						: customers.indexOf(m);
		
		
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		if(existId(param.getId())) {
			if(employees.contains(param))
				{}
			
		}			
		
		
	}

} */
