const urlBase  = 'https://api.polygon.io/v1/open-close/';
//${input}/${date}?unadjusted=true&apiKey=YFwSCfZwscyZ_6w4E5BUYLS0jokB595H


function response() {
    let input = document.getElementById('input').value.toUpperCase();
    let date = document.getElementById('date').value;

fetch(`${urlBase}${input}/${date}?unadjusted=true&apiKey=YFwSCfZwscyZ_6w4E5BUYLS0jokB595H`).then(res => {
    if(res.status == 200){
        return res.json()    
        }
    else {
        alert("Symbol/Date invalid")
        }
    })
.then((out) => {
    let close = out.close;
    let from = out.from;
    let high = out.high;
    let low = out.low;
    let open = out.open;
    let symbol = out.symbol;
    let resultSymbol = document.getElementById("resultSymbol")
    let resultFrom = document.getElementById("resultFrom")
    let resultOpen = document.getElementById("resultOpen")
    let resultClose = document.getElementById("resultClose")
    let resultHigh = document.getElementById("resultHigh")
    let resultLow = document.getElementById("resultLow")
    resultSymbol.innerHTML = `<hr><h2>Symbol: ${symbol}</h2><hr>`;
    resultFrom.innerHTML = `<h2>From: ${from}</h2><hr>`;
    resultOpen.innerHTML = `<h2>Open: ${open}</h2><hr>`;
    resultClose.innerHTML = `<h2>Close: ${close}</h2><hr>`;
    resultHigh.innerHTML = `<h2>High: ${high}</h2><hr>`;
    resultLow.innerHTML = `<h2>Low: ${low}</h2><hr>`;
}).catch(err => console.error(err));

}

const urlBase1 = 'https://api.polygon.io/v1/open-close/crypto/'

//BTC/USD/2020-10-14?unadjusted=true&apiKey=YFwSCfZwscyZ_6w4E5BUYLS0jokB595H

function response1() {
    let crypto = document.getElementById('crypto').value;
    let currencies = document.getElementById('currencies').value;
    let date1 = document.getElementById('date1').value;

fetch(`${urlBase1}${crypto}/${currencies}/${date1}?unadjusted=true&apiKey=YFwSCfZwscyZ_6w4E5BUYLS0jokB595H`).then(res => {
    //if(res.status == 200){
        return res.json()    
        //
    //else {
        // alert("Data unavailable")
        // }
    })
.then((out) => {
    let close = out.close;
    let day = out.day;
    let open = out.open;
    let symbol = out.symbol;
    let resultSymbol1 = document.getElementById("resultSymbol1")
    let resultDay1 = document.getElementById("resultDay1")
    let resultOpen1 = document.getElementById("resultOpen1")
    let resultClose1 = document.getElementById("resultClose1")
    if(out.open === 0 && out.close === 0){
        alert("Data unavailable for currency or future date selected")
    }

    else {
    resultSymbol1.innerHTML = `<hr><h2>Symbol: ${symbol}</h2><hr>`;
    resultDay1.innerHTML = `<h2>From: ${day}</h2><hr>`;
    resultOpen1.innerHTML = `<h2>Open: ${open}</h2><hr>`;
    resultClose1.innerHTML = `<h2>Close: ${close}</h2><hr>`;

    }
    
}).catch(err => console.error(err));

}