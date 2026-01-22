package esInfrastructure.esTools;

public abstract class esCMD {

    private esCMD() {}

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void println(String msg){
        System.out.println(esCMDColor.CYAN + msg + esCMDColor.RESET);
    } 
    public static void printlnError(String msg){
        System.out.println(esCMDColor.RED + msg + esCMDColor.RESET);
    } 
}
