package def;

import def.Animal;

public class Gato extends Animal {
    public String mia(){
        return "Miau!";
    }

    //para atender ao construtor da classe pai;
    public Gato(String nome){
        super(nome);
    }

    public Gato(){

    };
}
