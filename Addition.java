package calculette;

public class Addition {
    int a, b;
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int additionner(int a, int b) {
        return a + b;
    }

    public void afficher() {
        System.out.println("addition : " + additionner(a, b));
    }
}
