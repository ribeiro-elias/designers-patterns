package book.chain.login;

import book.chain.pagamento.BaseBudgetHandler;
import book.chain.pagamento.CustomerBudget;

import java.util.HashMap;
import java.util.Set;

public abstract class HandlerBase {
    protected HandlerBase nextHandler;
    protected static HashMap<String,String> dicionario = new HashMap<>();


    public HandlerBase setNextHandler(HandlerBase nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public Usuario handler(Usuario usuario){
        if(this.nextHandler != null) return this.nextHandler.handler(usuario);
        return usuario;
    }

    public boolean hasErrors(){
        if(dicionario.size() >= 1) return true;
        return false;
    }

    public HashMap<String, String> getDicionario() {
        return dicionario;
    }

    public void showErros() {
        System.out.println(dicionario.entrySet());
    }
}
