import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

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
}
