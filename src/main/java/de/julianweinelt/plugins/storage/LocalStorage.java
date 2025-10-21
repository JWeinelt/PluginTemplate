package de.julianweinelt.plugins.storage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.util.logging.Logger;

public class LocalStorage {
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final File confFile;
    private final Logger log;
    @Getter
    private Configuration config = new Configuration();

    public LocalStorage(JavaPlugin plugin) {
        this.log = plugin.getLogger();
        this.confFile = new File(plugin.getDataFolder(), "config.json");
        if (!this.confFile.exists()) confFile.getParentFile().mkdirs();
    }

    public void load() {
        if (!this.confFile.exists()) {
            save();
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(confFile))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) content.append(line);
            config = new Gson().fromJson(content.toString(), Configuration.class);
        } catch (IOException e) {
            log.severe("Could not load config.json");
            log.severe(e.getMessage());
        }
    }

    public void save() {
        try (FileWriter w = new FileWriter(confFile)) {
            w.write(GSON.toJson(config));
        } catch (IOException e) {
            log.severe("Could not save config.json");
            log.severe(e.getMessage());
        }
    }
}
