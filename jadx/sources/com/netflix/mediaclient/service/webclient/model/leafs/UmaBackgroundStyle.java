package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaBackgroundStyle;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class UmaBackgroundStyle extends UmaStyleCommonFields {
    public static final Companion Companion = new Companion(null);

    public static final TypeAdapter<UmaBackgroundStyle> typeAdapter(Gson gson) {
        return Companion.typeAdapter(gson);
    }

    @SerializedName("image")
    public abstract UmaImageDetails image();

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TypeAdapter<UmaBackgroundStyle> typeAdapter(Gson gson) {
            return new AutoValue_UmaBackgroundStyle.GsonTypeAdapter(gson);
        }
    }
}
