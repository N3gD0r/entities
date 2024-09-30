package org.n3gd0r.commons.models;

import static jakarta.persistence.InheritanceType.TABLE_PER_CLASS;

import java.time.LocalDateTime;

import jakarta.persistence.Inheritance;
import lombok.Data;

/**
 * BaseEntity
 */
@Data
@Inheritance(strategy = TABLE_PER_CLASS)
public abstract class BaseEntity<TKey> {
	private TKey id;
	private Boolean status;
	private LocalDateTime createdAt;
}
