
public Round(String[] names) {
    competitorList = new ArrayList<Competitor>();
    for (int i = 0; i < names.length(); i++) {
        int rank = i + 1;
        competitorList.add(new Competitor(names[i], rank));
    }
}


public ArrayList<Match> buildMatches() {
    int size = competitorList1.size();
    ArrayList<Match> matchesList = new ArrayList<Match>();
    if (competitorList.size() % 2 == 0) {
        //even
        for (int i = 0; i < (competitorList.size()/2); i++) {
            Competitor competitor = competitorList.get(i);
            int worstIndex = size - 1 - i;

            Match m = Match(competitor, competitorList.get(worstIndex);

            matchesList.add(m);
        }
    }
    else {
        //odd
    ArrayList<Match> competitorList1 = new ArrayList<Match>();

	// create competitorlist1
	
for (int i = 0; i < competitorList.size(); i++) {
	competitorList1.add(competitorList.get(i));
}

        competitorList1.remove(0);
        int size = competitorList.size();
        for (int i = 0; i < (competitorList1.size()/2); i++) {
            Competitor competitor = competitorList1.get(i);
            int worstIndex = size - 1 - i;
            Match m = new Match(competitor, competitor.get(worstIndex));
            matchesList.add(m);
    }
return matchesList;
}