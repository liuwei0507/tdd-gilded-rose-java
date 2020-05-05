# Requirement

## purpose
manage the inventory information of the goods

## attribute
SellIn
Quality

## rule
1. 0 <= Quality <= 50
2. when pass it's sell-by date the Quality will decrease double
3. special goods
    Aged Brie:
    Sulfuras:
    Backstage pass:
    
# Stepping 
1. define data class of the goods
2. define enum class for the goods
3. handle common goods sellin & quality
    remain sellIn > 0
    remain sellIn < 0  
    
4. handle aged brie 
    quality > 50
    quality < 50
 
5. handle Sulfuras
   quality not change
   
6. handle Backstage pass
    remain sellIn > 10
    remain sellIn [5,10]
    remain sellIn <= 0

