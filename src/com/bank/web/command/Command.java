package com.bank.web.command;
import  javax.servlet.http.HttpServletRequest;
import com.bank.web.pool.Constants;
import lombok.Data;
@Data
public class Command implements Order{
   protected HttpServletRequest request;
   protected String action, domain, page, view;
   @Override
   public void execute(){
	// System.out.println("리퀘스트가 가야할 길 :::" +String.format(Constants.VIEW_PATH, domain, page));
	  setDomain();
      setPage();
      this.view =  String.format(Constants.VIEW_PATH,  domain, page);     
   }
   public void setDomain() {
	//  System.out.println("서블릿 패스가 뭘까: " +path);
	  String path =  request.getServletPath(); // ---> customer.do
      domain = path.replace(".do",""); // --> .do 를 제거해라
      domain = domain.substring(1); //-->  다음 인덱스번호 1번부터 끝까지
   }
   public void setPage() {
      page =  request.getParameter("page");
   }
}
   
