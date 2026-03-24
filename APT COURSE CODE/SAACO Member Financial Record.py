name = input("Enter member name: ")
member_id = input("Enter member ID: ")
total_savings = 0

for i in range(1, 7):
    contribution = float(input(f"Enter contribution for month {i}: "))
    total_savings += contribution

print("Total Savings:", total_savings)
