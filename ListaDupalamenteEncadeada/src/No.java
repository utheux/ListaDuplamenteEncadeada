public class No {
    public String valor;
    public No noAnterior;
    public No noProximo;

    public void criar(String valor) {
        this.valor = valor;
        this.noAnterior = null;
        this.noProximo = null;
    }


}
