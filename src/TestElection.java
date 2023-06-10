import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestElection {
    public static void main(String[] args) {
        int arrayLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the array:"));
        Election[] elections = new Election[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            String candidate = JOptionPane.showInputDialog("Enter the name of candidate " + (i + 1) + ":");
            int numVotes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of votes for candidate " + (i + 1) + ":"));
            elections[i] = new Election(candidate, numVotes);
        }
        ArrayList<String> highVoteCandidates = new ArrayList<>();
        for (Election election : elections) {
            if (election.getNumVotes() >= 4000) {
                highVoteCandidates.add(election.getCandidate());
            }
        }
        StringBuilder message = new StringBuilder("Candidates with 4000 or more votes:\n");
        for (String candidate : highVoteCandidates) {
            message.append(candidate).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString());
        int totalVotes = 0;
        for (Election election : elections) {
            totalVotes += election.getNumVotes();
        }
        double highestPercentage = 0;
        String winner = "";
        System.out.println("Election Results:");
        System.out.println("##################");
        for (Election election : elections) {
            double percentage = (double) election.getNumVotes() / totalVotes * 100;
            System.out.println(election.toString() + ", Percentage: " + percentage + "%");
            if (percentage > highestPercentage) {
                highestPercentage = percentage;
                winner = election.getCandidate();
            }
        }
        System.out.println("##################");
        System.out.println("Total Votes: " + totalVotes);
        System.out.println("The winner of the election is: " + winner);
    }
}