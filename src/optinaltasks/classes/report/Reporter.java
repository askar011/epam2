package optinaltasks.classes.report;

import optinaltasks.classes.entity.Faculty;
import optinaltasks.classes.entity.Student;

import java.util.Date;
import java.util.List;

public interface Reporter {
    List<Student> listOfFacultyStudents(List<Student> list, Faculty faculty);

    List<Student> listOfGroup(List<Student> studentsList, String groupName);

    List<Student> bornAfter(List<Student> studentList, Date date);

    void printStudents(List<Student> studentsList);
}
