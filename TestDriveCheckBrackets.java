/*

Task:

# Brackets

Implement function check (text) which checks whether brackets within text are
correctly nested. You need to consider brackets of three kinds: (), [], {}.

Examples:
   
check("a(b)") -> true
check("[{}]") -> true
check("[(]") -> false
check("}{") -> false
check("z([{}-()]{a})") -> true
check("") -> true

*/

public class TestDriveCheckBrackets {

    public static void main(String[] args) {

        Brackets brackets = new Brackets();

        String [] textWithBrackets = {"a(b)","[{}]","[(]","}{","z([{}-()]{a})",""};

        for (int i = 0; i < textWithBrackets.length; i++){
            System.out.print("Brackets within text: '" + textWithBrackets[i] + "' --> ");
            if (brackets.check(textWithBrackets[i])){
                System.out.println(" are correctly nested");
            } else System.out.println(" are uncorrectly nested");

        }
    }

}
