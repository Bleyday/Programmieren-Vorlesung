
function checkBrackets(text) {
    let count = 0;
    for (let i = 0; i < text.length; i++) {
        if (text[i] === "(") count++;
        else if (text[i] === ")")
            if (count === 0) return false;
            else count--;
    }

    if (count === 0) return true;
    return false;
}
console.log(checkBrackets("(())((()))"))