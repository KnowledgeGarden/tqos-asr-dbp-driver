/**
 * 
 */
package devtests;

import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class SecondTest extends TestRoot {
	private final String 
		S1 = "NFIL3 is a transcription factor, a protein that switches certain genes on and off. Earlier studies had focused on its role in immune cells, but a team led by Lora Hooper at the University of Texas Southwestern Medical Center, Dallas, discovered that NFIL3 is also found in cells in the inner lining, or epithelium, of the mouse small intestine.",
		S2 = "Left ventricular hypertrabeculation fulfilling noncompaction cardiomyopathy criteria has been detected in athletes.";

	/**
	 * 
	 */
	public SecondTest() {
		super();
		IResult r = environment.processSentence(S1);
		System.out.println("A "+r.getErrorString());
		System.out.println("B "+r.getResultObject());
		
		environment.shutDown();
		System.exit(0);	}

}
/*
A 
B {"agent":"dbpedia","dbp":[{"@percentageOfSecondRank":"0.0","@URI":"http:\/\/dbpedia.org\/resource\/NFIL3","@support":"8","@surfaceForm":"NFIL3","@offset":"0","@similarityScore":"1.0","@types":""},{"@percentageOfSecondRank":"2.330325051954496E-10","@URI":"http:\/\/dbpedia.org\/resource\/Transcription_factor","@support":"2381","@surfaceForm":"transcription factor","@offset":"11","@similarityScore":"0.999999999766942","@types":""},{"@percentageOfSecondRank":"1.027861094192732E-7","@URI":"http:\/\/dbpedia.org\/resource\/Protein","@support":"53207","@surfaceForm":"protein","@offset":"35","@similarityScore":"0.9999998938066085","@types":""},{"@percentageOfSecondRank":"0.0","@URI":"http:\/\/dbpedia.org\/resource\/Lora_Hooper","@support":"2","@surfaceForm":"Lora Hooper","@offset":"158","@similarityScore":"0.9999994962626734","@types":""},{"@percentageOfSecondRank":"0.010570431623319521","@URI":"http:\/\/dbpedia.org\/resource\/Texas","@support":"136284","@surfaceForm":"Texas","@offset":"191","@similarityScore":"0.989306558381755","@types":"Wikidata:Q3455524,Schema:Place,Schema:AdministrativeArea,DBpedia:Region,DBpedia:PopulatedPlace,DBpedia:Place,DBpedia:Location,DBpedia:AdministrativeRegion"},{"@percentageOfSecondRank":"7.554344827793439E-5","@URI":"http:\/\/dbpedia.org\/resource\/Dallas","@support":"27285","@surfaceForm":"Dallas","@offset":"226","@similarityScore":"0.999911110911593","@types":"Wikidata:Q515,Wikidata:Q486972,Schema:Place,Schema:City,DBpedia:Settlement,DBpedia:PopulatedPlace,DBpedia:Place,DBpedia:Location,DBpedia:City"},{"@percentageOfSecondRank":"0.0","@URI":"http:\/\/dbpedia.org\/resource\/NFIL3","@support":"8","@surfaceForm":"NFIL3","@offset":"250","@similarityScore":"1.0","@types":""},{"@percentageOfSecondRank":"0.15148998756814175","@URI":"http:\/\/dbpedia.org\/resource\/Epithelium","@support":"3046","@surfaceForm":"epithelium","@offset":"303","@similarityScore":"0.8684371449588663","@types":"Wikidata:Q4936952,DBpedia:AnatomicalStructure"},{"@percentageOfSecondRank":"0.007552002757489936","@URI":"http:\/\/dbpedia.org\/resource\/Mouse","@support":"4909","@surfaceForm":"mouse","@offset":"322","@similarityScore":"0.992433921441594","@types":""},{"@percentageOfSecondRank":"3.065339853568951E-4","@URI":"http:\/\/dbpedia.org\/resource\/Small_intestine","@support":"1396","@surfaceForm":"small intestine","@offset":"328","@similarityScore":"0.9996828833610166","@types":"Wikidata:Q4936952,DBpedia:AnatomicalStructure"}]}

*/
