package dao.impl;

import dao.IAccountDAO;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;

public class AccountDAOImpl implements IAccountDAO {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void transOut(long outId, int money) {
        this.namedParameterJdbcTemplate.update("update account set balance = balance - :ebalance where id = :eid",
                new HashMap(){{
                    this.put("ebalance",money);
                    this.put("eid",outId);
                }});
    }

    @Override
    public void transIn(long inId, int money) {
        this.namedParameterJdbcTemplate.update("update account set balance = balance + :ebalance where id = :eid",
                new HashMap(){
                    {
                        this.put("ebalance",money);
                        this.put("eid",inId);
                    }
                });
    }
}
