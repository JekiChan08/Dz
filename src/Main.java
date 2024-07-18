
public class Main {
    public static void main(String[] args) {
        TheCondidant theCondidant1 = new TheCondidant(20, 4, "Jeki", 200000);
        TheCondidant theCondidant2 = new TheCondidant(15, 1, "Jeki2", 400000);
        TheCondidant theCondidant3 = new TheCondidant(15, 1, "Jeki2", 400000);

        Company company = new Company(19, 3, 300000);
        company.specifications(theCondidant1);
        company.specifications(theCondidant2);
        company.activities();

    }
}