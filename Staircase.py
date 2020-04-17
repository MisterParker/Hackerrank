#Java
# static void staircase(int n) {
#         int t=n;
#         while(t>0){
#             for(int i=0;i<t-1;i++)
#                 System.out.print(" ");
#             for(int i=0;i<n-t+1;i++)
#                 System.out.print("#");
#             System.out.println();
#             t--;
#         }
    }

#Python
def staircase(n):
    for i in range(1,n+1):
        print(str("#"*i).rjust(n)) # rjust justifies the content to right with length being 'n'