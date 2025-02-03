package data.model;

import data.model.exceptions.InvalidAtribute;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

class UserModelTest {
    @Test
    void testIncorrectEmail(){
        assertThrows(InvalidAtribute.class,()->new UserModel("userk@anfa.o","Jorge","Pérez"));
    }
}
