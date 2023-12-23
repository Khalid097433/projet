import java.util.ArrayList;

public class bibliotheque {
    ArrayList <Livre> mes_livres ;

    public bibliotheque() {
        mes_livres = new ArrayList<Livre>();
    }

    public ArrayList<Livre> getMes_livres() {
        return mes_livres;
    }


    @Override
    public String toString() {
        return "bibliotheque{" +
                "mes_livres=" + mes_livres +
                '}';
    }
    public void ajouter_livre (Livre l){
        if(!mes_livres.contains(l)){
            if(l.getMaBibliotheque()!=null){
                l.getMaBibliotheque().enleve(l);
            }
        }
        mes_livres.add(l);
        l.setMaBibliotheque(this);
    }
    public void enleve (Livre l){
        if(mes_livres.contains(l)){
            mes_livres.remove(l);
            l.setMaBibliotheque(null);
        }

    }
    public void afficher_catalogue() {
        for (int i=0 ; i<mes_livres.size();i++){
            mes_livres.get(i).afficherDetails();
        }
    }
    public void emprunter_livre(String titre) throws LivreIndisponibleException {
        for (Livre livre : mes_livres) {
            if (livre.titre.equals(titre)) {
                if (livre.disponible) {
                    livre.disponible = false;
                    System.out.println("Livre emprunté : " + titre);
                    return;
                } else {
                    throw new LivreIndisponibleException("Livre indisponible pour emprunt.");
                }
            }
        }
        System.out.println("Livre non trouvé dans la bibliothèque.");
    }
}
