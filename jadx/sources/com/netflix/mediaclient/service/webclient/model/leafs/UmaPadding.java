package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaPadding;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class UmaPadding {
    public static final Companion Companion = new Companion(null);

    public static final TypeAdapter<UmaPadding> typeAdapter(Gson gson) {
        return Companion.typeAdapter(gson);
    }

    public abstract Float bottom();

    public abstract Float end();

    public abstract Float start();

    public abstract Float top();

    public final Integer getPaddingBottomAsInteger() {
        Float bottom = bottom();
        if (bottom != null) {
            return Integer.valueOf((int) bottom.floatValue());
        }
        return null;
    }

    public final Integer getPaddingTopAsInteger() {
        Float pVar = top();
        if (pVar != null) {
            return Integer.valueOf((int) pVar.floatValue());
        }
        return null;
    }

    public final Integer getPaddingStartAsInteger() {
        Float start = start();
        if (start != null) {
            return Integer.valueOf((int) start.floatValue());
        }
        return null;
    }

    public final Integer getPaddingEndAsInteger() {
        Float end = end();
        if (end != null) {
            return Integer.valueOf((int) end.floatValue());
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TypeAdapter<UmaPadding> typeAdapter(Gson gson) {
            return new AutoValue_UmaPadding.GsonTypeAdapter(gson);
        }
    }
}
