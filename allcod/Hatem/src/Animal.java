public class Animal {
private int age ;
public static void main (String[] args){
Animal Dog = new Animal();
Dog.age = 4;
Animal Cat = new Animal();
Cat.age= 4 ;
System.out.println(Dog==Cat);
System.out.println(Dog.age==Cat.age);
}
}