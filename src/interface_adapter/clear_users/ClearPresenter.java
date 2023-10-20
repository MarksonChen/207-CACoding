package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.*;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData names) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearedNames(names.getNames());
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
        clearState.setClearedNames(null);
    }
}
