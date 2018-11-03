package master;

import java.util.List;

public interface AccountDAO {
public int insert(Account acc);
public int delete(Account acc);
public int update(Account acc);
public List getData(Account acc);
}
