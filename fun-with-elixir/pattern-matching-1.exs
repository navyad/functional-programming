defmodule MATCH do

  def fail_0 do
    a = 10
    9 = a
  end
	
  def fail_1 do
      [a, b] = [1, 2, 3]
  end

  def fail_2 do
    [a, b, c] = [10, 20, 30]
    [1,2,3] = [a,b,c]
  end

  def fail_3 do
    list = [1,2,3]
    [a,3,c] = list
  end
    
  def fail_4 do
    # once value of left is bind, it will remain same 
    [x, x] = [1, 2]
  end

  def fail_5 do
    x, y = [10, 20]
    x, x = [10, 20]
end


MATCH.fail_0()
