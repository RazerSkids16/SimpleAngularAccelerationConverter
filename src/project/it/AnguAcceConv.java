package project.it;

import java.util.Scanner;

public class AnguAcceConv {

    static void SubMenuRad() {
        System.out.println("\nRADIAN/SQUARE SECOND CONVERTED TO:\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"
                + "\t\t♠♠ [1.] RADIAN/SQUARE MINUTE     ♠♠\n"
                + "\t\t♠♠ [2.] REVOLUTION/SQUARE SECOND ♠♠\n"
                + "\t\t♠♠ [3.] REVOLUTION/MINUTE/SECOND ♠♠\n"
                + "\t\t♠♠ [4.] REVOLUTION/SQUARE MINUTE ♠♠\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");
        System.out.print("\nTYPE IN THE NUMBER OF YOUR CHOICE: ");
    }

    static void SubMenuRadMin() {
        System.out.println("\nRADIAN/SQUARE MINUTE CONVERTED TO:\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"
                + "\t\t♠♠ [1.] RADIAN/SQUARE SECOND     ♠♠\n"
                + "\t\t♠♠ [2.] REVOLUTION/SQUARE SECOND ♠♠\n"
                + "\t\t♠♠ [3.] REVOLUTION/MINUTE/SECOND ♠♠\n"
                + "\t\t♠♠ [4.] REVOLUTION/SQUARE MINUTE ♠♠\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");
        System.out.print("\nTYPE IN THE NUMBER OF YOUR CHOICE: ");
    }

    static void SubMenuRevSec() {
        System.out.println("\nREVOLUTION/SQUARE SECOND CONVERTED TO:\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"
                + "\t\t♠♠ [1.] RADIAN/SQUARE SECOND     ♠♠\n"
                + "\t\t♠♠ [2.] RADIAN/SQUARE MINUTE     ♠♠\n"
                + "\t\t♠♠ [3.] REVOLUTION/MINUTE/SECOND ♠♠\n"
                + "\t\t♠♠ [4.] REVOLUTION/SQUARE MINUTE ♠♠\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");
        System.out.print("\nTYPE IN THE NUMBER OF YOUR CHOICE: ");
    }

    static void SubMenuRevMins() {
        System.out.println("\nREVOLUTION/MINUTE/SECOND CONVERTED TO:\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"
                + "\t\t♠♠ [1.] RADIAN/SQUARE SECOND     ♠♠\n"
                + "\t\t♠♠ [2.] RADIAN/SQUARE MINUTE     ♠♠\n"
                + "\t\t♠♠ [3.] REVOLUTION/SQUARE SECOND ♠♠\n"
                + "\t\t♠♠ [4.] REVOLUTION/SQUARE MINUTE ♠♠\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");
        System.out.print("\nTYPE IN THE NUMBER OF YOUR CHOICE: ");
    }

    static void SubMenuRevMin() {
        System.out.println("\nREVOLUTION/SQUARE MINUTE CONVERTED TO:\n"
                + "\n\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"
                + "\t\t♠♠ [1.] RADIAN/SQUARE SECOND     ♠♠\n"
                + "\t\t♠♠ [2.] RADIAN/SQUARE MINUTE     ♠♠\n"
                + "\t\t♠♠ [3.] REVOLUTION/SQUARE SECOND ♠♠\n"
                + "\t\t♠♠ [4.] REVOLUTION/MINUTE/SECOND ♠♠\n"
                + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");
        System.out.print("\nTYPE IN THE NUMBER OF YOUR CHOICE: ");
    }

    public static void main(String[] reymar) {
        Scanner scan = new Scanner(System.in);

        int SubOption;
        char Option;
        double Rad, RadMin, RevSec, RevMins, RevMin;

        System.out.print("\n\n\t╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩");
        System.out.println("\n\t\t  ☻ANGULAR ACCCELERATION CONVERTER☻\n"
                + "\t╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩");
        do {

            System.out.println("\nCHOOSE THE ORIGIN OF THE ACCELERATION: \n"
                    + "\n\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"
                    + "\t\t♠♠ [A.] RADIAN/SQUARE SECOND     ♠♠\n"
                    + "\t\t♠♠ [B.] RADIAN/SQUARE MINUTE     ♠♠\n"
                    + "\t\t♠♠ [C.] REVOLUTION/SQUARE SECOND ♠♠\n"
                    + "\t\t♠♠ [D.] REVOLUTION/MINUTE/SECOND ♠♠\n"
                    + "\t\t♠♠ [E.] REVOLUTION/SQUARE MINUTE ♠♠\n"
                    + "\t\t♠♠ [Q.] QUIT THE CONVERSION      ♠♠\n"
                    + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"
                    + "\nTYPE THE LETTER OF THE CORRESPONDING CHOICE:");
            Option = scan.next().charAt(0);
            System.out.println("\t====================================================");

            if (Option == 'A' || Option == 'a') {
                SubMenuRad();
                SubOption = scan.nextInt();
                System.out.println("ENTER THE VALUE OF RADIAN/SQUARE SECOND: ");
                Rad = scan.nextDouble();

                if (SubOption == 1) {
                    RadMin = Rad * 3600.00;
                    System.out.printf("RADIAN/SQUARE MINUTE = %f rad/min2", RadMin);
                } else if (SubOption == 2) {
                    RevSec = Rad * 0.159;
                    System.out.printf("REVOLUTION/SQUARE SECOND = %f r/sec2", RevSec);
                } else if (SubOption == 3) {
                    RevMins = Rad * 9.549;
                    System.out.printf("REVOLUTION/MINUTE/SECOND = %f r/(min*s)", RevMins);
                } else if (SubOption == 4) {
                    RevMin = Rad * 572.958;
                    System.out.printf("REVOLUTION/SQUARE MINUTE = %f r/min2", RevMin);
                } else if (SubOption >= 5) {
                    System.err.println("INVALID KEY!");
                    System.exit(0);
                }
            }
            if (Option == 'B' || Option == 'b') {
                SubMenuRadMin();
                SubOption = scan.nextInt();
                System.out.println("ENTER THE VALUE OF RADIAN/SQUARE MINUTE: ");
                RadMin = scan.nextDouble();
                if (SubOption == 1) {
                    Rad = RadMin * 0.000277777778;
                    System.out.printf("RADIAN/SQUARE SECOND = %f rad/s2", Rad);
                } else if (SubOption == 2) {
                    RevSec = RadMin * 0.00004420970641667;
                    System.out.printf("REVOLUTION/SQUARE SECOND = %f r/sec2", RevSec);
                } else if (SubOption == 3) {
                    RevMins = RadMin * 0.00265258238;
                    System.out.printf("REVOLUTION/MINUTE/SECOND = %f r/(min*s)", RevMins);
                } else if (SubOption == 4) {
                    RevMin = RadMin * 0.159154943;
                    System.out.printf("REVOLUTION/SQUARE MINUTE = %f r/min2", RevMin);
                } else if (SubOption >= 5) {
                    System.err.println("INVALID KEY!");
                    System.exit(0);
                }
            }
            if (Option == 'C' || Option == 'c') {
                SubMenuRevSec();
                SubOption = scan.nextInt();
                System.out.println("ENTER THE VALUE OF REVOLUTION/SQUARE SECOND: ");
                RevSec = scan.nextDouble();
                if (SubOption == 1) {
                    Rad = RevSec * 6.28318530686;
                    System.out.printf("RADIAN/SQUARE SECOND = %f rad/s2", Rad);
                } else if (SubOption == 2) {
                    RadMin = RevSec * 22619.46710469;
                    System.out.printf("RADIAN/SQUARE MINUTE = %f rad/min2", RadMin);
                } else if (SubOption == 3) {
                    RevMins = RevSec * 60;
                    System.out.printf("REVOLUTION/MINUTE/SECOND = %f r/s2", RevMins);
                } else if (SubOption == 4) {
                    RevMin = RevSec * 3600.000000251;
                    System.out.printf("REVOLUTION/SQUARE SECOND = %f r/min2", RevMin);
                } else if (SubOption >= 5) {
                    System.err.println("INVALID KEY!");
                }
            }
            if (Option == 'D' || Option == 'd') {
                SubMenuRevMins();
                SubOption = scan.nextInt();
                System.out.println("ENTER THE VALUE OF REVOLUTION/MINUTE/SECOND: ");
                RevMins = scan.nextDouble();
                if (SubOption == 1) {
                    Rad = RevMins * 0.1047197551143;
                    System.out.printf("RADIAN/SQUARE SECOND = %f Rad/s2", Rad);
                } else if (SubOption == 2) {
                    RadMin = RevMins * 376.9911184116;
                    System.out.printf("RADIAN/SQUARE MINUTE = %f rad/min2", RadMin);
                } else if (SubOption == 3) {
                    RevSec = RevMins * 0.01666666666667;
                    System.out.printf("REVOLUTION/SQUARE SECOND = %f r/(mins*s)", RevMins);
                } else if (SubOption == 4) {
                    RevMin = RevMins * 60.00000000419;
                    System.out.printf("REVOLUTION/SQUARE MINUTE = %f r/min2", RevMin);
                } else if (SubOption >= 5) {
                    System.err.println("INVALID KEY!");
                    System.exit(0);
                }
            }
            if (Option == 'E' || Option == 'e') {
                SubMenuRevMin();
                SubOption = scan.nextInt();
                System.out.println("ENTER THE VALUE OF REVOLUTION/SQUARE MINUTE: ");
                RevMin = scan.nextDouble();
                if (SubOption == 1) {
                    Rad = RevMin * 0.001745329251784;
                    System.out.printf("RADIAN/SQUARE SECOND = %f rad/s2", Rad);
                } else if (SubOption == 2) {
                    RadMin = RevMin * 6.283185306421;
                    System.out.printf("RADIAN/SQAURE MINUTE = %f rad/min2", RadMin);
                } else if (SubOption == 3) {
                    RevSec = RevMin * 0.0002777777777574;
                    System.out.printf("REVOLUTION/SQUARE SECOND = %f r/s2", RevSec);
                } else if (SubOption == 4) {
                    RevMins = RevMin * 0.0166666666655;
                    System.out.printf("REVOLUTION/MINUTE/SECOND = %f r/min2", RevMin);
                } else if (SubOption >= 5) {
                    System.out.println("INVALID KEY!");
                    System.exit(0);
                }
            } else if (Option == 'Q' || Option == 'q') {
                System.err.println("\t\t   THANK YOU AND HAVE A NICE DAY!");
                System.exit(0);
            }
            System.out.println("\n\n\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
            System.out.println("\t\t♠♠ DO YOU WANT TO CONVERT MORE?  ♠♠"
                    + "\n\t\t♠♠ [Y.] YES                      ♠♠"
                    + "\n\t\t♠♠ [N.] NO                       ♠♠\n"
                    + "\t\t¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
            System.out.print("INPUT HERE: ");
            Option = scan.next().charAt(0);

            if (Option == 'N' || Option == 'n') {
                System.err.println("\n\t\tTHANK YOU FOR USING THE CONVERTER!\n"
                        + "\t\t      HAVE A NICE DAY AHEAD!");
                System.exit(0);
            } else if (Option == 'Y' || Option == 'y') {
                System.out.println("\n\t\t\t>>>>> MAIN MENU <<<<<");
            } else {
                System.err.println("INVALID INPUT!");
                System.exit(0);
            }
        } while (Option != 'S');
    }
}