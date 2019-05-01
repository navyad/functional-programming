defmodule HelloWorld do 

  def add_all(a, b, c) do
    IO.inspect binding()
    if is_integer(a) do
      a + b + c 
    else  
      a  
    end  
  end

  def colors(colors) do
    colors |> IO.inspect(lable: "show all colors") 
    colors |> IO.inspect(lable: "show 2 colors", limit: 2)
  end  
end
  

val = HelloWorld.add_all(4, 5, 6)
IO.puts val 
HelloWorld.colors(["red", "blue", "green", "black", "white"])
