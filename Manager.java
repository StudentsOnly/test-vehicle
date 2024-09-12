class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative.");
        }
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus; // calculate the manager's salary
    }
}
