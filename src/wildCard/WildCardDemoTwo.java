package wildCard;

import java.util.ArrayList;
import java.util.List;

/*
* Use extend wildcard when you want to get values out of a structure and super wildcard when you put values in a structure.
* Don’t use wildcard when you get and put values in a structure.
* Note: You can specify an upper bound for a wildcard, or you can specify a lower bound, but you cannot specify both.
* */


public class WildCardDemoTwo {

    public static void main(String[] args) {

        List<AsianApple> asianAppleList = new ArrayList<>();
        addFruits(asianAppleList);

        List<Apple> appleList = new ArrayList<>();
        addFruits(appleList);

        List<Fruit> fruitList = new ArrayList<>();
//        addFruits(fruitList); //Won't compile

//        superFruitList(asianAppleList); //Wont't compile
        superFruitList(appleList);
        superFruitList(fruitList);

        List<? super Apple> baseketList = new ArrayList<>();
        baseketList.add(new Apple());
        baseketList.add(new AsianApple());
//        baseketList.add(new Fruit()); //Won't compile

        relationShip();
    }

    private static void relationShip() {
        List<Apple> listApple = new ArrayList<>();
        List<Fruit> listFruitFix = new ArrayList<>();
        List<AsianApple> listAsianApple = new ArrayList<>();
//        List<Fruit> listFruit = listApple; // won't compile

        List<? extends Fruit> listFruit = listApple;
        List<? super Apple> listLowerApple = listApple;
//        List<? super Apple> listLowerApple = listFruitFix; //won't compile
//        List<? super Apple> listAsianApple = listFruitFix; //won't compile
    }

    /*Upper bound*/
    /*Maximum limit of accept object upto Apple not above that.*/
    private static void addFruits(List<? extends Apple> listFruits) {
        System.out.println(listFruits);
//        listFruits.add(new Fruit());
//        listFruits.add(new Apple());
//        listFruits.add(new AsianApple());
    }

    /*Lower bound wildcard*/
    /*Minimum limit of accept object is Apple or above that.*/
    private static void superFruitList(List<? super Apple> listFruits) {
        System.out.println(listFruits);
        listFruits.add(new Apple());
        listFruits.add(new AsianApple());
    }
}


class Fruit {
    @Override
    public String toString() {
        return "I am a Fruit !!";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "I am an Apple !!";
    }
}

class AsianApple extends Apple {
    @Override
    public String toString() {
        return "I am an AsianApple !!";
    }
}
