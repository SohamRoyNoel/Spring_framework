package master;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.setAccno("100");
		acc.setCname("SOHAM");
		acc.setBalance(15000.00);
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
		AccountDAOImpl adaoimpl=(AccountDAOImpl)factory.getBean("accdao");
		adaoimpl.insert(acc);
		List results=adaoimpl.getData(acc);
		Iterator itr=results.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

} 
