package Exercicio2;

import java.util.Scanner;

class Autor {
    private String nome;
    private int id;

    public String getNome () {
        return this.nome;
    }

    public int getId () {
        return this.id;
    }

    public String setNome (String nome) {
        return this.nome = nome;
    }

    public int setNome (int id) {
        return this.id = id;
    }
}
 
class Exercicio2 {
    public static void main(String arg[]) {
        
        Autor b = new Autor();       
        System.out.println("Nome: %c" + b.getNome());
        System.out.println("Nome: %d" + b.getId());

        System.out.println("Nome: %c" + b.getNome(a.nome));
        System.out.println("Nome: %d" + b.getId(a.id));
    } 
}