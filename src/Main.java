public class Main {

    public static void main(String[] args) {
        Sumn n1 = new Sumn();
        n1.setN(325.84);
        System.out.println(n1.getSumn());
        n1.setN(891.21);
        System.out.println(n1.getSumn());
        Numn n2 = new Numn();
        n2.setN(325.84);
        System.out.println(n2.getMax());
        System.out.println(n2.getMin());
        n2.setN(891.21);
        System.out.println(n2.getMax());
        System.out.println(n2.getMin());

    }
}
