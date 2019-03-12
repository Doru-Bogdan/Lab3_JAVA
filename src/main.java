import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {

    public static ArrayList<Facultate> addFacultate() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/dorumancila/Desktop/Lab3_JAVA/src/facultate.txt"));
        ArrayList<Facultate> vector = new ArrayList<>();
        while (scan.hasNext()) {
            String line;
            line = scan.nextLine();
            String[] elem = line.split(" ");
            String oras = elem[elem.length - 1];
            String nume = "";
            for (int i = 0; i < elem.length - 2; i++) {
                nume += elem[i] + " ";
            }
            nume += elem[elem.length-2];
            boolean gasit = false;
            for (Facultate f : vector)
                if (f.getNume().equals(nume) && f.getOras().equals(oras)) {
                    gasit = true;
                }

            if (gasit == false)
                vector.add(new Facultate(nume, oras));
        }

        return vector;
    }


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Facultate> vector;
        ArrayList<Student> studenti;

        vector = addFacultate();
        studenti = functie(vector);

        for (Facultate f : vector)
            System.out.println(f.toString());

        System.out.println("Studenti care locuiesc in acelasi oras unde fac si facultatea: ");
        for ( Student s : studenti) {
            if(s.getOras().equals(s.getFacultate().getOras())) {
                System.out.println(s.getNume());
            }
        }

    }


    public static ArrayList<Student> functie(ArrayList<Facultate> vector) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/dorumancila/Desktop/Lab3_JAVA/src/studenti.txt"));
        ArrayList<Student> studenti = new ArrayList<>();
        while (scan.hasNext()) {
            String line;
            line = scan.nextLine();
            String[] elem = line.split(",");
            String nume, prenume, oras, specializare, varsta, numeFacultate;
            nume = elem[0];
            prenume = elem[1];
            oras = elem[2];
            specializare = elem[3];
            varsta = elem[4];
            numeFacultate = elem[5];

            for (Facultate f : vector) {
                if (numeFacultate.equals(f.getNume())) {
                    studenti.add(new Student(nume, prenume, Integer.parseInt(varsta), specializare, oras, f));
                    break;
                }
            }
        }
        Collections.sort(vector, new Comparator<Facultate>() {
            @Override
            public int compare(Facultate o1, Facultate o2) {
                if(o1.getNrStudenti() < o2.getNrStudenti())
                    return 1;
                return -1;
            }
        });
        scan.close();
        PrintWriter print = new PrintWriter(new File("/Users/dorumancila/Desktop/Lab3_JAVA/src/facultati_out.txt"));
        for (Facultate f : vector)
            print.print(f.toString() + "\n");
        print.close();
        return studenti;
    }
}

