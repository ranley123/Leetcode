def removeDuplicates(nums):
    if len(nums) <= 1:
        return len(nums)
    pre = 0
    cur = 0

    while cur < len(nums):
        while cur < len(nums) and nums[pre] == nums[cur]:
            cur += 1

        if cur < len(nums):
            nums[pre + 1] = nums[cur]
            pre += 1
    return pre + 1

nums = [0,0,1,1,1,2,2,3,3,4]
print(removeDuplicates(nums))