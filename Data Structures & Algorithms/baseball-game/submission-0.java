class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<>();

        for (int i = 0; i < operations.length; ++i) {
            if (operations[i].equals("+")) {
                int newScore = record.get(record.size() - 1) + record.get(record.size() - 2);
                record.add(newScore);
            }
            else if (operations[i].equals("C")) {
                record.remove(record.size() - 1);
            }
            else if (operations[i].equals("D")) {
                record.add(record.get(record.size() - 1) * 2);
            }
            else {
                String theString = operations[i];
                int number = Integer.parseInt(theString);
                record.add(number);
            }
        }
        int total = 0;
        for (int x = 0; x < record.size(); ++x) {
            total += record.get(x);
        }
        return total;
        
    }
}