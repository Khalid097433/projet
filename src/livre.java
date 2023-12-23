public abstract class livre {
    protected String titre ;
    protected String auteur ;
    protected boolean disponible;
    bibliotheque mon_bibliotheque;

    public livre(String t, String a, boolean d) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
        this.mon_bibliotheque = mon_bibliotheque;
    }

    public bibliotheque getMon_bibliotheque() {
        return mon_bibliotheque;
    }

    public void setMon_bibliotheque(bibliotheque mon_bibliotheque) {
        this.mon_bibliotheque = mon_bibliotheque;
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

    abstract void afficher_details ();

    @Override
    public String toString() {
        return "livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", disponible=" + disponible +
                ", mon_bibliotheque=" + mon_bibliotheque +
                '}';
    }
}
