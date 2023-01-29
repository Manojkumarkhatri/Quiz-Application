import java.util.Scanner;
public class QuizApplication {
    public static void main(String[] args) {
        int chance = 2;
        QuizApplication.userRegistractionAndLogin(chance);
    }
    static String registerName, registerPassword;
    static String loginName, loginPassword;
    static int prizeMoney = 0;
    static int totalAttemptedQuestion = 0;
    static int totalRightAnswer = 0;
    static int totalWorngAnswer = 0;
    static int helpAnwer = 0;

    //Scanner myObj = new Scanner(System.in);


    static void userRegistractionAndLogin(int chance)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("\t\t***************************\t\t");
        System.out.println("\t\t*      User Registraction *\t\t");
        System.out.println("\t\t***************************\t\t");
        System.out.println();

        System.out.println("Enter User Name :");
        registerName = myObj.nextLine();
        System.out.println();

        System.out.println("Enter User Password : ");
        registerPassword = myObj.nextLine();
        System.out.println("You Are Register !");
        System.out.println();
        questions1(chance);
    }


    static void questions1(int chance)
    {

        Scanner sc = new Scanner(System.in);

        totalAttemptedQuestion += 1 ;
        System.out.println("Q: 1) Who Is The Developer Of Computer ? ");
        System.out.println();
        System.out.println("a) Dennis Ritchie\tb) James Gosling ");
        System.out.println("c) Charles Babbage\td) None");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y') {
            chance--;
            helpAnwer++;
            System.out.println("Charles Babbage Is Correct Answer !");
            System.out.println();
            questions2(chance);
        } else if(choice == 'n') {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'c')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;

                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions2(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions2(chance);
            }
        }
    }
    static void questions2(int chance)
    {
        Scanner sc = new Scanner(System.in);

        totalAttemptedQuestion += 1;
        System.out.println("Q: 2) The Smallest Unit of Data in Computer is ?");
        System.out.println();
        System.out.println("a) Bit \t b) Nibble");
        System.out.println("c) Kb \t  d) Byte");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("Bit Is Correct Answer !");
            System.out.println();
            questions3(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'a')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;
                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions3(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions3(chance);
            }
        }
    }
    static void questions3(int chance)
    {
        Scanner sc = new Scanner(System.in);

        totalAttemptedQuestion += 1;
        System.out.println("Q: 3) In Computer 1 Nibble is Equal to ? ");
        System.out.println();
        System.out.println("a) Eight Bytes\t b) One Bit");
        System.out.println("c)Four Bits\td) One Kb ");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("Four Bits Is Correct Answer !");
            System.out.println();
            questions4(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'c')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions4(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions4(chance);
            }
        }
    }
    static void questions4(int chance)
    {
        Scanner sc = new Scanner(System.in);
        totalAttemptedQuestion += 1;
        System.out.println("Q: 4) One Byte Is Equal To ?");
        System.out.println();
        System.out.println("a)Eight Bits\t b) One Nibble");
        System.out.println("c)Four Bit\t d) One Kb ");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("Eight Bits Is Correct Answer !");
            System.out.println();
            questions5(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'a')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions5(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions5(chance);
            }
        }
    }
    static void questions5(int chance)
    {
        Scanner sc = new Scanner(System.in);

        totalAttemptedQuestion += 1;
        System.out.println("Q: 5) How Many Parts Are In There In CPU ?");
        System.out.println();
        System.out.println("a) 1\t b) 2");
        System.out.println("c) 3\t d) 4 ");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("2 Is Correct Answer !");
            System.out.println();
            questions6(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'b')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions6(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions6(chance);
            }
        }

    }
    static void questions6(int chance)
    {
        Scanner sc = new Scanner(System.in);
        totalAttemptedQuestion += 1;
        System.out.println("Q: 6) The Brain Of Any Computer System is ?");
        System.out.println();
        System.out.println("a) Cu   \t b) CPU");
        System.out.println("c) Memory\td) ALU ");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("CPU Is Correct Answer !");
            System.out.println();
            questions7(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'b')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions7(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions7(chance);
            }
        }
    }
    static void questions7(int chance)
    {
        Scanner sc = new Scanner(System.in);
        totalAttemptedQuestion += 1;
        System.out.println("Q: 7) In Memory Full Name Of Kb ?");
        System.out.println();
        System.out.println("a) Know Bit\t b) Killo Byte");
        System.out.println("c) Knee Byte\td) Killo Bit");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("Killo Byte Is Correct Answer !");
            System.out.println();
            questions8(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'b')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions8(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions8(chance);
            }
        }
    }
    static void questions8(int chance)
    {
        Scanner sc = new Scanner(System.in);
        totalAttemptedQuestion += 1;
        System.out.println("Q: 8) How Many Types Of Memory Are There ?");
        System.out.println();
        System.out.println("a) 1\t b) 2");
        System.out.println("c) 3\t d) 4 ");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("2 Is Correct Answer !");
            System.out.println();
            questions9(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'b')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions9(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions9(chance );
            }
        }

    }
    static void questions9(int chance )
    {
        Scanner sc = new Scanner(System.in);
        totalAttemptedQuestion += 1;
        System.out.println("Q: 9) Cpu Consist Of ?");
        System.out.println();
        System.out.println("a) ALU + CU\t b) Ram + Rom");
        System.out.println("c) Ram + ALU\t d) Rom + CU");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("ALU + CU Is Correct Answer !");
            System.out.println();
            questions10(chance);
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'a')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                questions10(chance);
            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                questions10(chance);
            }
        }

    }
    static void questions10(int chance)
    {
        Scanner sc = new Scanner(System.in);
        totalAttemptedQuestion += 1;
        System.out.println("Q: 10)How Many Arrow Keys Are in KeyBoard ?");
        System.out.println();
        System.out.println("a) 1 \t b) 2");
        System.out.println("c) 3\t d) 4 ");
        System.out.println();
        System.out.println("If You Want To Show Answer Press Y And N For Give Answere !");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y')
        {
            chance--;
            helpAnwer++;
            System.out.println("4 Is Correct Answer !");
            System.out.println();
            resultCard();
        }
        else if (choice == 'n')
        {
            System.out.println("Enter Your Choice ?");
            System.out.println();
            char ans = sc.nextLine().charAt(0);
            if (ans == 'd')
            {
                totalRightAnswer += 1;
                prizeMoney += 1000;


                System.out.println("Great!! Right Answer ");
                System.out.println();
                resultCard();

            }
            else
            {

                totalWorngAnswer += 1;
                System.out.println(" Worng  Answer ");
                resultCard();
            }
        }
    }
    static void resultCard()
    {
        System.out.println("***** RESULT CARD ****");
        System.out.println("Your Prize Is : " + prizeMoney);
        System.out.println("Your Attempted Question Is : " + totalAttemptedQuestion);
        System.out.println("Your Right Questions Is : " + totalRightAnswer);
        System.out.println("Your Wrong Question Is : " + totalWorngAnswer);
        System.out.println("Your Hepling Question Is : "+ helpAnwer);

    }
}


