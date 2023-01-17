/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.monitoring.v3.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for GroupService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.monitoring.v3.group-service")
public class GroupServiceSpringProperties implements CredentialsSupplier {
  /** OAuth2 credentials to authenticate and authorize calls to Google Cloud Client Libraries. */
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/monitoring",
          "https://www.googleapis.com/auth/monitoring.read");
  /** Quota project to use for billing. */
  private String quotaProjectId;
  /** Number of threads used for executors. */
  private Integer executorThreadCount;
  /** Allow override of retry settings at service level, applying to all of its RPC methods. */
  @NestedConfigurationProperty private Retry retry;
  /**
   * Allow override of retry settings at method-level for listGroups. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listGroupsRetry;
  /**
   * Allow override of retry settings at method-level for getGroup. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getGroupRetry;
  /**
   * Allow override of retry settings at method-level for createGroup. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createGroupRetry;
  /**
   * Allow override of retry settings at method-level for updateGroup. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateGroupRetry;
  /**
   * Allow override of retry settings at method-level for deleteGroup. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteGroupRetry;
  /**
   * Allow override of retry settings at method-level for listGroupMembers. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listGroupMembersRetry;

  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  public String getQuotaProjectId() {
    return this.quotaProjectId;
  }

  public void setQuotaProjectId(String quotaProjectId) {
    this.quotaProjectId = quotaProjectId;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Retry getRetry() {
    return this.retry;
  }

  public void setRetry(Retry retry) {
    this.retry = retry;
  }

  public Retry getListGroupsRetry() {
    return this.listGroupsRetry;
  }

  public void setListGroupsRetry(Retry listGroupsRetry) {
    this.listGroupsRetry = listGroupsRetry;
  }

  public Retry getGetGroupRetry() {
    return this.getGroupRetry;
  }

  public void setGetGroupRetry(Retry getGroupRetry) {
    this.getGroupRetry = getGroupRetry;
  }

  public Retry getCreateGroupRetry() {
    return this.createGroupRetry;
  }

  public void setCreateGroupRetry(Retry createGroupRetry) {
    this.createGroupRetry = createGroupRetry;
  }

  public Retry getUpdateGroupRetry() {
    return this.updateGroupRetry;
  }

  public void setUpdateGroupRetry(Retry updateGroupRetry) {
    this.updateGroupRetry = updateGroupRetry;
  }

  public Retry getDeleteGroupRetry() {
    return this.deleteGroupRetry;
  }

  public void setDeleteGroupRetry(Retry deleteGroupRetry) {
    this.deleteGroupRetry = deleteGroupRetry;
  }

  public Retry getListGroupMembersRetry() {
    return this.listGroupMembersRetry;
  }

  public void setListGroupMembersRetry(Retry listGroupMembersRetry) {
    this.listGroupMembersRetry = listGroupMembersRetry;
  }
}
