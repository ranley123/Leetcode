def func(s):
    if len(s) == 0:
        return s
    arr = list(s)
    length = len(s)
    dp = [[0] * length for _ in range(length)]
    maximum = -1
    start, end = 0, 0

    for i in range(length):
        for j in range(i, length):
            if i == j:
                dp[i][j] = 1
            elif i + 1 == j and arr[i] == arr[j]:
                dp[i][j] = 2
            elif arr[i] == arr[j]:
                dp[i][j] = dp[i + 1][j - 1] + 2
            if maximum < dp[i][j]:
                start = i
                end = j
                maximum = dp[i][j]
    return s[start: end + 1]

s = "bb"
print(func(s))