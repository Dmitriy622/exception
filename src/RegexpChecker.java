public class RegexpChecker implements Checker {


    private static final String REGEXP = "^\\w{1, 20}$";

    @Override
    public void checkLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Длина или символы некорректны");
        }

    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        if (password.length() > 20) {
            throw new WrongPasswordException("Длина или символы некорректны");
        }

    }

    @Override
    public void checkPasswords(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
