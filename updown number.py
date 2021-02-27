stay = "Y"
while(stay in ("Y" , "y")):
    number = input("Please enter a number: ")

    changeinstat
    e = 0
    currentstate = None
    previousstate = None


    updownallowflag = True;

    for element in range(1, len(number)):
        previousnumber = int(number[element-1])
        currentnumber = int(number[element])
        if(previousnumber > currentnumber):
            currentstate = "down"
        elif(previousnumber < currentnumber):
            currentstate = "up"
        else:
            currentstate = "same"
        if(previousstate == "up" and currentstate == "down" and updownallowflag == True):
            updownallowflag = False
            previousstate = currentstate
        elif(currentstate != "same"):
            if (currentstate != previousstate):
                changeinstate =changeinstate + 1


        if(changeinstate > 1):
            break;
    if(changeinstate > 1):
        print("The number is not valid")
    else:
        print("The number is valid")

    stay = input("Do you want to try for another number Y/N ?")
            
