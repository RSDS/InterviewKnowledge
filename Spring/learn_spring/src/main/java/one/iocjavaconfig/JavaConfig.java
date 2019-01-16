package one.iocjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public  class JavaConfig {

    @Bean
    public FunctionService4Java functionService(){
        return new FunctionService4Java();
    }

    @Bean
    public UseFunctionService4Java useFunctionService(){
        UseFunctionService4Java useFunctionService4Java = new UseFunctionService4Java();
        useFunctionService4Java.setFunctionService4Java(functionService());
        return useFunctionService4Java;
    }


}