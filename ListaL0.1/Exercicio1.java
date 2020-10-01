import java.util.Scanner;

class Autor {
    public String nome;
    public int id;
}

class Exercicio1 {
    public static void main(String arg[]) {
        Autor a = new Autor();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        a.nome = teclado.nextLine();

        System.out.print("Digite o id: ");
        a.id = teclado.nextInt();

        System.out.println("nome = " + a.nome);
        System.out.println("id = " + a.id);
    }
}