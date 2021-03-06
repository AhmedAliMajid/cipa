/*
 * Copyright (C) 2018 by Sebastian Hasait (sebastian at hasait dot de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.hasait.cipa.jobprops

interface JobPropertiesContainer {

	/**
	 * Add trigger to build, e.g. <code>rawScript.pollSCM('H/10 * * * *')</code>.
	 */
	void addPipelineTrigger(def trigger)

	void addCustomJobProperty(def customJobProperty)

	void setBuildDiscarder(def buildDiscarder)

	void setRebuildSettingsAutoRebuild(boolean autoRebuild)

	void setRebuildSettingsRebuildDisabled(boolean rebuildDisabled)

}
