import akka.actor.ActorSystem

object Main extends App{

	implicit val sys=ActorSystem("logging")
	val actorRef=sys.actorOf(LevelActor.props)
	actorRef ! Debug()
	actorRef ! Info()
	actorRef ! Warn()
	actorRef ! Error()

	sys.terminate()

}
