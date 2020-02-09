import sys

def numSquares(n):
    dp = [sys.maxsize] * (n + 1)
    i = 0
    while True:
        if i * i <= n:
            dp[i * i] = 1
            i += 1
        else:
            break
    for i in range(1, n + 1):
        j = 1
        while True:
            if i + j * j <= n:
                dp[i + j * j] = min(dp[i + j * j], dp[i] + 1)
                j += 1
            else:
                break
    return dp[n]

print(numSquares(13))