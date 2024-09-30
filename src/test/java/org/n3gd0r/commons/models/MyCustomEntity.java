package org.n3gd0r.commons.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * MyCustomEntity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class MyCustomEntity extends CommonEntity<String> {
}
