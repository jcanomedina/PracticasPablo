public class Main {
    public static void main(String[] args) {

        Fecha f1 = new Fecha (23, 2, 1980);
        Fecha f2 = new Fecha (14, 7, 1981);

        System.out.println("Diferencia en dias = " + f1.diferencia(f2));
    }
}