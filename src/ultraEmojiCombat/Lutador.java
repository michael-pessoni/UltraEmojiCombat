package ultraEmojiCombat;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String  categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Metodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    private void setCategoria(){
        if (peso < 52.2){
            categoria = "Invalido";
        }else if (peso<=70.3){
            categoria = "Leve";
        }else if (peso<=83.9){
            categoria = "Médio";
        }else if (peso<=120.2){
            categoria = "Pesado";
        }else {
            categoria = "Inválido";
        }
    }

    public String getCategoria(){
        return categoria;
    }

    //Métodos abstratos
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
        System.out.println("Parabéns, " + getNome() + "!! Você adcionou uma vitória ao seu histórico.");
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
        System.out.println("Ouch, " + getNome() + "! Você agora tem mais uma derrota amarga no seu histórico.");
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
        System.out.println("Um empate! Vamos lá, não é tão ruim assim. Você ganhou experiência.");
    }

    public void apresentar(){
        System.out.println("-----------------------------");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Apresentamos o lutador " + getNome());
        System.out.println("Diretamente da " + getNacionalidade());
        System.out.println("Com " + getIdade()+ " anos");
        System.out.println("Pesando " + getPeso() + " Kg");
        System.out.println("Ganhou " + getVitorias());
        System.out.println("Perdeu " + getDerrotas());
        System.out.println("Empatou " + getEmpates());
        System.out.println("-----------------------------");
    }

    public void status(){
        System.out.println(getNome() + " é um peso " + getCategoria() + " com " + getVitorias() + " vitórias " + getDerrotas() + " derrotas " + getEmpates() + " empates.");
    }

}
