import java.io.*;
class CloneExample {
    int x, y;
    CloneExample()
    {
        x = 10;
        y = 20;
    }

 
  public static void main(String[] args)
    {
        Test ob1 = new Test();
 
        System.out.println(ob1.x + " " + ob1.y);
        Test ob2 = ob1;
        ob2.x = 100;
         System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);
    }
}