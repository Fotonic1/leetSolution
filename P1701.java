public class P1701 {
    public double averageWaitingTime(int[][] customers) {
        long sum = 0;
        int time = customers[0][0];
        for (int i = 0; i < customers.length; i++) {
            int start = time - customers[i][0];

            if (start < 0) {
                time = customers[i][0];
                start = 0;
            }

            sum += start + customers[i][1];
            time += customers[i][1];
        }

        return (double) sum / customers.length;
    }
}
