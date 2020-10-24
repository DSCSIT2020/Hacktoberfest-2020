money = 20
items = {'orange': 2, 'apple': 3, 'mango': 2, 'tomato': 4}

total_price = 0
for item in items:
    print('='*20)
    print('Price for ' + item + ' is $' + str(items[item]))

    input_item = input('do you want to buy ' + item + ' ? (y/n)')
    input_item.lower()
    if input_item == 'y':
        input_count = input('How much ? (number only)')
    else:
        input_count = 0

    count = items[item] * int(input_count)
    total_price = total_price + count
    money = money - count
    print('total price is $' + str(total_price) +
          ' rest of your money is $' + str(money))
