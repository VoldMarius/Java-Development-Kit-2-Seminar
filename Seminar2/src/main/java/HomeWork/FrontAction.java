package HomeWork;

public interface FrontAction {
    void front();
    default void cofee() {
        System.out.println("Drink");
    };
}