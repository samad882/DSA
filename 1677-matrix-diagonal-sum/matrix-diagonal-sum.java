class Solution {
    public int diagonalSum(int[][] matrix) {
        int sum=0;
        int n=matrix.length;
  for (int i=0;i<n;i++){
    sum+=matrix[i][i];
    sum+=matrix[i][n-i-1];

  }
 if (n%2!=0){
    sum-=matrix[n/2][n/2];
 }   
    return sum;
    }
}