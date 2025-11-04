package org.example;

public class ContractEmployee extends Employee {

    public ContractEmployee(String fio, String position, double salary) throws OkladException {
        super(fio, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            return salary;
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты контрактного сотрудника: " + e.getMessage());
            return 0.0;
        }
    }
}