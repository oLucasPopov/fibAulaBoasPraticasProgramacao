package conversor_tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import conversor.Conversor;

public class ConversorTest {
  @Test
  void testACard() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("A");
    assertEquals(1, card);
    card = sut.converteCartaParaInt("a");
    assertEquals(1, card);
  }

  @Test
  void test2Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("2");
    assertEquals(2, card);
  }

  @Test
  void test3Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("3");
    assertEquals(3, card);
  }

  @Test
  void test4Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("4");
    assertEquals(4, card);
  }

  @Test
  void test5Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("5");
    assertEquals(5, card);
  }

  @Test
  void test6Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("6");
    assertEquals(6, card);
  }

  @Test
  void test7Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("7");
    assertEquals(7, card);
  }

  @Test
  void test8Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("8");
    assertEquals(8, card);
  }

  @Test
  void test9Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("9");
    assertEquals(9, card);
  }

  @Test
  void test10Card() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("10");
    assertEquals(10, card);
  }

  @Test
  void testJCard() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("J");
    assertEquals(11, card);
    card = sut.converteCartaParaInt("j");
    assertEquals(11, card);
  }

  @Test
  void testQCard() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("Q");
    assertEquals(12, card);
    card = sut.converteCartaParaInt("q");
    assertEquals(12, card);
  }

  @Test
  void testKCard() {
    Conversor sut = new Conversor();
    int card = sut.converteCartaParaInt("K");
    assertEquals(13, card);
    card = sut.converteCartaParaInt("k");
    assertEquals(13, card);
  }
}
