package def;

import def.Animal;

public class Cachorro extends Animal {
    public String late(){
        return "AuAu!";
    }

    // para atender o construtor da classe pai;
    public Cachorro(String nome){
        super(nome);
    }

    public Cachorro(){

    };
}
