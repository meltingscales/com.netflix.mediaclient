package o;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bcq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4351bcq {
    C4351bcq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(InterfaceC4208baF interfaceC4208baF, String str) {
        if (interfaceC4208baF != null && interfaceC4208baF.s()) {
            return ((InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class)).a(str);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final Context context, final InterfaceC5097bsN interfaceC5097bsN) {
        if (interfaceC5097bsN != null) {
            C8187dfe.c(new Runnable() { // from class: o.bcq.4
                @Override // java.lang.Runnable
                public void run() {
                    interfaceC5097bsN.d(new C4614bho(((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).a(context), "", null));
                }
            });
        }
    }
}
