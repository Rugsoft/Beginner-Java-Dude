package dueloGuerreros;

public class Main {

    public static void main(String[] args) {

        Guerrero Kelemvor = new Guerrero(14, 5, 55, "Kelemvor", 20, 80);
        Guerrero Darius = new Guerrero(12, 6, 60, "Darius", 25, 70);

        Kelemvor.showStats();
        Darius.showStats();

        while (Kelemvor.isAlive() && Darius.isAlive()) {

            if(Kelemvor.getSpeed() > Darius.getSpeed()) {

                Kelemvor.atacar(Darius);
                if (Darius.isAlive() == false) {
                    break;
                }else {
                    Darius.atacar(Kelemvor);
                }
            } else {

                Darius.atacar(Kelemvor);
                if (Kelemvor.isAlive() == false) {
                    break;
                } else {
                    Kelemvor.atacar(Darius);
                }
            }

        }

        if (Kelemvor.isAlive()) {
            System.out.println("\nKelemvor es el vencedor");
        } else {
            System.out.println("\nDarius es el vencedor");
        }

    }

}