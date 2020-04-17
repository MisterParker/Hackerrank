class Add{
    public void add(int...nums){
        int sum = 0;
        String plus = "";
        for(int num : nums){
            sum+=num;
            System.out.print(plus+num);
            plus="+";
        }
        System.out.println("="+sum);
    }
}