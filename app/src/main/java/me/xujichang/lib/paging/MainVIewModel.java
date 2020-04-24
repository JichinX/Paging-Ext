package me.xujichang.lib.paging;

import androidx.lifecycle.ViewModel;

import me.xujichang.lib.paging_ext.PagedLists;

public class MainVIewModel extends ViewModel {

    public MainVIewModel() {
        PagedLists.createLivePagedList();
        PagedLists.createRxPagedList();
    }
}
