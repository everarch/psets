/**
 * 
 * Day 5: Loops
 *
 *  https://www.hackerrank.com/challenges/30-loops/problem
 *
 **/

function main() {
  const n = parseInt(readLine().trim(), 10);
  for (let i = 1; i <= 10; i++) {
    console.log(n + " x " + i + " = " + n * i);
  }
}
