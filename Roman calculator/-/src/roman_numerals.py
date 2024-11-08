def roman_to_int(s: str) -> int:
    roman_dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    total = 0
    prev_value = 0
    
    for char in reversed(s):
        value = roman_dict[char]
        if value < prev_value:
            total -= value
        else:
            total += value
        prev_value = value
    
    return total

def int_to_roman(num: int) -> str:
    val = [
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4,
        1
    ]
    syms = [
        "M", "CM", "D", "CD",
        "C", "XC", "L", "XL",
        "X", "IX", "V", "IV",
        "I"
    ]
    roman = ''
    for i in range(len(val)):
        while num >= val[i]:
            roman += syms[i]
            num -= val[i]
    return roman