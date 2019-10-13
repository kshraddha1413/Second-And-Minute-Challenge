
public class Main {
	private static final String message="invalid value";

	public static void main(String[] args) {
     System.out.println(getDurationString(65, 45));
     System.out.println(getDurationString(232424l));
     System.out.println(getDurationString(-1,60));
	}
	public static String getDurationString(long minute,long seconds) {
		if((minute<0)||((seconds<0)&&(seconds>59))){
			
			return message;
		}
		long hour=minute/60;
        long reminingMinute=minute%60;
        String hourString=hour+"h";
        if(hour<10) {
        	hourString="0"+hourString;
        }
        String minuteString=minute+"m";
        if(minute<10) {
        	minuteString="0"+minuteString;
        }
        String secondString=seconds+"s";
        if(seconds<10) {
        	secondString="0"+secondString;
        }
        
        return hourString+""+minuteString+""+secondString+"";
	}

	public static String getDurationString(long seconds) {
		if (seconds<0) {
		return message;
	}
		long minutes=seconds/60;
		long reminingSeconds=minutes%60;
		return getDurationString(minutes,seconds);
	
}
}
