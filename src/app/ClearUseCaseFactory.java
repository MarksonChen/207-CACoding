package app;

import data_access.FileUserDataAccessObject;
import interface_adapter.ViewManagerModel;
import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.logged_in.LoggedInViewModel;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearInteractor;

public class ClearUseCaseFactory {

    private ClearUseCaseFactory() {}

    public static ClearController create(ClearViewModel clearViewModel, FileUserDataAccessObject userDataAccessObject) {
        ClearInteractor clearInteractor = new ClearInteractor(userDataAccessObject, new ClearPresenter(clearViewModel));
        ClearController clearController = new ClearController(clearInteractor);

        return clearController;
    }
}
