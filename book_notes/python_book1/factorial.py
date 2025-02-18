def fac(n):
    if n==1:
        return 1
    else:
        return fac(n-1)*n


def fac1(n):
    fac_num: list[int] = []
    if n==1:
        fac_num.append(1)
    else:
        fac_num.append(1)
        for i in range(1, n):
            fac_num.append(fac_num[i-1]*(i+1))
    return fac_num[-1]

print(fac(966))
print(fac(40))