import java.util.Random;
import java.util.Scanner;

public class mainmethod {
    public static void main(String[] args) {
        new game();
    }
}

class invalidinput extends Exception {
    invalidinput(String str) {
        super(str);
    }
}

class game {
    Scanner sc = new Scanner(System.in);
    final char a[][] = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
    char ip, comp;
    boolean flag = false;

    game() {
        System.out.println("*****************************************************");
        System.out.println("\t\tWELCOME TO TIC TAC TOE");
        System.out.println("*****************************************************");
        choice1();
        while (flag) {
            System.out.println("Wrong input! retry");
            choice1();
        }
        if (ip == 'x' || ip == 'X') {
            comp = '0';
        } else {
            comp = 'X';
        }
        display();

    }
    // void clearScreen() {  
    // System.out.print("\033[H\033[2J");  
    // System.out.flush();  
//    }

    void choice1() {
        System.out.println("Choose : X or 0");
        ip = sc.next().charAt(0);

        if (ip == 'x' || ip == 'X' || ip == '0') {
            flag = false;
        } else {
            flag = true;
            return;
        }

    }

    void display() {
        // clearScreen();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("\t" + a[i][j] + "\t");
                if (j != 2) {
                    System.out.print("|");
                }
            }
            if (i != 2) {
                System.out.println("\n--------------------------------------------------");
            }
        }
        if (!gameover()) {
            System.out.println("\nEnter location to put " + ip);
            put();
        }

    }

    void put() {
        int location = sc.nextInt();
        if (location < 1 || location > 9) {
            System.out.println("Wrong input Try again!!");
            put();
        }

        else {
            switch (location) {
                case 1:
                    if (a[0][0] == ' ') {
                        a[0][0] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 2:
                    if (a[0][1] == ' ') {
                        a[0][1] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 3:
                    if (a[0][2] == ' ') {
                        a[0][2] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 4:
                    if (a[1][0] == ' ') {
                        a[1][0] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 5:
                    if (a[1][1] == ' ') {
                        a[1][1] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 6:
                    if (a[1][2] == ' ') {
                        a[1][2] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 7:
                    if (a[2][0] == ' ') {
                        a[2][0] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 8:
                    if (a[2][1] == ' ') {
                        a[2][1] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                case 9:
                    if (a[2][2] == ' ') {
                        a[2][2] = ip;
                    } else {
                        System.out.println("Already taken\nTry again");
                        put();
                    }
                    break;
                default:
                    System.out.println("ugh wrong input");
            }
            logic();
            compchance();
            logic();
        }
        display();
    }

    void logic() {
        flag = false;
        if (((a[0][0] == ip) && (a[0][1] == ip) && (a[0][2] == ip))
                || ((a[1][0] == ip) && (a[1][1] == ip) && (a[1][2] == ip))
                || ((a[2][0] == ip) && (a[2][1] == ip) && (a[2][2] == ip))
                || ((a[0][0] == ip) && (a[1][1] == ip) && (a[2][2] == ip))
                || ((a[0][2] == ip) && (a[1][1] == ip) && (a[2][0] == ip))
                || ((a[0][0] == ip) && (a[1][0] == ip) && (a[2][0] == ip))
                || ((a[0][2] == ip) && (a[1][2] == ip) && (a[2][2] == ip))
                || ((a[0][1] == ip) && (a[1][1] == ip) && (a[2][1] == ip))){
                    // clearScreen();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print("\t" + a[i][j] + "\t");
                    if (j != 2) {
                        System.out.print("|");
                    }
                }
                if (i != 2) {
                    System.out.println("\n--------------------------------------------------");
                }
            }
            System.out.println("\n\n*****************************************************");
            System.out.println("\n\t\t\tGame won");
            System.out.println("\n*****************************************************");
            System.exit(0);
        } 
        else if (((a[0][0] == comp) && (a[0][1] == comp) && (a[0][2] == comp))
                || ((a[1][0] == comp) && (a[1][1] == comp) && (a[1][2] == comp))
                || ((a[2][0] == comp) && (a[2][1] == comp) && (a[2][2] == comp))
                || ((a[0][0] == comp) && (a[1][1] == comp) && (a[2][2] == comp))
                || ((a[0][2] == comp) && (a[1][1] == comp) && (a[2][0] == comp))
                || ((a[0][0] == comp) && (a[1][0] == comp) && (a[2][0] == comp))
                || ((a[0][2] == comp) && (a[1][2] == comp) && (a[2][2] == comp))
                || ((a[0][1] == comp) && (a[1][1] == comp) && (a[2][1] == comp))) {
                    // clearScreen();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print("\t" + a[i][j] + "\t");
                    if (j != 2) {
                        System.out.print("|");
                    }
                }
                if (i != 2) {
                    System.out.println("\n--------------------------------------------------");
                }
            }
            System.out.println("\n\n*****************************************************");
            System.out.println("\n\t\t\tComputer won");
            System.out.println("\n*****************************************************");
            System.exit(0);
        }
        tied();
    }

    void tied() {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] != ' ') {
                    c++;
                }
            }
        }
        if (c == 9) {
            // clearScreen();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print("\t" + a[i][j] + "\t");
                    if (j != 2) {
                        System.out.print("|");
                    }
                }
                if (i != 2) {
                    System.out.println("\n--------------------------------------------------");
                }
            }
            System.out.println("\n\n----------------------Game tied------------------------");
            System.exit(0);
        }
    }

    void compchance() {
        Random rand = new Random();
        int i1, j1;
        i1 = rand.nextInt(0, 3);
        j1 = rand.nextInt(0, 3);
        while (a[i1][j1] == ip || a[i1][j1] == comp) {
            i1 = rand.nextInt(0, 3);
            j1 = rand.nextInt(0, 3);
        }
        a[i1][j1] = comp;
    }
    boolean gameover() {
        return false;
    }
}
