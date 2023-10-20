package interface_adapter.clear_users;

public class ClearState {
    private String[] names = null;
    public void setClearedNames(String[] names) {
        this.names = names;
    }
    public String[] getNames() {
        return names;
    }
}
