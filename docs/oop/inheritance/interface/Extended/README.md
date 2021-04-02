# Extending Interfaces

An interface can extend another interface in the same way that a class can extend another class. The extends keyword is used to extend an interface, and the child interface inherits the methods of the parent interface.

The following Sports interface is extended by Hockey and Football interfaces.
Example

        // Filename: Sports.java
        public interface Sports {
        public void setHomeTeam(String name);
        public void setVisitingTeam(String name);
        }

        // Filename: Football.java
        public interface Football extends Sports {
        public void homeTeamScored(int points);
        public void visitingTeamScored(int points);
        public void endOfQuarter(int quarter);
        }

        // Filename: Hockey.java
        public interface Hockey extends Sports {
        public void homeGoalScored();
        public void visitingGoalScored();
        public void endOfPeriod(int period);
        public void overtimePeriod(int ot);
        }

The Hockey interface has four methods, but it inherits two from Sports; thus, a class that implements Hockey needs to implement all six methods. Similarly, a class that implements Football needs to define the three methods from Football and the two methods from Sports.