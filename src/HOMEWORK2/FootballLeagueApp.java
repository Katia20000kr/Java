
package HOMEWORK2;

import java.util.ArrayList;
import java.util.Scanner;

public class FootballLeagueApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Elbonia Football League ---");
            System.out.println("1. Add Game");
            System.out.println("2. Team Performance");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter home team: ");
                    String home = scanner.nextLine();

                    System.out.print("Enter away team: ");
                    String away = scanner.nextLine();

                    System.out.print("Enter home score: ");
                    int homeScore = scanner.nextInt();

                    System.out.print("Enter away score: ");
                    int awayScore = scanner.nextInt();
                    scanner.nextLine();

                    games.add(new Game(home, away, homeScore, awayScore));
                    System.out.println("Game added.");
                    break;

                case 2:
                    System.out.print("Enter team name: ");
                    String team = scanner.nextLine();
                    int wins = 0, losses = 0, draws = 0;

                    for (Game game : games) {
                        if (game.getHomeTeam().equalsIgnoreCase(team)) {
                            if (game.getHomeScore() > game.getAwayScore()) wins++;
                            else if (game.getHomeScore() < game.getAwayScore()) losses++;
                            else draws++;
                        } else if (game.getAwayTeam().equalsIgnoreCase(team)) {
                            if (game.getAwayScore() > game.getHomeScore()) wins++;
                            else if (game.getAwayScore() < game.getHomeScore()) losses++;
                            else draws++;
                        }
                    }

                    System.out.println("Performance of " + team + ":");
                    System.out.println("Wins: " + wins);
                    System.out.println("Losses: " + losses);
                    System.out.println("Draws: " + draws);
                    break;

                case 0:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
