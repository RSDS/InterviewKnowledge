package one.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

    public void add(){
        System.out.println("方法式:  +1");
    }

    public void divise(int a, int b){
        System.out.println("方法式： "+a/b);

    }

}
