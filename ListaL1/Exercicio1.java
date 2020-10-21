class BlurayDisc {
    private String rotulo;
    protected int id;
    protected float densidade;
    public char[] dados;
    
    public BlurayDisc(String rotulo, int id) {
        setIdentificação(rotulo, id);
        this.dados = new char[4096];
    }

    public void setIdentificação(String rotulo, int id) {
        this.rotulo = rotulo;
        this.id = id;
    }
    
    private String getRotulo() {
        return this.rotulo;
    }
}
    

/* Dadas as variáveis abaixo, indique se cada uma dos comandos seguintes funciona. Se houver algum erro nesses
   comandos, diga qual é esse erro (e justifique).
*/


class Exercicio1 {
    public static void main (String args[]) {
        BlurayDisc c;
        BlurayDisc h = new BlurayDisc("Teste", 1);
        String st = "teste";
        float num;

        c.dados[10] = ' i ';
        /*^ Dado uma posição única de char, pode-se apenas colocar UM caracter,
            e não 3 */
        
        h.setIdentificacao(st, num);
        /*^ num é um inteiro */

        c.setIdentificacao(12, "Outro rótulo");
        /*^ st é uma String, num é um inteiro */
        
        c = new BlurayDisc();
        /*^ Falta a declaração de tipo BlurayDisc no início */

        h.rotulo = "Outro rótulo";
        /*^ rotulo é privado e precisa de um método setter*/
        num = 2.34f;
        /*^ f é uma limitação de casas após a vírgula, apenas para print*/

        num = h.densidade;
        /*^ h foi declarado como método BlurayDisc e não como classe BlurayDisc*/

        st = h.getRotulo();
        /*^ getRotulo é privado*/

        c = new BlurayDisc(st, 234);
        /*^ ????????????????????????*/
        
        c.dados[100] = "Dado posição 100";
        /*^ Dados foideclarado com 4096 posições, não pode alterar para 100*/

    }
}