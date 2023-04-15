import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";
        
        int year;
        while (true){
            System.out.print("Input a year: ");
            year = scanner.nextInt();
            if (year >= 0){
                break;
            }
        }
        
        scanner.nextLine(); //to get out of nextInt and read nextLine

        String month;
        while (true){
            System.out.print("Input a month number: ");

            month = scanner.nextLine(); 
            if ((month.equals("1")) || (month.equals("January")) || (month.equals("Jan")) || (month.equals("Jan."))){
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            } else if ((month.equals("2")) || (month.equals("February")) || (month.equals("Feb")) || (month.equals("Feb."))){
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            } else if ((month.equals("3")) || (month.equals("March")) || (month.equals("Mar")) || (month.equals("Mar."))){
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            } else if ((month.equals("4")) || (month.equals("April")) || (month.equals("Apr")) || (month.equals("Apr."))){
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            } else if ((month.equals("5")) || (month.equals("May")) || (month.equals("May."))){
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            } else if ((month.equals("6")) || (month.equals("June")) || (month.equals("Jun")) || (month.equals("Jun."))){
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            } else if ((month.equals("7")) || (month.equals("July")) || (month.equals("Jul")) || (month.equals("Jul."))){
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            } else if ((month.equals("8")) || (month.equals("August")) || (month.equals("Aug")) || (month.equals("Aug."))){
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            } else if ((month.equals("9")) || (month.equals("September")) || (month.equals("Sep")) || (month.equals("Sep."))){
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            } else if ((month.equals("10")) || (month.equals("October")) || (month.equals("Oct")) || (month.equals("Oct."))){
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            } else if ((month.equals("11")) || (month.equals("November")) || (month.equals("Nov")) || (month.equals("Nov."))){
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            } else if ((month.equals("12")) || (month.equals("December")) || (month.equals("Dec")) || (month.equals("Dec."))){
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
                break;
            } 
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
        scanner.close();
    }
}
