/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.demo.data.cache.serializer;

import com.demo.data.model.RepositoriesResponseRestDto;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Class user as Serializer/Deserializer for user entities.
 */
@Singleton
public class JsonSerializer {

  private final Gson gson = new Gson();

  @Inject
  public JsonSerializer() {}

  /**
   * Serialize an object to Json.
   *
   * @param userEntity {@link RepositoriesResponseRestDto} to serialize.
   */
  public String serialize(RepositoriesResponseRestDto userEntity) {
    String jsonString = gson.toJson(userEntity, RepositoriesResponseRestDto.class);
    return jsonString;
  }

  /**
   * Deserialize a json representation of an object.
   *
   * @param jsonString A json string to deserialize.
   * @return {@link RepositoriesResponseRestDto}
   */
  public RepositoriesResponseRestDto deserialize(String jsonString) {
    RepositoriesResponseRestDto userEntity = gson.fromJson(jsonString, RepositoriesResponseRestDto.class);
    return userEntity;
  }
}