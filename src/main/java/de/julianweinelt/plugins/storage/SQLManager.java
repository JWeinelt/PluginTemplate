package de.julianweinelt.plugins.storage;

import de.codeblocksmc.codelib.databsae.MySQLTemplate;

import java.util.logging.Logger;

public class SQLManager extends MySQLTemplate {

    public SQLManager(Logger log, Configuration c) {
        super(log, c.getDatabaseHost(), c.getDatabasePort(), c.getDatabaseName(),
                c.getDatabaseUser(), c.getDatabasePassword());
    }

    @Override
    public void afterSuccessfulConnection() {
        // Do something here
    }
}
