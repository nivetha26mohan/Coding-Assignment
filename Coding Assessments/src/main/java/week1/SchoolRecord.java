package week1;

public class SchoolRecord {
	String schoolName;
	int schoolId;
	String schoolAddress;
	void addRecords(int schoolId,String schoolName,String schoolAddress) {
		System.out.println(schoolId+" "+schoolName+" "+schoolAddress);
	}
	void dispRecords() {
		System.out.println("Display School Records");
	}
}
