#include <stdio.h>

int main() {
    int upper_bound;
    printf("Enter the upper bound: ");
    scanf("%d", &upper_bound);

    printf("Odd numbers between 1 and %d are: ", upper_bound);
    for (int i = 1; i <= upper_bound; i++) {
        if (i % 2 == 1) {
            printf("%d ", i);
        }
    }
    printf("\n");

    return 0;
}
