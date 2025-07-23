package encapsulamento.petshop;

public class Pet {
    private String nome;
    private  String raca;
    private  String porteAnimal;


    public Pet(String nome, String raca, String porteAnimal) {
        this.nome = nome;
        this.raca = raca;
        this.porteAnimal = porteAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorteAnimal() {
        return porteAnimal;
    }

    public void setPorteAnimal(String porteAnimal) {
        this.porteAnimal = porteAnimal;
    }
}
