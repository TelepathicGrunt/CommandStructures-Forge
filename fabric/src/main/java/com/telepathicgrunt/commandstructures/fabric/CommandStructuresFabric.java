package com.telepathicgrunt.commandstructures.fabric;

import com.telepathicgrunt.commandstructures.commands.FillStructureVoidCommand;
import com.telepathicgrunt.commandstructures.commands.SpawnMobsCommand;
import com.telepathicgrunt.commandstructures.commands.SpawnPiecesCommand;
import com.telepathicgrunt.commandstructures.commands.StructureSpawnCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class CommandStructuresFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, buildContext, dedicated) -> StructureSpawnCommand.createCommand(dispatcher, buildContext));
        CommandRegistrationCallback.EVENT.register((dispatcher, buildContext, dedicated) -> SpawnPiecesCommand.createCommand(dispatcher, buildContext));
        CommandRegistrationCallback.EVENT.register((dispatcher, buildContext, dedicated) -> SpawnMobsCommand.createCommand(dispatcher, buildContext));
        CommandRegistrationCallback.EVENT.register((dispatcher, buildContext, dedicated) -> FillStructureVoidCommand.createCommand(dispatcher, buildContext));
    }
}
