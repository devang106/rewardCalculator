# Reward Calculator

## A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent between $50 and $100 in each transaction.
 

### Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

* Solve using Spring Boot
* Create a RESTful endpoint
* Make up a data set to best demonstrate your solution
* Check solution into GitHub



`if(amount > 100) {
                rewards.put(transaction.getCustomerId(), rewards.getOrDefault(transaction.getCustomerId(), 0) + 50 + (2 * (amount - 100)));
            }else if(amount > 50) {
                rewards.put(transaction.getCustomerId(), rewards.getOrDefault(transaction.getCustomerId(), 0) + (amount - 50));
            }`
            
Let take the case1 amount= 250, case2 amount= 80.
points=50+2*(250-100)= 350
which is the expected output

case2
points=(amount-50)=80-50=30
which is the expected output, it works in both the cases
