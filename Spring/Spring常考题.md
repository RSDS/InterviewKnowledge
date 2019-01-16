## 1、Spring 两大特性：IOC和AOP
- IOC: 应用程序不再过问对象的创建、维护对象之间的依赖关系，将控制权交给Spring 容器，将对象创建过程从编译时延期到运行时。
    - 注解配置 <code> @Autowired</code>
    - Java配置 <code> @Bean</code>
    - xml配置
- AOP：面向切面编程，解耦，可以让一组类共享相同的行为，核心使用的是Java代理机制，将程序中的交叉业务逻辑（如安全、日志、事务等）封装成一个切面，然后注入到目标对象（具体业务逻辑）中。
    - 基于注解式拦截<code> @After("annotationPointCut()")</code>
    - 基于方法式拦截<code> @Before("execution(* DemoMethodService.*(..))")</code>



