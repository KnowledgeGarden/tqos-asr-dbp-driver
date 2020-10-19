/**
 * 
 */
package org.topicquests.os.asr.driver;

import org.topicquests.os.asr.dbpedia.SpotlightClient;
import org.topicquests.os.asr.pd.api.ISentenceParser;
import org.topicquests.support.RootEnvironment;
import org.topicquests.support.api.IResult;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

/**
 * @author jackpark
 *
 */
public class DbpDriverEnvironment extends RootEnvironment implements ISentenceParser {
	private SpotlightClient spotlight;
	/**
	 */
	public DbpDriverEnvironment() {
		super("dbp-props.xml", "logger.properties");
		spotlight = new SpotlightClient(this);
	}

	public SpotlightClient getSpotlight() {
		return spotlight;
	}
	
	@Override
	public IResult processSentence(String sentence) {
		IResult r = spotlight.annotateSentence(sentence);
		JSONObject jo = new JSONObject();
		JSONObject x = (JSONObject)r.getResultObject();
		jo.put("dbp", x.get("Resources"));
		jo.put("agent", "dbpedia");
		r.setResultObject(jo);
		return r;
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
