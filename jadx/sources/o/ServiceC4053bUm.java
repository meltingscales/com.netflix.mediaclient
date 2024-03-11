package o;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
/* renamed from: o.bUm  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceC4053bUm extends AbstractServiceC4056bUp {
    public static final d c = new d(null);

    /* renamed from: o.bUm$d */
    /* loaded from: classes6.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return new Binder();
    }
}
