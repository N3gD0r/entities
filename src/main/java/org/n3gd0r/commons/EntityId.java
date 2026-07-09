package org.n3gd0r.commons;

import java.io.Serializable;

/**
 * Interface for primary keys.
 *
 * @param <T> entity id type
 */
public interface EntityId<T> extends Serializable {
    /**
     * Returns the value of the entity id.
     *
     * @return the id value
     */
    T getId();

    /**
     * Returns the value as a String.
     *
     * @return a String representation of the value
     */
    String asString();
}
