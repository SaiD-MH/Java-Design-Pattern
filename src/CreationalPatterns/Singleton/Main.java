package CreationalPatterns.Singleton;

public class Main {

    public static void main(String[] args) {

        ConfigurationManager manager = ConfigurationManager.getInstance();

        manager.add("name","JAVA");

        ConfigurationManager other = ConfigurationManager.getInstance();
        System.out.println(other.get("name"));

    }

}
