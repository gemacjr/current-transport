package com.ecom.transportserv.domain;

public class AccountPreferenceDataList {

    private String preference;
    private String key;
    private String lastUpdatedBy;
    private String createdBy;
    private String createTimeStamp;
    private String lastUpdateTimeStamp;

    public AccountPreferenceDataList(String preference, String key, String lastUpdatedBy, String createdBy, String createTimeStamp, String lastUpdateTimeStamp) {
        this.preference = preference;
        this.key = key;
        this.lastUpdatedBy = lastUpdatedBy;
        this.createdBy = createdBy;
        this.createTimeStamp = createTimeStamp;
        this.lastUpdateTimeStamp = lastUpdateTimeStamp;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public String getLastUpdateTimeStamp() {
        return lastUpdateTimeStamp;
    }

    public void setLastUpdateTimeStamp(String lastUpdateTimeStamp) {
        this.lastUpdateTimeStamp = lastUpdateTimeStamp;
    }
}
