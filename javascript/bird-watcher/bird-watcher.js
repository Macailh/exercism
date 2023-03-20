// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export function totalBirdCount(birdsPerDay) {
  let numOfBirds = 0;
  for (let i = 0; i < birdsPerDay.length; i++) {
    numOfBirds += birdsPerDay[i];
  }

  return numOfBirds;
}

/**
 * Calculates the total number of birds seen in a specific week.
 *
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number} birds counted in the given week
 */
export function birdsInWeek(birdsPerDay, week) {
  const daysInWeek = 7;
  const startIndex = (week - 1) * daysInWeek;
  const endIndex = startIndex + daysInWeek;
  const weekBirdCounts = birdsPerDay.slice(startIndex, endIndex);
  const totalBirdsInWeek = weekBirdCounts.reduce(
    (acc, count) => acc + count,
    0
  );
  return totalBirdsInWeek;
}

/**
 * Fixes the counting mistake by increasing the bird count
 * by one for every second day.
 *
 * @param {number[]} birdsPerDay
 * @returns {number[]} corrected bird count data
 */
export function fixBirdCountLog(birdsPerDay) {
  for (let i = 0; i < birdsPerDay.length; i = i + 2) {
    birdsPerDay[i]++;
  }
  return birdsPerDay;
}
