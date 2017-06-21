class Vehicle
{
int speed=80;
public void displaySpeed()
{
System.out.println(speed);
}
}
class Car extends Vehicle
{}
class Jeep extends Vehicle
{}
class Bus extends Vehicle
{}
class Final_vehicle
{
public static void main(String args[])
{
Car c=new Car();
c.displaySpeed();
Jeep j=new Jeep();
j.displaySpeed();
Bus b=new Bus();
b.displaySpeed();
}
}
