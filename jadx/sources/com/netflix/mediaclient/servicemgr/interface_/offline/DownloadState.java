package com.netflix.mediaclient.servicemgr.interface_.offline;

/* loaded from: classes4.dex */
public enum DownloadState {
    Unknown(0),
    Creating(1),
    InProgress(2),
    Stopped(3),
    Complete(4),
    Deleted(5),
    DeleteComplete(6),
    CreateFailed(7);
    
    private final int i;

    public static boolean a(DownloadState downloadState) {
        return downloadState == DeleteComplete || downloadState == Deleted;
    }

    public int b() {
        return this.i;
    }

    DownloadState(int i) {
        this.i = i;
    }

    public static DownloadState d(int i) {
        DownloadState[] values;
        for (DownloadState downloadState : values()) {
            if (downloadState.b() == i) {
                return downloadState;
            }
        }
        return Unknown;
    }
}
