package ec.cjpq.parrot.util;

import java.io.IOException;
import java.util.Properties;

// https://github.com/perspilling/jdbi-examples/blob/master/src/main/java/no/kodemaker/ps/jdbiapp/DbProperties.java

public enum DbProperties {

    DB_TYPE         ("db.type"),
    DB_DRIVER_CLASS ("db.driver_class"),
    DB_URL          ("db.url"),
    DB_USERNAME     ("db.username"),
    DB_PASSWORD     ("db.password");

    private final String key;

    private DbProperties(String key) {
        this.key = key;
    }

    private final static Properties appProperties = new Properties();
    private static String propsFilename = "db.properties";

    static {
        try {
            appProperties.load(DbProperties.class.getClassLoader().getResourceAsStream(propsFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String value() {
        return appProperties.getProperty(key, "");
    }

}
