package optinaltasks.errors.inforeader;

import optinaltasks.errors.validator.DoubleNumberValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataReader {

    private static final String FILE_PATH = "data/optionalTaskData.txt";
    private List<Double> listOfData = new ArrayList<>();
    private Scanner in;

    // have condition to check for OutOfMemoryError
    public List<Double> getData() {
        File input = new File(FILE_PATH);
        try {
            in = new Scanner(input);
            in.useLocale(Locale.US);
            while (in.hasNextDouble()) {
                double temp = in.nextDouble();
                if (DoubleNumberValidator.isValid(temp)) {
                    listOfData.add(temp);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e) {
            System.exit(-1);
        } finally {
            in.close();
        }
        return Collections.unmodifiableList(listOfData);
    }
}
