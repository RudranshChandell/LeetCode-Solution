class Solution {
    private Map<String,String>parent;
    private Map<String,Double>weight;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        int size=equations.size();
        parent=new HashMap<>();
        weight=new HashMap<>();

        for(List<String>equation:equations){
            String numerator=equation.get(0);
            String denominator=equation.get(1);
            parent.put(numerator,numerator);
            weight.put(numerator,1.00);
            weight.put(denominator,1.00);
            parent.put(denominator,denominator);
        }

        for(int i=0;i<size;i++){
            List<String>equation=equations.get(i);
            String numerator=equation.get(0);
            String denominator=equation.get(1);

            String pnumerator=findParent(numerator);
            String pdenominator=findParent(denominator);

            if(Objects.equals(pnumerator,pdenominator)){
                continue;
            }

            parent.put(pnumerator,pdenominator);
            weight.put(pnumerator, weight.get(denominator)*values[i]/weight.get(numerator));
        }
        size=queries.size();
        double ans[]=new double[size];

        for(int i=0;i<size;i++){
            String first=queries.get(i).get(0); 
            String second=queries.get(i).get(1);
            
            if(!parent.containsKey(first) || !parent.containsKey(second)|| !Objects.equals(findParent(first),findParent(second))){
                ans[i]=-1;
            }else{
                ans[i]= weight.get(first)/weight.get(second);
            }

        }
        return ans;        
    }

    public String findParent(String x){
        if(!Objects.equals(x,parent.get(x))){
            String originalParent=parent.get(x);
            parent.put(x,findParent(originalParent));
            weight.put(x,weight.get(x)*weight.get(originalParent));
        }
        return parent.get(x);
    }
}