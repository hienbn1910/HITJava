import java.util.*;

public class StudentControl {
    ArrayList<Student> danhSach = new ArrayList<>();


    public static void fakeData(ArrayList<Student> danhSach) {
        Student st1 = new Student("Nam", 2005, "Hà Nội", 8.0, 7.5, 9.0, 2);
        Student st2 = new Student("An", 2001, "Hải Phòng", 6.5, 7.0, 7.0, 4);
        Student st3 = new Student("Linh", 2004, "Đà Nẵng", 9.0, 8.0, 8.5, 1);
        Student st4 = new Student("Mai", 2003, "TP.HCM", 8.0, 8.0, 8.0, 2);
        Student st5 = new Student("Hùng", 2002, "Cần Thơ", 7.5, 8.5, 9.5, 3);
        danhSach.add(st1);
        danhSach.add(st2);
        danhSach.add(st3);
        danhSach.add(st4);
        danhSach.add(st5);
    }

    public static void show(ArrayList<Student> danhSach) {
        System.out.println("               ==========DANH SACH SINH VIEN==========              ");

        System.out.printf("%-10s %-5s %-20s %-7s %-7s %-8s %-7s %-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Số tiết nghỉ");

        for (Student sv : danhSach) {
            System.out.printf("%-10s %-5d %-20s %-7.1f %-7.1f %-8.1f %-7.1f %-10d\n",
                    sv.getName(), sv.getAge(), sv.getDiaChi(), sv.getTx1(), sv.getTx2(), sv.getKthp(), sv.diemGPA(), sv.getSoTietNghi());
        }
    }

    public static void addStudent(ArrayList<Student> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần thêm: ");
        String name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        int namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm TX1: ");
        double tx1 = sc.nextDouble();
        System.out.println("Nhập điểm TX2: ");
        double tx2 = sc.nextDouble();
        System.out.println("Nhập điểm KTHP: ");
        double kthp = sc.nextDouble();
        System.out.println("Nhập số tiết nghỉ: ");
        int soTietNghi = sc.nextInt();

        int age = 2025 - namSinh;

        Student newStudent = new Student(name, namSinh, diaChi, tx1, tx2, kthp, soTietNghi);
        danhSach.add(newStudent);

        System.out.println("Đã thêm sinh viên mới tên " + name + "!!!");
    }

    public static void editStudentProfiles(ArrayList<Student> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần sửa: ");
        String name = sc.nextLine();

        boolean nameEdit = false;

        for(Student sv : danhSach) {
            if (sv.getName().equalsIgnoreCase(name)) {
                nameEdit = true;

                System.out.println("Nhập thông tin mới:");

                System.out.println("Tên mới: ");
                sv.setName(sc.nextLine());

                System.out.println("Năm sinh mới: ");
                sv.setNamSinh(Integer.parseInt(sc.nextLine()));

                System.out.println("Địa chỉ mới: ");
                sv.setDiaChi(sc.nextLine());

                System.out.println("Điểm TX1 mới: ");
                sv.setTx1(Double.parseDouble(sc.nextLine()));

                System.out.println("Điểm TX2 mới: ");
                sv.setTx2(Double.parseDouble(sc.nextLine()));

                System.out.println("Điểm KTHP mới: ");
                sv.setKthp(Double.parseDouble(sc.nextLine()));

                System.out.println("Số tiết nghỉ mới: ");
                sv.setSoTietNghi(Integer.parseInt(sc.nextLine()));
                break;
            }
        }
        if (!nameEdit) {
            System.out.println("Không tìm thấy sinh viên có tên: " + name);
        }

        System.out.println("Đã chỉnh sửa thành công!!!");
    }

    public static void descendingAge(ArrayList<Student> danhSach) {
        Collections.sort(danhSach, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                return sv2.getAge() - sv1.getAge();
            }
        });
        System.out.println("Đã sắp xếp thành công!!!");
    }

    public static void descendingGPA(ArrayList<Student> danhSach) {
        Collections.sort(danhSach, (sv1, sv2) -> Double.compare(sv2.diemGPA(), sv1.diemGPA()));
        System.out.println("Đã sắp xếp thành công!!!");
    }

    public static void descendingSoTietNghi(ArrayList<Student> danhSach) {
        Collections.sort(danhSach, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                return sv2.getSoTietNghi() - sv1.getSoTietNghi();
            }
        });
        System.out.println("Đã sắp xếp thành công!!!");
    }

    public static void deleteStudent(ArrayList<Student> danhSach) {
        Iterator<Student> it = danhSach.iterator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên cần xóa: ");
        String name = sc.nextLine();
        boolean isRemoved = false;

        while (it.hasNext()) {
            Student sv = it.next();
            if(sv.getName().equalsIgnoreCase(name)) {
                it.remove();
                isRemoved = true;
            }
        }


        if(!isRemoved) {
            System.out.println("Không tìm thấy sinh viên tên " + name + "!!!");
        }
        else {
            System.out.println("Đã xóa sinh viên tên " + name + "!!!");
        }
    }
}
