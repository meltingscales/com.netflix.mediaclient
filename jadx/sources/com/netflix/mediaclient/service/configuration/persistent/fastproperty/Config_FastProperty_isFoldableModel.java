package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_isFoldableModel extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("isFoldableModel")
    private boolean isFoldableModel;

    public static final boolean isEnabled() {
        return Companion.c();
    }

    @Override // o.aRW
    public String getName() {
        return "isFoldableModel";
    }

    public final boolean isFoldableModel() {
        return this.isFoldableModel;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_FastProperty_isFoldableModel");
        }

        public final boolean c() {
            return ((Config_FastProperty_isFoldableModel) C1822aPn.b("isFoldableModel")).isFoldableModel();
        }
    }
}
