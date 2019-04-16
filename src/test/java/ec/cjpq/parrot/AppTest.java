package ec.cjpq.parrot;

import org.junit.Test;

import ec.cjpq.parrot.util.UtilHelper;
import ec.cjpq.parrot.util.DbProperties;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
  */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );

        UtilHelper.getInstance().showMessage();

        System.out.println(DbProperties.DB_DRIVER_CLASS.value());

    }

}
