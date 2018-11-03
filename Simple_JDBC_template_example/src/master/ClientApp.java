package master;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApp {

	public static void main(String[] args) {
		Account1 acc1 = new Account1();
		acc1.setAccno(101);
		acc1.setCname("Nick");
		acc1.setBalance(500.00);
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
		Account1DAOImpl accImpl = (Account1DAOImpl)factory.getBean("accdao");
		
		accImpl.insert(acc1);
		List result = accImpl.getData(acc1);
		Iterator it = result.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
