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

package com.google.cloud.aiplatform.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for JobService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.aiplatform.v1.job-service")
public class JobServiceSpringProperties implements CredentialsSupplier {
  /** OAuth2 credentials to authenticate and authorize calls to Google Cloud Client Libraries. */
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/cloud-platform.read-only");
  /** Quota project to use for billing. */
  private String quotaProjectId;
  /** Number of threads used for executors. */
  private Integer executorThreadCount;
  /** Allow override of retry settings at service level, applying to all of its RPC methods. */
  @NestedConfigurationProperty private Retry retry;
  /**
   * Allow override of retry settings at method-level for createCustomJob. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createCustomJobRetry;
  /**
   * Allow override of retry settings at method-level for getCustomJob. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getCustomJobRetry;
  /**
   * Allow override of retry settings at method-level for listCustomJobs. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listCustomJobsRetry;
  /**
   * Allow override of retry settings at method-level for cancelCustomJob. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry cancelCustomJobRetry;
  /**
   * Allow override of retry settings at method-level for createDataLabelingJob. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createDataLabelingJobRetry;
  /**
   * Allow override of retry settings at method-level for getDataLabelingJob. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getDataLabelingJobRetry;
  /**
   * Allow override of retry settings at method-level for listDataLabelingJobs. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listDataLabelingJobsRetry;
  /**
   * Allow override of retry settings at method-level for cancelDataLabelingJob. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry cancelDataLabelingJobRetry;
  /**
   * Allow override of retry settings at method-level for createHyperparameterTuningJob. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createHyperparameterTuningJobRetry;
  /**
   * Allow override of retry settings at method-level for getHyperparameterTuningJob. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getHyperparameterTuningJobRetry;
  /**
   * Allow override of retry settings at method-level for listHyperparameterTuningJobs. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listHyperparameterTuningJobsRetry;
  /**
   * Allow override of retry settings at method-level for cancelHyperparameterTuningJob. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry cancelHyperparameterTuningJobRetry;
  /**
   * Allow override of retry settings at method-level for createNasJob. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createNasJobRetry;
  /**
   * Allow override of retry settings at method-level for getNasJob. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getNasJobRetry;
  /**
   * Allow override of retry settings at method-level for listNasJobs. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listNasJobsRetry;
  /**
   * Allow override of retry settings at method-level for cancelNasJob. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry cancelNasJobRetry;
  /**
   * Allow override of retry settings at method-level for getNasTrialDetail. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getNasTrialDetailRetry;
  /**
   * Allow override of retry settings at method-level for listNasTrialDetails. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listNasTrialDetailsRetry;
  /**
   * Allow override of retry settings at method-level for createBatchPredictionJob. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createBatchPredictionJobRetry;
  /**
   * Allow override of retry settings at method-level for getBatchPredictionJob. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getBatchPredictionJobRetry;
  /**
   * Allow override of retry settings at method-level for listBatchPredictionJobs. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listBatchPredictionJobsRetry;
  /**
   * Allow override of retry settings at method-level for cancelBatchPredictionJob. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry cancelBatchPredictionJobRetry;
  /**
   * Allow override of retry settings at method-level for createModelDeploymentMonitoringJob. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createModelDeploymentMonitoringJobRetry;
  /**
   * Allow override of retry settings at method-level for
   * searchModelDeploymentMonitoringStatsAnomalies. If defined, this takes precedence over
   * service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry searchModelDeploymentMonitoringStatsAnomaliesRetry;
  /**
   * Allow override of retry settings at method-level for getModelDeploymentMonitoringJob. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getModelDeploymentMonitoringJobRetry;
  /**
   * Allow override of retry settings at method-level for listModelDeploymentMonitoringJobs. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listModelDeploymentMonitoringJobsRetry;
  /**
   * Allow override of retry settings at method-level for pauseModelDeploymentMonitoringJob. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry pauseModelDeploymentMonitoringJobRetry;
  /**
   * Allow override of retry settings at method-level for resumeModelDeploymentMonitoringJob. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry resumeModelDeploymentMonitoringJobRetry;
  /**
   * Allow override of retry settings at method-level for listLocations. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listLocationsRetry;
  /**
   * Allow override of retry settings at method-level for getLocation. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getLocationRetry;
  /**
   * Allow override of retry settings at method-level for setIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry setIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for getIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for testIamPermissions. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry testIamPermissionsRetry;

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

  public Retry getCreateCustomJobRetry() {
    return this.createCustomJobRetry;
  }

  public void setCreateCustomJobRetry(Retry createCustomJobRetry) {
    this.createCustomJobRetry = createCustomJobRetry;
  }

  public Retry getGetCustomJobRetry() {
    return this.getCustomJobRetry;
  }

  public void setGetCustomJobRetry(Retry getCustomJobRetry) {
    this.getCustomJobRetry = getCustomJobRetry;
  }

  public Retry getListCustomJobsRetry() {
    return this.listCustomJobsRetry;
  }

  public void setListCustomJobsRetry(Retry listCustomJobsRetry) {
    this.listCustomJobsRetry = listCustomJobsRetry;
  }

  public Retry getCancelCustomJobRetry() {
    return this.cancelCustomJobRetry;
  }

  public void setCancelCustomJobRetry(Retry cancelCustomJobRetry) {
    this.cancelCustomJobRetry = cancelCustomJobRetry;
  }

  public Retry getCreateDataLabelingJobRetry() {
    return this.createDataLabelingJobRetry;
  }

  public void setCreateDataLabelingJobRetry(Retry createDataLabelingJobRetry) {
    this.createDataLabelingJobRetry = createDataLabelingJobRetry;
  }

  public Retry getGetDataLabelingJobRetry() {
    return this.getDataLabelingJobRetry;
  }

  public void setGetDataLabelingJobRetry(Retry getDataLabelingJobRetry) {
    this.getDataLabelingJobRetry = getDataLabelingJobRetry;
  }

  public Retry getListDataLabelingJobsRetry() {
    return this.listDataLabelingJobsRetry;
  }

  public void setListDataLabelingJobsRetry(Retry listDataLabelingJobsRetry) {
    this.listDataLabelingJobsRetry = listDataLabelingJobsRetry;
  }

  public Retry getCancelDataLabelingJobRetry() {
    return this.cancelDataLabelingJobRetry;
  }

  public void setCancelDataLabelingJobRetry(Retry cancelDataLabelingJobRetry) {
    this.cancelDataLabelingJobRetry = cancelDataLabelingJobRetry;
  }

  public Retry getCreateHyperparameterTuningJobRetry() {
    return this.createHyperparameterTuningJobRetry;
  }

  public void setCreateHyperparameterTuningJobRetry(Retry createHyperparameterTuningJobRetry) {
    this.createHyperparameterTuningJobRetry = createHyperparameterTuningJobRetry;
  }

  public Retry getGetHyperparameterTuningJobRetry() {
    return this.getHyperparameterTuningJobRetry;
  }

  public void setGetHyperparameterTuningJobRetry(Retry getHyperparameterTuningJobRetry) {
    this.getHyperparameterTuningJobRetry = getHyperparameterTuningJobRetry;
  }

  public Retry getListHyperparameterTuningJobsRetry() {
    return this.listHyperparameterTuningJobsRetry;
  }

  public void setListHyperparameterTuningJobsRetry(Retry listHyperparameterTuningJobsRetry) {
    this.listHyperparameterTuningJobsRetry = listHyperparameterTuningJobsRetry;
  }

  public Retry getCancelHyperparameterTuningJobRetry() {
    return this.cancelHyperparameterTuningJobRetry;
  }

  public void setCancelHyperparameterTuningJobRetry(Retry cancelHyperparameterTuningJobRetry) {
    this.cancelHyperparameterTuningJobRetry = cancelHyperparameterTuningJobRetry;
  }

  public Retry getCreateNasJobRetry() {
    return this.createNasJobRetry;
  }

  public void setCreateNasJobRetry(Retry createNasJobRetry) {
    this.createNasJobRetry = createNasJobRetry;
  }

  public Retry getGetNasJobRetry() {
    return this.getNasJobRetry;
  }

  public void setGetNasJobRetry(Retry getNasJobRetry) {
    this.getNasJobRetry = getNasJobRetry;
  }

  public Retry getListNasJobsRetry() {
    return this.listNasJobsRetry;
  }

  public void setListNasJobsRetry(Retry listNasJobsRetry) {
    this.listNasJobsRetry = listNasJobsRetry;
  }

  public Retry getCancelNasJobRetry() {
    return this.cancelNasJobRetry;
  }

  public void setCancelNasJobRetry(Retry cancelNasJobRetry) {
    this.cancelNasJobRetry = cancelNasJobRetry;
  }

  public Retry getGetNasTrialDetailRetry() {
    return this.getNasTrialDetailRetry;
  }

  public void setGetNasTrialDetailRetry(Retry getNasTrialDetailRetry) {
    this.getNasTrialDetailRetry = getNasTrialDetailRetry;
  }

  public Retry getListNasTrialDetailsRetry() {
    return this.listNasTrialDetailsRetry;
  }

  public void setListNasTrialDetailsRetry(Retry listNasTrialDetailsRetry) {
    this.listNasTrialDetailsRetry = listNasTrialDetailsRetry;
  }

  public Retry getCreateBatchPredictionJobRetry() {
    return this.createBatchPredictionJobRetry;
  }

  public void setCreateBatchPredictionJobRetry(Retry createBatchPredictionJobRetry) {
    this.createBatchPredictionJobRetry = createBatchPredictionJobRetry;
  }

  public Retry getGetBatchPredictionJobRetry() {
    return this.getBatchPredictionJobRetry;
  }

  public void setGetBatchPredictionJobRetry(Retry getBatchPredictionJobRetry) {
    this.getBatchPredictionJobRetry = getBatchPredictionJobRetry;
  }

  public Retry getListBatchPredictionJobsRetry() {
    return this.listBatchPredictionJobsRetry;
  }

  public void setListBatchPredictionJobsRetry(Retry listBatchPredictionJobsRetry) {
    this.listBatchPredictionJobsRetry = listBatchPredictionJobsRetry;
  }

  public Retry getCancelBatchPredictionJobRetry() {
    return this.cancelBatchPredictionJobRetry;
  }

  public void setCancelBatchPredictionJobRetry(Retry cancelBatchPredictionJobRetry) {
    this.cancelBatchPredictionJobRetry = cancelBatchPredictionJobRetry;
  }

  public Retry getCreateModelDeploymentMonitoringJobRetry() {
    return this.createModelDeploymentMonitoringJobRetry;
  }

  public void setCreateModelDeploymentMonitoringJobRetry(
      Retry createModelDeploymentMonitoringJobRetry) {
    this.createModelDeploymentMonitoringJobRetry = createModelDeploymentMonitoringJobRetry;
  }

  public Retry getSearchModelDeploymentMonitoringStatsAnomaliesRetry() {
    return this.searchModelDeploymentMonitoringStatsAnomaliesRetry;
  }

  public void setSearchModelDeploymentMonitoringStatsAnomaliesRetry(
      Retry searchModelDeploymentMonitoringStatsAnomaliesRetry) {
    this.searchModelDeploymentMonitoringStatsAnomaliesRetry =
        searchModelDeploymentMonitoringStatsAnomaliesRetry;
  }

  public Retry getGetModelDeploymentMonitoringJobRetry() {
    return this.getModelDeploymentMonitoringJobRetry;
  }

  public void setGetModelDeploymentMonitoringJobRetry(Retry getModelDeploymentMonitoringJobRetry) {
    this.getModelDeploymentMonitoringJobRetry = getModelDeploymentMonitoringJobRetry;
  }

  public Retry getListModelDeploymentMonitoringJobsRetry() {
    return this.listModelDeploymentMonitoringJobsRetry;
  }

  public void setListModelDeploymentMonitoringJobsRetry(
      Retry listModelDeploymentMonitoringJobsRetry) {
    this.listModelDeploymentMonitoringJobsRetry = listModelDeploymentMonitoringJobsRetry;
  }

  public Retry getPauseModelDeploymentMonitoringJobRetry() {
    return this.pauseModelDeploymentMonitoringJobRetry;
  }

  public void setPauseModelDeploymentMonitoringJobRetry(
      Retry pauseModelDeploymentMonitoringJobRetry) {
    this.pauseModelDeploymentMonitoringJobRetry = pauseModelDeploymentMonitoringJobRetry;
  }

  public Retry getResumeModelDeploymentMonitoringJobRetry() {
    return this.resumeModelDeploymentMonitoringJobRetry;
  }

  public void setResumeModelDeploymentMonitoringJobRetry(
      Retry resumeModelDeploymentMonitoringJobRetry) {
    this.resumeModelDeploymentMonitoringJobRetry = resumeModelDeploymentMonitoringJobRetry;
  }

  public Retry getListLocationsRetry() {
    return this.listLocationsRetry;
  }

  public void setListLocationsRetry(Retry listLocationsRetry) {
    this.listLocationsRetry = listLocationsRetry;
  }

  public Retry getGetLocationRetry() {
    return this.getLocationRetry;
  }

  public void setGetLocationRetry(Retry getLocationRetry) {
    this.getLocationRetry = getLocationRetry;
  }

  public Retry getSetIamPolicyRetry() {
    return this.setIamPolicyRetry;
  }

  public void setSetIamPolicyRetry(Retry setIamPolicyRetry) {
    this.setIamPolicyRetry = setIamPolicyRetry;
  }

  public Retry getGetIamPolicyRetry() {
    return this.getIamPolicyRetry;
  }

  public void setGetIamPolicyRetry(Retry getIamPolicyRetry) {
    this.getIamPolicyRetry = getIamPolicyRetry;
  }

  public Retry getTestIamPermissionsRetry() {
    return this.testIamPermissionsRetry;
  }

  public void setTestIamPermissionsRetry(Retry testIamPermissionsRetry) {
    this.testIamPermissionsRetry = testIamPermissionsRetry;
  }
}
