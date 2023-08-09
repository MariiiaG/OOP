package OOP.Sem2_zoo;

import java.util.List;

public class ZooNoise {
    private List<Speakable> speakables;

    public ZooNoise(List<Speakable> speakables) {
        this.speakables = speakables;
    }

    public void speakAll() {
        for (Speakable speakable: speakables) {
            speakable.speak();
        }
    }
}
