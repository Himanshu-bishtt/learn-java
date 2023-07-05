/*
 * Packages means grouping related types together.
 * Benefits
 * 1. avoid name conflicts
 * 2. Easier to find types
 * 3. Control access
 *
 * */
package mathseries;

public class Main {
    public static void main(String[] args) {
        new Box<>(100).inspect(12.321F); // Integer, Integer
    }
}

class Box <T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return this.t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
