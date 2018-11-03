package master.rup;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
		case1 pd=(case1)factory.getBean("case");
		
		String id = pd.getRollno();
		System.out.println("Roll no : " + id);
		
		String name = pd.getName();
		System.out.println("Name : " + name);	
		
		System.out.println("Phone Number");
		Set s = pd.getPhone();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Fees : ");
		Map map=(Map) pd.getFees();
		Set set=map.entrySet();
		Iterator itr1=set.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
			System.out.println(me.getKey()+"=====>"+me.getValue());
		}
		
		System.out.println("Interest : ");
		Properties p= pd.getInterest();
		Set sets=p.entrySet();
		Iterator itrs=sets.iterator();
		while(itrs.hasNext())
		{
			Map.Entry me=(Map.Entry)itrs.next();
			System.out.println(me.getKey()+"=====>"+me.getValue());
		}
		
		System.out.println("Visit ");
		List s1 = pd.getVisit();
		Iterator itr12 = s1.iterator();
		while(itr12.hasNext()) {
			System.out.println(itr12.next());
		}
	}

}

