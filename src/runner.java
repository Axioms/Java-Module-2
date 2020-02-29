public class runner {
    public static void main(String[] args) {
        String[] items = {"apples", "room", "water"};
        int[] costs = {100, 20, 2};
        AllInclusiveVacation h1 = new AllInclusiveVacation("hotel Brand", 2, 2000, 2500);
        PiecemealVacation h2 = new PiecemealVacation(items, costs, 100);

        System.out.println("h1 remaining budget: " + h1.budgetRemaining());
        System.out.println("h2 remaining budget: " + h2.budgetRemaining());
    }
}
