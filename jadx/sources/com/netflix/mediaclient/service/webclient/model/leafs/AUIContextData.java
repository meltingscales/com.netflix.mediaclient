package com.netflix.mediaclient.service.webclient.model.leafs;

import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class AUIContextData {
    public static final Companion Companion = new Companion(null);
    private static final String GEO_KEY = "geoInfo";
    private static final String USER_CONTEXT_KEY = "userContext";
    private final String TAG;
    private final Map<String, ?> geo;
    private final String membershipStatus;
    private final Map<String, ?> userInfo;

    public static final String getGEO_KEY() {
        return Companion.getGEO_KEY();
    }

    public static final String getUSER_CONTEXT_KEY() {
        return Companion.getUSER_CONTEXT_KEY();
    }

    public final Map<String, ?> getGeo() {
        return this.geo;
    }

    public final String getMembershipStatus() {
        return this.membershipStatus;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final Map<String, ?> getUserInfo() {
        return this.userInfo;
    }

    public AUIContextData(Map<String, ?> map, Map<String, ?> map2) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        this.geo = map;
        this.userInfo = map2;
        this.TAG = "nf_aui_context";
        Object obj = map2.get("membershipStatus");
        this.membershipStatus = obj instanceof String ? (String) obj : null;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        public static /* synthetic */ void getGEO_KEY$annotations() {
        }

        public static /* synthetic */ void getUSER_CONTEXT_KEY$annotations() {
        }

        private Companion() {
        }

        public final String getGEO_KEY() {
            return AUIContextData.GEO_KEY;
        }

        public final String getUSER_CONTEXT_KEY() {
            return AUIContextData.USER_CONTEXT_KEY;
        }
    }

    public String toString() {
        Map<String, ?> map = this.geo;
        Map<String, ?> map2 = this.userInfo;
        return "AUIContextData(geo=" + map + ", userInfo=" + map2 + ")";
    }
}
