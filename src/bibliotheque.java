import java.util.ArrayList;

public class bibliotheque {
    ArrayList <livre> mes_livres ;

    public bibliotheque() {
        mes_livres = new ArrayList<livre>();
    }

    public ArrayList<livre> getMes_livres() {
        return mes_livres;
    }


    @Override
    public String toString() {
        return "bibliotheque{" +
                "mes_livres=" + mes_livres +
                '}';
    }
    public void ajouter_livre (livre l){
        if(!mes_livres.contains(l)){
            if(l.getMon_bibliotheque()!=null){
                l.getMon_bibliotheque().enleve(l);
            }
        }
        mes_livres.add(l);
        l.setMon_bibliotheque(this);
    }
    public void enleve (livre l){
        if(mes_livres.contains(l)){
            mes_livres.remove(l);
            l.setMon_bibliotheque(null);
        }

    }
    public void afficher_catalogue() {
        for (int i=0 ; i<mes_livres.size();i++){
            mes_livres.get(i).afficher_details();
        }
    }
    public void emprunter_livre(String t) throws LivreIndisponibleException {
        for (int i = 0; i < mes_livres.size(); i++) {
            if (mes_livres.get(i).getTitre() == t) {
                if (!mes_livres.get(i).isDisponible()) throw new LivreIndisponibleException();
            }
        }
    }
}
