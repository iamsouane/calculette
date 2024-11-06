package calculette;

public class Multiplication {
    int a, b;
    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int multiplier(int a, int b) {
        return a * b;
    }

    public void afficher() {
        System.out.println("multiplication : " + multiplier(a, b));
    }
}
