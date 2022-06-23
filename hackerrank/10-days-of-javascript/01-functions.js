/**
 *
 * Day 1: Functions
 *
 * https://www.hackerrank.com/challenges/js10-function/problem
 *
 **/

/*
 * Create the function factorial here
 */
const factorial = n => (n === 0 ? 1 : n * factorial(n - 1));


function main() {
    const n = +(readLine());

    console.log(factorial(n));
}
