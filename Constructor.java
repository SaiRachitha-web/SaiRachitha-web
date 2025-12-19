class Demo1{
    int a,b;
     Demo1(int a, int b) {
        this.a = a;
        this.b = b;
    }

     Demo1() {
    a = 100;
    b = 200;
}
}
class Demo2 extends Demo1{
    int x,y;

     Demo2(int x, int y) {
        this.x = x;
        this.y = y;
    }
     Demo2(){
        x = 300;
        y = 400;

     }
     void display(){
        System.out.println("a");
        System.out.println("b");
        System.out.println("x");
        System.out.println("y");
     }
}
public class Constructor {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2(100,200);
        d2.display();
        
    }
    
}
