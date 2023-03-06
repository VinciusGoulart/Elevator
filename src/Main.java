import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        boolean up, down, check = true;
        Elevator ele = new Elevator();

        System.out.println("Configure your elevator with max capacity and total floor");
        ele.initialize(20, 10);
        System.out.println(ele);

        do {
            System.out.println("How much person will enter");
            ele.enter(sc.nextInt());

            do {
                System.out.println("1- Up  or 2- Down");
                choose = sc.nextInt();
                switch (choose) {

                    case 1:

                        while (check) {
                            System.out.println("Which floor did you wanna go up?");
                            up = ele.up(sc.nextInt());

                            if (up) {
                                System.out.println("How much person will exit?");
                                ele.out(sc.nextInt());
                                check = false;
                            }
                        }

                        System.out.println(ele);

                        break;
                    case 2:

                        while (check) {
                            System.out.println("Which floor did you wanna go down?");
                            down = ele.down(sc.nextInt());
                            if (down) {
                                System.out.println("How much person will exit?");
                                ele.out(sc.nextInt());
                                check = false;
                            }
                        }
                        System.out.println(ele);
                        break;
                    default:
                        System.out.println("Wrong choice. ");
                        System.out.println(ele);
                }
                check = true;
            } while (choose != 1 && choose != 2);


        } while (ele.getAmountPerson() != 0);


        sc.close();

    }

}