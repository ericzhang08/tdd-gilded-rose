# TDD @Gilded Rose


## 开发环境
 - JDK1.8+
 
## 业务需求

"镶金玫瑰"！这是一家魔兽世界里的小商店。出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。

首先，简单介绍一下我们的系统：

- 所有商品都有一个`SellIn`值，这是商品距离过期的天数，最好在这么多天之内卖掉
- 所有商品都有一个`Quality`值，代表商品的价值
- 商品的`SellIn`值和`Quality`值，它们每天会发生变化，但是会有特例


商品的价格规则说明如下：

- 商品的价值永远不会小于0，也永远不会超过50
- 一旦过了保质期，`Quality`就以双倍的速度下滑
- 陈年干酪（`Aged Brie`）是一种特殊的商品，放得越久，价值反而越高
- 萨弗拉斯（`Sulfuras`）是一种传奇商品，没有保质期的概念，价值也不会下滑
- 后台门票（`Backstage pass`）和陈年干酪（`Aged Brie`）有相似之处：
	- 越接近演出日，商品的价值反而上升
	- 在演出前10天，价值每天上升2点
	- 演出前5天，价值每天上升3点
	- 一旦过了演出日，价值就马上变成0

tasking
普通商品：
given 普通商品距离过期的天数为5天，价值为10
when 经过一天
then 商品离过期的天数为4， 价值为9      --》每天价值减1

given 普通商品距离过期的天数为1天，价值为10
when 经过一天
then 商品离过期的天数为0， 价值为9     

given 普通商品距离过期的天数为0天，价值为10
when 经过一天
then 商品距离过期的天数为-1， 价值为8     

given 普通商品距离过期的天数为-1天，价值为10
when 经过一天
then 商品距离过期的天数为-2， 价值为8

given 普通商品举例过期的天数为3天，价值为0
when 经过一天
then 商品距离过期的天数为2， 价值为0

陈年干酪

given 陈年干酪距离过期的天数为5天，价值为10
when 经过一天
then 商品离过期的天数为4， 价值为11

given 陈年干酪距离过期的天数为1天，价值为0
when 经过一天
then 商品离过期的天数为0， 价值为1

given 陈年干酪距离过期的天数为0，价值为0
when 经过一天
then 商品离过期的天数为-1， 价值为2

given 陈年干酪距离过期的天数为-2，价值为2
when 经过一天
then 商品离过期的天数为-3， 价值为4

given 陈年干酪距离过期的天数为1，价值为49
when 经过一天
then 商品离过期的天数为0， 价值为50

given 陈年干酪距离过期的天数为0，价值为49
when 经过一天
then 商品离过期的天数为-1， 价值为50

萨弗拉斯

given萨弗拉斯距离过期的天数为2，价值为50
when 经过一天
then 商品离过期的天数为1， 价值为50

given萨弗拉斯距离过期的天数为1，价值为49
when 经过一天
then 商品离过期的天数为0， 价值为49

given萨弗拉斯距离过期的天数为0，价值为49
when 经过一天
then 商品离过期的天数为-1， 价值为49

given 萨弗拉斯距离过期的天数为-1，价值为0
when 经过一天
then 商品离过期的天数为-2， 价值为0


后台门票

given后台门票距离过期的天数为11，价值为10
when 经过一天
then 商品离过期的天数为10， 价值为11

given后台门票距离过期的天数为10，价值为10
when 经过一天
then 商品离过期的天数为9， 价值为12

given后台门票距离过期的天数为5，价值为10
when 经过一天
then 商品离过期的天数为4， 价值为13

given后台门票距离过期的天数为0，价值为 10
when 经过一天
then 商品离过期的天数为-1， 价值为0

given后台门票距离过期的天数为5，价值为 49
when 经过一天
then 商品离过期的天数为4， 价值为 50

given后台门票距离过期的天数为-1，价值为 0
when 经过一天
then 商品离过期的天数为-2， 价值为 0











1. given an on date normal product when one day passed then quality decrease 1 point per day
2. given an out of date normal product when one day passed then quality decrease 2 point per day
3. given an on date normal product when multiple day passed  then quality decrease 1 point per day
4. given an out of date normal product when multiple day passed  then quality decrease 2 point per day
5. given an on date product become an out of date normal product when multiple day passed  then quality decrease
6. given an normal product quality bigger than 0 when one day passed  then quality is  0
7. given an normal product quality bigger than 50 when one day passed  then quality is 49

8. given aged brie product is on date when one day passed then quality increase one point per day
8. given aged brie product is on date when multiple day passed  then quality increase one point per day
9. given aged brie product is out of date when one day passed  then quality increase two point per day
9. given aged brie product is out of date when multiple day passed  then quality increase two point per day
10 given aged brie product quality is smaller than 50 and increase to 50 when one day passed  then biggest quality is 50 
11. given an on date aged brie product become an out of  product when multiple day passed  then quality increase 

12. given an on date49sulfuras product when one days passed then quality does not change
12. given an out of date sulfuras product when one days passed  then quality does not change
13. given an on date sulfuras product become an out of date sulfuras product when multiple day passed  then quality does not change

14. given an on date Backstage pass product sellin bigger than 10 days  when one days passed  then quality increase 1 per day 
15. given an on date Backstage pass product sellin between 5 -10  when one days passed  then quality increase 2
16. given an on date Backstage pass product sellin between 0-5 when one day passed then quality increase 3
17.given an on date Backstage pass product  out of date  when one day passed  then quality is 0 
18.given an Backstage pass product quality increase bigger than 50 when one day passed  then quality is 50

