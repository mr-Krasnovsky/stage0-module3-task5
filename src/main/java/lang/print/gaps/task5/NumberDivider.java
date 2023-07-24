package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        try {
            System.out.println((double) toBeDivided / 5);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
