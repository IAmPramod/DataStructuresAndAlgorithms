=begin
***********Approach**************
*Sort the prices
*Buy flowers alternatively.
=end

def calculate_price(x,c)
    return (x+1)*c
end

flower, people = gets.chomp.split(" ").map(&:to_i)
prices = gets.chomp.split(" ").map(&:to_i)
min_cost = 0
arr = Array.new(people,0)
if flower==people
    puts prices.inject(:+)
else
    prices.sort!.reverse!
    (0...prices.length).each do |price|
        arr[price%people]= price/people
        min_cost+=calculate_price(arr[price%people],prices[price])
    end
    puts min_cost
end
