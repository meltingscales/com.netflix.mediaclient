package o;

import android.content.Intent;

/* renamed from: o.cfK  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6542cfK extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6542cfK() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGCANCEL");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Cancel dialog");
        interfaceC6538cfG.c();
    }
}
