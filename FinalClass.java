  abstract class FinalClass1{
    public FinalClass1(){
        System.out.println("FinalClass Instantiatred");
    }
     abstract final void f(){
        System.out.println("f() called");
    }
    }
    class DerviedFinalclass1 extends FinalClass1{
        final public void f(){
            System.out.println("F() of Devired called......");
        }
    }


    class FinalClass{
        public static void main(String [] args){
            // FinalClass1 obj = new FinalClass1();
            // obj.f();
        }
    }

