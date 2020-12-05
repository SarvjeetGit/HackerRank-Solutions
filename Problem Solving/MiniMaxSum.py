#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the miniMaxSum function below.
def miniMaxSum(arr):
    minsum=0
    maxsum=0
    mi=min(arr)
    ma=max(arr)
    if (mi==ma):
        minsum=maxsum=mi*3
    else:
        for i in range(len(arr)):
            if(arr[i]==mi or arr[i]==ma):
                continue
            minsum+=arr[i]
            maxsum+=arr[i]
    print((minsum+mi),(maxsum+ma))

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
