public class TesteBiblio {
    public static void main(String[] args) {
        Livro livro1 = new Livro("hora da estrela");
        System.out.println(livro1.getTitulo() + " - " + livro1.getSituacao());

        livro1.emprestar();
        System.out.println(livro1.getTitulo() + " - " + livro1.getSituacao());

        livro1.devolver();
        System.out.println(livro1.getTitulo() + " - " + livro1.getSituacao());

        Periodico revista = new Periodico("revista ifrs", 67);
        System.out.println(revista.getTitulo() + " - Volume " + revista.getNumeroVolume());
    }
}
