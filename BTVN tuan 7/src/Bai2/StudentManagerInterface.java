package Bai2;

public interface StudentManagerInterface {
    public void sortByScoreDesc();
    public void sortByScoreAsc();

    public Student findByName(String name);
    public void printStudents();

    ;
}
