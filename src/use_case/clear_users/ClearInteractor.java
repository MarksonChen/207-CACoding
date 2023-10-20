package use_case.clear_users;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    public void execute(ClearInputData clearInputData) {
        String[] names = userDataAccessObject.clearAllUsers();
        userPresenter.prepareSuccessView(new ClearOutputData(names));
    }
}
