package o;

import android.content.Intent;

/* renamed from: o.cfP  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6547cfP extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6547cfP() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NOTREADY");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "MDX_ACTION_UPDATE_NOTREADY");
        interfaceC6538cfG.a(false);
    }
}
