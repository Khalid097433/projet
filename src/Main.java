import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livre l1 , l2;
        l1 = new LivreNumerique("PDF" , "baris" , "bitch" , true);
        l2 = new LivrePapier (500,"la vie qu'on mene","houssein" , false);
        bibliotheque b1 = new bibliotheque();
        b1.ajouter_livre(l1);
        b1.ajouter_livre(l2);
        try {
            b1.emprunter_livre("baris");
            b1.emprunter_livre("la vie qu'on mene");
        } catch (LivreIndisponibleException e) {
            System.out.println("Erreur de retrait : " + e.getMessage());
        }
    }
}
