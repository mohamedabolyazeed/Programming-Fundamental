const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (answer) => {
    let input = answer.trim().split(' ');

    let a = parseInt(input[0]);
    let b = parseInt(input[1]);

    if (a >= b) {
        console.log(a - b);
    } else {
        console.log(0);
    }

    rl.close();
});