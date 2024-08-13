public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public void criar(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(String valor){
        No novoNo = new No();
        novoNo.criar(valor);

        if(this.inicio == null){
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.noProximo = novoNo;
            novoNo.noAnterior = this.fim;
            this.fim = novoNo;
        }
    }

    public void exibir(){
        No atual = this.inicio;
        while (atual!= null){
            System.out.println(atual.valor);
            atual = atual.noProximo;
        }
    }

    public void remover(String valor){
        No atual = inicio;

        while (atual != null) {
            if (atual.valor.equals(valor)) {
                // Remoção do nó
                if (atual.noAnterior != null) {
                    atual.noAnterior.noProximo = atual.noProximo;
                } else {
                    // Removendo o primeiro nó
                    inicio = atual.noProximo;
                }

                if (atual.noProximo != null) {
                    atual.noProximo.noAnterior = atual.noAnterior;
                } else {
                    // Removendo o último nó
                    fim = atual.noAnterior;
                }

                atual = null; // Liberar a memória do nó removido
                return;
            }
            atual = atual.noProximo;
        }
    }

    public void insereNaPosicao(int posicao, String valor){
        No novoNo = new No();
        novoNo.criar(valor);
        if (posicao == 0) {
            if (inicio == null) {
                inicio = fim = novoNo;
            } else {
                novoNo.noProximo = inicio;
                inicio.noAnterior = novoNo;
                inicio = novoNo;
            }
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao - 1 && atual != null; i++) {
                atual = atual.noProximo;
            }
            if (atual != null) {
                novoNo.noProximo = atual.noProximo;
                if (atual.noProximo != null) {
                    atual.noProximo.noAnterior = novoNo;
                }
                atual.noProximo = novoNo;
                novoNo.noAnterior = atual;

                if (novoNo.noProximo == null) {
                    fim = novoNo;
                }
            }
        }
    }

    public void esvaziar(){
        this.inicio = null;
        this.fim = null;
    }

}
