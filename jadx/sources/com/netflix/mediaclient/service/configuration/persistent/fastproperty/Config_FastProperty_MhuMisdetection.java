package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_MhuMisdetection extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("isEnabled")
    private boolean isEnabled;
    @SerializedName("helpLink")
    private String helpLink = "https://help.netflix.com/node/128339";
    @SerializedName("troubleshootLink")
    private String troubleshootPath = "verifyDevice";

    @Override // o.aRW
    public String getName() {
        return "mhumisdetection";
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean a() {
            aRW b = C1822aPn.b("mhumisdetection");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_MhuMisdetection) b).isEnabled;
        }

        public final String b() {
            aRW b = C1822aPn.b("mhumisdetection");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_MhuMisdetection) b).helpLink;
        }

        public final String e() {
            aRW b = C1822aPn.b("mhumisdetection");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_MhuMisdetection) b).troubleshootPath;
        }
    }
}
