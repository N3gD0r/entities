package org.n3gd0r.commons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.n3gd0r.commons.models.MyCustomEntity;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommonsApplicationTests {
	MyCustomEntity customEntity;

	@BeforeEach
	void initEntities() {
		customEntity = new MyCustomEntity();
	}

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("test common entity with string key id")
	void testCommonEntityStringKeyId() {
		String id = "CustomId";

		customEntity.setId(id);

		assertEquals("CustomId", customEntity.getId());
	}

	@Test
	@DisplayName("test common entity with string key userId")
	void testCommonEntityStringKeyUserId() {
		String userId = "CustomUserId";

		customEntity.setUserId(userId);

		assertEquals("CustomUserId", customEntity.getUserId());
	}

	@Test
	@DisplayName("test common entity with status true")
	void testCommonEntityStatusIsTrue() {
		Boolean status = true;

		customEntity.setStatus(status);

		assertTrue(customEntity.getStatus());
	}

	@Test
	@DisplayName("test common entity createdAt current time")
	void testCommonEntityCreatedAtCurrentTime() {
		LocalDateTime createdAt = LocalDateTime.of(1999, 10, 10, 0, 0, 0);

		customEntity.setCreatedAt(createdAt);

		assertEquals("1999-10-10T00:00", customEntity.getCreatedAt().toString());
	}

	@Test
	@DisplayName("test common entity updatedAt current time")
	void testCommonEntityUpdatedAtCurrentTime() {
		LocalDateTime updatedAt = LocalDateTime.of(1999, 11, 25, 1, 0, 0);

		customEntity.setUpdatedAt(updatedAt);

		assertEquals("1999-11-25T01:00", customEntity.getUpdatedAt().toString());
	}
}
