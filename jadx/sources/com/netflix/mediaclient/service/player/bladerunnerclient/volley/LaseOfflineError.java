package com.netflix.mediaclient.service.player.bladerunnerclient.volley;

/* loaded from: classes3.dex */
public enum LaseOfflineError {
    BlacklistedDevice(2303),
    Undefined(21000),
    AggregateError(21001),
    EventStoreError(21002),
    RequestTypeError(21003),
    MembershipError(22000),
    LicenseAggregateError(22001),
    TotalLicensesPerDeviceReached(22002),
    TotalLicensesPerAccountReached(22003),
    TitleNotAvailableForOffline(22004),
    StudioOfflineTitleLimitReached(22005),
    YearlyStudioDownloadLimitReached(22006),
    YearlyStudioLicenseLimitReached(22007),
    viewingWindowExpired(22008),
    DeviceMonthlyLimitError(22010),
    LicenseNotMarkedPlayable(24000),
    LicenseIdMismatch(24001),
    LicenseReleasedError(24002),
    LicenseTooOld(24003),
    DataMissError(24004),
    DataWriteError(24005),
    DeviceNotActiveError(24006),
    ViewableNotAvailableInRegion(24007),
    PackageRevokedError(24008),
    OfflineDeviceLimitReached(23000),
    DeviceAggregateError(23001),
    ServerError(25000),
    IOError(25001),
    DependencyCommandError(25002),
    ClientUsageError(25003),
    PlayableAggregateError(26001),
    LicenseNotActive(26008),
    NOT_KNOWN_TO_CLIENT(-7777);
    
    private final int E;

    public int c() {
        return this.E;
    }

    LaseOfflineError(int i) {
        this.E = i;
    }

    public static LaseOfflineError b(int i) {
        LaseOfflineError[] values;
        for (LaseOfflineError laseOfflineError : values()) {
            if (laseOfflineError.c() == i) {
                return laseOfflineError;
            }
        }
        return NOT_KNOWN_TO_CLIENT;
    }
}
