public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Lucia", "Rossi", "Via Alba");
        Employee employee2 = new Employee("Marco", "Bianchi", "Via Vittoria");

        Badge employeeBadge1 = new Badge(employee1);
        Badge employeeBadge2 = new Badge(employee2);

        employeeBadge1.showBadgeDetails();
        employeeBadge2.showBadgeDetails();


    }
}