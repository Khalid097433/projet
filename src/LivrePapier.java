public class LivrePapier extends livre {
    @Override
    void afficher_details() {
        System.out.println("\"livre{\" +\n" +
                "                \"titre='\" + titre + '\\'' +\n" +
                "                \", auteur='\" + auteur + '\\'' +\n" +
                "                \", disponible=\" + disponible +\n" +
                "                \", mon_bibliotheque=\" + mon_bibliotheque +\n" +
                "                '}'");
    }

    int nombre_de_pages ;

    public LivrePapier(int nombre_de_pages, String titre, String auteur, boolean disponible) {
        super(titre, auteur, disponible);
        this.nombre_de_pages = nombre_de_pages;
    }


    public int getNb_page() {
        return nombre_de_pages;
    }

    public void setNb_page(int nb_page) {
        this.nombre_de_pages = nb_page;
    }

    @Override
    public String toString() {
        return "LivrePapier{" +
                "nombre_de_pages=" + nombre_de_pages +
                '}';
    }

}
