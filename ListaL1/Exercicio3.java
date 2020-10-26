class Tester {
    private int var;
    public Tester(double var) {
        this.var = (int)var;
    }

    public Tester(int var) {
        this("hello");
    }

    public Tester() {
        System.out.println("good­bye");
    }
    public Tester(String s) {
        this();
        System.out.println(s);
    }
}

class Exercicio3 {
    public static void main(String[] args) {
        Tester t = new Tester(5);
    }
}