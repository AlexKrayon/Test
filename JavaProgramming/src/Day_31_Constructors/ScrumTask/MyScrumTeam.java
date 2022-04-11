package Day_31_Constructors.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        //4 testers object

        Tester tester1 = new Tester("John",32,"QA",110000);
        Tester tester2 = new Tester("Ali",33,"QA",120000);
        Tester tester3 = new Tester("Ayşe",34,"SDET",141000);
        Tester tester4 = new Tester("Davis",35,"SE",135000);

        Tester [] testers = {tester2,tester3,tester4};

        // 5 developer objects

        Developer developer1 = new Developer("Olga",22,"Java Dev",145000);
        Developer developer2 = new Developer("Oya",23,"Java Dev",115000);
        Developer developer3 = new Developer("Hayri",36,"Java Dev",95000);
        Developer developer4 = new Developer("Veys",26,"Java Dev",105000);
        Developer developer5 = new Developer("Michelle",21,"Java Dev",85000);

        Developer [] developers = {developer2,developer3,developer4,developer5};

        // 1 scrum team objects
        ScrumTeam scrum = new ScrumTeam("Ahmet","Huseyin", "Yahya",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("-------------------------------------");

        for (Tester eachTester: scrum.testerList) {
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }

        System.out.println("-------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }

        System.out.println("-------------------------------------");

        for (Tester eachTester: scrum.testerList) {
            System.out.println(eachTester.name+" is a "+ eachTester.jobTitle +" gets $"+eachTester.salary+" from our company.");
        }

        System.out.println("-------------------------------------");

        scrum.removeTester(32);
        scrum.removeDeveloper(23);

        System.out.println(scrum);




    }
}
