package avaliacaoLampada;

public class Main {

    //metodo
    public static void main(String[] args) {

        //variavel        construtor
        Lampada lampada = new Lampada ( false, 50);         //cria uma nova lampada e define por padrao acesa: false e watts: 50

        //metodos
        lampada.exibirDados();          //exibe os dados da lampada criada
        lampada.ligar();                //deixa o boolean acesa true
        lampada.exibirDados();          //exibe os dados da lampada
        lampada.desligar();             //deixa o boolean acesa false
        lampada.exibirDados();          //exibe os dados da lampada

        //variavel         construtor
        Lampada lampada2 = new Lampada();       //cria uma nova lampada com os parametros do outro código
        lampada2.exibirDados();                 //exibe os dados dessa lampada
    }
}