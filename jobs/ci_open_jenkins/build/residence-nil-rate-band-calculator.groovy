package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtFrontendJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtMicroserviceJobBuilder

new SbtMicroserviceJobBuilder('residence-nil-rate-band-calculator').
        withScalaStyle().
        withSCoverage().
        build(this as DslFactory)

new SbtFrontendJobBuilder('residence-nil-rate-band-calculator-frontend').
        withScalaStyle().
        withSCoverage().
        build(this as DslFactory)

// TODO: Add acceptance test job

new BuildMonitorViewBuilder('RNRB-MONITOR')
    .withJobs('residence-nil-rate-band-calculator',
	          'residence-nil-rate-band-calculator-frontend').build(this)