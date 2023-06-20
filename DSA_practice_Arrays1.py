#Given an array, Arr[] of N integers, find the contiguous sub-array (containing at least one number) that has the maximum sum, and return its sum.

#Example case : Input:
#N = 5
#Arr[] = {1,2,3,-2,5}
#Output: 9
#Explanation: Max subarray sum is 9 of the elements (1, 2, 3, -2, 5), which is a contiguous subarray

# Code:

n = int(input())
arr = list(map(int, input().split()))

max_sum = -1

for i in range(n):
    for j in range(i,n):
        a = sum(arr[i:j+1])
        if a > max_sum:
            max_sum = a

print(max_sum)