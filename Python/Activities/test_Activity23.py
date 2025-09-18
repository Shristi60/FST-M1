import pytest

#@pytest.mark.activity
def test_sumActivity():
    sum=0
    for num in num_list():
        sum += num
    assert sum == 55

