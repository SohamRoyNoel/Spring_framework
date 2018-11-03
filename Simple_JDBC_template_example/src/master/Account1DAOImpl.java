package master;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class Account1DAOImpl extends SimpleJdbcDaoSupport implements Account1DAO{

	/*JdbcTemplate jdbcTemplate;
		
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	
	@Override
	public int insert(Account1 acc1) {
		return getSimpleJdbcTemplate().update(QueryConstraints.insert_into, acc1.getAccno(), acc1.getCname(),acc1.getBalance() );
	}

	@Override
	public List getData(Account1 acc1) {
		// TODO Auto-generated method stub
		return getSimpleJdbcTemplate().queryForList(QueryConstraints.fetch);
	}

}
