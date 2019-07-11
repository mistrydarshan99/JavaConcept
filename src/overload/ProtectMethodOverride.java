package overload;

public class ProtectMethodOverride {

    protected void sum(){

    }

    protected static void demo(){

    }
}

class SubProtectedMehod extends ProtectMethodOverride{

    @Override
    protected void sum() {
        super.sum();
    }



}
