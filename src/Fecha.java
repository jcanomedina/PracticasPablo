public class Fecha {
    private int day;
    private int month;
    private int year;

    private int[] dayspermonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Fecha (int d, int m, int y) {
        day = d ;
        month = m ;
        year = y;
    }

    public int diferencia (Fecha f) {
        int numdias = 0;

        int d1 = this.getDay();
        int d2 = f.getDay();

        int m1 = this.getMonth();
        int m2 = f.getMonth();

        int y1 = this.getYear();
        int y2 = f.getYear();

        // days between y1 and y2
        if (m1 < m2) {
            numdias = numdias + (y2-y1) * 365;
        } else {
            numdias = numdias + (y2-y1-1) * 365;
        }

        // days between m1 and m2
        if (d1 >= d2) {
            numdias = numdias + (m2-m1-1) * 30;
        } else {
            numdias = numdias + (m2-m1) * 30;
        }

        // days between d1 and d2
        numdias = numdias + dayspermonth[m1-1] - d1 + d2;

        return numdias;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
