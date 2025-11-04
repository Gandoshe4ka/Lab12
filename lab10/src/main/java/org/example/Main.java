package org.example;

public class Main {
    public static void main(String[] args) {
        // Тест 1: Обработка PremiyaException у штатного сотрудника
        try {
            StaffEmployee staff = new StaffEmployee("Иванов И.И.", "Программист", 100000, -5000);
            System.out.println("Рассчитанная зарплата: " + staff.calculateSalary());
        } catch (OkladException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------");

        // Тест 2: Обработка OkladException при создании сотрудника
        try {
            Employee emp = new StaffEmployee("Петров П.П.", "Аналитик", -30000, 10000);
        } catch (OkladException e) {
            System.out.println(e.getMessage());
            // Повторно выбрасываем исключение (по условию задачи)
            try {
                throw e;
            } catch (OkladException ex) {
                System.out.println("Повторный выброс исключения обработан.");
            }
        }

        System.out.println("------------------------");

        // Тест 3: Корректный расчёт зарплаты
        try {
            StaffEmployee goodStaff = new StaffEmployee("Сидоров С.С.", "Дизайнер", 80000, 15000);
            System.out.println("Зарплата (корректно): " + goodStaff.calculateSalary());
        } catch (OkladException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------");

        // Тест 4: Контрактный сотрудник
        try {
            ContractEmployee contract = new ContractEmployee("Козлов К.К.", "Консультант", 120000);
            System.out.println("Зарплата контрактника: " + contract.calculateSalary());
        } catch (OkladException e) {
            System.out.println(e.getMessage());
        }
    }
}