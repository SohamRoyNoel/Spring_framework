package master;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
		Category cg=(Category)factory.getBean("ctg");
		System.out.println(cg.getBk().getBid()+"=====>"+cg.getBk().getBname()+"=====>"+cg.getBk().getBprice()+"====>"+cg.getCatg());

	}

}
