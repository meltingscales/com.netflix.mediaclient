package com.netflix.mediaclient.service.mdx;

/* loaded from: classes3.dex */
public enum MdxErrorCode {
    MdxInitFailed(4005),
    ConnectFailed(4010),
    ReconnectFailed(4011),
    DisconnectFailed(4012),
    Cancelled(4013);
    
    private final int i;

    public int d() {
        return this.i;
    }

    MdxErrorCode(int i) {
        this.i = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.i);
    }

    public static MdxErrorCode e(int i) {
        MdxErrorCode[] values;
        for (MdxErrorCode mdxErrorCode : values()) {
            if (mdxErrorCode.d() == i) {
                return mdxErrorCode;
            }
        }
        return null;
    }

    public static MdxErrorCode c(String str) {
        return e(Integer.valueOf(str).intValue());
    }
}
