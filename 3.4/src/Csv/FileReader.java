package Csv;

import java.io.*;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileReader {
    public static void main(String[] args) throws ParseException {
        double averageTemperature = 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");  // Lisätään Tavoite päivämäärä oikeassa muodossa
        Date targetDate = dateFormat.parse("31.12.2022 23:58");
        Date EndDate = dateFormat.parse("01.01.2023 23:59");
        String[] columnNames = new String[0];
        ArrayList<String> data = new ArrayList<String>();
        boolean header = true;
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                if (line != null) {
                    if (header) {
                        //columnNames = line.split(";");
                        header = false;
                    } else {
                        String[] columns = line.split(";");
                            for (int i = 0; i < 2 && i < columns.length; i++) {
                                Date rowDate = dateFormat.parse(columns[0].trim());  // Laitetaan päivämäärät oikeaan muotoon
                                if (rowDate.after(targetDate) && rowDate.before(EndDate)) { // Valitaan ajat, jotka ovat tavoite ajan välissä
                                        //System.out.print(columnNames[i] + ": " + columns[i] + ", ");
                                        data.add(columns[1]);    // Lisätään Lämpötilat listaan

                            }
                        }
                    }
                }
            }
            for (String values : data) {
                String modifiedString = values.replace(",", ".");  //Muokataan tiedoston aika oikeaan muotoon
                averageTemperature += Double.parseDouble(modifiedString);  // Lisätään Double arvot lämpötilaan
            }
            System.out.println();
            System.out.println("Average temperature Between " + targetDate + " and " + EndDate + " is: " + averageTemperature/ data.size()); // Tulostetaan lämpötila


            reader.close();
            System.out.println(response.toString());
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}