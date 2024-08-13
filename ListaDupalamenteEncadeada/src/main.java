public class main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        System.out.println("_________________________");
        lista.inserir("Homer");
        lista.inserir("Merge");
        lista.exibir();
        System.out.println("_________________________");

        lista.esvaziar();
        lista.exibir();
        System.out.println("_________________________");

        lista.inserir("Homer");
        lista.insereNaPosicao(0, "Bart");
        lista.insereNaPosicao(1, "Moll");
        lista.exibir();
        System.out.println("_________________________");

        lista.esvaziar();
        lista.exibir();
        System.out.println("_________________________");



    }

}
