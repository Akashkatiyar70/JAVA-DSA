 class Base{}
 abstract class Abdemo{
    int vari;
    final int vari2=10;
    void f(){
    System.out.println("F from Abdemo");

}
abstract void g();
}
interface I{
    //int vari3;
    final int vari4=5;
     default void h(){
        System.out.println("F from I");
}
//abstract void j();
}
interface I2{}
// class Dervied implements I1,I2()
class Dervied extends Base implements I{}

 