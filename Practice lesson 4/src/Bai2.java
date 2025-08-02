public class Bai2 {
    public static void main(String[] args) {
        Student st1 = new Student("Hien", 19);
        st1.sayHello();
        st1.setName("Hong");
        st1.setAge(17);

        System.out.println("Tên mới: " + st1.getName());
        System.out.println("Tuổi mới: " + st1.getAge());
    }
}
