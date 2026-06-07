const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question('', (n) => {
    n = parseInt(n);

for (let i = 0; i < n; i++) {
    let line = "";

    for (let j = 0; j < n; j++) {
        if (i === j && i === Math.floor(n / 2)) {
            line += "X";
        }
        else if (i === j) {
            line += "\\";
        }
        else if (i + j === n - 1) {
            line += "/";
        }
        else {
            line += "*";
        }
    }

    console.log(line);
    }
    rl.close();
});