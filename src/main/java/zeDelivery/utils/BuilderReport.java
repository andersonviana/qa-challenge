package zeDelivery.utils;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rajatthareja.reportbuilder.ReportBuilder;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 22/03/2020 22:23
 */
public class BuilderReport {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static DateFormat dateFormatFile = new SimpleDateFormat("dd-M-yyyy");
    private static Date date = new Date();

    public static void main(String... args) {

        ReportBuilder reportBuilder = new com.rajatthareja.reportbuilder.ReportBuilder();
        reportBuilder.setReportDirectory("target/report/");
        reportBuilder.setReportFileName(dateFormatFile.format(date) + "_TestReport");
        reportBuilder.setReportTitle("<img src=\'https://i.ibb.co/1JWYkVc/logozedelivery.png'>");

        // Set Report Color for more visit http://materializecss.com/color.html
        reportBuilder.setReportColor(String.valueOf(Color.BLUE));
        // Enable voice control for report_doc
        reportBuilder.disableVoiceControl();

        // Add additional info for Report
        reportBuilder.setAdditionalInfo("Company", "Zé");
        reportBuilder.setAdditionalInfo("Date", dateFormat.format(date));
        reportBuilder.setAdditionalInfo("QA", "<b></i> " + System.getProperty("user.name") + " </i></b>");
        reportBuilder.setAdditionalInfo("Team", "Engeering ZéDelivery");
        reportBuilder.setAdditionalInfo("Projeto","qachallenge");
        reportBuilder.setAdditionalInfo("Channel Slack", "#ZeDelivery");
        reportBuilder.setAdditionalInfo("Java Version", System.getProperty("java.version"));
        // Create list or report_doc Files or Directories or URLs or JSONObject or JSONString
        List<Object> cucumberJsonReports = new ArrayList<>();
        cucumberJsonReports.add(new File("target/report/cucumber.json"));
        cucumberJsonReports.add(new File("target/report/"));
        // Build your report_doc
        reportBuilder.build(cucumberJsonReports);
    }

    public enum Color {
        BLUE("blue");

        private final String color;
        /**
         * @param color for report_doc
         */
        Color(final String color) {
            this.color = color;
        }
        @Override
        public String toString() {
            return color.toLowerCase();
        }
    }
}
