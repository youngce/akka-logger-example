import akka.actor.{Actor, ActorLogging, Props}

case class Debug(msg:String="DEBUG")
case class Info(msg:String="INFO")
case class Warn(msg: String="WARN")
case class Error(msg:String="ERROR")
object LevelActor{
	def props=Props(classOf[LevelActor])
}
class LevelActor extends Actor with ActorLogging{
	override def receive: Receive = {
		case Debug(msg)=>
			log.debug(msg)
		case Info(msg)=>
			log.info(msg)
		case Warn(msg)=>
			log.warning(msg)
		case Error(msg)=>
			log.error(msg)
	}
}
