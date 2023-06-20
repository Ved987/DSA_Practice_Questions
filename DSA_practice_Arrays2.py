# Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
#Example Input:
#2
#2 4
# Example Output:
#4

#Code:
n = int(input())
arr = list(map(int, input().split()))

max_area = -1
for i in range(n):
    for j in range(i,n):
        a = arr[i:j+1]
        l = len(a)
        area = min(a)*l
        if max_area < area:
            max_area = area

print(max_area)