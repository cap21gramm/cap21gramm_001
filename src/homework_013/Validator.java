package homework_013;

class Validator {

    public static boolean validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть менее 20 символов и не содержать пробелы");
        }
        return true;
    }

    public static boolean validatePass(String password) throws WrongPassException {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPassException("Пароль должен быть менее 20 символов, не содержать пробелы." +
                    "Пароль должен содержать хотя бы одну цифру");
        }
        return true;
    }

    public static boolean validatePassConf(String password, String confirmPassword) throws WrongPassException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPassException("Записи паролей не совпадают");
        }
        return true;
    }
}

