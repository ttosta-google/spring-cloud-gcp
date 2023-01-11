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

package com.google.cloud.devtools.containeranalysis.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisClient;
import com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings;
import com.google.cloud.spring.autoconfigure.core.GcpContextAutoConfiguration;
import com.google.cloud.spring.core.DefaultCredentialsProvider;
import com.google.cloud.spring.core.Retry;
import com.google.cloud.spring.core.util.RetryUtil;
import java.io.IOException;
import java.util.Collections;
import javax.annotation.Generated;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Auto-configuration for {@link ContainerAnalysisClient}.
 *
 * <p>Provides auto-configuration for Spring Boot
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default transport provider is used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@AutoConfiguration
@AutoConfigureAfter(GcpContextAutoConfiguration.class)
@ConditionalOnClass(ContainerAnalysisClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.devtools.containeranalysis.v1.container-analysis.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties(ContainerAnalysisSpringProperties.class)
public class ContainerAnalysisSpringAutoConfiguration {
  private final ContainerAnalysisSpringProperties clientProperties;
  private final CredentialsProvider credentialsProvider;
  private static final Log LOGGER =
      LogFactory.getLog(ContainerAnalysisSpringAutoConfiguration.class);

  protected ContainerAnalysisSpringAutoConfiguration(
      ContainerAnalysisSpringProperties clientProperties, CredentialsProvider credentialsProvider)
      throws IOException {
    this.clientProperties = clientProperties;
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from ContainerAnalysis-specific configuration");
      }
      this.credentialsProvider =
          ((CredentialsProvider) new DefaultCredentialsProvider(this.clientProperties));
    } else {
      this.credentialsProvider = credentialsProvider;
    }
  }

  /**
   * Provides a default transport channel provider bean. The default is gRPC and will default to it
   * unless the useRest option is provided to use HTTP transport instead
   *
   * @return a default transport channel provider.
   */
  @Bean
  @ConditionalOnMissingBean(name = "defaultContainerAnalysisTransportChannelProvider")
  public TransportChannelProvider defaultContainerAnalysisTransportChannelProvider() {
    if (this.clientProperties.getUseRest()) {
      return ContainerAnalysisSettings.defaultHttpJsonTransportProviderBuilder().build();
    }
    return ContainerAnalysisSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a ContainerAnalysisSettings bean configured to use the default credentials provider
   * (obtained with containerAnalysisCredentials()) and its default transport channel provider
   * (defaultContainerAnalysisTransportChannelProvider()). It also configures the quota project ID
   * if provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Retry settings are also configured from service-level and method-level properties specified
   * in ContainerAnalysisSpringProperties. Method-level properties will take precedence over
   * service-level properties if available, and client library defaults will be used if neither are
   * specified.
   *
   * @param defaultTransportChannelProvider TransportChannelProvider to use in the settings.
   * @return a {@link ContainerAnalysisSettings} bean configured with {@link
   *     TransportChannelProvider} bean.
   */
  @Bean
  @ConditionalOnMissingBean
  public ContainerAnalysisSettings containerAnalysisSettings(
      @Qualifier("defaultContainerAnalysisTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    ContainerAnalysisSettings.Builder clientSettingsBuilder;
    if (this.clientProperties.getUseRest()) {
      clientSettingsBuilder = ContainerAnalysisSettings.newHttpJsonBuilder();
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using REST (HTTP/JSON) transport.");
      }
    } else {
      clientSettingsBuilder = ContainerAnalysisSettings.newBuilder();
    }
    clientSettingsBuilder
        .setCredentialsProvider(this.credentialsProvider)
        .setTransportChannelProvider(defaultTransportChannelProvider)
        .setHeaderProvider(this.userAgentHeaderProvider());
    if (this.clientProperties.getQuotaProjectId() != null) {
      clientSettingsBuilder.setQuotaProjectId(this.clientProperties.getQuotaProjectId());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Quota project id set to "
                + this.clientProperties.getQuotaProjectId()
                + ", this overrides project id from credentials.");
      }
    }
    if (this.clientProperties.getExecutorThreadCount() != null) {
      ExecutorProvider executorProvider =
          ContainerAnalysisSettings.defaultExecutorProviderBuilder()
              .setExecutorThreadCount(this.clientProperties.getExecutorThreadCount())
              .build();
      clientSettingsBuilder.setBackgroundExecutorProvider(executorProvider);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Background executor thread count is "
                + this.clientProperties.getExecutorThreadCount());
      }
    }
    Retry serviceRetry = clientProperties.getRetry();
    if (serviceRetry != null) {
      RetrySettings setIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.setIamPolicySettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.setIamPolicySettings().setRetrySettings(setIamPolicyRetrySettings);

      RetrySettings getIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getIamPolicySettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getIamPolicySettings().setRetrySettings(getIamPolicyRetrySettings);

      RetrySettings testIamPermissionsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.testIamPermissionsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .testIamPermissionsSettings()
          .setRetrySettings(testIamPermissionsRetrySettings);

      RetrySettings getVulnerabilityOccurrencesSummaryRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVulnerabilityOccurrencesSummarySettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .getVulnerabilityOccurrencesSummarySettings()
          .setRetrySettings(getVulnerabilityOccurrencesSummaryRetrySettings);

      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured service-level retry settings from properties.");
      }
    }
    Retry setIamPolicyRetry = clientProperties.getSetIamPolicyRetry();
    if (setIamPolicyRetry != null) {
      RetrySettings setIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.setIamPolicySettings().getRetrySettings(), setIamPolicyRetry);
      clientSettingsBuilder.setIamPolicySettings().setRetrySettings(setIamPolicyRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for setIamPolicy from properties.");
      }
    }
    Retry getIamPolicyRetry = clientProperties.getGetIamPolicyRetry();
    if (getIamPolicyRetry != null) {
      RetrySettings getIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getIamPolicySettings().getRetrySettings(), getIamPolicyRetry);
      clientSettingsBuilder.getIamPolicySettings().setRetrySettings(getIamPolicyRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getIamPolicy from properties.");
      }
    }
    Retry testIamPermissionsRetry = clientProperties.getTestIamPermissionsRetry();
    if (testIamPermissionsRetry != null) {
      RetrySettings testIamPermissionsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.testIamPermissionsSettings().getRetrySettings(),
              testIamPermissionsRetry);
      clientSettingsBuilder
          .testIamPermissionsSettings()
          .setRetrySettings(testIamPermissionsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for testIamPermissions from properties.");
      }
    }
    Retry getVulnerabilityOccurrencesSummaryRetry =
        clientProperties.getGetVulnerabilityOccurrencesSummaryRetry();
    if (getVulnerabilityOccurrencesSummaryRetry != null) {
      RetrySettings getVulnerabilityOccurrencesSummaryRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVulnerabilityOccurrencesSummarySettings().getRetrySettings(),
              getVulnerabilityOccurrencesSummaryRetry);
      clientSettingsBuilder
          .getVulnerabilityOccurrencesSummarySettings()
          .setRetrySettings(getVulnerabilityOccurrencesSummaryRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getVulnerabilityOccurrencesSummary from properties.");
      }
    }
    return clientSettingsBuilder.build();
  }

  /**
   * Provides a ContainerAnalysisClient bean configured with ContainerAnalysisSettings.
   *
   * @param containerAnalysisSettings settings to configure an instance of client bean.
   * @return a {@link ContainerAnalysisClient} bean configured with {@link
   *     ContainerAnalysisSettings}
   */
  @Bean
  @ConditionalOnMissingBean
  public ContainerAnalysisClient containerAnalysisClient(
      ContainerAnalysisSettings containerAnalysisSettings) throws IOException {
    return ContainerAnalysisClient.create(containerAnalysisSettings);
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-container-analysis";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
