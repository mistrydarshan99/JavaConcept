package exception;

import java.sql.SQLDataException;
import java.sql.SQLException;


/*Can we override a super class method which is throwing an unchecked exception with checked exception in the sub class?

      No. If a super class method is throwing an unchecked exception,
      then it can be overridden in the sub class with same exception or
      any other unchecked exceptions but can not be overridden with checked
       exceptions.*/

public class ExceptionOne {

    public static void main(String[] args) {

    }
}

class UncheckedException {

    void checkDemo() throws ArithmeticException {
        System.out.println("Check Demo");
    }
}

class UncheckSuper extends UncheckedException {

    @Override
    void checkDemo() throws RuntimeException {
        super.checkDemo();
    }
}

/*
class CheckException extends UncheckedException {

    @Override
    void checkDemo() throws RuntimeException, SQLDataException {
        super.checkDemo();
    }
}*/
