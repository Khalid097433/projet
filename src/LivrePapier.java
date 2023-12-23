public class LivrePapier extends Livre {
    int nombreDePages;

    public LivrePapier(int nbPages, String titre, String auteur, boolean disponible) {
        super(titre, auteur, disponible);
        this.nombreDePages = nbPages;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nbPages) {
        this.nombreDePages = nbPages;
    }

    @Override
    void afficherDetails() {
        System.out.println("Livre Papier : " + titre + " de " + auteur + ", " +
                (disponible ? "disponible" : "indisponible") +
                ", Nombre de pages : " + nombreDePages);
    }

    @Override
    public String toString() {
        return "LivrePapier{" +
                "nombreDePages=" + nombreDePages +
                '}';
    }
}
