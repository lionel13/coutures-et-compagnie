package fr.varex13.couturesetcompagnie.cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("fr/varex13/couturesetcompagnie")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "fr.varex13.couturesetcompagnie")
class RunCucumberUTTest {

}
