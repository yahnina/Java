package Religions;

public class Main {

    public static void main(String[] args) {

        Islam I = new Islam();
        Buddhizm B = new Buddhizm();
        Orthodoxy O = new Orthodoxy();
        Ateizm A = new Ateizm();

        Describing[] x = new Describing[4];
        x[0] = I;
        x[1] = B;
        x[2] = O;
        x[3] = A;


        for (int i = 0; i < 4; i++) {
            x[i].describeReligion();


            }
        }
    }
