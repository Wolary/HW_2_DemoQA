package onLesson;


import org.junit.jupiter.api.*;

public class JUnitDemoTest {
    @BeforeAll
    static void setUp() {
        System.out.println("### @BeforeAll");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("###         @beforeEach");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("###         @afterEach");
    }


    @Test
    void simpleFirstTest() {
        System.out.println("###     @firstTest");
        Assertions.assertTrue(3 > 2);

    }

    @Test
    void simpleSecondTest() {
        System.out.println("###     @secondTest");
        Assertions.assertTrue(3 > 1);
    }

    @AfterAll
    static void tearDown() {
        System.out.println("### @AfterAll");
    }

}
