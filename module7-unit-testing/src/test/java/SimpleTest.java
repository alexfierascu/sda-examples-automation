import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleTest {

    @BeforeAll
    public static void beforeAllTestSuit() {
        System.out.println("Before all test suite");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Before each test");
    }

    @Test
    @Order(1)
    public void simpleTest() {
        System.out.println("Test 1");
    }

    @Test
    @Order(2)
    public void anotherSimpleTest() {
        System.out.println("Test 2");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("After each test");
    }

    @AfterAll
    public static void afterAllTestSuit() {
        System.out.println("After all test suite");
    }
}
