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

package io.vertx.rxjava.ext.apex.handler;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;
import io.vertx.rxjava.ext.apex.RoutingContext;
import io.vertx.core.Handler;

/**
 * A handler for serving static resources from the file system or classpath.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 *
 * NOTE: This class has been automatically generated from the original non RX-ified interface using Vert.x codegen.
 */

public class StaticHandler {

  final io.vertx.ext.apex.handler.StaticHandler delegate;

  public StaticHandler(io.vertx.ext.apex.handler.StaticHandler delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Create a handler using defaults
   *
   * @return the handler
   */
  public static StaticHandler create() {
    StaticHandler ret= StaticHandler.newInstance(io.vertx.ext.apex.handler.StaticHandler.create());
    return ret;
  }

  /**
   * Create a handler, specifying web-root
   *
   * @param root  the web-root
   * @return the handler
   */
  public static StaticHandler create(String root) {
    StaticHandler ret= StaticHandler.newInstance(io.vertx.ext.apex.handler.StaticHandler.create(root));
    return ret;
  }

  public void handle(RoutingContext context) {
    this.delegate.handle((io.vertx.ext.apex.RoutingContext) context.getDelegate());
  }

  /**
   * Set the web root
   *
   * @param webRoot  the web root
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setWebRoot(String webRoot) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setWebRoot(webRoot));
    return ret;
  }

  /**
   * Set whether files are read-only and will never change
   *
   * @param readOnly  whether files are read-only
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setFilesReadOnly(boolean readOnly) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setFilesReadOnly(readOnly));
    return ret;
  }

  /**
   * Set value for max age in caching headers
   *
   * @param maxAgeSeconds  maximum time for browser to cache, in seconds
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setMaxAgeSeconds(long maxAgeSeconds) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setMaxAgeSeconds(maxAgeSeconds));
    return ret;
  }

  /**
   * Set whether cache header handling is enabled
   *
   * @param enabled  true if enabled
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setCachingEnabled(boolean enabled) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setCachingEnabled(enabled));
    return ret;
  }

  /**
   * Set whether directory listing is enabled
   *
   * @param directoryListing  true if enabled
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setDirectoryListing(boolean directoryListing) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setDirectoryListing(directoryListing));
    return ret;
  }

  /**
   * Set whether hidden files should be served
   *
   * @param includeHidden  true if hidden files should be served
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setIncludeHidden(boolean includeHidden) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setIncludeHidden(includeHidden));
    return ret;
  }

  /**
   * Set the server cache entry timeout when caching is enabled
   *
   * @param timeout  the timeout, in ms
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setCacheEntryTimeout(long timeout) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setCacheEntryTimeout(timeout));
    return ret;
  }

  /**
   * Set the index page
   *
   * @param indexPage  the index page
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setIndexPage(String indexPage) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setIndexPage(indexPage));
    return ret;
  }

  /**
   * Set the max cache size, when caching is enabled
   *
   * @param maxCacheSize  the max cache size
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setMaxCacheSize(int maxCacheSize) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setMaxCacheSize(maxCacheSize));
    return ret;
  }

  /**
   * Set whether async filesystem access should always be used
   *
   * @param alwaysAsyncFS  true for always async FS access
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setAlwaysAsyncFS(boolean alwaysAsyncFS) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setAlwaysAsyncFS(alwaysAsyncFS));
    return ret;
  }

  /**
   * Set whether async/sync filesystem tuning should enabled
   *
   * @param enableFSTuning  true to enabled FS tuning
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setEnableFSTuning(boolean enableFSTuning) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setEnableFSTuning(enableFSTuning));
    return ret;
  }

  /**
   * Set the max serve time in ns, above which serves are considered slow
   *
   * @param maxAvgServeTimeNanoSeconds  max serve time, in ns
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setMaxAvgServeTimeNs(long maxAvgServeTimeNanoSeconds) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setMaxAvgServeTimeNs(maxAvgServeTimeNanoSeconds));
    return ret;
  }

  /**
   * Set the directory template to be used when directory listing
   *
   * @param directoryTemplate  the directory template
   * @return a reference to this, so the API can be used fluently
   */
  public StaticHandler setDirectoryTemplate(String directoryTemplate) {
    StaticHandler ret= StaticHandler.newInstance(this.delegate.setDirectoryTemplate(directoryTemplate));
    return ret;
  }


  public static StaticHandler newInstance(io.vertx.ext.apex.handler.StaticHandler arg) {
    return new StaticHandler(arg);
  }
}
