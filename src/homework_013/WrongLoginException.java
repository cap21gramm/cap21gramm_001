package homework_013;

class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
