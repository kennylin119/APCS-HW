/*
Kenny Lin
APCS1 pd8
HW7 -- On the Origins of a BigSib
2017--09--27
*/

public class BigSib {
    private String helloMsg;
    public void setHelloMsg(String newMsg) {
	helloMsg = newMsg;
    }
    public void setName (String name)  {
	noun = name;
    }
    public String greet (String greeting ){
        String statement;
	statement = helloMsg;
        statement += " ";
        statement += noun;
        return statement;
    }
}

