// StockMarket API

function StockMarket(exchange) {
    this.exchange = exchange
}

StockMarket.prototype = {
    getStockQuote(stock) {
        return {
            symbol: stock,
            price: Math.round(Math.random() * 100000) / 100,
            timestamp: new Date(),
            exchange: this.exchange
        };
    }
}

function test() {
    let sm = new StockMarket("NYSE");
    console.log(sm.getStockQuote("APPLE"));
}

// test()
// outputs {symbol: 'APPLE', price: 211.19, timestamp: Sun Jan... Time), exchange: 'NYSE'}
const stocks = ["IBM", "APPLE", "GOOGLE", "AMAZON"]

function initPortfolio(portfolio, stocks){
    for (let stock of stocks) {
        portfolio[stock] = {}
    }
}

function getQuotes(portfolio,exchage){
    for(let symbol in portfolio){
        portfolio[symbol] = exchange.getStockQuote(Symbol)
    }
}

let portfolio = {}
initPortfolio(portfolio, all_stocks)
getQuotes(portfolio, new StockMarket("NYSE"))
console.log(JSON.stringify)



