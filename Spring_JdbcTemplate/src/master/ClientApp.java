package master;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;





public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String insert_sql="insert into cust values('C2','SOHAM','656565')";
		String select_sql="select * from cust";
     BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
     JdbcTemplate temp=(JdbcTemplate)factory.getBean("template");
       int n=temp.update(insert_sql);
       System.out.println("THE NUMER OF ROW INSERTED:"+n);
       List results=temp.queryForList(select_sql);
       Iterator itr=results.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
     
	}

}
