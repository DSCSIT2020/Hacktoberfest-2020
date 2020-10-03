import scala.util.Random
import scala.io.StdIn.readLine

object RockPaperScissor {
  def main(args: Array[String]): Unit = {
    val winner = playRound()
    println(s"Winner is $winner")
  }

  private def playRound(round: Int = 1): String = {
    println(s"Round $round starts")
    println(s"Choose between: ${Move.allMoves.mkString(" / ")}")

    val computerChoice = Move.parse(Random.nextInt(3))
    val playerChoice = retrievePlayerChoice()

    println(s"Player chose $playerChoice")
    println(s"Computer chose $computerChoice")

    checkWinner(computerChoice, playerChoice) match {
      case Some(winner) => winner
      case None =>
        println(s"No winner this round, goind to round ${round + 1}")
        playRound(round + 1)
    }
  }

  private def retrievePlayerChoice(): Move = {
    val input = readLine()
    Move.parse(input) match {
      case Some(move) => move
      case None =>
        println(s"Invalid input $input")
        println(s"Choose between: ${Move.allMoves.mkString(" / ")}")
        retrievePlayerChoice()
    }
  }

  private def checkWinner(computerMove: Move, playerMove: Move): Option[String] = {
    if (computerMove.weakness == playerMove) {
      return Some("Player")
    }
    if (playerMove.weakness == computerMove) {
      return Some("Computer")
    }
    return None
  }

  sealed trait Move {
    def name: String
    def value: Int
    def weakness: Move

    override def toString: String = name.capitalize
  }

  case object RockMove extends Move {
    override val name: String = "rock"
    override val value: Int = 0
    override val weakness: Move = PaperMove
  }

  case object PaperMove extends Move {
    override val name: String = "paper"
    override val value: Int = 1
    override val weakness: Move = ScissorMove
  }

  case object ScissorMove extends Move {
    override val name: String = "scissor"
    override val value: Int = 2
    override val weakness: Move = RockMove
  }

  object Move {
    val allMoves = Seq(RockMove, PaperMove, ScissorMove)

    def parse(i: Int): Move = i match {
      case RockMove.value => RockMove
      case PaperMove.value => PaperMove
      case ScissorMove.value => ScissorMove
    }

    def parse(s: String): Option[Move] = s.toLowerCase match {
      case RockMove.name => Some(RockMove)
      case PaperMove.name => Some(PaperMove)
      case ScissorMove.name => Some(ScissorMove)
      case _ => None
    }
  }
}