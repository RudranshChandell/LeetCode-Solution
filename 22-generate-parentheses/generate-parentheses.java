class Solution {
    public List<String> generateParenthesis(int n) {
        List<String >res=new ArrayList<>();
        generate(res,0,0,"",n);
        return res;
    }

    public void generate(List<String>res,int left,int right,String str, int n){
        if(str.length()==n*2){
            res.add(str);
            return;
        }

        if(left<n){
            generate(res,left+1,right,str+"(",n);
        }
        if(right<left){
            generate(res,left,right+1,str+")",n);
        }
    }
}