package com.netflix.mediaclient.servicemgr.interface_.offline;

/* loaded from: classes4.dex */
public enum StopReason {
    Unknown(0, false),
    WaitingToBeStarted(1, false),
    NetworkError(2, true),
    StorageError(3, true),
    NotEnoughSpace(4, true),
    StoppedFromAgentAPI(5, false),
    NotAllowedOnCurrentNetwork(6, false),
    NoNetworkConnectivity(7, false),
    NotAllowedOnCurrentCharger(8, false),
    PlayerStreaming(10, false),
    AccountInActive(11, false),
    AccountIneligible(12, false),
    EncodesAreNotAvailableAnyMore(101, true),
    ManifestError(102, true),
    GeoCheckError(103, true),
    DownloadLimitRequiresManualResume(104, true),
    EncodesRevoked(105, true);
    
    private final boolean q;
    private final int r;

    public boolean a() {
        return this.q;
    }

    public int e() {
        return this.r;
    }

    StopReason(int i, boolean z) {
        this.r = i;
        this.q = z;
    }

    public static StopReason d(int i) {
        StopReason[] values;
        for (StopReason stopReason : values()) {
            if (stopReason.e() == i) {
                return stopReason;
            }
        }
        return Unknown;
    }

    public boolean d() {
        return e() < 100;
    }
}
