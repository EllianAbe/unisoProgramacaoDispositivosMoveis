package def;

public class Animal {
    private String nome;
    private String raca;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String caminha(){
        return "caminhando :D";
    }

    // construtores;
    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(){

    };
}
