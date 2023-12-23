public class LivreNumerique extends Livre {
    String format;

    public LivreNumerique(String format, String titre, String auteur, boolean disponible) {
        super(titre, auteur, disponible);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    void afficherDetails() {
        System.out.println("Livre Numérique : " + titre + " de " + auteur + ", " +
                (disponible ? "disponible" : "indisponible") +
                ", Format : " + format);
    }

    @Override
    public String toString() {
        return "LivreNumerique{" +
                "format='" + format + '\'' +
                '}';
    }
}
