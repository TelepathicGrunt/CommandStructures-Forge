package com.telepathicgrunt.commandstructures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommandStructuresMain {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "command_structures";

    public static void CommandStructuresInit() {
        // Silences logspam due to some mc implementations with spawning structures rawly like Mineshafts
        Logger rootLogger = LogManager.getRootLogger();
        if (rootLogger instanceof org.apache.logging.log4j.core.Logger) {
            ((org.apache.logging.log4j.core.Logger) rootLogger).addFilter(new LogSpamFiltering());
        }
        else {
            LOGGER.error("Registration failed with unexpected class: {}", rootLogger.getClass());
        }
    }
}
