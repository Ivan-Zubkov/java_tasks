package lab__2;


public class TestHuman {
    public static void main(String[] args) {
        Human hum = new Human(18,176,"White","Ivan");

        Human.Head h1 = new Human.Head("White", 12.3, "Brown");

        h1.setEyeColor("Black");
        System.out.println(h1.getEyeColor());

        Human.Hand hand1 = new Human.Hand(5,0.5,true);
        Human.Leg leg1 = new Human.Leg(5,1.1,true);
        leg1.numberFingers = 4;

        hum.printHuman();



        //Human.Head.eye_color = "black";
        //System.out.println(Human.Head.eye_color);
    }
}
