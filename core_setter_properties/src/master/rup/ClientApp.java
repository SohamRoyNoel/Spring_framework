package master.rup;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
		Products pd=(Products)factory.getBean("prd");
		Properties map=pd.getPro();
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+"=====>"+me.getValue());
		}

	}

}
