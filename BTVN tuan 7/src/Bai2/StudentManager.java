package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager implements StudentManagerInterface {
    private final ArrayList<Student> students = new ArrayList<>();

    @Override
    public void sortByScoreDesc() {
        students.sort(Comparator.comparingDouble(Student::getScore).reversed());
    }

    @Override
    public void sortByScoreAsc() {
        students.sort(Comparator.comparingDouble(Student::getScore));
    }

    @Override
    public Student findByName(String name) {
        for (Student s : students) {
            if (name.equalsIgnoreCase(s.getName())) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void printStudents() {
        // In tiêu đề
        System.out.printf("%-6s %-20s %-5s %-25s %-10s %-15s %-6s %-5s%n", "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        for (Student s : students) {
            s.printStudent();
        }
    }


    public void fakeData() {
        students.add(new Student("SV001", "Nguyen Ngoc Hien", 20, "hien@gmail.com", "KTPM01", "Bac Ninh", 7.5));
        students.add(new Student("SV002", "Tran Anh Tu", 21, "tu@gmail.com", "CNTT02", "Ha Noi", 9.5));
        students.add(new Student("SV003", "Vu Thi Anh Thu", 19, "thu@gmail.com", "HTTT01", "Nha Trang", 3.5));
        students.add(new Student("SV004", "Nguyen Kieu Anh", 22, "anh@gmail.com", "KTPM04", "Bac Giang", 5.5));
    }

}
