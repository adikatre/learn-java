
public Round(String[] names) {
    for (int i = 0; i < names.length(); i++) {
        int rank = i + 1
        competitorList.add(Competitor(names[i], rank))
    }
}


public ArrayList<Match> buildMatches() {
    ArrayList<Match> matchesList = new ArrayList<Match>();
    if (competitorList.size() % 2).equals(0) {
        //even
        for (int i = 0; i < (competitorList.size()/2); i++) {
            String competitor = competitorList.get(i);
            int worstIndex = (i + 1)*(-1);

            Match m = Match(competitor, competitor[worstIndex]);

            matchesList.add(m);
        }
    }
    else {
        //odd
        competitorList.remove(0);
        for (int i = 0; i < (competitorList.size()/2); i++) {
            String competitor = competitorList.get(i);
            int worstIndex = (i + 1)*(-1);

            Match m = Match(competitor, competitor[worstIndex]);

            matchesList.add(m);

    }
}
