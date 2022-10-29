package chapter02.loops2.breaks;

class Break4WithLabels {
    public static void main(String[] args) {

        first: // the for loop is labeled as first
        for( int i = 1; i < 5; i++) {
            second: // the for loop is labeled as second
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);
                // the break statement breaks the first for loop
                if (i == 2)
                    break first;
            }
        }
    }
}