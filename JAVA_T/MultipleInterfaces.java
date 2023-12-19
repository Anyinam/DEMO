interface MultipleInterfaces {
    public void myMethod();
    
}

interface SecondInterface{
    public void mysecondmethod();

}

class DemoClassInterface implements MultipleInterfaces, SecondInterface{
    public void myMethod(){
        System.out.println("Some text..");

    }

    public void mysecondmethod(){
        System.out.println("Some other text..");
    }
}

class MultipleInterfaceDemo{
    public static void main(String[] args){
        DemoClassInterface myDemoIn = new DemoClassInterface();
        myDemoIn.myMethod();
        myDemoIn.mysecondmethod();
    }
}