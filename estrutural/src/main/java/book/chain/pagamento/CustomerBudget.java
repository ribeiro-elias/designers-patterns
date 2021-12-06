package book.chain.pagamento;

public class CustomerBudget {
    private Long total;
    private boolean aprovado;

    public CustomerBudget(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return total;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
