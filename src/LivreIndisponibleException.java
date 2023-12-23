public class LivreIndisponibleException extends Exception {
    public LivreIndisponibleException(String s) {
        super("le livre n'est pas disponible");
    }

}
