package master;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class AccountDAOImpl implements AccountDAO{
	JdbcTemplate jdbctemplate;
	
		public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int insert(Account acc) {
		// TODO Auto-generated method stub
		return getJdbctemplate().update(QueryConstraints.insert_sql, new Object[] {acc.getAccno(),acc.getCname(),acc.getBalance()});
	}

	@Override
	public int delete(Account acc) {
		// TODO Auto-generated method stub
		return getJdbctemplate().update(QueryConstraints.delete_sql, new Object[] {acc.getAccno()});
	}

	@Override
	public int update(Account acc) {
		// TODO Auto-generated method stub
		return getJdbctemplate().update(QueryConstraints.update_sql, new Object[] {acc.getCname(), acc.getBalance(), acc.getAccno()});
	}

	@Override
	public List getData(Account acc) {
		// TODO Auto-generated method stub
		return getJdbctemplate().queryForList(QueryConstraints.select_sql);
	}

}
