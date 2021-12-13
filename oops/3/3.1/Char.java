class Char implements S{
	
	public String filter(String str){

		str = str.replaceAll("[^a-zA-Z]","");
		return str;


	}

}