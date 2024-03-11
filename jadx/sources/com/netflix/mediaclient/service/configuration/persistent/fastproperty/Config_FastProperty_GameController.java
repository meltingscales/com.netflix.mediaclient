package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import o.C1045Mp;
import o.C1822aPn;
import o.C8569dql;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_GameController extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("allowedTestHosts")
    private List<String> allowedTestHosts;
    @SerializedName("deeplinkEnabled")
    private boolean deeplinkEnabled = true;
    @SerializedName("deeplinkPLayStoreEnabled")
    private boolean deeplinkPLayStoreEnabled = true;
    @SerializedName("backStackEnabled")
    private boolean backStackEnabled = true;

    public final List<String> getAllowedTestHosts() {
        return this.allowedTestHosts;
    }

    public final boolean getBackStackEnabled() {
        return this.backStackEnabled;
    }

    public final boolean getDeeplinkEnabled() {
        return this.deeplinkEnabled;
    }

    public final boolean getDeeplinkPLayStoreEnabled() {
        return this.deeplinkPLayStoreEnabled;
    }

    @Override // o.aRW
    public String getName() {
        return "game_controller";
    }

    public Config_FastProperty_GameController() {
        List<String> j;
        j = C8569dql.j("netflix.net", "netflix.com", "nflxso.net");
        this.allowedTestHosts = j;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_FastProperty_GameController");
        }

        public final boolean d() {
            return ((Config_FastProperty_GameController) C1822aPn.b("game_controller")).getDeeplinkEnabled();
        }

        public final boolean a() {
            return ((Config_FastProperty_GameController) C1822aPn.b("game_controller")).getDeeplinkPLayStoreEnabled();
        }

        public final boolean e() {
            return ((Config_FastProperty_GameController) C1822aPn.b("game_controller")).getBackStackEnabled();
        }

        public final List<String> c() {
            return ((Config_FastProperty_GameController) C1822aPn.b("game_controller")).getAllowedTestHosts();
        }
    }
}
