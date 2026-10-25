class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =new ArrayList<>();
        if (numRows==0){
            return result;

        }
        List<Integer>alist=new ArrayList<>();
    alist.add(1);
    result.add(alist);
   if (numRows==1){
   return result;
   }
    for(int i=1;i<numRows;i++){
      List<Integer>prevRow=result.get(i-1);
      List<Integer>row= new ArrayList<>();
      row.add(1);

    
   for (int j=1;j<i;j++){
    int num=prevRow.get(j-1)+ prevRow.get(j);
   row.add(num);
   }
  row.add(1);
  result.add(row);
    }
    return result;
    }

}