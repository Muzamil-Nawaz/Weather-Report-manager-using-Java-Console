/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherreport;

/**
 *
 * @author ADMIN
 */
public class WeatherRecord {
    String condition,date,dayOfWeek,seaLevel;
    double lowTemp,highTemp,windSpeed,pressure;
    int windDegree,stationId,humidity;
    public void setCondition(String c){
        this.condition =c;
    }
    
    public void setDate(String d){
        this.date = d;
    }
    public void setDayOfWeek(String dow){
        this.dayOfWeek = dow;
    }
    public void setSeaLevel(String s){
        this.seaLevel =s;
    }
    public void setStationId(int a){
        this.stationId =a;
    }
    public void setHighTemp(double ht){
        this.highTemp  = ht;
    }
    public void setLowTemp(double lt){
        this.lowTemp = lt;
    }
    public void setWindSpeed(double ws){
        this.windSpeed = ws;
    }
    public void setPressure(double p){
        this.pressure = p;
    }
    public void setHumidity(int h){
        this.humidity = h;
    }
    public void setWindDegeree(int wd){
        this.windDegree =wd;
    }
    public String toString(){
        return "[Condition:"+condition+",Date:"+date+",DayOfWeek:"+dayOfWeek+",HighTemp:"+highTemp+",Humidity:"+humidity+",LowTemo:"+lowTemp+",Pressure:"
                +pressure+",SeaLevel:"+seaLevel+",StationId:"+stationId+",WindDegree:"+windDegree+",WindSpeed:"+windSpeed;
    }
    
}
