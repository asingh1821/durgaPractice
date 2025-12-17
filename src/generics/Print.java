package generics;

public class Print<T> {

    T value;

    public void setPrint(T value){
        this.value = value;
    }
    public  T getPrint(){
        return value;
    }
}
