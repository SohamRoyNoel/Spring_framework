package master.rup;

public class Customer {
	String cid;
	String cname;
	String cphone;
	
	public Customer(String cid, String cname, String cphone) {
		this.cid=cid;
		this.cname = cname;
		this.cphone = cphone;
	}
	public void show() {
		System.out.println(this.cid+"======>"+this.cname+"=====>"+this.cphone);
	}
}
