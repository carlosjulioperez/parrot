package ec.cjpq.parrot.util;

import org.jdbi.v3.core.Jdbi;

import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.util.Clients;

import org.zkoss.zul.Center;

/**
 * Utilería del sistema
 * @author carper, carlosjulioperez@gmail.com
 * 2019-02-22
 * 2019-03-31 Adding showForm()
 * 2019-04-16
 */
public class UtilHelper{

	//Create an object of UtilHelper
	private static UtilHelper instance = new UtilHelper();

	//Make the constructor private so that this class can not be instantiated
	private UtilHelper(){}

	//Get the only object available
	public static UtilHelper getInstance(){
		return instance;
	}

	//Print the greeting message of the alive object...
	public void showMessage(){
		System.out.println("Hello world, I'm a single object ;)");
	}

	//Show JavaScript's alert window
	public void showMessage(String message){
        Clients.evalJavaScript("alert('" + message + "')");
	}

    public void showForm(String form){
        Center mainContent = (Center)Path.getComponent("/indexWindow/mainContent");
        mainContent.getChildren().clear();
        Executions.createComponents(form, mainContent, null);
    }

    public Jdbi createJdbi(){
        Jdbi jdbi = Jdbi.create(DbProperties.DB_URL.value(), DbProperties.DB_USERNAME.value(), DbProperties.DB_PASSWORD.value());
        jdbi.installPlugin(new SqlObjectPlugin());
        return jdbi;
    }

}
