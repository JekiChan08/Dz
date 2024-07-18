public class Company extends TheСompanysActivities  implements ISpecifications{

    public Company(int age, int experience, double salary) {
        super(age, experience, salary);
    }

    @Override
    public void specifications(TheCondidant theCondidant) {
        if(theCondidant.getSalary() <= super.getSalary()  && theCondidant.getExperience() >= super.getExperience() && theCondidant.getAge() >= super.getAge()){
            if (size < workers.length) {
                workers[size] = theCondidant;
                size++;
                System.out.println("Кондидант теперь работник");
                return;
            } else {
                System.out.println("Не остлость мест");
                return;
            }
        }
        else {
            System.out.println("Кондидант не подходит по требованиям компании");
        }
    }

    @Override
    public void activities() {
        System.out.println("У компании деятельность Web програмирование ");
    }
}
