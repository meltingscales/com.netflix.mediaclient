package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaStyle;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class UmaStyle extends UmaStyleCommonFields {
    public static final Companion Companion = new Companion(null);

    public static final TypeAdapter<UmaStyle> typeAdapter(Gson gson) {
        return Companion.typeAdapter(gson);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TypeAdapter<UmaStyle> typeAdapter(Gson gson) {
            return new AutoValue_UmaStyle.GsonTypeAdapter(gson);
        }
    }
}
