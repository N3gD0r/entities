package org.n3gd0r.commons.models;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CommonEntity
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class CommonEntity<TKey> extends BaseEntity<TKey> {
	private TKey userId;
	private LocalDateTime updatedAt;
}
