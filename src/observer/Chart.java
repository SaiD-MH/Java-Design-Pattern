package observer;

import javax.xml.crypto.Data;

public class Chart implements Observer{


    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {

        System.out.println("Charts are updated " + dataSource.getValue());

    }
}
