def maxProfit(prices):
    length = len(prices)
    if length <= 1:
        return 0
    buy = [0] * length
    sell = [0] * length
    buy[0] = -prices[0]    

    for i in range(1, length):
        buy[i] = max(sell[i - 1] - prices[i], buy[i - 1])
        sell[i] = max(buy[i - 1] + prices[i], sell[i - 1])
    return max(buy[length - 1], sell[length - 1])

def maxProfit2(prices):
    if len(prices) <= 1:
        return 0
    profit = 0
    for i in range(1, len(prices)):
        if prices[i] > prices[i - 1]:
            profit += prices[i] - prices[i - 1]
    return profit

prices = [7,1,5,3,6,4]
print(maxProfit(prices))