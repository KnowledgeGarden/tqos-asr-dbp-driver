/**
 * 
 */
package devtests;

import org.topicquests.os.asr.dbpedia.SpotlightClient;
import org.topicquests.os.asr.driver.DbpDriverEnvironment;

/**
 * @author jackpark
 *
 */
public class TestRoot {
	protected DbpDriverEnvironment environment;
	protected SpotlightClient spotlight;

	/**
	 * 
	 */
	public TestRoot() {
		environment = new DbpDriverEnvironment();
		spotlight = environment.getSpotlight();
	}

}
