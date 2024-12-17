package booung.boo;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void UserTest() {
        UserRecord record1 = new UserRecord(
                "javaspring", "kotiln@spring.com", "2024-12-16"
        );
        UserRecord record2 = new UserRecord(
                "", "kotiln@spring.com", "2024-12-16"
        );
    }

    @Test
    void weather() {
        Weathor weathor1 = new Weathor(
                "부산",22.5,60,"맑음",5.2
        );
    }

    @Test
    void product() {

    }
}
