/*
 *    Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *
 *    Portions copyright (c) 2013-2018 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.greenbuttonalliance.espi.common.domain;

import org.greenbuttonalliance.espi.common.utils.TestUtils;
import org.junit.Test;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class ElectricPowerQualitySummaryPersistenceTests {
	@Test
	public void persistence() {
		TestUtils.assertAnnotationPresent(ElectricPowerQualitySummary.class,
				Entity.class);
		TestUtils.assertAnnotationPresent(ElectricPowerQualitySummary.class,
				Table.class);
	}

	@Test
	public void usagePoint() {
		TestUtils.assertAnnotationPresent(ElectricPowerQualitySummary.class,
				"usagePoint", ManyToOne.class);
		TestUtils.assertAnnotationPresent(ElectricPowerQualitySummary.class,
				"usagePoint", JoinColumn.class);
	}
}
