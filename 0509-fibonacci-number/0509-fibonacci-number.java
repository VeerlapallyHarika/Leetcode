class Solution {
    public int fib(int n) {
		if(n<=1){
			return n;
		}
		int last=fib(n-1);
		int slast=fib(n-2);
		return last+slast;
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Solution obj=new Solution();
		for(int i=0;i<n;i++){
			System.out.print(obj.fib(i)+" ");
		}
	}
}