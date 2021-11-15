import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        String password = "Password";
        String expectedHash = "P4ssw0rd";

        String hashedPassword = CodeupCrypt.hashPassword(password);

        assertEquals(expectedHash, hashedPassword);
        assertEquals("P13", CodeupCrypt.hashPassword("Pie"));
        assertEquals("J9n1t", CodeupCrypt.hashPassword("JUnit"));

    }

    @Test
    public void testCheckPassword(){
         assertTrue("Password and hash are not teh same", CodeupCrypt.checkPassword("Douglas", "D09gl4s"));
        assertFalse(CodeupCrypt.checkPassword("Douglas", "Douglas"));
    }
}
