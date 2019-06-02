package optinaltasks.errors.main;

import optinaltasks.errors.inforeader.DataReader;
import optinaltasks.errors.service.Calculation;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataReader reader = new DataReader();
        Calculation calculator = new Calculation();
        List<Double> doubles = reader.getData();

        System.out.println(calculator.sum(doubles));
        System.out.println(calculator.avg(doubles));
    }
}
