/*
 * Copyright 2017-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.testresources.oracle.xe;

import io.micronaut.testresources.jdbc.AbstractJdbcTestResourceProvider;
import org.testcontainers.containers.OracleContainer;
import org.testcontainers.utility.DockerImageName;

import java.util.Map;

/**
 * A test resource provider which will spawn an Oracle XE test container.
 */
public class OracleXETestResourceProvider extends AbstractJdbcTestResourceProvider<OracleContainer> {

    @Override
    protected String getSimpleName() {
        return "oracle";
    }

    @Override
    protected String getDefaultImageName() {
        return "gvenzl/oracle-xe";
    }

    @Override
    protected OracleContainer createContainer(DockerImageName imageName, Map<String, Object> properties) {
        return new OracleContainer(imageName);
    }

}
