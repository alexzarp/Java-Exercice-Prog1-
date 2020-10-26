import java.util.Scanner;
class Compra {
    private String nomeProduto;
    private float preco;
    private int quantidade;

    public Compra(String produto, float preco, int quantidade) {
        setNomeProduto(produto);
        setpreco(preco);
        setQuantidade(quantidade);
    }

    public void setNomeProduto(String novo) {
        this.nomeProduto = novo;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setpreco(float preco) {
        this.preco = preco;
    }

    public float getpreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    // Imprime todas as propriedades da classe
    public void imprimeResumo() {
        System.out.println("Nome do produto " + getNomeProduto());
        System.out.println("Preço do produto " + getpreco());
        System.out.println("Quantidade " + getQuantidade());
    }
}

class Exercicio2 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        Compra c = new Compra("a", 1.1, 1);

        System.out.println("Digite o nome do produto: ");
        String nome = teclado.nextLine();
        c.setNomeProduto(nome);

        System.out.println("Digite o preço do produto: ");
        float preco = teclado.nextFloat();
        c.setpreco(preco);

        System.out.println("Digite a quantidade: " );
        int quantidade = teclado.nextInt();
        c.setQuantidade(quantidade);

    

        c.imprimeResumo();
    }
}
    