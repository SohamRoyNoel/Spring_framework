package master;

public interface QueryConstraints {
public static String insert_sql="insert into account values(?,?,?)";
public static String delete_sql="delete from account where accno=?";
public static String update_sql="update account set cname=?,balance=? where accno=?";
public static String select_sql="select * from account";
}
