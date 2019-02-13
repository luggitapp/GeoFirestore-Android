package org.imperiumlabs.geofirestore.core;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Extra fields.
 *
 * @author João Pedro Pedrosa (<a href="mailto:joao.pedrosa@luggit.app">joao.pedrosa@luggit.app</a>) on 13/02/19.
 */
public class ExtraFields {

    private Map<String, Object> objectMap;

    /**
     * Instantiates a new Extra fields.
     */
    public ExtraFields() {
        this.objectMap = new HashMap<>();
    }

    /**
     * Instantiates a new Extra fields.
     *
     * @param objectMap the object map
     */
    public ExtraFields(@NonNull Map<String, Object> objectMap) {
        this.objectMap = objectMap;
    }

    /**
     * Add.
     *
     * @param key   the key
     * @param value the value
     */
    public void add(String key, Object value) {
        this.objectMap.put(key, value);
    }

    /**
     * Remove.
     *
     * @param key the key
     */
    public void remove(String key) {
        this.objectMap.remove(key);
    }

    /**
     * Gets object map.
     *
     * @return the object map
     */
    public Map<String, Object> getObjectMap() {
        return objectMap;
    }

    /**
     * Sets object map.
     *
     * @param objectMap the object map
     */
    public void setObjectMap(Map<String, Object> objectMap) {
        this.objectMap = objectMap;
    }
}
