def helper(board, i, j, arr, index):
    if (i >= 0 and i < len(board) and j >= 0 and j < len(board[0])) == False:
        return False
    if index == len(arr):
        return True
    target = arr[index]
    res = False
    if board[i][j] == target:
        board[i][j] = '*'
        res = helper(board, i + 1, j, arr, index + 1) or helper(board, i - 1, j, arr, index + 1) or helper(board, i, j + 1, arr, index + 1) or helper(board, i, j - 1, arr, index + 1)
    else:
        return False
    board[i][j] = arr[index]
    return res

def exist(board, word):
    if len(board) == 0 or len(board[0]) == 0:
        return False
    arr = list(word)
    row = len(board)
    col = len(board[0])
    for i in range(row):
        for j in range(col):
            if (board[i][j] == arr[0]):
                if helper(board, i, j, arr, 0) == True:
                    return True
    return False

board = [['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']]
word = "ABCB"
print(exist(board, word))