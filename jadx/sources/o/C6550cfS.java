package o;

import android.content.Intent;

/* renamed from: o.cfS  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6550cfS extends AbstractC6549cfR {
    public C6550cfS() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NETWORK_CONNECTIVITY_CHANGE");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "MDX_ACTION_UPDATE_NETWORK_CONNECTIVITY_CHANGE");
        interfaceC6538cfG.e(intent.getBooleanExtra("networkConnected", true));
    }
}
