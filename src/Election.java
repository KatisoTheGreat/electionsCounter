public class Election {
    private String candidate;
    private int numVotes;

    // Default constructor
    public Election() {
    }

    public Election(String nm, int nVotes) {
        candidate = nm;
        numVotes = nVotes;
    }

    public void setCandidate(String nm) {
        candidate = nm;
    }

    public void setNumVotes(int nVotes) {
        numVotes = nVotes;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public String getCandidate() {
        return candidate;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidate + ", Votes: " + numVotes;
    }
}
