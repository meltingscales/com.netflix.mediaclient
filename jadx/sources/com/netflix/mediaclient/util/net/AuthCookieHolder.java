package com.netflix.mediaclient.util.net;

import o.C8168dfL;

/* loaded from: classes.dex */
public final class AuthCookieHolder {
    public String netflixId;
    public String secureNetflixId;
    public String userId;

    public AuthCookieHolder(String str, String str2, String str3) {
        this.userId = str;
        this.netflixId = str2;
        this.secureNetflixId = str3;
    }

    public boolean hasCookies() {
        return C8168dfL.h(this.netflixId) && C8168dfL.h(this.secureNetflixId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthCookieHolder.class != obj.getClass()) {
            return false;
        }
        AuthCookieHolder authCookieHolder = (AuthCookieHolder) obj;
        String str = this.userId;
        if (str == null ? authCookieHolder.userId == null : str.equals(authCookieHolder.userId)) {
            String str2 = this.netflixId;
            if (str2 == null ? authCookieHolder.netflixId == null : str2.equals(authCookieHolder.netflixId)) {
                String str3 = this.secureNetflixId;
                String str4 = authCookieHolder.secureNetflixId;
                return str3 != null ? str3.equals(str4) : str4 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.netflixId;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.secureNetflixId;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AuthCookieHolder{userId='" + this.userId + "'netflixId='" + this.netflixId + "', secureNetflixId='" + this.secureNetflixId + "'}";
    }
}
