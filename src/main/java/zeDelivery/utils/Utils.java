package zeDelivery.utils;



import cucumber.api.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static zeDelivery.utils.BrowserDriver.getCurrentDriver;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 01:14
 */

public class Utils {

    public static void embeddImagesInReport(Scenario scenario) {
        try {
            File scrFile = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.FILE);
            byte[] data = FileUtils.readFileToByteArray(scrFile);
            scenario.embed(data, "image/png");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Tirar um Print em formato png da tela.
     * Lembre-se que arquivos de mesmo nome serão sobrescritos
     *
     * @param nomeArquivo Nome do print que sera feito;
     */
    public static void capturarScreenshot(String nomeArquivo, String plataforma) {

        if (plataforma.equalsIgnoreCase("web")) {
            if (!("".equals(nomeArquivo) || nomeArquivo == null)) {

                try {
                    File diretorio = new File("target/screenshots");
                    if (!diretorio.exists()) {
                        diretorio.mkdirs();
                    }

                    if (getCurrentDriver() != null) {
                        File arquivo = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.FILE);
                        File destFile = new File(diretorio + "/" + nomeArquivo + ".png");
                        FileUtils.copyFile(arquivo, destFile);
                    }

                } catch (IOException e) {
                    System.out.println("########  ERRO #######");
                }
            }
        } else if (plataforma.equalsIgnoreCase("mobile")) {
            if (!("".equals(nomeArquivo) || nomeArquivo == null)) {

                try {
                    File diretorio = new File("target/screenshots");
                    if (!diretorio.exists()) {
                        diretorio.mkdirs();
                    }

                    if (getCurrentDriver() != null) {
                        File arquivo = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.FILE);
                        File destFile = new File(diretorio + "/" + nomeArquivo + ".png");
                        FileUtils.copyFile(arquivo, destFile);
                    }

                } catch (IOException e) {
                    System.out.println("########  ERRO #######");
                }
            }
        }
    }

}
