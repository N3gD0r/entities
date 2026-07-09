package org.n3gd0r.commons;

/**
 * Entity: Abstraction for domain entities.
 *
 * @param <TKey> the type of {@link EntityId} for this entity
 */
public interface Entity<TKey extends EntityId<?>> {

    /**
     * Returns the id of this entity.
     *
     * @return the id value
     */
    TKey getId();
}
