package encapsulamento.petshop;

public class PetMachine {
        private  int aguaMax;
        private  int shampoo;
        private boolean limpa;
        private boolean banho;
        private Pet pet;

    public PetMachine() {
        this.aguaMax = 30;
        this.shampoo = 10;
        this.limpa = false;
    }

    public void darBanho(){
            if (getAguaMax() >= 10 && getShampoo() >= 2 && this.pet != null){
                setShampoo(getShampoo() - 2);
                setAguaMax( getAguaMax() - 10);
                setLimpa(false);
                System.out.println("Banho do "+ this.pet.getNome()+  "está finalizado");
            }
            else {
            System.out.println("Não foi possivel dar banho :(");
            }
    }
    public  void abastecerAgua(){
        if (getAguaMax() == 30){
            System.out.println("A máquina já está no limite de água. Não é possivel adicionar mais :)");
        }
        else{
            setAguaMax(getAguaMax()+2);
            System.out.println("Foram adicionados 2L de água :)");
        }
    }
    public void abastecershampoo(){
        if (getShampoo() == 10){
            System.out.println("A máquina já está no limite de água. Não é possivel adicionar mais :)");
        }
        else{
            setShampoo(getShampoo()+2);
            System.out.println("Foram adicionados 2L de shampoo :)");
        }
    }
    public  void verificaNivelAgual(){
        System.out.println("Nível da agua: "+ getAguaMax());

    }
    public void verificarNivelShampoo(){
        System.out.println("Nível da Shampoo: "+ getShampoo());
    }
    public void  temPetNoBanho(){
        System.out.println("O "+ this.pet.getNome()+ " está no banho");
    }

    public void colocarPetMaquina(Pet pet){
        if (this.getPet() == null && isLimpa() == true){
        setPet(pet);
        System.out.println("O "+ this.getPet().getNome() + " Está na maquina");
        }
        else {
            System.out.println("A maquina já tem um pet :(. Ou a maquina está suja");
        }
    }
    public void retirarPetMaquina(){

        if (this.getPet() != null ){
        System.out.println("O "+ this.getPet().getNome()+ " Está saindo da maquina");
        setPet(null);
        System.out.println("Agora a máquina está vazia");
        }
        else {
            System.out.println("Não é possivel retirar um pet, pois ela já está vazia :)");
        }

    }

    public void limparMaquina(){
        if (getAguaMax() >= 3 && getShampoo() >= 1 && getPet() == null){
            setShampoo( getShampoo() - 1);
            setAguaMax( getAguaMax() - 3);
            System.out.println("Maquina limpa :)");
            setLimpa(true);
        }
        else {
            System.out.println("Não foi possível limpar. Verifique se há pet ou falta água/shampoo.");
        }
    }

    public boolean isBanho() {
        return banho;
    }

    public void setBanho(boolean banho) {
        this.banho = banho;
    }

    public int getAguaMax() {
        return aguaMax;
    }

    public void setAguaMax(int agua) {
        this.aguaMax = agua;
    }

    private int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public boolean isLimpa() {
        return limpa;
    }

    public void setLimpa(boolean limpa) {
        this.limpa = limpa;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
