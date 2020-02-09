def func(matrix):
    # row = len(matrix)
    # col = len(matrix[0])
    # dp = [[0] * row]

    # for i in range(row):
    #     for j in range(col):
    #         if i == 0 and j == 0:
    #             dp[i][j] = matrix[i][j]
    #         elif i == 0:
    #             dp[i][j] = min(matrix[i][j], matrix[i][j - 1])
    #         elif j == 0:
    #             dp[i][j] = min(matrix[i][j], matrix[i - 1][j])
    #         else:
    #             dp[i][j] = min(matrix[i][j], max(dp[i - 1][j], dp[i][j - 1])
    # return dp[-1][-1]
    if not matrix or not matrix[0]:
        return 0

    n, m = len(matrix), len(matrix[0])

    dp = [[0] * m for _ in range(n)]

    for i in range(n):
        for j in range(m):
            if i == 0 and j == 0:
                dp[i][j] = matrix[i][j]
            elif i == 0:
                dp[i][j] = min(matrix[i][j], dp[i][j - 1])
            elif j == 0:
                dp[i][j] = min(matrix[i][j], dp[i - 1][j])
            else:
                dp[i][j] = max(min(dp[i-1][j], matrix[i][j]), min(dp[i][j-1], matrix[i][j]))

    return dp[-1][-1]

print(func([[5, 1],
 [4, 5]]))
