import java.util.Scanner;
class Vehicle{
    int noSeats;
    String fuel;
    int speed;
    public Vehicle(int noSeats,String fuel, int speed){
        this.noSeats=noSeats;
        this.fuel=fuel;
        this.speed=speed;


    }
    public String toString(){
        return "No of Seats:"+noSeats+"Fuel Used:"+fuel+"speed:"+speed;
    }
}

interface FlyingObject{
    int  maxheight=20000;
}
class Aeroplane extends Vehicle implements FlyingObject{
    int takeoffSpeed;
    public Aeroplane(int noSeats,String fuel,int speed,int takeoffSpeed){
        super(noSeats,fuel,speed);
        this.takeoffSpeed=takeoffSpeed;
    }
    public String toString(){
        String aeroPrint;
        aeroPrint="Attributes of Aeroplane";
        aeroPrint=aeroPrint+"No of Seats:"+noSeats+"Fuel Used:"+fuel+"speed:"+speed;
        aeroPrint=aeroPrint+"Maximum Height:"+maxheight;
        aeroPrint=aeroPrint+"Takeoffspeed:"+takeoffSpeed;
        return aeroPrint; 
    }
}
class Bus extends Vehicle{
    String type ; 

    public Bus( int noSeats,String fuel, int speed, String type){
        super( noSeats,fuel,speed);
        this.type=type;
    }

public String toString(){
    String aeroPrint;
    aeroPrint="Attributes of Aeroplane";
    aeroPrint=aeroPrint+"No of Seats:"+noSeats+"Fuel Used:"+fuel+"speed:"+speed;
    aeroPrint="type"+type;
    return aeroPrint;
}
}
class Rocket extends Vehicle implements FlyingObject{
public Rocket (int noSeats,String fuel, int speed){
    super(noSeats,fuel,speed);
}
}
class interfaceDemo3{
    public static void main (String [] args){
        Vehicle v[] = new Vehicle[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Enter 1 to Create Bus ,to 2 to Create Aeroplane and 3 create Rocket");
            int choice= sc.nextInt();
            if(choice==1){// user wants to create bus
            int Seats;
            String fuel;
            int speed;
            String type;
            System.out.println("Enter seats ,Fuel,speed and Type of Bus");
            Seats=sc.nextInt();
            fuel=sc.next();
            speed=sc.nextInt();
            type=sc.next();
            v[i]= new Bus( Seats,fuel,speed,type);
        }
        else if (choice==2){
            int Seats;
            String fuel;
            int speed;
            int takeoffSpeed;
            System.out.println("Enter Seats,Fuel,Speed and takeoffSpeed of bus");
            Seats=sc.nextInt();
            fuel=sc.next();
            speed=sc.nextInt();
            takeoffSpeed=sc.nextInt();
            v[i]= new Aeroplane( Seats,fuel,speed, takeoffSpeed);
        }
        else{
            int Seats;
            String fuel;
            int speed;
            System.out.println("Enter ,Fuel,Speed of Rocket");
            Seats=4;
            fuel=sc.next();
            speed=sc.nextInt();
            v[i]= new Rocket( Seats,fuel,speed);
        


        }
    }
    int count=0;
    for(int i=0;i<5; i++)
    {
        if(v[i] instanceof FlyingObject)
        count ++;
        System.out.println(v[1]);
    }
        System.out.println("Total flyingObjects are:" +count);
    }
}
