public class LivreIndisponibleException extends Exception {
    public LivreIndisponibleException() {
        super("The book is unavailable for borrowing.");
    }

    public LivreIndisponibleException(String message) {
        super(message);
    }

    public LivreIndisponibleException(String message, Throwable cause) {
        super(message, cause);
    }
}
