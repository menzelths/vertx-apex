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

package io.vertx.groovy.ext.apex.templ;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
/**
 * A template engine that uses the Handlebars library.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@CompileStatic
public class MVELTemplateEngine extends TemplateEngine {
  final def io.vertx.ext.apex.templ.MVELTemplateEngine delegate;
  public MVELTemplateEngine(io.vertx.ext.apex.templ.MVELTemplateEngine delegate) {
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
  public static MVELTemplateEngine create() {
    def ret= MVELTemplateEngine.FACTORY.apply(io.vertx.ext.apex.templ.MVELTemplateEngine.create());
    return ret;
  }
  /**
   * Create a template engine
   *
   * @param resourcePrefix  the resource prefix
   * @param extension  the extension
   * @return  the engine
   */
  public static MVELTemplateEngine create(String resourcePrefix, String extension) {
    def ret= MVELTemplateEngine.FACTORY.apply(io.vertx.ext.apex.templ.MVELTemplateEngine.create(resourcePrefix, extension));
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
  public static MVELTemplateEngine create(String resourcePrefix, String extension, int maxCacheSize) {
    def ret= MVELTemplateEngine.FACTORY.apply(io.vertx.ext.apex.templ.MVELTemplateEngine.create(resourcePrefix, extension, maxCacheSize));
    return ret;
  }

  static final java.util.function.Function<io.vertx.ext.apex.templ.MVELTemplateEngine, MVELTemplateEngine> FACTORY = io.vertx.lang.groovy.Factories.createFactory() {
    io.vertx.ext.apex.templ.MVELTemplateEngine arg -> new MVELTemplateEngine(arg);
  };
}
