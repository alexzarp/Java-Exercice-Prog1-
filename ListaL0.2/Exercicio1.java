import java.util.Scanner;
class Pessoa {
    private String nome;
    private int idade;
    private float peso;

    String getNome() {
        return nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    int getIdade() {
        return idade;
    }
    void setIdade(int idade) {
        this.idade = idade;
    }
    float getPeso() {
        return peso;
    }
   
    void setPeso(float peso) {
        this.peso = peso;
    }
    // Imprime todas as propriedades da classe
    void imprimeDados() {
        System.out.println("Este é o nome: "+ nome);
        System.out.println("Esta é a idade: "+ idade);
        System.out.println("Este é o peso: "+ peso);
    }
   }

class Exercicio1 {
    public static void main (String args[]) {
        Pessoa p = new Pessoa();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();
        p.setNome(nome);

        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        p.setIdade(idade);

        System.out.println("Digite seu peso: ");
        float peso = teclado.nextFloat();
        p.setPeso(peso);

        p.imprimeDados();

        System.out.println("Peso: "+ p.getPeso());
    }
}