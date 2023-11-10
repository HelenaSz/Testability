public class BonusMilesService {

    public int calculate(int price) {
        int rub = 20;
        int bonusMiles = price / rub;

        return bonusMiles;
    }
}

