/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.platform.engine.discovery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.Test;

/**
 * @since 1.0
 */
class ClassFilterTests {

	@Test
	void classNameMatches() {
		String regex = "^java\\.lang\\..*";

		ClassFilter filter = ClassFilter.includeClassNamePattern(regex);

		assertEquals("Includes class names with regular expression: " + regex, filter.toString());
		assertTrue(filter.apply(String.class).included());
		assertFalse(filter.apply(Collection.class).included());
	}

}
