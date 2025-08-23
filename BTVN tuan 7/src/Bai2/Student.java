package Bai2;

public class Student {
    private String id;
    private String name;
    private double score;
    private int age;
    private String email;
    private String className;
    private String address;

    public Student() {

    }
    public Student(String id, String name, int age, String email, String className, String address, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
        this.email = email;
        this.className = className;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        if(this.score >= 8) {
            return "A";
        }
        else if(this.score >= 6 && this.score < 8) {
            return "B";
        }
        else if(this.score >= 4 && this.score < 6) {
            return "C";
        }
        return "D";
    }

    public void printStudent() {
        System.out.printf("%-6s %-20s %-5d %-25s %-10s %-15s %-6.1f %-5s%n",
                this.id, this.name, this.age, this.email, this.className,
                this.address, this.score, getGrade());
    }

    @Override
    public String toString() {
        return String.format("%-6s %-20s %-5s %-25s %-10s %-15s %-6s %-5s%n",
                "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade") + String.format("%-6s %-20s %-5d %-25s %-10s %-15s %-6.1f %-5s%n",
                id, name, age, email, className, address, score, getGrade());
    }
}
