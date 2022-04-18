package Day_42_ExceptionContinue;

public class Keywords {
    public static void main(String[] args) {
        System.out.println("-----------Push up started---------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPush up 1"+i);

            sleep(1.5);
            /*try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("-------Push up completed-------------");

        System.out.println("-----------Pull up started---------------");

        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPull up 1"+i);

            sleep(2.5);
            /*try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("\n-------Pull up completed-------------");

    }
    public static void sleep (double seconds){

        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
