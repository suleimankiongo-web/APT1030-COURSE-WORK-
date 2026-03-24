/*
 * Student registration checker in C
 * I'm using fgets for the name so a full name with spaces still works
 */

#include <stdio.h>
#include <string.h>

int main(void)
{
    char studentName[100];
    int numUnits;
    int len;
    const char *registrationStatus;

    printf("Enter student name: ");
    fgets(studentName, sizeof studentName, stdin);

    /* fgets keeps the Enter key as a newline - chop it off */
    len = strlen(studentName);
    if (len > 0 && studentName[len - 1] == '\n') {
        studentName[len - 1] = '\0';
    }

    printf("Enter number of registered units: ");
    scanf("%d", &numUnits);

    if (numUnits > 7) {
        registrationStatus = "Overload - Approval Required";
    } else {
        registrationStatus = "Registration Accepted";
    }

    printf("\n--- Final Summary ---\n");
    printf("Student: %s\n", studentName);
    printf("Units: %d\n", numUnits);
    printf("Status: %s\n", registrationStatus);

    return 0;
}
