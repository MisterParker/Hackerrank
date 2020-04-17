//JAVA
static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int f1=0,f2=0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i))
                f1++;
            else if(a.get(i)<b.get(i))
                f2++;
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(f1);
        list.add(f2);
        return list;

    }