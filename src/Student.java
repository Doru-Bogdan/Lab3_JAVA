public class Student extends Persoana {
    private String specializare;
    protected Facultate facultate;
    private String oras;

    public Student(String nume, String prenume, int varsta, String specializare, String oras, Facultate facultate) {
        super(nume, prenume, varsta);
        this.specializare = specializare;
        this.facultate = facultate;
        this.oras = oras;
        this.facultate.increaseNrStudenti();
    }

    public Student() {
    }

    @Override
    public String toString() {
        return super.toString() + ", specializare " + this.specializare + ", facultate " + this.facultate;
    }

    public Facultate getFacultate() {
        return facultate;
    }

    public String getOras() {
        return oras;
    }

    public static void main(String[] args) {
        Facultate f1 = new Facultate("Unibuc", "Bucuresti");
        Student s1 = new Student("Andrei", "Vasile", 4,"Bucuresti", "CTI", f1);
        System.out.println(s1.toString());
    }
}
