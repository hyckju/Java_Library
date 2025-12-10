import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // 일부러 실패시키는 테스트 (오류 테스트)
    @org.junit.jupiter.api.Test
    void failTest() {
        int result = 1 + 1;

        // 실제 결과는 2인데 3이라고 기대 → 반드시 실패함
        assertEquals(3, result);
    }

    // 정상적으로 통과하는 테스트
    @org.junit.jupiter.api.Test
    void successTest() {
        int result = 1 + 1;

        assertEquals(2, result);
    }
}
