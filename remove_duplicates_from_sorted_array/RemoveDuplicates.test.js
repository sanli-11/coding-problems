const { removeDuplicatesUsingSet } = require("./removeDuplicatesUsingSet");

test("test 1", () => {
  const result = removeDuplicatesUsingSet([1, 1, 2]);

  expect(result).toBe(2);
})

test("test 2", () => {
  const result = removeDuplicatesUsingSet([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]);

  expect(result).toBe(5);
})
