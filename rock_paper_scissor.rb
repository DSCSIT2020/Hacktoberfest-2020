
#game rule
puts("Game rule:\n\tRock vs Paper => Paper Win \n\tPaper vs Scissor => Scissor Win \n\tRock vs Scissor => Rock Win")

#For play again
while true  
    puts("\nChoices are: \n\t1.Rock \n\t2.paper \n\t3.Scissor")

    choice_names = ["Rock","Paper","Scissor"]

    #This will decide how a material wins agains other
    win = {'Rock':'Scissor','Scissor':'Paper','Paper':'Rock'}

    #Computer choice    
    puts("\nComputer's turn")
    puts("----------------------")
    puts("Computer has done secretly. Obviously You're not able to see it now")
    computer_choice = rand(1...3)
    

    # puts user choice
    puts("\nYour turn")
    puts("--------------")
    puts("Enter your choice: ")
    user_choice = gets().to_i
    while user_choice > 3 or user_choice < 1
        puts ("enter valid input:" )
        user_choice = gets().to_i
    end
    
    computer_material = choice_names[computer_choice-1]
    user_material = choice_names[user_choice-1]

    puts("\n" + computer_material + " vs " + user_material )

    if computer_material == user_material
        puts("\nDraw")
    elsif win[user_material] == computer_material
        puts(user_material + " wins. You Win")
    else
        puts(computer_material + " wins. Computer win")

        puts("\nDo you want to continue (Y/N)")
        answer = gets().chomp.to_s

        if answer.downcase.eql? "n"
            break
        end
    end
end

puts("Thanks for playing")