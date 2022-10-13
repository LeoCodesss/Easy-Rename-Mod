package net.leocodes.ezrename

import com.mojang.brigadier.CommandDispatcher
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
import net.leocodes.ezrename.command.RenameCommand
import net.minecraft.command.CommandRegistryAccess
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource

@Suppress("unused")

object EasyRenameMod: ModInitializer {
    const val MOD_ID = "ezrename"

    override fun onInitialize() {
        CommandRegistrationCallback.EVENT.register( CommandRegistrationCallback { commandDispatcher: CommandDispatcher<ServerCommandSource>, _: CommandRegistryAccess, _: CommandManager.RegistrationEnvironment ->
            RenameCommand.register(commandDispatcher)
        })
    }
}


