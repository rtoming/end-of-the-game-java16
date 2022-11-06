package ee.secretagency.endofthegame.exception;

// TODO: why Runtime ????
public class IncomeNotFoundException extends RuntimeException {
    public IncomeNotFoundException() {
    }

    public IncomeNotFoundException(String message) {
        super(message);
    }

    public IncomeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncomeNotFoundException(Throwable cause) {
        super(cause);
    }

    public IncomeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
