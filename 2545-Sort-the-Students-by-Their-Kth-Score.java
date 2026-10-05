class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int largest = 0;
        for (int s = 0; s < score.length - 1; s++) {
            for (int i = 0; i < score.length; i++) {
                for (int j = 0; j < score[i].length; j++) {
                    if (i != score.length - 1 && score[i][k] < score[i + 1][k]) {
                        int[] temp = score[i];
                        score[i] = score[i + 1];
                        score[i + 1] = temp;
                    }
                }
            }
        }
        return score;
    }
}