package Day12;

class MyClass<T> {
    T obj;

    void add(T obj1) {
        this.obj = obj1;
    }

    T get() {
        return obj;
    }
}

public class Learning_GenericTypes2 {
    public static void main(String[] args) {
        MyClass<Object> objectMyClass = new MyClass<>();
        objectMyClass.obj = "Hola";
        objectMyClass.add("Hello");
        String result = (String) objectMyClass.get();
        System.out.println(result);

        MyClass<Integer> numbers = new MyClass<>();
        numbers.obj = 2;
        numbers.add(3);
        int result1 = numbers.get();
        System.out.println(result1);


    }
}
