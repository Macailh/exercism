// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
  if (name == "Pure Strawberry Joy") {
    return 0.5;
  } else if (name == "Energizer" || name == "Green Garden") {
    return 1.5;
  } else if (name == "Tropical Island") {
    return 3;
  } else if (name == "All or Nothing") {
    return 5;
  } else {
    return 2.5;
  }
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
  let limesWedges = 0;
  let limesToCut = 0;

  for (let i = 0; i < limes.length && limesWedges < wedgesNeeded; i++) {
    if (limes[i] == "small") {
      limesWedges += 6;
      limesToCut++;
    } else if (limes[i] == "medium") {
      limesWedges += 8;
      limesToCut++;
    } else {
      limesWedges += 10;
      limesToCut++;
    }
  }

  return limesToCut;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
  let remainingOrders = [];
  let totalTime = 0;

  for (let i = 0; i < orders.length; i++) {
    if (totalTime < timeLeft) {
      totalTime += timeToMixJuice(orders[i]);
    } else {
      remainingOrders = orders.splice(i);
      break;
    }
  }
  return remainingOrders;
}
