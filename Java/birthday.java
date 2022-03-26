class Birthday {
    public static void main(String[] args) {

        // this variable keeps track of the number of people we've asked so far
        int numPeople = 0;

        // this array will associate true or false with each possible birthday
        boolean[] seenBefore = new boolean[365];

        while (true) { // same as: while (1 < 2)

            // ask a person - so increment counter
            numPeople += 1;

            // represented as an int between 0 and 364
            int dayNum = (int) (Math.random() * 365);

            // if we've seen this dayNum in a previous iteration,
            // leave the loop immediately
            if (seenBefore[dayNum])
                break;

            // update seenBefore[], for future iterations of this loop
            seenBefore[dayNum] = true;

        }

        // so, how many people did you need to find two with the same birthday?
        System.out.println(numPeople);
    }
}
