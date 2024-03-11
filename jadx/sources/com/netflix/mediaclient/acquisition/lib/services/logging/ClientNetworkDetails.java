package com.netflix.mediaclient.acquisition.lib.services.logging;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C8055ddE;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.duD;

/* loaded from: classes3.dex */
public final class ClientNetworkDetails {
    public static final Companion Companion = new Companion(null);
    private final String clientPlatform;
    private final String endpointVersion;
    private final String swVersion;

    public static /* synthetic */ ClientNetworkDetails copy$default(ClientNetworkDetails clientNetworkDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientNetworkDetails.clientPlatform;
        }
        if ((i & 2) != 0) {
            str2 = clientNetworkDetails.swVersion;
        }
        if ((i & 4) != 0) {
            str3 = clientNetworkDetails.endpointVersion;
        }
        return clientNetworkDetails.copy(str, str2, str3);
    }

    public final String component1() {
        return this.clientPlatform;
    }

    public final String component2() {
        return this.swVersion;
    }

    public final String component3() {
        return this.endpointVersion;
    }

    public final ClientNetworkDetails copy(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        return new ClientNetworkDetails(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientNetworkDetails) {
            ClientNetworkDetails clientNetworkDetails = (ClientNetworkDetails) obj;
            return C8632dsu.c((Object) this.clientPlatform, (Object) clientNetworkDetails.clientPlatform) && C8632dsu.c((Object) this.swVersion, (Object) clientNetworkDetails.swVersion) && C8632dsu.c((Object) this.endpointVersion, (Object) clientNetworkDetails.endpointVersion);
        }
        return false;
    }

    public final String getClientPlatform() {
        return this.clientPlatform;
    }

    public final String getEndpointVersion() {
        return this.endpointVersion;
    }

    public final String getSwVersion() {
        return this.swVersion;
    }

    public int hashCode() {
        return (((this.clientPlatform.hashCode() * 31) + this.swVersion.hashCode()) * 31) + this.endpointVersion.hashCode();
    }

    public String toString() {
        String str = this.clientPlatform;
        String str2 = this.swVersion;
        String str3 = this.endpointVersion;
        return "ClientNetworkDetails(clientPlatform=" + str + ", swVersion=" + str2 + ", endpointVersion=" + str3 + ")";
    }

    public ClientNetworkDetails(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.clientPlatform = str;
        this.swVersion = str2;
        this.endpointVersion = str3;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final ClientNetworkDetails newInstance(Context context) {
            List d;
            Object B;
            C8632dsu.c((Object) context, "");
            d = duD.d((CharSequence) "/aui/pathEvaluator/mobile/latest", new String[]{"/"}, false, 0, 6, (Object) null);
            B = C8576dqs.B((List<? extends Object>) d);
            String e = C8055ddE.e(context);
            C8632dsu.a(e, "");
            return new ClientNetworkDetails(SignupConstants.AndroidPlatform.ANDROID_NATIVE, e, (String) B);
        }
    }
}
