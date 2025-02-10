public class CarInfo{
String name;
int speed;
int bhp;
int accelerate;
void speed(){
System.out.println("Your car " + name +" is the best car ever made and has the highest speed of " + speed + " miles/hr.");
}

void brake(){
System.out.println("Car "+ name + "has a brake power of" + bhp + "bhp   and its the powerful in its sector.");
}

void accelerate(){
System.out.println("Car "+ name + " accekerates 60 miles/hr in just 3 seconds.");
}
}

class carMain{
public static void main(String[] args){
CarInfo obj=new CarInfo();
obj.name="Mercedes_C_Class";
obj.speed=240;
obj.bhp=1250;
obj.accelerate=60;
obj.speed();
obj.brake();
obj.accelerate();
}
}
