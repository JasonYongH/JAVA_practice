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
    int i = 1;
    void tip() {
        System.out.println(i);
    }
}

class tiger {
    static String name = "tiger";
    int size = 20;
    class hunter {
        void tes() {
            System.out.println(name);
            System.out.println(size);
        }
    }
    void tes() {
        System.out.println(name);
        System.out.println(size);
    }
}

class lion extends tiger {
    class hunter {
        void tes() {
            System.out.println("lion hunter");
        }
    }
}

class cat {
    class tail {}
    static class claw {}
    canSwim getFat() {
        return new canSwim() {
            public void swim() {
                System.out.println("cat.swim");
            }
        };
    }
    void getThin() {
        class minicat {
            minicat() {
                System.out.println("getThin.minicat");
            }
        }
        new minicat();
    }
}

class color_tail extends cat.tail {
    color_tail(cat my_cat) {
        my_cat.super();
    }
}



public class solution{
    public static void main(String[] args){
        // tiger jone = new tiger();
        // System.out.println(jone.name);
        // System.out.println(jone.size);
        // tiger.hunter mary = jone.new hunter();
        // mary.tes();

        // lion page = new lion();
        // System.out.println(page.name);
        // System.out.println(page.size);
        // lion.hunter bob = page.new hunter();
        // bob.tes();
        dragon dito = new dragon();
        dito.tip();
    }
}