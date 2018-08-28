class const
{
const()
{
gg(15);
System.out.println("Default constructor");
}
const(int a)
{
gg(15,20);
System.out.println(a);
}
const(int x,int y)
{
System.out.println(x+y);
}
public static void main(String args[])
{
new const(); 
}
}