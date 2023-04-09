//
// This is only a SKELETON file for the 'Anagram' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const findAnagrams = (word, listOfWords) => {
  let anagrams = [];
  for (let i = 0; i < listOfWords.length; i++) {
    if (word.toLowerCase() === listOfWords[i].toLowerCase()) {
      continue;
    }

    let word1 = word.toLowerCase().split("").sort().join("");
    let word2 = listOfWords[i].toLowerCase().split("").sort().join("");

    if (word1 === word2) {
      anagrams.push(listOfWords[i]);
    }
  }
  return anagrams;
};
