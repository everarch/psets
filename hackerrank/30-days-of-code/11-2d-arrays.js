/**
 * Day 11: 2D Arrays
 *
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 *
 **/

function main() {

  let arr = Array(6);
  const rowSize = 4;
  const colSize = 4;
  let count = 0;
  let max = -100;

  for (let i = 0; i < 6; i++) {
    arr[i] = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));
  }

  for(let i = 0; i < rowSize; i++) {
    for(let j = 0; j < colSize; j++) {
      count = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
      if(count > max) {
        max = count;
      }
    }
  }
  console.log(max);
}
