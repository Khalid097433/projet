public class LivreNumerique extends livre {
    String format;

    public LivreNumerique(String format, String auteur, boolean disponible, String titre) {
        super(titre, auteur, disponible);
        this.format = format;
    }
    public String gettitre(){
        return titre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    void afficher_details() {
        System.out.println("\"livre{\" +\n" +
                "                \"titre='\" + titre + '\\'' +\n" +
                "                \", auteur='\" + auteur + '\\'' +\n" +
                "                \", disponible=\" + disponible +\n" +
                "                \", mon_bibliotheque=\" + mon_bibliotheque +\n" +
                "                '}'");
    }

    @Override
    public String toString() {
        return "LivreNumerique{" +
                "format='" + format + '\'' +
                '}';
    }
}
