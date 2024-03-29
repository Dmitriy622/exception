public class LoopChecker implements Checker {

    private static final String ALPHABET = "0123456789_ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    @Override
    public void checkLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть меньше или равна 20 символам");
        }
        for (int i = 0; i < login.length(); i++) {
            if (!ALPHABET.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Использован некорректный символ: %c".formatted(login.charAt(i)));
            }
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        if (password.length() > 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше или равна 20 символам");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!ALPHABET.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException("Использован некорректный символ: %c".formatted(password.charAt(i)));
            }
        }
    }

    @Override
    public void checkPasswords(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
