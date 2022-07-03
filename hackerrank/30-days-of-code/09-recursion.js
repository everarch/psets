/**
 *
 * Day 9: Recursion 3
 *
 * https://www.hackerrank.com/challenges/30-recursion/problem
 *
 **/

/*
 * Complete the 'factorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

function factorial(n) {
  // Write your code here
  if (n == 1) {
    return n;
  } else {
    return n * factorial(n - 1);
  }
}

function main() {
  const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

  const n = parseInt(readLine().trim(), 10);

  const result = factorial(n);

  ws.write(result + '\n');

  ws.end();
}
