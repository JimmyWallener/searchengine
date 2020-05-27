package se.gritacademy.search.model;

public class Model {
	
	private static String searchQ;
	final private static String searchString = "SELECT bearbase.name,bearbase.Origin,bearbase.Creator,bearbase.Notes FROM bearbase WHERE name REGEXP";
	
	final private static String bearBase = "SELECT bearbase.name,bearbase.Creator,bearbase.Origin,bearbase.Notes,null,null,null,null,null,null,null,null,null,null,null,null,null \r\n" + 
			"FROM bearbase WHERE bearbase.name REGEXP";
	final private static String ikeaNames = "SELECT ikea_names.name,ikea_names.description,ikea_names.Column_3,ikea_names.Column_4,ikea_names.Column_5,null,null,null,null,null,null,null,null,null,null,null,null\r\n" + 
			"FROM ikea_names WHERE ikea_names.name REGEXP";
	final private static String masters = "SELECT masterscplist.SCP,masterscplist.Title,masterscplist.rating,masterscplist.Classification,masterscplist.Type,\r\n" + 
			"masterscplist.Related_GOI_s,masterscplist.Location_Notes,masterscplist.Author,masterscplist.Leaked_info,masterscplist.Humanoid_or_Structure,\r\n" + 
			"masterscplist.Animal_Computer_or_Extradimensional,masterscplist.Autonomous_or_Cognitohazard,masterscplist.Artifact_Location_or_Sentient,\r\n" + 
			"masterscplist.Summary,masterscplist.Gender,masterscplist.None,masterscplist.Ethnicity_Origins\r\n" + 
			"FROM masterscplist WHERE masterscplist.SCP REGEXP";
	final private static String union = "UNION ALL";
	
	
	
	public static String getSearchQ() {
		return searchQ;
	}

	public static void setSearchQ(String searchQ) {
		Model.searchQ = searchQ;
	}

	public static String getSearchstring() {
		return searchString;
	}

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
