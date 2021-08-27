import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public  void helloSothon () {
        //Arrange
        HelloWorld helloWorld = new HelloWorld();
        //Act
        String actualResult = helloWorld.greeting("Sothon");
        //Assert
        assertEquals("Hello Sothon", actualResult);
    }

    private void assertEquals(String expected, String actualResult) {

    }
}
