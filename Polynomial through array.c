#include <stdio.h>

#define MAX_DEGREE 10

void addPolynomials(int poly1[], int poly2[], int result[], int degree) {
    for (int i = 0; i <= degree; i++) {
        result[i] = poly1[i] + poly2[i];
    }
}

int main() {
    int degree;

    printf("Enter the degree of the polynomials (up to %d): ", MAX_DEGREE);
    scanf("%d", &degree);

    int poly1[degree+1], poly2[degree+1], result[degree+1];

    printf("Enter the coefficients of the first polynomial:\n");
    for (int i = 0; i <= degree; i++) {
        printf("Coefficient %d: ", i);
        scanf("%d", &poly1[i]);
    }

    printf("Enter the coefficients of the second polynomial:\n");
    for (int i = 0; i <= degree; i++) {
        printf("Coefficient %d: ", i);
        scanf("%d", &poly2[i]);
    }

    addPolynomials(poly1, poly2, result, degree);

    printf("The sum of the two polynomials is:\n");
    for (int i = 0; i <= degree; i++) {
        printf("%dx^%d ", result[i], i);
        if (i != degree) {
            printf("+ ");
        }
    }
    printf("\n");

    return 0;
}

