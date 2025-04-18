class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> rows = new ArrayList<>();
         rows.add(Arrays.asList(1));
         for(int i=0;i<numRows-1;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(0); // Add 0 at the beginning
            temp.addAll(rows.get(rows.size() - 1)); // Add all elements of the last row
            temp.add(0);
            System.out.println(temp);
            List<Integer> lastRow = rows.get(rows.size()-1);
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < lastRow.size() + 1; j++) {
                newRow.add(temp.get(j) + temp.get(j + 1)); // Sum adjacent elements
            }
            rows.add(newRow);
           
         }
         return rows;
    }
     
}