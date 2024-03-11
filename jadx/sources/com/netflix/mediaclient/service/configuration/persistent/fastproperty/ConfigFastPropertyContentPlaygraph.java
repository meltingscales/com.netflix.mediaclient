package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class ConfigFastPropertyContentPlaygraph extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("enableStartIdent")
    private final boolean enableStartIdent = true;
    @SerializedName("dedupeAuxManifest")
    private final boolean dedupeAuxManifest = true;
    @SerializedName("enableContentPlaygraph")
    private final boolean enableContentPlaygraph = true;

    public static final boolean enableContentPlaygraph() {
        return Companion.d();
    }

    public final boolean getDedupeAuxManifest() {
        return this.dedupeAuxManifest;
    }

    public final boolean getEnableContentPlaygraph() {
        return this.enableContentPlaygraph;
    }

    public final boolean getEnableStartIdent() {
        return this.enableStartIdent;
    }

    @Override // o.aRW
    public String getName() {
        return "contentPlaygraph";
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean a() {
            return ((ConfigFastPropertyContentPlaygraph) C1822aPn.b("contentPlaygraph")).getEnableStartIdent();
        }

        public final boolean b() {
            return ((ConfigFastPropertyContentPlaygraph) C1822aPn.b("contentPlaygraph")).getDedupeAuxManifest();
        }

        public final boolean d() {
            return ((ConfigFastPropertyContentPlaygraph) C1822aPn.b("contentPlaygraph")).getEnableContentPlaygraph();
        }
    }
}
