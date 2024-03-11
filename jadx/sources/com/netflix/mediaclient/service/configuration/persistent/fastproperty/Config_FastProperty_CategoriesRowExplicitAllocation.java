package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_CategoriesRowExplicitAllocation extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "enable_categories_row_explicit_allocation";
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Config_FastProperty_CategoriesRowExplicitAllocation");
        }

        public final boolean e() {
            return ((Config_FastProperty_CategoriesRowExplicitAllocation) C1822aPn.b("enable_categories_row_explicit_allocation")).isEnabled();
        }
    }
}
