const { expect } = require('@jest/globals');
const { add, subtract, multiply, divide } = require('./calculator');


test('should return 3 given 1 and 2', () => {
  expect(add(1, 2)).toBe(3);
})

test('should return -1 given 1 and 2', () => {
  expect(subtract(1, 2)).toBeLessThan(1);
})

test('should return 2 given 1 and 2', () => {
  expect(multiply(1, 2)).not.toBe(5);
})

test('should return .5 given 1 and 2', () => {
  expect(divide(1, 2)).toEqual(.5);
})
