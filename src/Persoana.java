public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;
    private long id;
    static long var;

    static {
        var = 0;
    }

    {
        var++;
    }

    public  Persoana() { }

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.id = var;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nume si prenume: " + this.nume + " " + this.prenume + " ,varsta " + this.varsta + " ,id " + this.id;
    }

    public static void main(String[] args) {

        Persoana p1 = new Persoana("Andrei", "Vasile", 4);
        Persoana p2 = new Persoana("Doru", "Mancila", 5);
        Persoana p3 = new Persoana("Bogdan", "Alexe", 6);

        System.out.println(p1.toString() + "\n" + p2.toString() + "\n" + p3.toString());
    }
}
