package com.netflix.msl.util;

import com.netflix.msl.MslConstants;
import java.util.Date;
import java.util.Random;
import java.util.SortedSet;
import o.AbstractC8393djy;
import o.AbstractC8399dkd;
import o.AbstractC8411dkp;
import o.AbstractC8425dlc;
import o.C8415dkt;
import o.C8421dkz;
import o.InterfaceC8429dlg;
import o.djG;
import o.djI;
import o.djK;
import o.dkS;
import o.dkZ;

/* loaded from: classes5.dex */
public abstract class MslContext {
    private volatile boolean c = false;
    private volatile long e = 0;

    public abstract djG a(ReauthCode reauthCode);

    public abstract djI a(String str);

    public abstract AbstractC8393djy b();

    public abstract C8415dkt b(String str);

    public abstract AbstractC8411dkp c(C8415dkt c8415dkt);

    public abstract C8421dkz c();

    public abstract SortedSet<AbstractC8411dkp> d();

    public abstract djK d(djI dji);

    public abstract dkZ e(String str);

    public abstract AbstractC8399dkd e();

    public abstract AbstractC8425dlc e(dkZ dkz);

    public abstract long f();

    public abstract boolean g();

    public abstract InterfaceC8429dlg h();

    public abstract dkS i();

    public abstract Random j();

    /* loaded from: classes5.dex */
    public enum ReauthCode {
        ENTITY_REAUTH(MslConstants.ResponseCode.ENTITY_REAUTH),
        ENTITYDATA_REAUTH(MslConstants.ResponseCode.ENTITYDATA_REAUTH);
        
        private final MslConstants.ResponseCode e;

        public static ReauthCode c(MslConstants.ResponseCode responseCode) {
            ReauthCode[] values;
            for (ReauthCode reauthCode : values()) {
                if (reauthCode.e == responseCode) {
                    return reauthCode;
                }
            }
            throw new IllegalArgumentException("Unknown reauthentication code value " + responseCode + ".");
        }

        ReauthCode(MslConstants.ResponseCode responseCode) {
            this.e = responseCode;
        }
    }

    public final void b(Date date) {
        this.e = (date.getTime() / 1000) - (f() / 1000);
        this.c = true;
    }

    public final Date m() {
        if (this.c) {
            return new Date(((f() / 1000) + this.e) * 1000);
        }
        return null;
    }
}
