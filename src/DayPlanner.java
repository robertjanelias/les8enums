// DayPlanner class
public class DayPlanner {
    public void scheduleForDay(DayOfWeek day) {
        switch (day) {
            case MONDAY:
                System.out.println("Monday: Meeting at 9:00 AM");
                break;
            case TUESDAY:
                System.out.println("Tuesday: Gym session at 6:00 PM");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday: Dinner with friends at 7:00 PM");
                break;
            case THURSDAY:
                System.out.println("Thursday: Movie night at 8:00 PM");
                break;
            case FRIDAY:
                System.out.println("Friday: Coding practice at 10:00 AM");
                break;
            case SATURDAY:
                System.out.println("Saturday: Hiking trip all day");
                break;
            case SUNDAY:
                System.out.println("Sunday: Relaxing day at home");
                break;
        }
    }

    public static void main(String[] args) {
        // Create an instance of DayPlanner
        DayPlanner planner = new DayPlanner();

        // Schedule tasks for each day of the week
        planner.scheduleForDay(DayOfWeek.MONDAY);
        planner.scheduleForDay(DayOfWeek.TUESDAY);
        planner.scheduleForDay(DayOfWeek.WEDNESDAY);
        planner.scheduleForDay(DayOfWeek.THURSDAY);
        planner.scheduleForDay(DayOfWeek.FRIDAY);
        planner.scheduleForDay(DayOfWeek.SATURDAY);
        planner.scheduleForDay(DayOfWeek.SUNDAY);

        System.out.println(DayOfWeek.MONDAY);
    }
}
