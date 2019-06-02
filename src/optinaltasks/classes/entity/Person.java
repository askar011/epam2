package optinaltasks.classes.entity;

import java.util.Calendar;
import java.util.Date;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String fatherLand;
    private Date birthday;
    private long phoneNumber;

    public Person(String firstName, String lastName, String fatherLand, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherLand = fatherLand;
        initBirthday(year, month, day);
    }

    private void initBirthday(int year, int month, int day) {
        if (year > 0 && month > 0 && day > 0) {
            Calendar cal = Calendar.getInstance();
            cal.set(year, month - 1, day, 0, 0, 0);
            birthday = cal.getTime();
        } else {
            throw new IllegalArgumentException("Birthday argument error");
        }
    }

    public Person(String firstName, String lastName, String fatherLand, Date birthday, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherLand = fatherLand;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherLand() {
        return fatherLand;
    }

    public Date getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherLand='" + fatherLand + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
