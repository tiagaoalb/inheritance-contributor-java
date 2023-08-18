package entities;

public class Individual extends Contributor {
    private Double healthExpenses;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenses) {
        super(name, anualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double tax() {
        if (getAnnualIncome() < 20000.0) {
            return (getAnnualIncome() * 0.15) - (getHealthExpenses() * 0.5);
        }
        else {
            return (getAnnualIncome() * 0.25)- (getHealthExpenses() * 0.5);
        }
    }
}
