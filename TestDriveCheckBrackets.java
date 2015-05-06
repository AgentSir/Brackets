
public class TestDriveCheckBrackets {

    public static void main(String[] args) {

        Brackets brackets = new Brackets();

        System.out.println(brackets.check("a(b)"));
        System.out.println(brackets.check("[{}]"));
        System.out.println(brackets.check("[(]"));
        System.out.println(brackets.check("}{"));
        System.out.println(brackets.check("z([{}-()]{a})"));
        System.out.println(brackets.check(""));
    }

}
