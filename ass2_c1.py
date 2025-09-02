#Write a binary search function which searches an item in a sorted list. The function should return 
#the index of element to be searched in the list.


def binary_search(arr, x):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2   
        if arr[mid] == x:
            return mid            
        elif arr[mid] < x:
            low = mid + 1         
        else:
            high = mid - 1        
    return -1                     


# Example usage
arr = [10, 20, 30, 40, 50]
print(binary_search(arr, 30))  
print(binary_search(arr, 50))  
