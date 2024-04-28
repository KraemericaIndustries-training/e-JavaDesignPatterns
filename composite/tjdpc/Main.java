package tjdpc;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Supervisor dean1 = new Supervisor("Dr. Mike", "Dean of Technology");
        Supervisor chair1 = new Supervisor("Dr. John", "Chair of Math");
        Supervisor chair2 = new Supervisor("Dr. Ian", "Chair of CS");

        Professor prof4 = new Professor("Math Professor1", "Adjunct", 301);
        Professor prof5 = new Professor("Math Professor2", "Associate", 302);

        Professor prof6 = new Professor("CSE Professor1", "Adjunct", 303);
        Professor prof7 = new Professor("CSE Professor2", "Professor", 304);
        Professor prof8 = new Professor("CSE Professor3", "Professor", 305);

        dean1.add(chair1);
        dean1.add(chair2);

        chair1.add(prof4);
        chair1.add(prof5);

        chair2.add(prof6);
        chair2.add(prof7);
        chair2.add(prof8);

        System.out.println("***COMPOSITE PATTERN DEMO***");
        System.out.println("\nThe college has the following structure\n");

        System.out.println(dean1.getDetails());
        List<FacultyInterface> chairs = dean1.getMyFaculty();

        for (FacultyInterface chair : chairs) {
            System.out.println("\t" + chair.getDetails());
        }

        List<FacultyInterface> mathProfs = chair1.getMyFaculty();

        for(int i = 0; i < mathProfs.size(); i++) {
            System.out.println("\t\t" + mathProfs.get(i).getDetails());
        }

        List<FacultyInterface> csProfs = chair2.getMyFaculty();

        for (FacultyInterface csProf : csProfs) {
            System.out.println("\t\t" + csProf.getDetails());
        }

        chair2.remove(prof7);

        System.out.println("After the departure:");

        for(int i = 0; i < csProfs.size(); i++) {
            System.out.println("\t\t" + csProfs.get(i).getDetails());
        }
    }
}