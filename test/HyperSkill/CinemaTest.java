package HyperSkill;

import org.junit.jupiter.api.Test;

public class CinemaTest
{
  @Test
  public void simpleTest() {
    String input = "3 4\n"
        + "0 1 0 1\n"
        + "1 0 0 1\n"
        + "1 1 1 1\n"
        + "2";

    int actual = Cinema.solve(input);

    assertThat(actual, 2);
  }

  @Test
  public void simpleTest2() {
    String input = "3 6\n"
        + "0 0 1 0 0 0\n"
        + "1 0 0 0 1 0\n"
        + "0 0 1 0 0 1\n"
        + "2";

    int actual = Cinema.solve(input);

    assertThat(actual, 3);
  }

  private void assertThat(int actual, int expected) {
    if (actual != expected) {
      System.out.println("Actual does not equal to expected: " + actual + " != " + expected);
      assert false;
    }
  }
}
