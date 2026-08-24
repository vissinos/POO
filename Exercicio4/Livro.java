public class Livro extends Publicacao {
    private String situacao;
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.situacao = "disponivel";
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            situacao = "emprestado";
            disponivel = false;
        } else {
            System.out.println("O livro já está emprestado");
        }
    }

    public void devolver() {
        situacao = "disponivel";
        disponivel = true;
    }

    public String getSituacao() {
        return situacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
