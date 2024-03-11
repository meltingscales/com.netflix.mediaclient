package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PlayerUI extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("pauseLockScreenTimeoutInMs")
    private int pauseLockScreenTimeoutInMs = 120000;
    @SerializedName("inactivityTimeoutInMs")
    private int inactivityTimeoutInMs = 5000;
    @SerializedName("inactivityTimeoutWhenTalkBackOnInMs")
    private int inactivityTimeoutWhenTalkBackOnInMs = 8000;
    @SerializedName("volumeTimeoutInMs")
    private int volumeTimeoutInMs = 500;
    @SerializedName("delayPostInMs")
    private int delayPostInMs = 1000;
    @SerializedName("pauseTimeoutInMs")
    private int pauseTimeoutInMs = 900000;
    @SerializedName("skipDeltaInMs")
    private int skipDeltaInMs = 10000;
    @SerializedName("fetchPostPlayDataAheadVideoEndInMs")
    private int fetchPostPlayDataAheadVideoEndInMs = 60000;
    @SerializedName("playbackSeekWindowSizeInMs")
    private int playbackSeekWindowSizeInMs = 2000;

    public final int getDelayPostInMs() {
        return this.delayPostInMs;
    }

    public final int getFetchPostPlayDataAheadVideoEndInMs() {
        return this.fetchPostPlayDataAheadVideoEndInMs;
    }

    public final int getInactivityTimeoutInMs() {
        return this.inactivityTimeoutInMs;
    }

    public final int getInactivityTimeoutWhenTalkBackOnInMs() {
        return this.inactivityTimeoutWhenTalkBackOnInMs;
    }

    @Override // o.aRW
    public String getName() {
        return "player_ui";
    }

    public final int getPauseLockScreenTimeoutInMs() {
        return this.pauseLockScreenTimeoutInMs;
    }

    public final int getPauseTimeoutInMs() {
        return this.pauseTimeoutInMs;
    }

    public final int getPlaybackSeekWindowSizeInMs() {
        return this.playbackSeekWindowSizeInMs;
    }

    public final int getSkipDeltaInMs() {
        return this.skipDeltaInMs;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final int d() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getPauseLockScreenTimeoutInMs();
        }

        public final int b() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getInactivityTimeoutInMs();
        }

        public final int a() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getInactivityTimeoutWhenTalkBackOnInMs();
        }

        public final int e() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getDelayPostInMs();
        }

        public final int h() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getPauseTimeoutInMs();
        }

        public final int j() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getSkipDeltaInMs();
        }

        public final int c() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getFetchPostPlayDataAheadVideoEndInMs();
        }

        public final int f() {
            return ((Config_FastProperty_PlayerUI) C1822aPn.b("player_ui")).getPlaybackSeekWindowSizeInMs();
        }
    }
}
