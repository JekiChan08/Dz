public abstract class TheСompanysActivities {
    TheCondidant[] workers;
    int size;
    private int age;
    private double salary;
    private int experience;


    public abstract void activities();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public TheСompanysActivities(int age, int experience, double salary) {
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.size = 0;
        this.workers = new TheCondidant[20];
    }

    public TheCondidant[] getWorkers() {
        return workers;
    }

    public void setWorkers(TheCondidant[] workers) {
        this.workers = workers;
    }
}
