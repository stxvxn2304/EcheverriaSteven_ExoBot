package esFramework;

public class esException extends Exception {
    public esException(String e, String clase, String metodo) {
        System.out.println("[ERROR EN APP ---> LOG] " + clase + "." + metodo + ": " + e);
    }

    @Override
    public String getMessage() {
        return "NO sea sapo...";
    }

}
