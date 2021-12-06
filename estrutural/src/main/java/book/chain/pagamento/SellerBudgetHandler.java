package book.chain.pagamento;

public class SellerBudgetHandler extends BaseBudgetHandler{
    @Override
    public CustomerBudget handler(CustomerBudget budget) {
        if(budget.getTotal() <= 1000){
            System.out.println("O vendedor tratou o orcamento");
            budget.setAprovado(true);
            return budget;
        }
        return super.handler(budget);
    }
}
