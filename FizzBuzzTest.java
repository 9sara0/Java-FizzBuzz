import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void getResultSgouldReturnFizzIfTheNumberIsDivisibalBy3() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.getResult(3));
  }

  @Test
  public void getResultShouldReturnBuzzIfTheNumberIsDivisibleBy5() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Buzz", fizzBuzz.getResult(5));
  }
}
