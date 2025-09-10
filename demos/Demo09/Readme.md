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

## Demo 2 : Reusable method to convert number and handle exceptions

```sh
cd bin
java demo09.Main2 1200 + 10.00
# Expected result 1210.00

java demo09.Main2 12,000 + 500
# Expects results 12500

java demo09.Main2 500 + two
# Expected an error with "Try again" message
```

## Demo 3 : Reusable method to convert number, but it delays / postpone exception handling to main method using `throws` clause.

```sh
cd bin
java demo09.Main3 1200 + 10.00
# Expected result 1210.00

java demo09.Main3 12,000 + 500
# Expected result 12500

java demo09.Main 500 + Thousand
# Expected and error, no result
```

