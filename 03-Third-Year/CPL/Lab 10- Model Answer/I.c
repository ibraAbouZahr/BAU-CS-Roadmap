#include <stdio.h>

int main() {
    int n, min;
    printf("Enter the number of integers: ");
    scanf("%d", &n);

    for (int i = 1; i < n; i++) {
        int num;
        scanf("%d", &num);
        if (num < min) {
            min = num; // update min if a smaller number is found
        }
    }

    printf("The smallest number is: %d\n", min);

    return 0;
}
