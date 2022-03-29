package day3;

public class VariableAndConstant {

    public static void main(String[] args) {

        String videoId = "asdasdasd";
        videoId = "dfdfdfefd";

        final String TITLE = "Some Title";
//        TITLE = "Changed Title";

        final String SMALL = "S";
        final String MEDIUM = "M";
        final String LARGE = "L";
        final String EXTRA_LARGE = "XL";

        //other way to write multiple CONSTANT

        enum Size {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }

        //Assignment operator
        int x= 5;
        x+=1; // x= x+1;
        System.out.println(x);
        x-=1; //x= x-1;
        System.out.println(x);
        x*=1; //x= x*1;
        System.out.println(x);
        x/=1; //x= x/1;
        System.out.println(x);

        System.out.println(x);

        //Arithmetic Operation Exercise
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int calc = 0;
        calc = ((a+b)*(c-d));
        System.out.println(calc);
        int sum = 0;
        sum = a+b;
        sum += c;
        sum += d;
        System.out.println(sum);

    }
}
