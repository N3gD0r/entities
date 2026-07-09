package org.n3gd0r.commons;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;

/**
 * AbstractEntity: super class for domain entites.
 *
 * @param <TKey> the type of {@link EntityId} for this entity
 */
@MappedSuperclass
public abstract class AbstractEntity<TKey extends EntityId<?>> implements Entity<TKey> {

    @EmbeddedId
    private TKey id;

    protected AbstractEntity() {
    }

    public AbstractEntity(TKey id) {
        this.id = Objects.requireNonNull(id, "ID must not be null");
    }

    @Override
    public TKey getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if (this == obj) {
            isEquals = true;
        } else if (obj == null) {
            return false;
        } else if (obj.getClass().equals(getClass())) {
            AbstractEntity<?> o = (AbstractEntity<?>) obj;
            isEquals = Objects.equals(getId(), o.getId());
        }
        return isEquals;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return String.format("%s[id=%s]", getClass().getSimpleName(), getId());
    }
}
