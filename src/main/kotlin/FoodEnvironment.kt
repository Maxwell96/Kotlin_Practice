//class FoodEnvironment(vararg ags : Actor) : Environment(*ags){
//
//    val scores: MutableMap<Actor, Int> = mutableMapOf()
//    init{
////        for (agent in agents){
////
////        }
//        agents.forEach{ //Another way of for loop
//            scores[it] = 0
//        }
//    }
//
//    override fun processAction(agent: Actor, act: Action) {
//        TODO("Not yet implemented")
//    }
//
//    override fun sense(agent: Actor) {
//        TODO("Not yet implemented")
//    }
//
//}
class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores : MutableMap<Actor, Int> = mutableMapOf()
    init {
        for (ag in ags)
            scores.put(ag, 0)
    }

    override fun processAction(agent: Actor, act: Action) {
        when(act) {
            is ForageAction -> scores.put(agent, scores.getOrDefault(agent,0)+1)
            is NoAction -> {}
            else -> println("Unrecognised action")
        }
    }

    override fun sense(agent: Actor) {

    }

}