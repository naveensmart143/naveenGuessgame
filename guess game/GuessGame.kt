
import java.util.* 
// strting point of the kotlin programm
fun main(args: Array<String>){
	println("1.Start The Game")
	println("2.To Quit the Game")
	guessGame() //calling the function guessGame
}
fun guessGame(){
	val choiceMaker = Game()//storing the class values
		choiceMaker.choice()	
}

class Game{
	fun choice(){
		
		var option:Int=readLine()!!.toInt();
		do{
			
			if(option==1){
				starter();
			}
			else{
				println("thank you")
			} 
			
		}
			while(option!=2)
	}
	
	fun randomNumber():Int{
		val numbers = arrayOf(1,2,3,4,5,6,7,8,9)
		return numbers[Random().nextInt(numbers.size)]
	}
	fun starter(){
		var number:Int =randomNumber()
		println("lets guess the number")
		var guess : Int =readLine()!!.toInt();
			if(number==guess){
			println("you won!!")
			
		}
		else{
			println("ohh!! you Lost")
		}
	}
	
	
}
