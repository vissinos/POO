package avaliacaoFormula1;

public class Teste {

    public static void main(String[] args) {

        //cosntrutor do piloto
        Piloto piloto = new Piloto();
        piloto.setNome("Max Verstappen");
        piloto.setIdade(26);
        piloto.setNacionalidade("Holandês");

        //construtor do patrocinador
        Patrocinador p1 = new Patrocinador();
        p1.setNome("IFRSkkkkk");
        p1.setValorPatrocinio(123456);

        Patrocinador p2 = new Patrocinador();
        p2.setNome("dolurdes");
        p2.setValorPatrocinio(676767);

        //vetor dos patrocinadores
        Patrocinador[] patrocinadores = new Patrocinador[2];
        patrocinadores[0] = p1;
        patrocinadores[1] = p2;

        //construtor da equipe
        Equipe equipe = new Equipe();
        equipe.setNome("RedBull");
        equipe.setAnoDeFundacao(2005);
        equipe.setPatrocinadores(patrocinadores);

        //construtor do carro
        Carro carro = new Carro();
        carro.setNumero(1);
        carro.setPosicao(1);
        carro.setPiloto(piloto);
        carro.setEquipe(equipe);

        //imprimir dados
        System.out.println("avaliacaoFormula1.Piloto: " + carro.getPiloto().getNome());
        System.out.println("Idade: " + carro.getPiloto().getIdade());
        System.out.println("Nacionalidade: " + carro.getPiloto().getNacionalidade());

        System.out.println("avaliacaoFormula1.Equipe: " + carro.getEquipe().getNome());
        System.out.println("Ano de fundação: " + carro.getEquipe().getAnoDeFundacao());

        System.out.println("Numero do carro: " + carro.getNumero());
        System.out.println("Posicao: " + carro.getPosicao());

        System.out.println("Patrocinadores:");
        for (int i = 0; i < carro.getEquipe().getPatrocinadores().length; i++) {
            System.out.println(carro.getEquipe().getPatrocinadores()[i].getNome() + " - R$ " + carro.getEquipe().getPatrocinadores()[i].getValorPatrocinio() );
        }
    }
}
