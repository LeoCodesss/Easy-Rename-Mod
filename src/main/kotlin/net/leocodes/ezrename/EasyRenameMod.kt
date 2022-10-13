package net.leocodes.ezrename

import com.mojang.brigadier.CommandDispatcher
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback
import net.leocodes.ezrename.command.RenameCommand
import net.minecraft.server.command.ServerCommandSource

@Suppress("unused")

object EasyRenameMod: ModInitializer {
    const val MOD_ID = "ezrename"

    override fun onInitialize() {
        CommandRegistrationCallback.EVENT.register(CommandRegistrationCallback { dispatcher: CommandDispatcher<ServerCommandSource?>, _: Boolean ->
            RenameCommand.register(dispatcher)
        })
    }
}


