##### Challenge:
Can you determine if a user is eligible for a discount based on their membership status and purchase amount? This challenge will help you practice using IF-ELSE statements to make decisions based on multiple conditions.

###### Explanation:
In this challenge, you'll use an IF-ELSE statement to check if a user qualifies for a discount based on whether they are a member and the amount they spent. You can set the criteria for discounts based on your specific conditions.

### Tasks:

* <a href="./src/loyaltyReward.java">Loyalty Reward</a>

Task: Write a program to check if a user qualifies for a loyalty reward based on their membership status and total purchases over the year.

Input: membership_status (a boolean) and total_purchases (a decimal number representing total purchases for the year). Members who have spent over $500 in a year receive a loyalty reward.

Output: "Eligible for loyalty reward" or "Not eligible for loyalty reward"

Example:

Input: membership_status = true, total_purchases = 600

Output: "Eligible for loyalty reward"

Input: membership_status = true, total_purchases = 450

Output: "Not eligible for loyalty reward"

* <a href="./src/freeShipping.java">Free Shipping</a>

Task: Write a program to determine if a user is eligible for free shipping based on their membership status and purchase amount.

Input: membership_status (a boolean) and purchase_amount (a decimal number). Users receive free shipping if they are members and spend more than $75.

Output: "Eligible for free shipping" or "Not eligible for free shipping"

Example:

Input: membership_status = true, purchase_amount = 80

Output: "Eligible for free shipping"

Input: membership_status = false, purchase_amount = 80

Output: "Not eligible for free shipping"

* <a href="./src/bonusPoints.java">Bonus Points</a>

Task: Write a program to determine if a user earns bonus points based on their membership status and purchase amount. Members earn bonus points if they spend over $100, while non-members only earn points if they spend over $200.

Input: membership_status (a boolean) and purchase_amount (a decimal number)

Output: "Earns bonus points" or "Does not earn bonus points"

Example:

Input: membership_status = true, purchase_amount = 150

Output: "Earns bonus points"

Input: membership_status = false, purchase_amount = 150

Output: "Does not earn bonus points"