import decimal    

def number2word(num):
    num = decimal.Decimal(num)
    decimal_part = num - int(num)
    num = int(num)

    if decimal_part:
        return number2word(num) + " point " + (" ".join(number2word(i) for i in str(decimal_part)[2:]))

    under_20 = ['Zero', 'One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine', 'Ten', 'Eleven', 'Twelve', 'Thirteen', 'Fourteen', 'Fifteen', 'Sixteen', 'Seventeen', 'Eighteen', 'Nineteen']
    tens = ['Twenty', 'Thirty', 'Forty', 'Fifty', 'Sixty', 'Seventy', 'Eighty', 'Ninety']
    above_100 = {100: 'Hundred', 1000: 'Thousand', 100000: 'Lakhs', 10000000: 'Crores'}

    if num < 20:
        return under_20[num]

    if num < 100:
        return tens[num // 10 - 2] + ('' if num % 10 == 0 else ' ' + under_20[num % 10])

    pivot = max([key for key in above_100.keys() if key <= num])

    return number2word(num // pivot) + ' ' + above_100[pivot] + ('' if num % pivot==0 else ' ' + number2word(num % pivot))

def MainFunc(data):
    
    pointvalue = number2word(decimal.Decimal(data))
    if "point" in pointvalue:
        index_num1 = pointvalue.index('point')
        index_num2 = data.index('.')
        afterpoint = number2word(decimal.Decimal(data[index_num2+1:]))
        var = pointvalue.replace(pointvalue[index_num1:],' Rupees'+" "+afterpoint+' paisa')
        print(var)
    else:
        print(pointvalue + " Rupees")

input_value = input("Enter Amount in Number : ")
MainFunc(input_value)

