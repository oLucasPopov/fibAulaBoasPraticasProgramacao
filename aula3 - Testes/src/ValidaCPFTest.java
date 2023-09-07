import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidaCPFTest {
  @Test
  void testIsCPF() {
    ValidaCPF sut = new ValidaCPF();
    assertTrue(sut.isCPF("24157618009"));
    assertFalse(sut.isCPF("1111111111"));
    assertFalse(sut.isCPF("letters"));
    assertFalse(sut.isCPF("1"));
  }

  @Test
  void testImprimeCPF() {
    ValidaCPF sut = new ValidaCPF();
    assertEquals("241.576.180-09", sut.imprimeCPF("24157618009"));
    assertThrows(StringIndexOutOfBoundsException.class, () -> {
      sut.imprimeCPF("123");
    });
    assertThrows(NullPointerException.class, () -> {
      sut.imprimeCPF(null);
    });
  }
}
