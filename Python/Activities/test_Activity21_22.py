import pytest

#Sum of two numbers
def test_sum():
    num1=25
    num2=40
    sum= num1+num2
    assert sum==65

#difference of 2 num
@pytest.mark.xfail
def test_difference():
    num1=65
    num2=40
    diff= num1-num2
    assert diff==0

@pytest.mark.activity
@pytest.mark.xfail
#product of 2 num
def test_product():
    num1=12
    num2=40
    product= num1*num2
    assert product==0

@pytest.mark.activity
@pytest.mark.xfail
#quotient of 2 num
def test_quotient():
    num1=60
    num2=3
    quotient=num1/num2
    assert quotient==20