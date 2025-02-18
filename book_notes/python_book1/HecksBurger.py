def function(amount: int) -> int:
    L = [500, 100, 50, 20, 10, 5, 2, 1]

    denomination = []
    i = 0
    while (i < len(L)):
        num = int(amount/L[i])
        amount = amount - num*L[i]
        denomination.append(num)
        i+=1

    return denomination


print(function(77))
print(function(10))
print(function(657))