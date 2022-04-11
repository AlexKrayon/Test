package Day_37_InheritanceContinue.AnimalTask.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        ProductOwner po = new ProductOwner("Ali",32,'M',"PO","Amazon", 32,90000);

        BusinessAnalysis ba = new BusinessAnalysis("Ayse",22,'F',"Cydeo",45,89000);

        ScrumMaster sm = new ScrumMaster("Asya",24,'F',"Amazon",98,120000);

        Tester tester1 = new Tester("asd",12,'M',"QA","company",54,45000 );
        Tester tester2 = new Tester("gsdd",44,'M',"SDET","company",58,55000 );
        Tester tester3 = new Tester("mkıyg",34,'F',"QA","company",38,75000 );
        Tester[] testers = {tester1,tester2,tester3};

        Developer developer1 = new Developer("Lale",34,'F',"FrontEnd","Amazon",28,120000);

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        for (Tester tester : scrumTeam.testers){
            System.out.println(tester.name+" : "+tester.salary);
        }

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.id);
        }





    }
}
