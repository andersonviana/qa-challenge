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
        // Create Report_Builder Object
        ReportBuilder reportBuilder = new com.rajatthareja.reportbuilder.ReportBuilder();

        reportBuilder.setReportDirectory("target/report/");


        // Set output report_doc file name
        reportBuilder.setReportFileName(dateFormatFile.format(date) + "_TestReport");

        // Set Report Title
        reportBuilder.setReportTitle("<img src=\'https://i.ibb.co/vh0JrZy/drozzlogo.png'>");

        // Set Report Color for more visit http://materializecss.com/color.html
        reportBuilder.setReportColor(String.valueOf(Color.ORANGE));

        // Enable voice control for report_doc
        reportBuilder.enableVoiceControl();

        // Add additional info for Report
        reportBuilder.setAdditionalInfo("Company", "DROZ");
        reportBuilder.setAdditionalInfo("Date", dateFormat.format(date));


        // Create list or report_doc Files or Directories or URLs or JSONObject or JSONString
        List<Object> cucumberJsonReports = new ArrayList<>();
        cucumberJsonReports.add(new File("target/report/cucumber.json"));
        cucumberJsonReports.add(new File("target/report/"));

        // Build your report_doc
        reportBuilder.build(cucumberJsonReports);
    }

    public enum Color {

        //        ORANGE("orange lighten-4");
//        ORANGE("b3e5fc light-blue lighten-4");
        ORANGE("green");


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
