package mystuff;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStuff myStuff = new MyStuff();
		myStuff.deviceBrand = "LG";
		myStuff.modelName = "V10";
		myStuff.phoneSizeCM = 89.6;
		myStuff.cameraMegapixel = 16;
		myStuff.pixelPerInchDensity = 515;
		myStuff.storageGB = 64;
		myStuff.memoryRamGB = 4;
		myStuff.battery = 3000;
		myStuff.supportsAndroidVersion9 = false;
		
		MyStuff myStuff2 = new MyStuff();
		myStuff2.deviceBrand = "Samsung";
		myStuff2.modelName = "Galaxy Note10+";
		myStuff2.phoneSizeCM = 114.0;
		myStuff2.cameraMegapixel = 12;
		myStuff2.pixelPerInchDensity = 498;
		myStuff2.storageGB = 256;
		myStuff2.memoryRamGB = 12;
		myStuff2.battery = 4300;
		myStuff2.supportsAndroidVersion9 = true;
		
		MyStuff myStuff3 = new MyStuff();
		myStuff3.deviceBrand = "Sony";
		myStuff3.modelName = "Xperia XZ3";
		myStuff3.phoneSizeCM = 92.9;
		myStuff3.cameraMegapixel = 19;
		myStuff3.pixelPerInchDensity = 537;
		myStuff3.storageGB = 64;
		myStuff3.memoryRamGB = 6;
		myStuff3.battery = 3300;
		myStuff3.supportsAndroidVersion9 = true;
		
		System.out.println(myStuff2.pixelPerInchDensity);
	}

}
