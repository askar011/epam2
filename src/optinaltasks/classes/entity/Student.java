package optinaltasks.classes.entity;

import optinaltasks.classes.entity.Faculty;
import optinaltasks.classes.entity.Person;

public class Student extends Person {
    private long id;
    private Faculty faculty;
    private String groupName;
    private int studyYear;

    public Student(String firstName, String lastName, String fatherLand, int year, int month, int day,
                   Faculty faculty, String group, int studyYear) {
        super(firstName, lastName, fatherLand, year, month, day);
        this.faculty = faculty;
        this.groupName = group;
        this.studyYear = studyYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return groupName;
    }

    public void setGroup(String group) {
        this.groupName = group;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "id=" + id +
                ", faculty=" + faculty +
                ", group='" + groupName + '\'' +
                ", studyYear=" + studyYear +
                '}';
    }
}
