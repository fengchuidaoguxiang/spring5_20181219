package dao.impl;

import dao.IAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;

@Repository
public class AccountDAOImpl implements IAccountDAO {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
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
