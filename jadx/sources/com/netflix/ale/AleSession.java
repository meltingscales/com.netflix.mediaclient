package com.netflix.ale;

import java.util.Date;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class AleSession {
    private final Jwe aleJwe;
    private final Date expiration;
    private final Date expirationDate;
    private final Date renew;
    private Date renewDate;
    private final String token;
    private final AleUtil util;

    public final Date getExpiration() {
        return this.expirationDate;
    }

    public final String getToken() {
        return this.token;
    }

    public AleSession(String str, Date date, Date date2, Jwe jwe, AleUtil aleUtil) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) date, "");
        C8632dsu.c((Object) date2, "");
        C8632dsu.c((Object) jwe, "");
        C8632dsu.c((Object) aleUtil, "");
        this.token = str;
        this.expiration = date;
        this.renew = date2;
        this.aleJwe = jwe;
        this.util = aleUtil;
        Date date3 = new Date();
        this.expirationDate = date.before(date3) ? date3 : date;
        this.renewDate = date2.before(date3) ? date3 : date2;
        this.renewDate = date2.after(date) ? date : date2;
    }

    public final byte[] decrypt(String str) {
        C8632dsu.c((Object) str, "");
        return this.aleJwe.decrypt(str);
    }

    public final String decryptString(String str) {
        C8632dsu.c((Object) str, "");
        return this.util.utf8BytesToString(this.aleJwe.decrypt(str));
    }

    public final String encrypt(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        if (isGreaterThanOrEqualTo(new Date(), this.expirationDate)) {
            throw new Exception("session expired");
        }
        return this.aleJwe.encrypt(bArr);
    }

    public final String encrypt(String str) {
        C8632dsu.c((Object) str, "");
        return encrypt(this.util.stringToUtf8Bytes(str));
    }

    public final String encryptString(String str) {
        C8632dsu.c((Object) str, "");
        return encrypt(this.util.stringToUtf8Bytes(str));
    }

    public final boolean shouldRenew() {
        return isGreaterThanOrEqualTo(new Date(), this.renewDate);
    }

    private final boolean isGreaterThanOrEqualTo(Date date, Date date2) {
        return Math.abs(date.getTime() - date2.getTime()) <= 1000 || date.getTime() >= date2.getTime();
    }
}
