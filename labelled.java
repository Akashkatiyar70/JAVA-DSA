// public class labelled{
//     public static void main(String[] args){
//         out:
//         for(int i=1;i<=100;i++){
//             System.out.println("outer");
//             if(i==5)
//             for(int j=1; j<=100;j++){
//                 System.out.println("inner");
//                 if(j==1)
//                 break out;
//             }
//         }
//     }
//}

 public class labelled{
    public static void main(String[] args){
out:
for(int i=1;i<=100;i++){
    System.out.println("from outer:"+i);
   // if(i==8)
   //break;
     for(int j=1;j<=100;j++){
    System.out.print("from inner:"+j);
    if(j==2)
    break;
}}
    }
 }




