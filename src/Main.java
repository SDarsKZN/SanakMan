import java.util.Random;
import java.util.Scanner;

public class Main {

    static int celll[][];

    public static void main(String[] args) {
        //��� ���� ��� �� �������� ������� ���������
        int restart = 1;
        int genious = 1;
        while(restart == 1) {
            //�������� ��������� ����������� ������ � ������� � � �
            celll = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    celll[i][j] = 0;
                }
            }
            int ap = 3;
            int score = 0;
            celll[0][0] = 1;

            //����� ������ ������ ��� �������


            Random randForFx = new Random();//����� ������� ������
            int fCoorx = randForFx.nextInt(4,10);
            Random randForFy = new Random();
            int fCoory = randForFy.nextInt(0,5);
            celll[fCoorx][fCoory] = 2;//2 - ��� �����

            Random randForTWx = new Random();//������ ������� ������
            int tWCoorx = randForTWx.nextInt(4,10);
            Random randForTWy = new Random();
            int tWCoory = randForTWy.nextInt(5,10);
            celll[tWCoorx][tWCoory] = 2;

            Random randForTx = new Random();//����� �������� ������
            int tCoorx = randForTx.nextInt(0,4);
            Random randForTy = new Random();
            int tCoory = randForTy.nextInt(4,10);
            celll[tCoorx][tCoory] = 2;
            //���������, �� ��������� ��������� ����� ��� �������

            //������ ������ ���������
            Random randForFGx = new Random();//����� ������� ��������
            int fGCoorx = randForFGx.nextInt(4,7);
            Random randForFGy = new Random();
            int fGCoory = randForFGy.nextInt(2,5);
            while(celll[fGCoorx][fGCoory] != 0) {
                fGCoorx = fGCoorx+ 1;
            }
            celll[fGCoorx][fGCoory] = 3;//3 - ��� �������

            Random randForFSx = new Random();//����� ������� ��������
            int sGCoorx = randForFSx.nextInt(1,4);
            Random randForFSy = new Random();
            int sGCoory = randForFSy.nextInt(5,8);
            while(celll[sGCoorx][sGCoory] != 0) {
                sGCoorx = sGCoorx+ 1;
            }
            celll[sGCoorx][sGCoory] = 3;

            int x = 0;//����� ������� ��������� ����� �� �
            int y = 0;//����� ������� ��������� ����� �� �
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(celll[i][j] + "  ");
                }
                System.out.println();
            }
            while (ap > 0) {
                Scanner scan1 = new Scanner(System.in);
                int sman = scan1.nextInt();
                if (sman == 4) {
                    celll[x][y] = 0;
                    if (celll[x][y - 1] == 2) {
                        score = score + 1;
                        ap = ap - 1;
                    }
                    else if (celll[x][y - 1] == 3) {
                        System.out.println("You lose :{");
                        System.out.println("You can try again!");
                        break;
                    }
                    celll[x][y - 1] = 1;
                    y = y - 1;
                }


                if (sman == 8) {
                    celll[x][y] = 0;
                    if (celll[x - 1][y] == 2) {
                        score = score + 1;
                        ap = ap - 1;
                    }
                    else if (celll[x - 1][y] == 3) {
                        System.out.println("You lose :{");
                        System.out.println("You can try again!");
                        break;
                    }
                    celll[x - 1][y] = 1;
                    x = x - 1;
                }


                if (sman == 2) {
                    celll[x][y] = 0;
                    if (celll[x + 1][y] == 2) {
                        score = score + 1;
                        ap = ap - 1;
                    }
                    else if (celll[x + 1][y] == 3) {
                        System.out.println("You lose :{");
                        System.out.println("You can try again!");
                        break;
                    }
                    celll[x + 1][y] = 1;
                    x = x + 1;
                }

                if (sman == 6) {
                    celll[x][y] = 0;
                    if (celll[x][y + 1] == 2) {
                        score = score + 1;
                        ap = ap - 1;
                    }
                    else if (celll[x][y + 1] == 3) {
                        System.out.println("You lose :{");
                        System.out.println("You can try again!");
                        break;
                    }
                    celll[x][y + 1] = 1;
                    y = y + 1;
                }


                     //������ ������� ����
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print(celll[i][j] + "  ");
                    }
                    System.out.println();
                }


               // if (genious % 4) {//��� ������� ��������� �������������������������
                //    celll[x][y] = 0;
                   // if (celll[x - 1][y] == 2) {
                  //      score = score + 1;
                   //     ap = ap - 1;
                  //  }
                   // else if (celll[x - 1][y] == 3) {
                     //   System.out.println("You lose :{");
                      //  System.out.println("You can try again!");
                      //  break;
                  //  }
                  //  celll[x - 1][y] = 1;
               //     x = x - 1;
             //   }


                System.out.println("Your score is: " + score);

            }
            if(score == 3) {
                System.out.println("You Won!!! Congratulations!!!!!!!!!!!!");
                restart = 0;
            }
            System.out.println("If you want to restart press 1");
            Scanner scan2 = new Scanner(System.in);
            restart = scan2.nextInt();
        }
    }
}