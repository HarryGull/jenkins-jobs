/*package ci_open_jenkins.build

THIS FILE CAN BE DELETED ONCE FULLY TESTED VIA NEW AUTO BUILD

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtMicroserviceJobBuilder

new SbtMicroserviceJobBuilder('financial-transactions-dynamic-stub').
		withScalaStyle().
		withSCoverage().
		build(this as DslFactory)

new BuildMonitorViewBuilder('FT-MONITOR').withJobs('financial-transactions','financial-transactions-dynamic-stub').build(this)

*/
