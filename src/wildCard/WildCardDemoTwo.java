package wildCard;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemoTwo {

    public static void main(String[] args) {

        List<AsianApple> asianAppleList = new ArrayList<>();
        addFruits(asianAppleList);

        List<Apple> appleList = new ArrayList<>();
        addFruits(appleList);

        List<Fruit> fruitList = new ArrayList<>();
//        addFruits(fruitList); //Won't compile

//        suprtFruit(asianAppleList); //Wont't compile
        suprtFruit(appleList);
        suprtFruit(fruitList);

        List<? super Apple> baseketList = new ArrayList<>();
        baseketList.add(new Apple());
        baseketList.add(new AsianApple());
//        baseketList.add(new Fruit()); //Won't compile
    }

    private static void addFruits(List<? extends Apple> listFruits) {
        System.out.println(listFruits);
    }

    private static void suprtFruit(List<? super Apple> listFruits) {
        System.out.println(listFruits);
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
