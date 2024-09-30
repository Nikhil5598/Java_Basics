interface Nikhil{
    void show();
}
interface Sai {
    void name();
}
class Basic implements Nikhil,Sai{
    
       @Override
        public void show(){
            System.out.print("Hello");
        }

        @Override
        public void name(){
            System.out.println(" Nikhil");
        }
        public static void main(String[] args) {
        Basic sc=new Basic();
        sc.show();
        sc.name();
       
        // java implements 2 interface
    }
}