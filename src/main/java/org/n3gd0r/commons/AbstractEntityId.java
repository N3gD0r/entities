package org.n3gd0r.commons;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.MappedSuperclass;

/**
 * AbstractEntityId: super class for domain entities id's.
 *
 * @param <TKey> the id type that encapsulates
 */
@MappedSuperclass
public class AbstractEntityId<TKey extends Serializable> implements EntityId<TKey> {
    private TKey id;

    protected AbstractEntityId() {
    }

    protected AbstractEntityId(TKey id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if (this == obj) {
            isEquals = true;
        } else if (obj == null) {
            return false;
        } else if (obj.getClass().equals(getClass())) {
            AbstractEntityId<?> o = (AbstractEntityId<?>) obj;
            isEquals = Objects.equals(getId(), o.getId());
        }
        return isEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "%s [id=%s]".formatted(getClass().getSimpleName(), getId());
    }

    @Override
    public String asString() {
        return id.toString();
    }

    @Override
    public TKey getId() {
        return id;
    }
}
