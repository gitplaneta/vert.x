/*
 * Copyright 2011-2012 the original author or authors.
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

package org.vertx.java.core.eventbus.spi;

import org.vertx.java.core.CompletionHandler;

import java.util.Collection;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 *
 *
 */
public interface AsyncMultiMap<K, V> {

  void put(K k, V v, CompletionHandler<Void> completionHandler);

  void get(K k, CompletionHandler<Collection<V>> completionHandler);

  void remove(K k, V v, CompletionHandler<Boolean> completionHandler);
}