package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_SendServiceTokensPolicy extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("sendWithLogblobs")
    private boolean sendWithLogblobs;
    @SerializedName("sendWithPdsEvents")
    private boolean sendWithPdsEvents;

    public static final boolean shouldSendWithLogblobs() {
        return Companion.c();
    }

    public static final boolean shouldSendWithPdsEvents() {
        return Companion.a();
    }

    @Override // o.aRW
    public String getName() {
        return "sendServiceTokensPolicy";
    }

    public final boolean getSendWithLogblobs() {
        return this.sendWithLogblobs;
    }

    public final boolean getSendWithPdsEvents() {
        return this.sendWithPdsEvents;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_FastProperty_SendServiceTokensPolicy");
        }

        public final boolean c() {
            return ((Config_FastProperty_SendServiceTokensPolicy) C1822aPn.b("sendServiceTokensPolicy")).getSendWithLogblobs();
        }

        public final boolean a() {
            return ((Config_FastProperty_SendServiceTokensPolicy) C1822aPn.b("sendServiceTokensPolicy")).getSendWithPdsEvents();
        }
    }
}
