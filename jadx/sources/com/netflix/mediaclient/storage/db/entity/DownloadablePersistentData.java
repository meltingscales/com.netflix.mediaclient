package com.netflix.mediaclient.storage.db.entity;

/* loaded from: classes4.dex */
public class DownloadablePersistentData {
    public final String mDownloadableId;
    public boolean mIsComplete = false;
    public long mSizeOfDownloadable;

    public DownloadablePersistentData(String str, long j) {
        this.mDownloadableId = str;
        this.mSizeOfDownloadable = j;
    }
}
