package comg.m.DAO;

import comg.m.DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by MingGong on 2016/11/3.
 */

@Component
public class ComputerDAO {

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Autowired
    public JdbcTemplate template;


    public List<User> getUsers(){
        String sql="select * from user";

        return template.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }
}
