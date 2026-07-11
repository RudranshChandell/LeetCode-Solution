class StockSpanner {
    List<Integer>list;
    public StockSpanner() {
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        int count=0;
        list.add(price);
        int size=list.size()-1;
        while(size>=0){
            if(list.get(size)<=price){
                count++;
                size--;
            }else{
                break;
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */