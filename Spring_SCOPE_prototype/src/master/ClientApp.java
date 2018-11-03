package master;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
		Item im1 = (Item)factory.getBean("it");
		Item im2 = (Item)factory.getBean("it");
		
		im1.setId(1);
		im1.setName("Domics");
		im1.setFees(10000);
		
		im2.setId(2);
		im2.setName("Sakura");
		im2.setFees(15000);
		
		System.out.println(im1.getId()+ "=>" + im1.getName() + "=>" + im1.getFees());
		System.out.println(im2.getId()+ "=>" + im2.getName() + "=>" + im2.getFees());
	}

}
