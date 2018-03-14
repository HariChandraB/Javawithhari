package Arrays;

public class ApartmentComplex {

	public static void main(String[] args) {
		String resName1_Hari;
		String resName2_Chandra;
		String resName3_Prasad;
		long flatNo1_1031;
		long flatNo2_1032;
		long flatNo3_1033;
		int parkingLot1_101;
		int parkingLot2_102;
		int parkingLot3_103;

		String[] resName = new String[3];
		long[] flatNo = new long[3];
		int[] parkingLot = new int[3];
		resName[0] = "Hari";
		flatNo[0] = 1031;
		flatNo[2] = 1033;
		parkingLot[0] = 101;
		parkingLot[2] = 103;
		System.out.println("Resident Name:" + resName[0] + "\nResident Flat No:" + flatNo[0]
				+ "\nResident Parking Lot No:" + parkingLot[0]);

	}

}
