//
// This is only a SKELETON file for the 'Raindrops' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const convert = (n) => {
  let raindrop = "";
  if (n % 3 == 0) {
    raindrop += "Pling";
  }
  if (n % 5 == 0) {
    raindrop += "Plang";
  }
  if (n % 7 == 0) {
    raindrop += "Plong";
  }
  if (raindrop === "") {
    return n.toString();
  }
  return raindrop;
};
