import org.example.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void getCountGetSet() {

        var human = new Human("", "", "", 0);
        System.out.println(Task5.getGetterSetter(human));
    }
}