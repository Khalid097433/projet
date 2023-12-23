 abstract class Livre {
    protected String titre;
    protected String auteur;
    protected boolean disponible;
    protected bibliotheque maBibliotheque;

    public Livre(String t, String a, boolean d) {
        this.titre = t;
        this.auteur = a;
        this.disponible = d;
    }

    public bibliotheque getMaBibliotheque() {
        return maBibliotheque;
    }

    public void setMaBibliotheque(bibliotheque maBibliotheque) {
        this.maBibliotheque = maBibliotheque;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    abstract void afficherDetails();

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", disponible=" + disponible +
                ", maBibliotheque=" + maBibliotheque +
                '}';
    }
}
