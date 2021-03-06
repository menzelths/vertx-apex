/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.apex.templ;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;

/**
 * A template engine that uses Jade.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 *
 * NOTE: This class has been automatically generated from the original non RX-ified interface using Vert.x codegen.
 */

public class JadeTemplateEngine extends TemplateEngine {

  final io.vertx.ext.apex.templ.JadeTemplateEngine delegate;

  public JadeTemplateEngine(io.vertx.ext.apex.templ.JadeTemplateEngine delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Create a template engine using defaults
   *
   * @return  the engine
   */
  public static JadeTemplateEngine create() {
    JadeTemplateEngine ret= JadeTemplateEngine.newInstance(io.vertx.ext.apex.templ.JadeTemplateEngine.create());
    return ret;
  }

  /**
   * Create a template engine
   *
   * @param resourcePrefix  the resource prefix
   * @param extension  the extension
   * @return  the engine
   */
  public static JadeTemplateEngine create(String resourcePrefix, String extension) {
    JadeTemplateEngine ret= JadeTemplateEngine.newInstance(io.vertx.ext.apex.templ.JadeTemplateEngine.create(resourcePrefix, extension));
    return ret;
  }

  /**
   * Create a template engine
   *
   * @param resourcePrefix  the resource prefix
   * @param extension  the extension
   * @param maxCacheSize  the max cache size
   * @return  the engine
   */
  public static JadeTemplateEngine create(String resourcePrefix, String extension, int maxCacheSize) {
    JadeTemplateEngine ret= JadeTemplateEngine.newInstance(io.vertx.ext.apex.templ.JadeTemplateEngine.create(resourcePrefix, extension, maxCacheSize));
    return ret;
  }


  public static JadeTemplateEngine newInstance(io.vertx.ext.apex.templ.JadeTemplateEngine arg) {
    return new JadeTemplateEngine(arg);
  }
}
