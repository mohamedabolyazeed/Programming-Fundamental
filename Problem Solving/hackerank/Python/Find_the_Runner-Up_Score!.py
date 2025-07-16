if __name__ == '__main__':
    n = int(input())  
    arr = list(map(int, input().split()))

    highest = max(arr)  # Find the highest score
    
    arr = [score for score in arr if score != highest]  # Remove the highest score

    runner_up = max(arr) # Find the runner-up score
    print(runner_up) # Print the runner-up score 
  