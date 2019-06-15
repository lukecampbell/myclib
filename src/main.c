/*
 * src/main.c
 */

#include <stdio.h>
#include <math.h>
#include "sum.h"

int main(int argc, char *argv[]) {
    double a = 2.718;
    double b = 5.2;
    if (fabs(sum(a,b) - (a + b)) > 0.01) {
        return 1;
    }
    return 0;
}
