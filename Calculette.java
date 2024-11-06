package calculette;

public class Calculette {
    public static void main(String[] args) {
        Addition addition = new Addition(3, 23);
        addition.afficher();

        Soustraction soustraction = new Soustraction(45, 04);
        soustraction.afficher();

        Multiplication multiplication = new Multiplication(5, 2);
        multiplication.afficher();

        Division division = new Division(45, 5);
        division.afficher();
    }
}
