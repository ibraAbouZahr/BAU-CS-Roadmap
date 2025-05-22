#include <stdio.h>

int main() {
    int rows;
    scanf("%d", &rows);

    // outer loop for rows
    for (int i = 1; i <= rows; i++) {
        // inner loop for columns
        for (int j = 1; j <= i; j++) {
            printf("%d ", j); // print column number
        }
        printf("\n"); // move to next row
    }

    return 0;
}
