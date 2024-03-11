package o;

import android.content.Context;
import com.netflix.mediaclient.util.ConnectivityUtils;

/* renamed from: o.bcW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4331bcW extends C4400bdm {
    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public String b() {
        return "adBreakHydration";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4331bcW(Context context, C4394bdg c4394bdg, ConnectivityUtils.NetType netType, String str) {
        super(context, c4394bdg, netType, str);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c4394bdg, "");
        C8632dsu.c((Object) str, "");
    }

    public final C4331bcW d(String str) {
        a(str);
        return this;
    }
}
