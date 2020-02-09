def rob(nums):
    if nums == None:
        return 0
    if len(nums) == 1:
        return nums[0]
    return max(helper(nums, 0, len(nums) - 2), helper(nums, 1, len(nums) - 1))
    
def helper(nums, start, end):
    num1 = nums[start]
    num2 = max(nums[start], nums[start + 1])
    profit = max(num1, num2)
    for i in range(start + 2, end):
        profit = max(num1 + nums[i], num2)
    return profit

nums = [2,3,2]
print(rob(nums))