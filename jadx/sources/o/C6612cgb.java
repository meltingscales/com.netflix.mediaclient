package o;

import android.content.Intent;

/* renamed from: o.cgb  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6612cgb extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6612cgb() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_TARGETLIST");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Target list changed");
        interfaceC6538cfG.d();
    }
}
