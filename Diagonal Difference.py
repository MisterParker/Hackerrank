# Python
def diagonalDifference(arr):
    # Write your code here
    d1,d2=0,0
    for i in range(len(arr)):
        d1+=arr[i][i]
        d2+=arr[len(arr)-i-1][i]
    return abs(d1-d2)