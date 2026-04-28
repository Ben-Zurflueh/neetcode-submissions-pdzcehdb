class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];
        for (int s : students) {
            counts[s]++;
        }

        for (int sandwich : sandwiches) {
            if (counts[sandwich] > 0) {
                counts[sandwich]--;
            } else {
                return counts[0] + counts[1];
            }
        }
        return counts[0] + counts[1];
    }
}