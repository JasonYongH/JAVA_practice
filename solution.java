interface canFly{
    int m = 1;
    void fly();
    int swim(String tes);
}
interface canSwim{
    void swim();
}
class dragon implements canFly, canSwim{
    public void fly(){
        System.out.println("dragon fly");
    }
    public int swim(String tes){
        System.out.println("dragon int swim");
        return 0;
    }
    public void swim(){
        System.out.println("dragon swim");
    }
}
public class solution{
    public static void main(String[] args){
        dragon ethla = new dragon();
        ethla.fly();
        ethla.swim();
        ethla.swim("jlk");
        System.out.println(ethla.m);
    }
}