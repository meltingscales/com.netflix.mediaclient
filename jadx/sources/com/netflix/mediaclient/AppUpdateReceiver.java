package com.netflix.mediaclient;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.AppUpdateReceiver;
import io.reactivex.subjects.PublishSubject;
import o.C1044Mm;
import o.C8187dfe;
import o.C8627dsp;
import o.C8632dsu;
import o.aSS;

/* loaded from: classes5.dex */
public final class AppUpdateReceiver extends BroadcastReceiver {
    public static final c c = new c(null);
    private static final String e = "nf_update";

    private final void b(Context context, Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) intent, "");
        if (C8632dsu.c((Object) "android.intent.action.MY_PACKAGE_REPLACED", (Object) intent.getAction())) {
            C1044Mm.e(e, "MY_PACKAGE_REPLACED");
            b(context, intent);
            if (aSS.c(context)) {
                c.a(context);
                return;
            }
            return;
        }
        C1044Mm.e(e, "Unexpected intent received", intent);
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final void a(Context context) {
            C8632dsu.c((Object) context, "");
            final PublishSubject create = PublishSubject.create();
            C8632dsu.a(create, "");
            if (aSS.c(context)) {
                new aSS(create, context).d();
                C8187dfe.a(new Runnable() { // from class: o.Mf
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppUpdateReceiver.c.e(PublishSubject.this);
                    }
                }, 2000L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(PublishSubject publishSubject) {
            C8632dsu.c((Object) publishSubject, "");
            publishSubject.onComplete();
        }
    }
}
