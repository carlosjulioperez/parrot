package ec.cjpq.parrot.admin.dao;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import ec.cjpq.parrot.admin.model.Users;

@RegisterBeanMapper(Users.class)
public interface UsersDao {

    @SqlQuery("SELECT * FROM users WHERE username = :username")
    Users getByUsername(@Bind("username") String username);
}


