Java Objects
 
- Object name in java is a reference
- references are used to store address 
- A special value null can be assigned
Student t; 

t=null;

t = new Student();

- Alias name can created

Student y=t;

(See memory diagram on board)
Dangling Reference

   Student s= new Student("abc");
   Student t=s;
   
.....................................
Parameter Passing
................................
Object as parameter

- parameter passing by reference
.....................................
Example 1
class Car{
String make;
String getMake() { return make;}
void setMake(String m){make=m;}

}
class ChangeCarMake{
static void changeMake(Car p){
p.setMake("Suzuki");
}

}

class Test {
public static void main(String o[]){
Car c1=new Car();
c1.setMake("Honda");
ChangeCarMake.changeMake(c1);
System.out.println(c1.getMake());

}
}

(See memory diagram on board)
...............................................




























