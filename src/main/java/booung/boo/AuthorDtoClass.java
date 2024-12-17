package booung.boo;

import java.util.List;
import java.util.Objects;

public class AuthorDtoClass {

    private String 이름;
    private String 생년월일;
    private List<String> 작품목록;

    public AuthorDtoClass(String 이름, String 생년월일, List<String> 작품목록) {
        this.이름 = 이름;
        this.생년월일 = 생년월일;
        this.작품목록 = 작품목록;
    }

    public String get이름() {
        return 이름;
    }

    public String get생년월일() {
        return 생년월일;
    }

    public List<String> get작품목록() {
        return 작품목록;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorDtoClass that = (AuthorDtoClass) o;
        return Objects.equals(이름, that.이름) && Objects.equals(생년월일, that.생년월일) && Objects.equals(작품목록, that.작품목록);
    }

    @Override
    public int hashCode() {
        return Objects.hash(이름, 생년월일, 작품목록);
    }
}