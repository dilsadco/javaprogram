public class Constructor {
    int id;
    String name;
    Constructor(){
        name="dilsad";
        id=45;
    }
    Constructor(String s){
        name=s;
        id=45;
    }
    Constructor(String s,int i){
        name=s;
        id=i;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Constructor t1=new Constructor();
        t1.display();
        Constructor t2=new Constructor("seraj");
        t2.display();
        Constructor t3=new Constructor("Abhimanyu",90);
        t3.display();
    }
}
