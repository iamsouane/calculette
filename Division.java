package calculette;

public class Division {
    int a, b;
    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int diviser(int a, int b) {
        return a / b;
    }

    public void afficher() {
        System.out.println("division : " + diviser(a, b));
    }
}
