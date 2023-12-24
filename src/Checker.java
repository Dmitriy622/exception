public interface Checker {
    void checkLogin(String login) throws WrongLoginException;
    void checkPassword(String password) throws WrongPasswordException;
    void checkPasswords(String password, String confirmPassword) throws WrongPasswordException;
}
