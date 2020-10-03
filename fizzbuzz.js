const fizzBuzz = () => {
    for (let i = 1; i < 101; i++) {
        let output = ''

        if (i % 3 === 0) output += 'Fizz'
        if (i % 5 === 0) output += 'Buzz'

        console.log(`${String(i).padEnd(5)}: ${output}`)
    }
}

fizzBuzz()
