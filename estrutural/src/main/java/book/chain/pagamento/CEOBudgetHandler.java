package book.chain.pagamento;

public class CEOBudgetHandler extends BaseBudgetHandler{
    @Override
    public CustomerBudget handler(CustomerBudget budget) {
            System.out.println("O CEO tratou o orcamento");
            budget.setAprovado(true);
            return budget;
    }
}
