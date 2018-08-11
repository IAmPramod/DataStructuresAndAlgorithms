#https://www.hackerrank.com/challenges/new-year-chaos

test_cases = gets.strip.to_i
test_cases.times{
  n = gets.strip.to_i
  q = gets.chomp.split(' ').map(&:to_i)
  flag,sorted = 0,false
  count = 0
  (0...q.length).each do |x|
    flag = 1 if (q[x]-x-1) > 2
  end
  if flag==1
    puts "Too chaotic"
  else
    #Using Bubble Sort logic to calculate number of swaps
    while sorted==false do
      sorted = true
      (0...q.length-1).each do |x|
        if q[x+1]<q[x]
            q[x+1],q[x] = q[x],q[x+1]
            sorted=false
            count+=1
        end
      end
    end
    puts count
  end
}
