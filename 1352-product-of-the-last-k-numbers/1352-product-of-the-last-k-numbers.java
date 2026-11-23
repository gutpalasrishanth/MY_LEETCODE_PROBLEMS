class ProductOfNumbers {
    ArrayList<Integer> al;
    public ProductOfNumbers() {
        al=new ArrayList<>();
    }
    
    public void add(int num) {
        al.add(0,num);
    }
    
    public int getProduct(int k) {
        int prod=1;
        for(int i=0;i<k&&i<al.size();i++){
            prod=prod*al.get(i);
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */