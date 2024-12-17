package booung.boo;

import org.junit.jupiter.api.Test;

import java.util.List;

public class AuthorTest {
    @Test
    void name() {
        AuthorDtoRecord author1 = new AuthorDtoRecord(
                "한강",
                "1970-11-27",
                List.of("소년이 온다" , "작별하지 않는다")
        );

        AuthorDtoRecord author2 = new AuthorDtoRecord(
                "한강",
                "1970-11-27",
                List.of("소년이 온다" , "작별하지 않는다")
        );
    }
}
