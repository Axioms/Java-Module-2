public class PiecemealVacation extends Vacation {
    String[] items;
    int[] costs;
    double budget;
    public PiecemealVacation(String[] items, int[] costs, double budget) {
        this.items = items;
        this.costs = costs;
        this.budget = budget;
    }

    @Override
    public double budgetRemaining() {
        double tempTotal = 0;

        for(int x=0; x < costs.length; x++) {
            tempTotal =tempTotal + costs[x];
        }

        return budget - tempTotal;
    }
}
