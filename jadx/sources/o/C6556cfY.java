package o;

import android.content.Intent;

/* renamed from: o.cfY  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6556cfY extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6556cfY() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Remote state is changed");
        interfaceC6538cfG.c(intent.getStringExtra("currentState"), intent.getIntExtra("time", 0), intent.getIntExtra("volume", 0), intent.getBooleanExtra("isInSkipIntroWindow", false), intent.getStringExtra("skipIntroText"), intent.getStringExtra("skipIntroType"));
    }
}
