def two_sum(nums, target):
    seen = {}  # Keeps track of numbers we have already looked at
    
    for index, num in enumerate(nums):
        complement = target - num  # The exact number we need to reach the target
        
        # Check if the needed number is already in our dictionary
        if complement in seen:
            return [seen[complement], index]
            
        # If not, save the current number and its index for later
        seen[num] = index
        
    return []  # Return empty list if no pair is found

# --- Example Usage ---
numbers = [2, 7, 11, 15]
goal = 9

result = two_sum(numbers, goal)
print("Indices of the two numbers:", result)
# Output: [0, 1] (because 2 + 7 = 9)
