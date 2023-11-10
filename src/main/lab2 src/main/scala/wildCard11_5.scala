object FSMExample {

  // Define states as an enumeration inside the companion object
  object State extends Enumeration {
    type State = Value
    val Idle, Active, Processing, Done = Value
  }

  import State._

  // Define the FSM class
  class FiniteStateMachine() {
    private var currentState: State = Idle

    // Static functionality in the companion object
    object FiniteStateMachine {
      def transition(currentState: State, event: String): State = {
        // Define transitions based on events
        (currentState, event) match {
          case (Idle, "start") => Active
          case (Active, "process") => Processing
          case (Processing, "complete") => Done
          case _ => currentState // No transition for other cases
        }
      }
    }

    // Method to trigger state transition
    def triggerEvent(event: String): Unit = {
      currentState = FiniteStateMachine.transition(currentState, event)
      println(s"Event: $event, New State: $currentState")
    }
  }

  def main(args: Array[String]): Unit = {
    val fsm = new FiniteStateMachine()

    fsm.triggerEvent("start")
    fsm.triggerEvent("process")
    fsm.triggerEvent("complete")
    fsm.triggerEvent("invalid") // No transition for this event
  }
}
