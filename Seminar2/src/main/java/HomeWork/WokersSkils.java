package HomeWork;

import java.util.ArrayList;

public class WokersSkils {
    private final ArrayList<Developer> developers = new ArrayList<>();
    public void wokersSkils() {

        developers.add(new FrontEnder());
        developers.add(new BackEnder());


        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i) instanceof FrontEnder) {
                (developers.get(i)).developGUI();
            }
        }
    }
}
