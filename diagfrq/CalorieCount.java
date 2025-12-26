package diagfrq;

public class CalorieCount {
    private int calLimit = 0;
    private int cal = 0;
    private int protein = 0;
    private int carbs = 0;
    private int fat = 0;

    public CalorieCount(int dailyCalLimit) {
        calLimit = dailyCalLimit;
    };

    public void addmeal(int calories, int protein, int carbohydrate, int fat) {
        cal = calories + cal;
        protein = protein + protein;
        carbs = carbohydrate + carbs;
        fat = fat + fat;
    };

    public boolean onTrack() {
        if (cal <= calLimit) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        CalorieCount sunday = new CalorieCount(1500);
        sunday.addmeal(1400, 32, 1, 3);
        sunday.addmeal(3,5,7,10);

        System.out.println(sunday);

        System.out.println(sunday.onTrack());
    }
}
