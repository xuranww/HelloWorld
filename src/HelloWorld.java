public class HelloWorld {
    private String name;
    public HelloWorld(){
        System.out.println("这里是构造函数");
    }
    public void setName(String name){
        System.out.println("这里是setName函数");
        this.name=name;
    }
    public void sayHello()
    {
        System.out.println("Hello "+name);
    }
}
