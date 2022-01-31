public class Principal {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(5);
        double peric1 = circulo1.getPerimetro();
        System.out.println("Perimetro de c1: " + peric1);

        Circulo circulo2 = new Circulo();
        circulo2.setRadio(10);
        System.out.println("Perimetro de c2" + circulo2.getPerimetro());
    }
}
