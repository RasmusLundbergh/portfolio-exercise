package market;

/**
 * Represents a stock ticker symbol.
 *  @author OSNB
 *  @version 1.0
 */
public enum Symbol {
    AAPL,
    GOOG,
    TSLA,
    MSFT;
    //TODO: Tilføj aktie ticker symboler (fx AAPL, GOOG osv)
    ;
    public static boolean isValidSymbol(String symbol) {
        // Loop through the enum values to check if the symbol matches any of them
        for (Symbol s : Symbol.values()){
            if (s.toString().equals(symbol)){
                return true;
            }
        }
        return false;
    }
}

