/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.serviceregistry.definition;

public interface DefinitionConst {
    String appIdKey = "APPLICATION_ID";

    String serviceDescriptionKey = "service_description";

    String nameKey = "name";

    String qulifiedServiceNameKey = serviceDescriptionKey + "." + nameKey;

    String qulifiedServiceVersionKey = serviceDescriptionKey + ".version";

    String qulifiedServiceDescKey = serviceDescriptionKey + ".description";

    String qulifiedServiceRoleKey = serviceDescriptionKey + ".role";

    String allowCrossAppKey = "allowCrossApp";

    String defaultAppId = "default";

    String defaultVersion = "1.0.0";

    String defaultStage = "prod";
}
