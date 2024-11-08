#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

int main() {
    // 1. Ask the user for input
    std::string input;
    std::cout << "Enter a string: ";
    std::getline(std::cin, input);
    
    // Convert input to uppercase
    std::transform(input.begin(), input.end(), input.begin(), ::toupper);
    
    // 2. Create a vector to hold the count of each ASCII character (128 slots)
    std::vector<int> char_count(128, 0);

    // 2. Iterate over each character and count occurrences
    for (char ch : input) {
        if (ch >= 0 && ch < 128) {
            char_count[ch]++;
        }
    }

    // 3. Find the character with the highest count
    int max_count = 0;
    char most_common_char = '\0';
    for (int i = 0; i < 128; ++i) {
        if (char_count[i] > max_count) {
            max_count = char_count[i];
            most_common_char = i;
        }
    }

    // 4. Print the most common character and its count
    if (max_count > 0) {
        std::cout << "'" << most_common_char << "' occurs " << max_count << " times.\n";
    } else {
        std::cout << "No characters found.\n";
    }

    return 0;
}