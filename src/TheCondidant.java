public class TheCondidant {
    private String name;
    private int age;
    private double salary;
    private int experience;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public TheCondidant(int age, int experience, String name, double salary) {
        this.age = age;
        this.experience = experience;
        this.name = name;
        this.salary = salary;
    }
}
