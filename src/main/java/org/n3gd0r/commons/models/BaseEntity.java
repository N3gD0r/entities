package org.n3gd0r.commons.models;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * BaseEntity
 */
@Data
public abstract class BaseEntity<TKey> {
	private TKey id;
	private Boolean status;
	private LocalDateTime createdAt;
}
