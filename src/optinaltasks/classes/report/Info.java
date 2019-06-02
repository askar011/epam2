package optinaltasks.classes.report;

import optinaltasks.classes.entity.Faculty;
import optinaltasks.classes.entity.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Info implements Reporter {
    @Override
    public List<Student> listOfFacultyStudents(List<Student> list, Faculty faculty) {
        List<Student> result = new ArrayList<>();
        for (Student el : list) {
            if (el.getFaculty().equals(faculty)) {
                result.add(el);
            }
        }
        return result;
    }

    @Override
    public List<Student> listOfGroup(List<Student> studentsList, String groupName) {
        List<Student> result = new ArrayList<>();
        for (Student el : studentsList) {
            if (el.getGroup().equals(groupName)) {
                result.add(el);
            }
        }
        return result;
    }

    @Override
    public List<Student> bornAfter(List<Student> list,Date date) {
        List<Student> result = new ArrayList<>();
        for (Student el : list) {
           if (el.getBirthday().after(date)){
               result.add(el);
           }
        }
        return result;
    }

    @Override
    public void printStudents(List<Student> studentsList) {
        for (Student el : studentsList) {
            System.out.println(el.getFirstName() + el.getLastName() + "," +
                    el.getFaculty() + ":" + el.getFaculty());
        }
    }
}
