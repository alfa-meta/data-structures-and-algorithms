import sys
import os
sys.path.insert(0, os.path.dirname(__file__))

from libs.count_occurrences import count_occurrences

def test_no_input():
    outcome = count_occurrences("", "")

    assert outcome == 0

def test_no_second_input():
    assert count_occurrences("a", "") == 0

def test_apple():

    assert count_occurrences("apple", "apples") == 0


def test_pattern():
    assert count_occurrences("b", "ababababab") == 5