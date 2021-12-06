package book.chain.pagamento;

public class DirectorBudgetHandler extends BaseBudgetHandler{
    @Override
    public CustomerBudget handler(CustomerBudget budget) {
        if(budget.getTotal() <= 50000){
            System.out.println("O diretor tratou o orcamento");
            budget.setAprovado(true);
            return budget;
        }
        return super.handler(budget);
    }
}
