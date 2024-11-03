package winlyps.limitedCrafting

import org.bukkit.plugin.java.JavaPlugin

class LimitedCrafting : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doLimitedCrafting", "true")
        }
        logger.info("LimitedCrafting plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doLimitedCrafting", "false")
            logger.info("LimitedCrafting plugin has been disabled.")
        }
    }
}