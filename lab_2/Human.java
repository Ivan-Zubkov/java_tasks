package lab__2;

public class Human {

    public String skinColor;
    public String name;
    public double height;
    public int age;

    Human(int age, double height, String skinColor, String name){
        this.age = age;
        this.height = height;
        this.skinColor = skinColor;
        this.name = name;
    }

    public void printHuman(){
        System.out.println("Human " + name + ": age = " + age + ", height = " + height + ", skin color = " + skinColor);
        System.out.println("Head: eye color = " + Head.getEyeColor() + ", hair length = " + Head.hairLength + ", hair color = " + Head.hairColor);
        System.out.println("Hand: length hand = " + Hand.lengthHand + ", hand bent = " + Hand.handBent + ", number of fingers = " + Hand.numberFingers);
        System.out.println("Leg: length leg = " + Leg.lengthLeg + ", leg bent = " + Leg.legBent + ", number of fingers = " + Leg.numberFingers);
    }


    public static class Head {
        private static String eyeColor = null;
        public static double hairLength = 0;
        public static String hairColor = null;

        Head(String ec,double hl, String hc){
            eyeColor = ec;
            hairLength = hl;
            hairColor = hc;
        }
        Head(){}

        public static void setEyeColor(String color){
            eyeColor = color;
        }

        public static String getEyeColor(){
            return eyeColor;
        }
    }



    public static class Hand {
        public static int numberFingers = 0;
        public static boolean handBent = false;
        public static double lengthHand = 0;

        Hand(int number, double len, boolean bent){
            handBent = bent;
            lengthHand = len;
            numberFingers = number;
        }
        Hand(){}

        public static void bend_hand(boolean bl){
            handBent = bl;
        }


    }

    public static class Leg {
        public static double lengthLeg = 0;
        public static int numberFingers = 0;
        public static boolean legBent = false;
        //согнуть ногу
        public static void bend_leg(boolean bl){
            legBent = bl;
        }

        Leg(int number, double len, boolean bent){
            legBent = bent;
            lengthLeg = len;
            numberFingers = number;
        }
        Leg(){}
    }



}
