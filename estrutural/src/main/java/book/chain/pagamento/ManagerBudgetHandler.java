package book.chain.pagamento;

public class ManagerBudgetHandler extends BaseBudgetHandler{
    @Override
    public CustomerBudget handler(CustomerBudget budget) {
        if(budget.getTotal() <= 5000){
            System.out.println("O gerente tratou o orcamento");
            budget.setAprovado(true);
            return budget;
        }
        return super.handler(budget);
    }
}
