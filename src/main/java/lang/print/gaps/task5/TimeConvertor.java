package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        try {
            System.out.println(minutes * 60);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
