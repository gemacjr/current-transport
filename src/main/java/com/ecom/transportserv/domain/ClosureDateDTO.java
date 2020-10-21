package com.ecom.transportserv.domain;

import java.util.ArrayList;

public class ClosureDateDTO {

    private ArrayList<AccountPreferenceDataList> accountPreferenceDataLists;
    private int pageNumber;
    private int pageSize;
    private int totalRecords;

    public ClosureDateDTO(ArrayList<AccountPreferenceDataList> accountPreferenceDataLists, int pageNumber, int pageSize, int totalRecords) {
        this.accountPreferenceDataLists = accountPreferenceDataLists;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalRecords = totalRecords;
    }

    public ArrayList<AccountPreferenceDataList> getAccountPreferenceDataLists() {
        return accountPreferenceDataLists;
    }

    public void setAccountPreferenceDataLists(ArrayList<AccountPreferenceDataList> accountPreferenceDataLists) {
        this.accountPreferenceDataLists = accountPreferenceDataLists;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }
}

