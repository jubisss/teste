
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Mamifero m1 = new Mamifero();
        Marsupial mar1 = new Marsupial();

        a1.setEspecie("ana beatriz");
        a1.setExtinto(false);
        a1.setnPatas(4);
        System.out.println("Espécie: "+a1.getEspecie()+"\nNumero de patas: "+a1.getnPatas()+"\nEstá extinto?: "+a1.isExtinto());

        m1.setEspecie("Ana clara");
        m1.setExtinto(false);
        m1.setLeite(true);
        System.out.println("\nEspécie: "+m1.getEspecie()+"\nProduz leite?: "+m1.isLeite()+"\nEstá extinto?: "+m1.isExtinto());

        mar1.setEspecie("canguru");
        mar1.setBolsa(true);
        System.out.println("\nEspécie: "+mar1.getEspecie()+"\nTem bolsa?: "+mar1.isBolsa());


    }
}