package people.women;

import lombok.extern.slf4j.Slf4j;
import people.faces.Woman;

@Slf4j
public class Irina implements Woman {

    public Irina(int trainsInWeek, boolean cleanly, String nameOfDish) {
        train(trainsInWeek);
        doHomeWork(cleanly);
        cook(nameOfDish);
    }

    @Override
    public void train(int trainsInWeek) {
        if (trainsInWeek < 1) log.info("{} is fat ass", this.getClass().getSimpleName());
        else log.info("{} trains {} times in week", this.getClass().getSimpleName(), trainsInWeek);
    }

    @Override
    public void doHomeWork(boolean truth) {
        if (truth) log.info("{} is neat & cleanly", this.getClass().getSimpleName());
        else log.info("{} is dirty pig", this.getClass().getSimpleName());

    }

    @Override
    public void cook(String nameOfDish) {
        log.info("{} is eating {}", this.getClass().getSimpleName(), nameOfDish);
    }
}
