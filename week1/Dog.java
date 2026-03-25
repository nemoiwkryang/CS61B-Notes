public class Dog {
    public int weight;
    public static String species="Dogs";

    public Dog(int weight) {//Constructor
        this.weight = weight;
    }

    public static Dog max(Dog d1, Dog d2){
        if (d1.weight > d2.weight) {
            return d1;
        }
        return d2;
    }

    public void bark(){//Non-static method
        if(weight < 10){
            System.out.println("Small Barking...");
        }
        else if(weight < 30){
            System.out.println("Middle Barking...");
        }
        else{
            System.out.println("Huge Barking...");
        }
    }
    static int max(int x,int y){
        if(x > y){
            return x;
        }
        return y;
    }
    static int min(int x, int y){
        return -max(-x,-y);
    }
    public static void largerThanFourNeighbors(Dog[] dogs){
        int n=dogs.length;
        boolean isLarge=true;

        for(int i = 0; i < n; i++){
            isLarge=true;

            for(int j=max(i-2,0);j<min(n,i+2);j++){
                if(dogs[i].weight<dogs[j].weight){
                    isLarge=false;
                    break;
                }
            }

            if(isLarge){
                System.out.println(dogs[i].weight);
            }
        }
    }
}
