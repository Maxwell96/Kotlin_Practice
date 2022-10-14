abstract class Environment(vararg ags : Actor){
    val agents : List<Actor> = ags.toList()

    fun step() {
        for (agent in agents) {
            sense(agent)
            processAction(agent, agent.act())
        }
    }

    abstract fun processAction(agent : Actor, act : Action)

    abstract fun sense(agent : Actor)
}