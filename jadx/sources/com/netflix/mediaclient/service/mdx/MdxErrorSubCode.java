package com.netflix.mediaclient.service.mdx;

/* loaded from: classes3.dex */
public enum MdxErrorSubCode {
    Unknown(1001),
    Exception(1002),
    PingTimeout(1003),
    PingFail(1004),
    DiscoveryTimeout(1201),
    DiscoveryFailed(1202),
    DeviceIsLost(1211),
    MdxInitTimeout(1301),
    MdxInitFailed(1302),
    LaunchTimeout(2001),
    LaunchFailed(2002),
    PairTimeout(2101),
    PairFailed(2102),
    RegPairFailed(2103),
    RemoteLoginCancelled(2104),
    RemoteLoginAndPairFailed(2105),
    RemoteLoginOnlyFailed(2106),
    RemoteLoginDisabled(2107),
    RegPairPinConfirmationCancelled(2199),
    SessionTimeout(2201),
    SessionFailed(2202),
    SessionStartFailed(2203),
    SessionResumeFailed(2204),
    SessionHandshakeFailed(2205),
    SessionAbruptlyEnded(2211),
    ShowToast(9999);
    
    private final int C;

    public int d() {
        return this.C;
    }

    MdxErrorSubCode(int i) {
        this.C = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.C);
    }

    public boolean d(MdxErrorSubCode mdxErrorSubCode) {
        return mdxErrorSubCode != null && mdxErrorSubCode.d() == this.C;
    }

    public static MdxErrorSubCode c(int i) {
        MdxErrorSubCode[] values;
        for (MdxErrorSubCode mdxErrorSubCode : values()) {
            if (mdxErrorSubCode.d() == i) {
                return mdxErrorSubCode;
            }
        }
        return null;
    }

    public static MdxErrorSubCode b(String str) {
        return c(Integer.valueOf(str).intValue());
    }

    public static boolean a(int i) {
        if (i == Unknown.d() || i == Exception.d()) {
            return true;
        }
        if (i == RemoteLoginOnlyFailed.d()) {
            return false;
        }
        return i > 2000 && i <= 2210;
    }
}
