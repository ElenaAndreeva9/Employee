public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Андрей", "Иванов", "Романович", 1, 20000.00);
        employees[1] = new Employee("Борис", "Петров", "Петрович", 2, 30100.00);
        employees[2] = new Employee("Владимир", "Сидоров", "Владимирович", 3, 20200.00);
        employees[3] = new Employee("Дмитрий", "Гарин", "Дмитриевич", 4, 40300.00);
        employees[4] = new Employee("Егор", "Антонов", "Егорович", 5, 20400.00);
        employees[5] = new Employee("Иван", "Попов", "Иванович", 5, 50500.00);
        employees[6] = new Employee("Леонид", "Руднев", "Леонидович", 4, 20600.00);
        employees[7] = new Employee("Максим", "Смирнов", "Максимович", 3, 60700.00);
        employees[8] = new Employee("Николай", "Хвалев", "Николаевич", 2, 20800.00);
        employees[9] = new Employee("Олег", "Михайлов", "Олегович", 1, 70900.00);

        getAllEmployees();
        getMinSalary();
        getMaxSalary();
        getSumSalaryPerMonth();

    }

    public static void getAllEmployees() {
        if (employees != null) {
            for (Employee employee : employees) {

                System.out.println(employee);//// Получить список всех
                // сотрудников со всеми имеющимися по ним данными
            }
        }
    }


    ///Найти сотрудника с минимальной зарплатой.


    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary);
        return minSalary;
    }


///Найти сотрудника с максимальной зарплатой.

    public static Employee getMaxSalary() {  ///// мakc зп
        double max = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        System.out.println("Максимальная  зарплата: " + maxSalary);
        return maxSalary;
    }


/// Посчитать сумму затрат на зарплаты в месяц.

    public static double getSumSalaryPerMonth() {

        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        System.out.println("Сумма зарплат всех работников: " + sum);
        return sum;
    }


/// Получить Ф. И. О. всех сотрудников
public static void getFullNameEmployees() {
    if (employees != null) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}

}


