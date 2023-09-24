package config;

public static void main(String[] args) throws InterruptedException, IOException {
	readPropertiesFile();
}

public static void readPropertiesFile() throws IOException  {
	
	Properties prop=new Properties();
	FileInputStream fis= new FileInputStream("D:\\workspace\\Learningproject\\src\\main\\java\\config\\config.properties");
    prop.load(fis);
   
System.out.println(prop.get("username"));


}


