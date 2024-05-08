package construct;

public class MemberDefault {
    String name;

    public MemberDefault(String name) {
        System.out.println("생성자 호출 "+ name);
        this.name = name;
    }
}
