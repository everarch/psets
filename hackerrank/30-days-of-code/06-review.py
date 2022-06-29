#
# Day 6: Let's Review
# 
# https://www.hackerrank.com/challenges/30-review-loop/problem
#

# Enter your code here. Read input from STDIN. Print output to STDOUT

def printstring(s):
  even = ''
  odd = ''
  for i in range(len(s)):
    if i % 2 == 0:
      even += s[i]
    else:
      odd += s[i]
  print(even + ' ' + odd)

if __name__ == '__main__':
  for i in range(int(input())):
    printstring(input())
