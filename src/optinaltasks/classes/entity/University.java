package optinaltasks.classes.entity;

import optinaltasks.classes.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class University {

    private List<Student> listOfStudents = new ArrayList<>();

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

    public List<Student> getListOfStudents() {
        return Collections.unmodifiableList(listOfStudents);
    }
}
