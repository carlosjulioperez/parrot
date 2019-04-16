package ec.cjpq.parrot.admin.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.jdbi.v3.core.Jdbi;

import org.junit.Test;

import ec.cjpq.parrot.admin.model.Users;
import ec.cjpq.parrot.util.UtilHelper;

public class UsersDaoTest{

    private static final Logger logger = LogManager.getLogger(UsersDaoTest.class);
    
    @Test
    public void dao(){

        Jdbi jdbi = UtilHelper.getInstance().createJdbi();

        Users user = jdbi.withExtension(UsersDao.class, dao -> {
           return dao.getByUsername("carper"); 
        });

        logger.warn(user.getId());
        logger.warn(user.getUsername());
    }
}

