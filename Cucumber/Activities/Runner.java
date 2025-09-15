package testRunner;
	
	import org.junit.platform.suite.api.Suite;
	import org.junit.platform.suite.api.IncludeEngines;
	import org.junit.platform.suite.api.ConfigurationParameter;
	import org.junit.platform.suite.api.SelectClasspathResource;

	import io.cucumber.junit.platform.engine.Constants;

	@Suite                          //To make the class a test suite
	@IncludeEngines("cucumber")    // convert suite from Junit to cucumber
	@SelectClasspathResource("Features") //give the folder name where the .feature file are located
	@ConfigurationParameter(      //property mentions where the step definitions are located
	  key = Constants.GLUE_PROPERTY_NAME,
	  value = "stepDefinitions")
	@ConfigurationParameter(      //property to control/choose the scenario/feature to run
	  key = Constants.FILTER_TAGS_PROPERTY_NAME,
	  value = "@activity6")
	@ConfigurationParameter(
	        key = Constants.PLUGIN_PROPERTY_NAME,
	        value = "pretty, html:Reports/HTML_Report.html, junit:Reports/XML_Report.xml, json:Reports/JSON_Report.json"
	)
	@ConfigurationParameter( //this will publish html report on cucumber's website and will stay only for 24 hrs- basically temporary
	        key = Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME,
	        value = "true"
	)

	public class Runner { 

}
