package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import o.C8118deO;
import o.C8168dfL;

/* loaded from: classes.dex */
public class UserCookies {
    private static final String TAG = "nf_config_nrm";
    @SerializedName("netflixId")
    public String netflixId;
    @SerializedName("secureNetflixId")
    public String secureNetflixId;

    public UserCookies(String str, String str2) {
        this.netflixId = str;
        this.secureNetflixId = str2;
    }

    public String toString() {
        return "UserCookies{netflixId='" + this.netflixId + "', secureNetflixId='" + this.secureNetflixId + "'}";
    }

    public String toJsonString() {
        return C8118deO.a().toJson(this);
    }

    public boolean isValid() {
        return C8168dfL.h(this.netflixId) && C8168dfL.h(this.secureNetflixId);
    }
}
