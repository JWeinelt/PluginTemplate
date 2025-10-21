package de.julianweinelt.plugins.storage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Configuration {
    /*
    Add any configuration value you want to this class by declaring variables.
    Please note that you should only store serializable values.
    These are (but not limited to:)
    - String
    - primitives
    - Wrapper classes

    You should avoid using these types (there may be more):
    - Color
    - World
    - Location
    - Thread
    - BufferedReader / BufferedWriter
    ...

    ProTip: If you declare a variable as transient, GSON won't try to serialize it!
     */

    // You don't need to declare any get/set methods.
    // It's recommended to initialize them with placeholder values, otherwise they won't be saved as fields
    // if no value is assigned.

    // Here's an example for the database:
    private String databaseHost = "";
    private int databasePort = 3306;
    private String databaseName = "";
    private String databaseUser = "";
    private String databasePassword = "";
}
