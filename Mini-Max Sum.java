static void miniMaxSum(int[] arr) {
        long sum =0;
        for(int n:arr)
            sum+=n;
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.printf("%d %d",sum-max,sum-min);
    }