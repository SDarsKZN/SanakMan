import java.util.Scanner;

public class Main {

    static int celll[][];

    public static void main(String[] args) {
        //��� ���� ��� ���� ����� ������� ������� ���������
        int restart = 1;

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
            celll[5][5] = 2;//������ - �������
            celll[7][3] = 2;
            celll[5][7] = 2;
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
                    celll[x][y - 1] = 1;
                    y = y - 1;
                }


                if (sman == 8) {
                    celll[x][y] = 0;
                    if (celll[x - 1][y] == 2) {
                        score = score + 1;
                        ap = ap - 1;
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
                    celll[x + 1][y] = 1;
                    x = x + 1;
                }

                if (sman == 6) {
                    celll[x][y] = 0;
                    if (celll[x][y + 1] == 2) {
                        score = score + 1;
                        ap = ap - 1;
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

                System.out.println("Your score is: " + score);

            }
            System.out.println("You Won!!! Congratulations!!!!!!!!!!!!");
            restart = 0;
            System.out.println("If you want to restart press 1");
            Scanner scan2 = new Scanner(System.in);
            restart = scan2.nextInt();
        }
    }
}