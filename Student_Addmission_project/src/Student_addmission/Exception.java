package Student_addmission;

 class StudentException extends RuntimeException {
	    String invalidNameException() {
			return "Wrong Type NAME should Be In Range 20<name>4";}
	    String invalidGenderException() {
			return "Wrong Type GENDR should Be In MALE ,FEMALE & OTHER";}
	    String invalidAddressException() {
	    	return "Wrong Type ADDRESS should Be In Range 40<name>10";}
		String invalidMobileNoException() {
			return "Wrong Type MOBILE_NO should Be In Range 40<name>10";}
}
