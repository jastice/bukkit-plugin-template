package org.gestern;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * Singleton for global configuration information. 
 * Values are initialized when the plugin is enabled.
 * 
 * @author jast
 *
 */
public enum Configuration {

    /** Central configuration instance. */
    CONF;

    @SuppressWarnings("unused")
    private final Logger log = MyPlugin.P.getLogger();

    public boolean variable = false;

    /**
     * Set configuration from values in a file configuration.
     * @param savedConf
     */
    public void readConfig(FileConfiguration savedConfig) {

        this.variable = savedConfig.getBoolean("variable",false);
    }


}
