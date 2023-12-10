import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Pruebas para StringUtils")
class StringUtilsTest {

    @Test
    @DisplayName("Prueba método reverse con un string valido")
    public void testReverseWithValidString(){
        // GIVEN
        String input = "hola";

        //WHEN
        String result = StringUtils.reverse(input);

        //THEN
        String expectedResult = "aloh";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Prueba método isPalindrom con una palabra válida")
    public void testIsPalindromWithPalindromString(){
        //GIVEN
        String input = "level";

        //WHEN
        boolean result = StringUtils.isPalindrome(input);

        //THEN
        Assertions.assertTrue(result);
    }

}