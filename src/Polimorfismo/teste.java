package Polimorfismo;

public class teste {
    public static void main(String[] args) {
        System.out.println("Inicio teste");
        Cachorro cachorro = new Cachorro();
        
        testePolimorfismo(cachorro);
    }
    public static void testePolimorfismo(Describable describable){
        System.out.println("Teste Sucesso!");
    } 
}
