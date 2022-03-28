

public class Lab2q3 {
 public static void main(String[] args) {
	
	 
	 long totalMiliseconds= System.currentTimeMillis();
	 long totalSeconds=totalMiliseconds/1000;
	 
	 long currentSeconds= totalSeconds%60;
	 long totalMinutes= totalSeconds/60;
	 long currentMinutes=totalMinutes%60;
	 
	 long totalHours=totalMinutes/60;
	 long currentHour=(totalHours%24)+8;
	 
	 System.out.println("Current time is "+ currentHour+":"+currentMinutes+":"+currentSeconds+"GMT");
	 
	 
	 
	 
}
	 
 
 


}
