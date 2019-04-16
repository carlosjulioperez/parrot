package ec.cjpq.parrot.util;

public enum DbProperties {

    DB_TYPE         ("db.type"),
    DB_DRIVER_CLASS ("db.driver_class"),
    DB_URL          ("db.url"),
    DB_USERNAME     ("db.username"),
    DB_PASSWORD     ("db.password"),

    private final String key;

    private DbProperties(String key) {
        this.key = key;
    }

    private final static Properties applicationProperties = new Properties();
    private static String propsFilename = "db.properties";

    static {
        try {
            applicationProperties.load(DbProperties.class.getClassLoader().getResourceAsStream(propsFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String val() {
        return applicationProperties.getProperty(key, "");
    }

}
