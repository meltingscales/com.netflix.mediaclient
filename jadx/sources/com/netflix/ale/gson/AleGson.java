package com.netflix.ale.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class AleGson {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Gson create() {
            Gson create = new GsonBuilder().create();
            C8632dsu.a(create, "");
            return create;
        }
    }
}
