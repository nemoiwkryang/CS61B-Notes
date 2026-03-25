/*
Lec2

instead of making classes
like dog1 dog2 dog...,

the difference of static/instant
static cannot access instant var
invoke static methods/var using class name
invoke instant methods/var only using instance name

why all in classes and static?
offer fewer ways to do things

helper methods
goal - write a method that finds int that
bigger than all 2 left and 2 right neighbors
if neighbor not exist, just consider the existing ones.
array
-> function of find: for each, judge
-> function of judge

about "this" - adding this when initialized recommended
*/

public class DogLauncher {

    public static void main(String[] args) {
        Dog smallDog = new Dog(5);//Declaration, Instantiation, Assignment
        Dog bigDog = new Dog(100);
        Dog middleDog = new Dog(20);
        smallDog.bark();
        middleDog.bark();
        bigDog.bark();

        Dog[] dogs = {new Dog(1), bigDog, middleDog};
        for(int i=0;i<dogs.length;i++){
            dogs[i].bark();
        }
        Dog.max(smallDog, middleDog).bark();
        System.out.println();
        int[] sizes={10, 20, 30, 25, 20, 40, 10};
        Dog[] dogsLTFN = new Dog[sizes.length];
        for(int i=0;i<sizes.length;i++){
            dogsLTFN[i] = new Dog(sizes[i]);
        }
        Dog.largerThanFourNeighbors(dogsLTFN);
    }
}
