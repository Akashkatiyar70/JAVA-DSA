class short3{
    public static void main (String[] args){
        int x=30,y=20;
        // if(++x<30&& ++y>20){
        // if(++x<30& ++y>20){
        // if(++x<30 | ++y>20){
        if(++x<30 || ++y>20){
            x++;
        }
        else{
            y++;
        }
        System.out.println(x+" " +y);

        }
    }
