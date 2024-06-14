package com.telepathicgrunt.commandstructures.neoforge;

import com.telepathicgrunt.commandstructures.CommandStructuresMain;
import com.telepathicgrunt.commandstructures.commands.FillStructureVoidCommand;
import com.telepathicgrunt.commandstructures.commands.SpawnMobsCommand;
import com.telepathicgrunt.commandstructures.commands.SpawnPiecesCommand;
import com.telepathicgrunt.commandstructures.commands.StructureSpawnCommand;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CommandStructuresMain.MODID)
public class CommandStructuresNeoForge {

    public CommandStructuresNeoForge() {
        IEventBus forgeBus = NeoForge.EVENT_BUS;
        forgeBus.addListener(this::registerCommand);

        CommandStructuresMain.CommandStructuresInit();
    }

    private void registerCommand(RegisterCommandsEvent event) {
        StructureSpawnCommand.createCommand(event.getDispatcher(), event.getBuildContext());
        SpawnPiecesCommand.createCommand(event.getDispatcher(), event.getBuildContext());
        SpawnMobsCommand.createCommand(event.getDispatcher(), event.getBuildContext());
        FillStructureVoidCommand.createCommand(event.getDispatcher(), event.getBuildContext());
    }
}
