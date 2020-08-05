package lixiang666.top.dao;

import lixiang666.top.domain.User;
import lixiang666.top.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    public User login(User loginuser){
        String sql="select * from user where username=? and password=?";
        User user=template.queryForObject(sql,
                new BeanPropertyRowMapper<User>(User.class),
                User.getUsername(),User.getPassword());
        return user;

    }
}
