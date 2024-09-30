package org.n3gd0r.commons.models;

import static jakarta.persistence.InheritanceType.TABLE_PER_CLASS;

import java.time.LocalDateTime;

import jakarta.persistence.Inheritance;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CommonEntity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Inheritance(strategy = TABLE_PER_CLASS)
public abstract class CommonEntity<TKey> extends BaseEntity<TKey> {
	private TKey userId;
	private LocalDateTime updatedAt;
}
