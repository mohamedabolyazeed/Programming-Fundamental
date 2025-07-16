const firstArray = [1, 4, 8, 12, 9, 20, 7];
const secondArray = [1, 2, 3, 4, 6, 7, 12];

const findCommonElements = (firstArray, secondArray) => {
    const commonElements = [];

    for (let i = 0; i < firstArray.length; i++) {
        if (secondArray.includes(firstArray[i])) {
            commonElements.push(firstArray[i]);
        }
    }
    return commonElements;
};

const commonElementsArray = findCommonElements(firstArray, secondArray);

console.log(commonElementsArray);
