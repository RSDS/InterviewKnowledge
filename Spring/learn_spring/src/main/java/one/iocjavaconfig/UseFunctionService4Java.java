package one.iocjavaconfig;


public class UseFunctionService4Java {
    FunctionService4Java functionService4Java;


    public void setFunctionService4Java(FunctionService4Java functionService4Java) {
        this.functionService4Java = functionService4Java;
    }

    public String SayHello(String word){
        return functionService4Java.sayHello(word);
    }



}
