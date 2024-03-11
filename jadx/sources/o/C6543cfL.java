package o;

import android.content.Intent;

/* renamed from: o.cfL  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6543cfL extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6543cfL() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Error");
        interfaceC6538cfG.a(intent.getIntExtra("errorCode", 0), intent.getStringExtra("errorDesc"), intent.getStringExtra("errorDisplayCode"));
    }
}
