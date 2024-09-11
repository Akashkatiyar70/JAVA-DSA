public class thisdemo{
 public static void main(String[] args) {
    Demo d= new Demo(20);
    Demo d1=new Demo( 33);
    Demo maxD;
    maxD=d.greater(d1);
    maxD.print();

 }
}
class Demo{ 
     int i;
    Demo(int i)
    {
        this.i=i;

    }
    Demo greater(                                                                                                                                                            Demo d){
        if (d.i>this.i)
            return d;
            else 
                 return this;
        }
    

    // int i;
    // int j;
    // int k;
    // int l;
    // Demo(int i,int j,int k,int l){
    //     this.i=i;
    //     this.j=j;
    //     this.k=k;
    //     this.l=l;


        // this(100);
        // i=100;
    // }
    // Demo(int j,int k,int l){
        // this.i=i;
        // this.j=j;
        // this.k=k;
        // this.l=l;
    //     this(100,j,k,l);
    // }
    void print(){
        System.out.println(i);
    }
}
