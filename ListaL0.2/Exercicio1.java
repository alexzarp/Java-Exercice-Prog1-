import java.util.Scanner;
class Pessoa {
    private String nome;
    private int idade;
    private float peso;

    String getNome() {
        return this.nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    int getIdade() {
        return this.idade;
    }
    void setIdade(int idade) {
        this.idade = idade;
    }
    float getPeso() {
        return this.peso;
    }
   
    void setPeso(float peso) {
        this.peso = peso;
    }
    // Imprime todas as propriedades da classe
    void imprimeDados() {
        System.out.println("Este é o nome: %s"+ nome);
        System.out.println("Este é o nome: %d"+ idade);
        System.out.println("Este é o nome: %f"+ peso);
    }
   }

class Ecercicio1 {
    public static void main (String args[]) {
        Pessoa a = new Pessoa();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        a.setNome(a) = teclado.nextLine();

        System.out.println("Digite a idade: ");
        a.setIdade(a) = teclado.nextInt();

        System.out.println("Digite seu peso: ");
        a.setPeso(a) = teclado.nextLine;

        a.imprimeDados();
    }
}