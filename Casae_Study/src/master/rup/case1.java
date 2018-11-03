package master.rup;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class case1 {
	String rollno;
	String name;
	Set<String> phone;
	Map fees;
	Properties interest;
	List<String> visit;
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public Map getFees() {
		return fees;
	}
	public void setFees(Map fees) {
		this.fees = fees;
	}
	public Properties getInterest() {
		return interest;
	}
	public void setInterest(Properties interest) {
		this.interest = interest;
	}
	public List<String> getVisit() {
		return visit;
	}
	public void setVisit(List<String> visit) {
		this.visit = visit;
	}
	
	
}
