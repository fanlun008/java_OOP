package inherit;

class Animal {
    private Integer old;
    private Integer weight;

    public void run() {
        System.out.println("runing...");
    }
    public void eat() {
        System.out.println("eating...");
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

class Cat extends Animal{

    public void mew() {
        System.out.println(this.getClass().getSimpleName() + " mew...");
    }
}

class Tiger extends Cat {

}

public class Main {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.mew();
    }
}
