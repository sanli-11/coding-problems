const removeDuplicatesUsingSet = (nums) => {
  const uniqueItems = [...new Set(nums)];

  nums.length = 0;
  nums.push(...uniqueItems);

  return nums.length;
};

module.exports = { removeDuplicatesUsingSet };
