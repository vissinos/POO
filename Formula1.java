package avaliacaoFormula1;

class Carro {

    //variaveis
    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto;

    //construtor
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //metodo
    public int getNumero() {
        return numero;
    }
    //construtor
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    //metodo
    public int getPosicao() {
        return posicao;
    }
    //construtor
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    //metodo
    public Equipe getEquipe() {
        return equipe;
    }
    //construtor
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    //metodo
    public Piloto getPiloto() {
        return piloto;
    }
}

class Piloto {

    //variaveis
    private String nome;
    private int idade;
    private String nacionalidade;

    //construtor
    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo
    public String getNome() {
        return nome;
    }

    //construtor
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //metodo
    public int getIdade() {
        return idade;
    }

    //construtor
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    //metodo
    public String getNacionalidade() {
        return nacionalidade;
    }
}

class Equipe {

    //variaveis
    private String nome;
    private int anoDeFundacao;
    private Patrocinador[] patrocinadores;

    //construtor
    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo
    public String getNome() {
        return nome;
    }

    //construtor
    public void setAnoDeFundacao(int anoDeFundacao) {
        this.anoDeFundacao = anoDeFundacao;
    }

    //metodo
    public int getAnoDeFundacao() {
        return anoDeFundacao;
    }

    //construtor
    public void setPatrocinadores(Patrocinador[] patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    //metodo
    public Patrocinador[] getPatrocinadores() {
        return patrocinadores;
    }
}

class Patrocinador {

    //variaveis
    private String nome;
    private int valorPatrocinio;

    //construtor
    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo
    public String getNome() {
        return nome;
    }

    //construtor
    public void setValorPatrocinio(int valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }

    //metodo
    public int getValorPatrocinio() {
        return valorPatrocinio;
    }
}