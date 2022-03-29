package day4;

public class Cat {
    //State
    String name;
    int age;
    String color;
    String breed;

    // behaviour
    public void sleep(){
        System.out.println("sleeping");
    }
    public void play(){
        System.out.println("playing");
    }
    public void feed(){
        System.out.println("eating");
    }

    public static void main(String[] args){
        Cat thor = new Cat();
        Cat rambo = new Cat();


        thor.name = "Thor";
        thor.age = 2;
        thor.color = "black";
        thor.breed = "A";

        rambo.name = "Rambo";
        rambo.age = 3;
        rambo.color = "grey";
        rambo.breed = "B";

        thor.sleep();
        rambo.play();
    }
}
