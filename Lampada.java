package avaliacaoLampada;

public class Lampada {

    //variaveis
    private boolean acesa;
    private int watts;


    //construtor
    public Lampada(boolean acesa, int watts){       //esse trecho controi a lampada e adiciona o boolean acesa e o int watts como parametros,
        this.acesa = acesa;                         //depois define eles como acesa e watts para depois serem alterados no Main.
        this.watts = watts;
    }

    //metodo
    public Lampada(){
        this.watts = 60;
    }       //esse trecho define watts como 60 por padrao

    //metodo
    public void ligar(){             //aqui ele configura a funcao ligar, para que quando ativada
        this.acesa = true;           //deixe o boolean verdadeiro
    }
    //metodo
    public void desligar(){            // aqui ele configura a funcao desligar para que quando
        this.acesa = false;            // for ativada desligue a lampada, ou seja, deixe o boolean false
    }
    //metodo
    public void exibirDados(){
        if(this.acesa){                     //faz com que quando o boolean acesa estiver true apareca para o user: acesa
            System.out.println("Acesa");
        }
        else
        {
            System.out.println("Apagada");      // o mesmo mas pra apagada
        }
        System.out.println("Watts: " + this.watts + "w");       //imprime o numero de watts
    }
}
