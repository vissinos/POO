public class TesteEstudante {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("João");
        aluno.insereNotas();
        System.out.println("Média: " + aluno.calculaMedia());
        System.out.println("Menor nota: " + aluno.menorNota());
    }
}
