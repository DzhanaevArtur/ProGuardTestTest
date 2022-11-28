package people.human;

import lombok.extern.slf4j.Slf4j;
import people.faces.Human;

@Slf4j
public class Artur implements Human {

    public Artur(int numberOfWomen, int valueOfSalary) {
        eat();
        fuckWomen(numberOfWomen);
        makeMoney(valueOfSalary);
    }

    @Override
    public void eat() {
        log.info("Please, don't disturb! {} is eating", this.getClass().getSimpleName());
    }

    @Override
    public void fuckWomen(int numberOfWomen) {
        log.info("{} is fucking {} brilliant girls", this.getClass().getSimpleName(), numberOfWomen);
    }

    @Override
    public void makeMoney(int valueOfSalary) {
        log.info("You can be proud {}! His salary is now {}", this.getClass().getSimpleName(), valueOfSalary);
    }
}
