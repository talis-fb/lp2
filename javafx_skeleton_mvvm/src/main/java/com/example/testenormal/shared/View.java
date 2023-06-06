package com.example.testenormal.shared;

public abstract class View<ViewModel> {
    private ViewModel viewModel = null;

    public ViewModel getModel() {
        return viewModel;
    }

    public void setViewModel(ViewModel viewModel) {
       this.viewModel = viewModel;
    }
}
