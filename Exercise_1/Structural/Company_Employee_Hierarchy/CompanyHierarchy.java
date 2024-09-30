package Exercise_1.Structural.Company_Employee_Hierarchy;

public class CompanyHierarchy {
    public static void main(String[] args) {
        Manager ceo = new Manager("Alice", "CEO");

        Manager headSales = new Manager("Bob", "Head of Sales");
        Manager headMarketing = new Manager("Carol", "Head of Marketing");

        Staff salesExecutive1 = new Staff("David", "Sales Executive");
        Staff salesExecutive2 = new Staff("Eva", "Sales Executive");

        Staff marketingExecutive1 = new Staff("Frank", "Marketing Executive");

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(marketingExecutive1);

        ceo.displayDetails();
    }
}

