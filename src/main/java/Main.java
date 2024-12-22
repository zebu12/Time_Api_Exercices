import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------");
        /*
         * Exercise 1:
         * Create a LocalDate of the current day and print it out
         */
        LocalDate myLocateDate = LocalDate.now();
        System.out.println(myLocateDate);

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise2:
         * Create a LocalDate of the current day and print it out in the following pattern using
         * DateTimeFormatter: Thursday 29 march.
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd MMM.");
        String formattedDate = myLocateDate.format(formatter);
        System.out.println("Today date is: "+formattedDate);

        System.out.println("-------------------------------------------------------------------------");


        /*
         * Exercise3:
         * Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
         * format.
         */
        LocalDate today = LocalDate.now();

        LocalDate lastMonday = today.with(DayOfWeek.MONDAY);
        if (today.getDayOfWeek() != DayOfWeek.MONDAY) {
            lastMonday = lastMonday.minusWeeks(1);
        }
        System.out.println("Week starting from last Monday: ");
        for(int i = 0; i < 7; i++){
            LocalDate currentDay = lastMonday.plusDays(i);
            System.out.println(currentDay);
        }

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 4:
         * Create a LocalDate object from a String by using the .parse() method.
         */
        String dateString = "2024-12-22";
        LocalDate date = LocalDate.parse(dateString);
        System.out.println(date);

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise5
         * The date time api provides enums for time units such as day and month.
         * Create a LocalDate of your birthday and extract the day of week for that date.
         *         Ex. 1945-05-08 -> TUESDAY
         */
        LocalDate myDate = LocalDate.of(2008, 10, 18); // Replace actual birthdate

        DayOfWeek dayOfWeek = myDate.getDayOfWeek(); // Extract the day of the week
        System.out.println(myDate+" -> "+dayOfWeek);



        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise6
         * Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the
         * month and print it out.
         */
        LocalDate currentDate = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println(currentDate.minusMonths(1));


        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise7
         * Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
         * the date from exercise 5. Print out the elapsed years, months and days.
         */
        LocalDate birthdate = LocalDate.of(1981,1,2);
        Period birthPeriod = Period.between(birthdate,currentDate);

        // Get the elapsed years, months and days
        int years = birthPeriod.getYears();
        int months = birthPeriod.getMonths();
        int days = birthPeriod.getDays();

        System.out.println(birthdate+" "+currentDate);
        System.out.println(years+" "+months+" "+days);




        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 8
         * Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add
         * the period you created to the current date.
         */
        LocalDate currentDate1 = LocalDate.now().plusYears(4)
                .plusMonths(7).plusDays(29);
        System.out.println(currentDate1);

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 9
         * Create a LocalTime object of the current time.
         */
        LocalTime currentTime1 = LocalTime.now();
        System.out.println(currentTime1);

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 10
         * Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
         */
        System.out.println(currentTime1.getNano());

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 11
         * Create a LocalTime object from a String using the .parse() method.
         */
        LocalTime currentTime2 = LocalTime.parse("10:15:45");
        System.out.println(currentTime2);


        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 12
         * Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
         * 10:32:53
         */
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime2 = currentTime1.format(formatter2);
        System.out.println(formattedTime2);

        System.out.println("-------------------------------------------------------------------------");

        /*
         *  Exercise 13
         *  Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00
         */
        LocalDateTime myLocalDateTime = LocalDateTime.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm");
        System.out.println(myLocalDateTime.format(formatter3));

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 14
         * Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String that should
         * look like this: thursday 5 april 10:00
         */
        formatter3 = DateTimeFormatter.ofPattern("E dd MMM HH:mm");
        System.out.println(myLocalDateTime.format(formatter3));

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 15
         * Create a LocalDateTime object by combining LocalDate object and LocalTime object.
         */
        LocalDate dateLocal = LocalDate.now();
        LocalTime timeLocal = LocalTime.now();
        System.out.println(dateLocal+" "+timeLocal);

        System.out.println("-------------------------------------------------------------------------");

        /*
         * Exercise 16
         * Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate
         * objects of respective types from the LocalDateTime object.
         */
        LocalDateTime combinedDateTime = LocalDateTime.now();
        LocalDate date1 = combinedDateTime.toLocalDate();
        LocalTime time1 = combinedDateTime.toLocalTime();

        System.out.println(date1+" "+time1);



        System.out.println("-------------------------------------------------------------------------");

        /*
         * Extra challenge
         * Create your own calendar for the year 2018.
         */


        System.out.println("-------------------------------------------------------------------------");


    }
}
