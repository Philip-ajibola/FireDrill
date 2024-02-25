package dairy;

import bank.AccountNotFoundException;

import java.util.ArrayList;

public class Dairies {

    private final ArrayList<Dairy> dairies = new ArrayList<>();

    public ArrayList<Dairy> getNumberOfDiaries() {
        return dairies;
    }

    public void add(String userName, String password) {
        Dairy dairy = new Dairy(userName,password);
        dairies.add(dairy);
    }

    public Dairy findByUserName(String userName) {
        Dairy expecctedDairy = null;
        for(Dairy dairy: dairies) if(userName.equals(dairy.getUserName())) expecctedDairy = dairy;
        if(expecctedDairy == null) throw new AccountNotFoundException("Diary not found");
        return expecctedDairy;
    }

    public void delete(String username, String password) {
        Dairy dairy = findByUserName(username);
        dairies.remove(dairy);
    }
}
