package com.netflix.mediaclient.servicemgr;

import o.C8168dfL;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface Logblob {

    /* loaded from: classes4.dex */
    public enum Severity {
        error,
        info,
        warn
    }

    String a();

    JSONObject c();

    boolean e();

    long z_();

    /* loaded from: classes4.dex */
    public static class d {
        public String d;
        public String e;

        public d(String str, String str2, String str3, String str4) {
            this.d = str;
            this.e = str4;
            a();
        }

        private boolean a() {
            if (C8168dfL.g(this.d)) {
                throw new IllegalStateException("ESN is missing");
            }
            if (C8168dfL.g(this.e)) {
                throw new IllegalStateException("deviceModel is missing");
            }
            return true;
        }
    }
}
