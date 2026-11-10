public class Jerarquia {
    static void cadena(Class<?> c) {
        String s = c.getSimpleName();
        Class<?> p = c.getSuperclass();
        while (p != null) {
            s += " -> " + p.getSimpleName();
            p = p.getSuperclass();
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        cadena(ArithmeticException.class);
        cadena(java.io.FileNotFoundException.class);
    }
}