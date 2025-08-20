package BaiTap2.B2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1001, "Hien", 20));
        students.add(new Student(1002, "Tuan", 22));
        students.add(new Student(1003, "Toan", 24));
        students.add(new Student(1004, "Dai", 21));

        for(Student st : students) {
            st.inThongTin();
            System.out.println();
        }
    }
}
