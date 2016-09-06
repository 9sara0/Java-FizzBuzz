import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void getResultShouldReturnFizzIfTheNumberIsDivisibalBy3() {
    assertEquals("Fizz", fizzBuzz.getResult(3));
  }

  @Test
  public void getResultShouldReturnBuzzIfTheNumberIsDivisibleBy5() {
    assertEquals("Buzz", fizzBuzz.getResult(5));
  }

  @Test
  public void getResultShouldReturnFizzBuzzIfTheNumberIsDivisibleBy15() {
    assertEquals("FizzBuzz", fizzBuzz.getResult(15));
  }

  @Test
  public void getResultShouldReturnNumberIfNotDivisibleBy3Or5() {
    assertEquals("1", fizzBuzz.getResult(1));
  }
}
