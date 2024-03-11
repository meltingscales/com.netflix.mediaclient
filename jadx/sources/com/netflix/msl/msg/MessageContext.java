package com.netflix.msl.msg;

import com.netflix.msl.MslConstants;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import o.AbstractC8393djy;
import o.AbstractC8412dkq;
import o.AbstractC8424dlb;
import o.InterfaceC8413dkr;
import o.dkE;
import o.dkF;
import o.dkL;
import o.dkR;

/* loaded from: classes5.dex */
public interface MessageContext {
    Set<AbstractC8412dkq> a();

    String b();

    Map<String, AbstractC8393djy> c();

    void c(dkL dkl, boolean z);

    AbstractC8424dlb d(ReauthCode reauthCode, boolean z, boolean z2);

    dkF e();

    void e(dkE dke);

    void e(InterfaceC8413dkr interfaceC8413dkr, InputStream inputStream);

    dkR f();

    boolean g();

    boolean h();

    String i();

    boolean j();

    default boolean k() {
        return false;
    }

    boolean l();

    default boolean n() {
        return false;
    }

    /* loaded from: classes5.dex */
    public enum ReauthCode {
        USERDATA_REAUTH(MslConstants.ResponseCode.USERDATA_REAUTH),
        SSOTOKEN_REJECTED(MslConstants.ResponseCode.SSOTOKEN_REJECTED);
        
        private final MslConstants.ResponseCode b;

        public static ReauthCode b(MslConstants.ResponseCode responseCode) {
            ReauthCode[] values;
            for (ReauthCode reauthCode : values()) {
                if (reauthCode.b == responseCode) {
                    return reauthCode;
                }
            }
            throw new IllegalArgumentException("Unknown reauthentication code value " + responseCode + ".");
        }

        ReauthCode(MslConstants.ResponseCode responseCode) {
            this.b = responseCode;
        }
    }
}
