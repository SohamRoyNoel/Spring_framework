package master;

public class Category {
	String catg;
	Book bk;
	
	public Category(Book bk) {
		this.bk = bk;
	}
	
	
	public String getCatg() {
		return catg;
	}
	public void setCatg(String catg) {
		this.catg = catg;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	
	public void display() {
		System.out.println(this.getBk().getBid()+ "=====>" + this.getBk().getBname() + "=====>" + this.getBk().getBprice() + "=======>" + this.getCatg());
	}
}
