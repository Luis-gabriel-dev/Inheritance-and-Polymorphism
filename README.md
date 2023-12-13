# Resolution of exercise 10 of the 2023 complete Java course on Inheritance and Polymorphism

## Exercise statement

Create a program to read the data of N taxpayers (N provided by the user), which can be individuals or legal entities, and then show the amount of tax paid by each one, as well as the total tax collected.

Individual data is: name, annual income and health expenses. Legal entity data is name, annual income and number of employees. The rules for calculating tax are as follows:

Individual: people whose income was below 20000.00 pay 15% tax. People with income from 20000.00 onwards pay 25% tax. If the person had health expenses, 50% of these expenses are deducted from the tax.
Example: a person whose income was 50000.00 and had 2000.00 in health expenses, the tax is: (50000 * 25%) - (2000 * 50%) = 11500.00

Legal entity: legal entities pay 16% tax. However, if the company has more than 10 employees, it pays 14% tax.
Example: a company whose income was 400000.00 and has 25 employees, the tax is: 400000 * 14% = 56000.00

### Example

```
Enter the number of tax payers: 3
Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00
Tax payer #2 data:
Individual or company (i/c)? c
Name: SoftTech
Anual income: 400000.00
Number of employees: 25
Tax payer #3 data:
Individual or company (i/c)? i
Name: Bob
Anual income: 120000.00
Health expenditures: 1000.00

TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 29500.00

TOTAL TAXES: $ 97000.00
```

### Diagram used

![myImage](https://github.com/Luis-gabriel-dev/ex10/blob/main/Diagrama%20UML.PNG)
