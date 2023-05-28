public class BonusCalculator {
    public double calculateBonus(int workHours) {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }
}
