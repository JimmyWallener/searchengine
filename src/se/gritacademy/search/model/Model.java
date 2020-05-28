package se.gritacademy.search.model;

public class Model {
	
	private static String searchQ;
	//final private static String searchString = "SELECT bearbase.name,bearbase.Origin,bearbase.Creator,bearbase.Notes FROM bearbase WHERE name REGEXP";
	
	final private static String bearBase = "SELECT bearbase.names,bearbase.Creator,bearbase.Origin,bearbase.Notes,delimiter,null,null,null,null,null,null,null,null,null,null,null,null,null " + 
											"FROM bearbase "
											+ "WHERE bearbase.names LIKE ? OR bearbase.Origin LIKE ? OR bearbase.Creator LIKE ? OR bearbase.Notes LIKE ?";
	
			
	final private static String ikeaNames = "SELECT ikea_names.name,ikea_names.description,ikea_names.Column_3,ikea_names.Column_4,ikea_names.Column_5,delimiter,null,null,null,null,null,null,null,null,null,null,null,null " + 
											"FROM ikea_names "
											+ "WHERE ikea_names.name LIKE ? OR ikea_names.description LIKE ? OR ikea_names.Column_3 LIKE ? OR ikea_names.Column_4 LIKE ? OR ikea_names.Column_5 LIKE ?";
	final private static String masters = "SELECT masterscplist.SCP,masterscplist.Title,masterscplist.rating,masterscplist.Classification,masterscplist.Type," + 
											"masterscplist.Related_GOI_s,masterscplist.Location_Notes,masterscplist.Author,masterscplist.Leaked_info,masterscplist.Humanoid_or_Structure," + 
											"masterscplist.Animal_Computer_or_Extradimensional,masterscplist.Autonomous_or_Cognitohazard,masterscplist.Artifact_Location_or_Sentient," + 
											"masterscplist.Summary,masterscplist.Gender,masterscplist.None,masterscplist.Ethnicity_Origins,delimiter " + 
											"FROM masterscplist " + 
											"WHERE masterscplist.SCP LIKE ? OR masterscplist.Title LIKE ? OR masterscplist.rating LIKE ? OR masterscplist.Classification LIKE ? OR masterscplist.Type LIKE ? OR " + 
											"masterscplist.Related_GOI_s LIKE ? OR masterscplist.Location_Notes LIKE ? OR masterscplist.Author LIKE ? OR masterscplist.Leaked_info LIKE ? OR masterscplist.Humanoid_or_Structure LIKE ? OR " + 
											"masterscplist.Animal_Computer_or_Extradimensional LIKE ? OR masterscplist.Autonomous_or_Cognitohazard LIKE ? OR masterscplist.Artifact_Location_or_Sentient LIKE ? OR " + 
											"masterscplist.Summary LIKE ? OR masterscplist.Gender LIKE ? OR masterscplist.None LIKE ? OR masterscplist.Ethnicity_Origins LIKE ?";
	final private static String union = "UNION ALL";
	
	
	
	
	public static String getSearchQ() {
		return searchQ;
	}

	public static void setSearchQ(String searchQ) {
		Model.searchQ = searchQ;
	}

	/*
	 * public static String getSearchstring() { return searchString; }
	 */

	public static String getBearbase() {
		return bearBase;
	}

	public static String getIkeanames() {
		return ikeaNames;
	}

	public static String getMasters() {
		return masters;
	}

	public static String getUnion() {
		return union;
	}

	
	

}
