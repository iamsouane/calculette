package calculette;

public class Soustraction {
    int a, b;
    public Soustraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soustraire(int a, int b) {
        return a - b;
    }

    public void afficher() {
        System.out.println("soustraction : " + soustraire(a, b));
    }
}
