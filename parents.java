class A{  
void func(){
System.out.println("This is Parent Class");
}  
}  
class B extends A{  
void func(){
System.out.println("This is Child Class");
}  
void fun(){
System.out.println("Calling Parent Class");
}  
void display(){ 
fun(); 
super.func();   
}  
}  
class parents{  
public static void main(String args[]){  
B n=new B();  
n.display();  
}
} 