package org.example;

public class StaffEmployee extends Employee {
    private double bonus;

    public StaffEmployee(String fio, String position, double salary, double bonus) throws OkladException {
        super(fio, position, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new PremiyaException("Премия не может быть отрицательной: " + bonus);
            }
            return salary + bonus;
        } catch (PremiyaException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return salary; // возвращаем только оклад без премии
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка при расчете зарплаты: " + e.getMessage());
            return 0.0;
        }
    }
}