package de.julianweinelt.plugins;

import de.julianweinelt.plugins.storage.LocalStorage;
import de.julianweinelt.plugins.storage.SQLManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class PluginTemplate extends JavaPlugin {
    @Getter
    private static PluginTemplate instance;
    @Getter
    private static Logger log;

    @Getter
    private SQLManager sqlManager;
    @Getter
    private LocalStorage localStorage;

    @Override
    public void onLoad() {
        instance = this;
        log = getLogger();
    }

    @Override
    public void onEnable() {
        localStorage = new LocalStorage(this);
        localStorage.load();
        sqlManager = new SQLManager(log, localStorage.getConfig());
    }

    @Override
    public void onDisable() {
        if (sqlManager != null) sqlManager.disconnect();
    }
}
