package observer;

import java.util.Date;

public class Main {


    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        var sheet1 = new SpreedSheet(dataSource);
        var sheet2 = new SpreedSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);
        dataSource.setValue(9);
    }


}
