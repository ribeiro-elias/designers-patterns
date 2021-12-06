package book.chain.pagamento;

public abstract class BaseBudgetHandler {
    protected BaseBudgetHandler nextHandler;

    public BaseBudgetHandler setNextHandler(BaseBudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public CustomerBudget handler(CustomerBudget budget){
        if(this.nextHandler != null) return this.nextHandler.handler(budget);
        return budget;
    }
}
