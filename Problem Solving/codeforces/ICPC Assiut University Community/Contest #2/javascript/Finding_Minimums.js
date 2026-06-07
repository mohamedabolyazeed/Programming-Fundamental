const reader = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

reader.question('', (line1) => {

    reader.question('', (line2) => {

        let first = line1.trim().split(' ').map(Number);
        let second = line2.trim().split(' ').map(Number);

        let n = first[0];
        let k = first[1];

        let arr = second;

        let res = [];

        for (let i = 0; i < n; i += k) {
            let min = arr[i];

            for (let j = i; j < i + k && j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
            }

            res.push(min);
        }

        console.log(res.join(' '));

        reader.close();
    });
});