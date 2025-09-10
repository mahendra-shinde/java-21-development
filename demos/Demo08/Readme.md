# Exception handling Demos

## Demo 1 : Basic Calculator

Open project in eclipse, Right click on project (Project panel on left side) then use option  "Show In Local Terminal"

```sh
cd bin
java demo09.Main 1200 + 10.00
# Expected result 1210.00

java demo09.Main 12,000 + 500
# Expects an Error as 12,000 is Invalid number and therefore uses Default ZERO
# Reason: Double.parseDouble is BASIC parsing method which cannot understand thousand seperator

java demo09.Main 500 + 11,500
# Expected Result : 12000
```