package interfaces;

public class InterfaceExample implements TypeOne, TypeTwo{

    public static void main(String[] args) {

    }

    @Override
    public void methodOne() {

    }

   /* @Override
    public boolean isChild() {
        return false;
    }*/
}

interface TypeOne{

    void methodOne();

//    boolean isChild();
}


interface TypeTwo{

    void methodOne();

//    int isChild();
}
