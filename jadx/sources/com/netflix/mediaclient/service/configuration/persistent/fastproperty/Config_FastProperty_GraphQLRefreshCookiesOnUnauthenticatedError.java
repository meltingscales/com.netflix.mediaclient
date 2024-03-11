package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_GraphQLRefreshCookiesOnUnauthenticatedError extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "refreshCookiesOnUnauthenticatedError";
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean a() {
            return ((Config_FastProperty_GraphQLRefreshCookiesOnUnauthenticatedError) C1822aPn.b("refreshCookiesOnUnauthenticatedError")).isEnabled();
        }
    }
}
