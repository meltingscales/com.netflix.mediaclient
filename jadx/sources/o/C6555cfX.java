package o;

import android.content.Intent;

/* renamed from: o.cfX  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6555cfX extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6555cfX() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_CANCEL");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "show remote login consent dialog");
        interfaceC6538cfG.c();
    }
}
