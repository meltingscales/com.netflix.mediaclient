package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_GamesInMyList extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("isGamesTabMyListRowEnabled")
    private boolean isGamesTabMyListRowEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "enable_games_in_my_list";
    }

    public final boolean isGamesTabMyListRowEnabled() {
        return this.isGamesTabMyListRowEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_GamesInMyList");
        }

        public final boolean e() {
            return ((Config_FastProperty_GamesInMyList) C1822aPn.b("enable_games_in_my_list")).isGamesTabMyListRowEnabled();
        }
    }
}
