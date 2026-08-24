public class TesteEstudante {
    public static void main(String[] args) {
        Estudante[] turma = new Estudante[3];
        turma[0] = new Estudante("João");
        turma[1] = new Estudante("Maria");
        turma[2] = new Estudante("Pedro");

        for (int i = 0; i < turma.length; i++) {
            turma[i].insereNotas();
        }

        Estudante[] aprovados = aprovados(turma);

        if (aprovados == null) {
            System.out.println("Nenhum estudante foi aprovado.");
        } else {
            System.out.println("Estudantes aprovados:");
            for (int i = 0; i < aprovados.length; i++) {
                System.out.println(aprovados[i].getNome());
            }
        }
    }

    public static Estudante[] aprovados(Estudante[] estudantes) {
        int quantidade = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6) {
                quantidade++;
            }
        }

        if (quantidade == 0) {
            return null;
        }

        Estudante[] aprovadosArray = new Estudante[quantidade];
        int pos = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6) {
                aprovadosArray[pos] = estudantes[i];
                pos++;
            }
        }

        return aprovadosArray;
    }
}
