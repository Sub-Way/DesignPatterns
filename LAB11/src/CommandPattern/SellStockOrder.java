/* 2013112015 ������ */

package CommandPattern;

class SellStockOrder implements Order { 
    private StockTrade stock;
    public SellStockOrder ( StockTrade st) {
        stock = st;
    }
    public void execute( ) {
        stock . sell( );
    }
}