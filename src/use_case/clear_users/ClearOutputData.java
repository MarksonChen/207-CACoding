package use_case.clear_users;

public class ClearOutputData {
    private final String[] names;

    public ClearOutputData(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }
}
