public class Facultate {
    private String nume;
    private String oras;
    private int nrStudenti;

    public Facultate(String nume, String oras) {
        this(nume, oras, 0);
    }

    public Facultate(String nume, String oras, int nrStudenti) {
        this.nume = nume;
        this.oras = oras;
        this.nrStudenti = nrStudenti;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public void setNrStudenti(int nrStudenti) {
        this.nrStudenti = nrStudenti;
    }

    public String getNume() {
        return nume;
    }

    public String getOras() {
        return oras;
    }

    public int getNrStudenti() {
        return nrStudenti;
    }

    public void increaseNrStudenti() {
        this.nrStudenti++;
    }

    @Override
    public String toString() {
        return this.nume + ", oras " + this.oras + ", nr studenti " + this.nrStudenti;
    }
}
