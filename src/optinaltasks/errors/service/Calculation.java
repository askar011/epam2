package optinaltasks.errors.service;

import java.util.List;

public class Calculation {

    public double sum(List<Double> list){
        double result = 0;
        for (Double elem : list ){
            result += elem;
        }
        return result;
    }

    public double avg(List<Double> list){
        double result = 0;
        for (Double elem : list ){
            result += elem;
        }
        return result/list.size();
    }

}
