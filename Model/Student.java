package Model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double score;

    private static int idEclement = 0;

    public Student(String name, int age, String address, double score) {
        this.id = idEclement;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;

        idEclement++;
    }

    public Student(int id, String name, int age, String address, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static int getIdEclement() {
        return idEclement;
    }

    public static void setIdEclement(int idEclement) {
        Student.idEclement = idEclement;
    }

    public String toString() {
        return "Sinh viên có id là:"+ this.id + "Sinh viên có tên là :" + this.name + "| có tuổi là " + this.age + " | Địa chỉ ở " + this.address + "|Có điểm trung bình là"+this.score;
    }
}