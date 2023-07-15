let runningTotal = 0;
let buffer = "0";
let previousOperator;

const screen = document.querySelector('.screen');

function buttonClick(value){
    if(isNaN(value)){
        handleSymbol(value);
    }else{
        handleSymbol(value);
    }
    screen.innerText = buffer;
}

function handleSymbol(symbol){
    switch(symbol){
        case 'C':
            buffer = '0';
            runningTOtal = 0;
            break;
        case "=":
            if(previousOperator === null){
                return
            }
            flushOperation(parseInt(buffer));
            previousOperator = bull;
            buffer = runningTotal;
            break;
        case ''
    }
}