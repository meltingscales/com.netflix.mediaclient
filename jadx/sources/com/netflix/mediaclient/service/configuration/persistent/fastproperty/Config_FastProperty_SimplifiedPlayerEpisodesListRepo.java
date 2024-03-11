package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_SimplifiedPlayerEpisodesListRepo extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("enabled")
    private boolean enabled = true;

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "simpl_episodes_list_repo";
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_SimplifiedPlayerEpisodesListRepo");
        }

        public final boolean d() {
            return ((Config_FastProperty_SimplifiedPlayerEpisodesListRepo) C1822aPn.b("simpl_episodes_list_repo")).getEnabled();
        }
    }
}
