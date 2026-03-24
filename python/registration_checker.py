# Student registration checker - Python version
# Asks for name and units, then says if it's ok or overload.

student_name = input("Enter student name: ")
num_units = int(input("Enter number of registered units: "))

# More than 7 units = need approval (that's the rule we were given)
if num_units > 7:
    registration_status = "Overload - Approval Required"
else:
    registration_status = "Registration Accepted"

# Show everything at the end so it's easy to read
print()
print("--- Final Summary ---")
print("Student:", student_name)
print("Units:", num_units)
print("Status:", registration_status)
