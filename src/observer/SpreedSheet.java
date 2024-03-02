package observer;


public class SpreedSheet implements Observer {

    private DataSource dataSource;

    public SpreedSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update( )
    {
        System.out.println("SpreedSheet are Notified " + dataSource.getValue());
    }
}
