package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PlayApiPlaybackLogs extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("logblobs")
    private boolean logblobs = true;
    @SerializedName("pds")
    private boolean pds = true;

    public static final boolean shouldSendLogblobs() {
        return Companion.e();
    }

    public static final boolean shouldSendPds() {
        return Companion.c();
    }

    public final boolean getLogblobs() {
        return this.logblobs;
    }

    @Override // o.aRW
    public String getName() {
        return "playApiPlayback";
    }

    public final boolean getPds() {
        return this.pds;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Config_FastProperty_PlayApiPlaybackLogs");
        }

        public final boolean e() {
            return ((Config_FastProperty_PlayApiPlaybackLogs) C1822aPn.b("playApiPlayback")).getLogblobs();
        }

        public final boolean c() {
            return ((Config_FastProperty_PlayApiPlaybackLogs) C1822aPn.b("playApiPlayback")).getPds();
        }
    }
}
