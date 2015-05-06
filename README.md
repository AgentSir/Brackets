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