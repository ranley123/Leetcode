# Maximal Square

def maximalSquare(matrix):
    row = len(matrix)
    if row == 0:
        return 0
    col = len(matrix[0])
    dp = [[0] * col for i in range(row)]
    maximum = 0
    for j in range(col):
        if matrix[0][j] == "1":
            dp[0][j] = 1
            maximum = 1
    for i in range(row):
        if matrix[i][0] == "1":
            dp[i][0] = 1
            maximum = 1
    for i in range(1, row):
        for j in range(1, col):
            if matrix[i][j] == "1":
                dp[i][j] = min(min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1
                maximum = max(maximum, dp[i][j])
            else:
                dp[i][j] = 0
    return maximum * maximum

matrix = [["0","1"]]
print(maximalSquare(matrix))