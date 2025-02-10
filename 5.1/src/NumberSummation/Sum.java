package NumberSummation;

import java.util.List;


class Sum extends Thread {
    private List<Integer> list;
    private int start;
    private int end;
    private long sum = 0;

    public Sum(List<Integer> list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += list.get(i);
        }
    }

    public long getSum() {
        return sum;
    }
}