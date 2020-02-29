public class AllInclusiveVacation extends Vacation {
    String brand;
    int rating;
    double price;

    public AllInclusiveVacation(String brand, int rating, double price, double budget){
        this.brand = brand;
        this.rating = rating;
        this.price = price;
        super.budget = budget;
    }

    @Override
    public double budgetRemaining() {
        return super.budget - price;
    }
}
