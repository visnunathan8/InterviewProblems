public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++){
            arr.add(new ArrayList());
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr.get(i).add(1);
                }else{
                    int y = arr.get(i-1).get(j-1) + arr.get(i-1).get(j); 
                    arr.get(i).add(y);
                }
            }
        }
        return arr;
    }
