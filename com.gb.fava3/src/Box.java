import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    public float boxWeight = getWeight(fruits);

    public void putInBox (T fruit){
        fruits.add(fruit);
    }

    public float getWeight(ArrayList<T> fruits) {
        return T.weight * fruits.size();
    }

    public boolean compare (Box<T> anotherBox){
        return this.boxWeight == anotherBox.boxWeight;
    }

    public void pourBox (Box<T> anotherBox){
        anotherBox.fruits = (ArrayList<T>) this.fruits.clone();
        this.fruits.clear();
    }
}
