package com.juaracoding.TestOrangeHrm.util;

//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GlobalFunction {

    public static int testCount = 0;
    public static int countOutline = 1;
    public static String rootProject = System.getProperty("user.dir");
    public static String extendReportName = "Ujian6";
//    public static DataGenerator dataGenerator ;
    public static Random random;

    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
                +screenshotName+"_"+dateName+".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }



//    public static void dropDownlist(WebDriver driver, String strXpath){
//        List<WebElement> d =driver.findElements(By.xpath(strXpath));
//        Iterator<WebElement> itr = d.iterator();
//
//        int intIter = 1;
//        String value = "";
//        while (itr.hasNext()){
//            WebElement element = itr.next();
//            value = element.getText();
//            System.out.println("Element get Text : "+value);
//        }
//    }

    /** ini untuk konfigurasi di seluruh step */
    public static  void delay(int intDetik){
        if(Constants.GLOB_PARAM_DELAY.equalsIgnoreCase("y")){
            try {
                Thread.sleep(intDetik*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /** ini untuk proses Asyncronous */
    public static void delay(int intDetik,String strNull){
        try {
            Thread.sleep(intDetik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /** Fungsional OCR mengubah image yang berisi text menjadi String */
//    public static String generateTextOCR(String pathFile){
//        String result = "";
//        try {
//            File image = new File(pathFile);
//            Tesseract tesseract = new Tesseract();
//            /** arahkan ke tessa data folder OCR nya */
//            tesseract.setDatapath("D:\\tessa\\tessdata-3.04.00");
//            tesseract.setLanguage("eng");
//            tesseract.setPageSegMode(1);
//            tesseract.setOcrEngineMode(1);
//            result = tesseract.doOCR(image);
//        } catch (TesseractException e) {
//            System.out.println(e.getMessage());
//        }
//        return result;
//    }

    /** melakukan pengecekan apakah folder telah dibuat atau belum, jika belum otomatis akan terbuat */
    public static void checkAndCreateDirectory(String path){
        File theDir = new File(path);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }

    /** melakukan download file dari url
     Parameter targetDirectory harus berbentuk Path + penamaan file
     */
    public static void downloadImage(String sourceUrl, String targetDirectory)
    {
        try {
            URL website = new URL(sourceUrl);
            ReadableByteChannel rbc;
            rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(targetDirectory);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

//    public static DataGenerator getDataGenerator(){
//        if(dataGenerator==null){
//            dataGenerator = new DataGenerator();
//        }
//        return dataGenerator;
//    }

    public static String getFilePathInResources(String pathToFile) {
        return System.getProperty("user.dir")+"\\src\\main\\resources" + pathToFile;
    }

    //       for (int i = 0; i < pendaftaranSendiriPageHadirAdmin.getSerchByList().size(); i++) {
//            if (pendaftaranSendiriPageHadirAdmin.getSerchByList().get(i).equalsIgnoreCase("nik")){
////                pendaftaranSendiriPageHadirAdmin.getSerchByListWebElement().get(i).click();
////                extentTest.log(LogStatus.PASS, "TRUMP022 Pengaturan Search Berdasarkan Nik");
////                break;
//            }else if(!pendaftaranSendiriPageHadirAdmin.getSerchByList().get(i).equalsIgnoreCase("nik") && !pendaftaranSendiriPageHadirAdmin.getSerchByList().get(i).equalsIgnoreCase("nama")){
//                extentTest.log(LogStatus.FAIL, "TRUMP022 Pengaturan Search Berdasarkan Nik");
//                break;
//            }else {
//                //pendaftaranSendiriPageHadirAdmin.getSerchByListWebElement().get(i).click();
//                extentTest.log(LogStatus.PASS, "TRUMP022 Pengaturan Search Berdasarkan Nik");
//                break;
    //           }
    //       }


}