import java.util.Scanner;
class MethodOverRidingDemo{

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter 1 to Creater Batsman and 2 to create Bowloer");
        int choice=sc.nextInt();
        sc.close();
        Cricketer c;
        if (choice==1)
        c= new Batsman("India","Rohit Sharma",4,2);
        else
        c=new Bowler("India","Ifran Pathan",4,10);
        c.print();


       }
}
class Cricketer{
    String countryName;
    String playerName;
    public Cricketer( String countryName,String playerName){
        this.countryName=countryName;
        this.playerName=playerName;

    }
    public void print(){
        System.out.println("Country Name"+countryName);
        System.out.println("Player Name"+playerName);
    }
}
class Batsman extends Cricketer{
    int no50s;
    int no100s;
    public Batsman(String countryName,String playerName,int no50s,int no100s){
         super(countryName,playerName);
         this.no100s=no100s;
         this.no50s=no50s;
    }
    public void print(){
        super.print();
        System.out.println("No of 50s:"+no50s);
        System.out.println("No of 100s:"+no100s);

    }
}

class Bowler extends Cricketer{
    int wickets;
    int runsgiven;
    public Bowler(String countryName,String playerName,int wickets,int runsgiven){
        super(countryName,playerName);
        this.wickets=wickets;
        this.runsgiven=runsgiven;
    }

        public void print(){
            super.print();
            System.out.println("No of wickets:"+wickets);
            System.out.println("No of runs given:"+runsgiven);
    
        }   
    }
