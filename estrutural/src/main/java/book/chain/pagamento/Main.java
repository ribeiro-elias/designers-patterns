package book.chain.pagamento;

public class Main {
    public static void main(String[] args) {

        CustomerBudget customerBudget = new CustomerBudget(500000L);

        SellerBudgetHandler sellerBudgetHandler = new SellerBudgetHandler();
        sellerBudgetHandler
                .setNextHandler(new ManagerBudgetHandler())
                .setNextHandler(new DirectorBudgetHandler())
                .setNextHandler(new CEOBudgetHandler());

        sellerBudgetHandler.handler(customerBudget);
    }
}
