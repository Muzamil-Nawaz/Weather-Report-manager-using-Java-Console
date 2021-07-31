package weatherreport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class WeatherReport {
    public static void main(String[] args) {
        try{
            ArrayList<WeatherRecord> list = new ArrayList<>();
            File f = new File("G:\\Netbeans Project\\WeatherReport\\src\\weatherreport\\report.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            s=br.readLine();
            while(s!=null){
                String []ss = s.split(",");
                WeatherRecord wr = new WeatherRecord();
                wr.setCondition(ss[0]);
                wr.setDate(ss[1]);
                wr.setDayOfWeek(ss[2]);
                wr.setHighTemp(Double.parseDouble(ss[3]));
                wr.setHumidity((int)Double.parseDouble(ss[4]));
                wr.setLowTemp(Double.parseDouble(ss[5]));
                wr.setPressure(Double.parseDouble(ss[6]));
                wr.setSeaLevel(ss[7]);
                wr.setStationId(Integer.parseInt(ss[8]));
                wr.setWindDegeree((int)Double.parseDouble(ss[9]));
                wr.setWindSpeed(Double.parseDouble(ss[10]));
                list.add(wr);
                s = br.readLine();
            }
            String date = list.get(0).date;
            int count=0;
            double sumofhtp=0,sumofltp=0,sumofhumidity=0,sumofpressure=0,sumofwDegree=0,sumofwSpeed=0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).date.equalsIgnoreCase(date)){
                    sumofhtp+=list.get(i).highTemp;
                    sumofltp+=list.get(i).lowTemp;
                    sumofpressure+=list.get(i).pressure;
                    sumofwDegree+=list.get(i).windDegree;
                    sumofwSpeed += list.get(i).windSpeed;
                    sumofhumidity += list.get(i).humidity;
                    count++;
                }
                else{
                    System.out.println("Average Calculations for "+date+" and StationId "+list.get(i-1).stationId+" => HighTemp:"+sumofhtp/count+",LowTemp:"+sumofltp/count+",Humidity:"+sumofhumidity/count
                    +",Pressure :"+sumofpressure/count+",Wind Degree:"+sumofwDegree/count+",Wind Speed:"+sumofwSpeed/count+", Total Readings :"+count);
                    date = list.get(i).date;
                    sumofhtp =list.get(i).highTemp;
                    sumofltp = list.get(i).lowTemp;
                    sumofpressure = list.get(i).pressure;
                    sumofhumidity = list.get(i).humidity;
                    sumofwDegree = list.get(i).windDegree;
                    sumofwSpeed = list.get(i).windSpeed;
                    count=1;
                }
            }
            System.out.println(list.size());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
