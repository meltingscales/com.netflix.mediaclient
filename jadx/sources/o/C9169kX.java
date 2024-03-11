package o;

import android.content.Context;
import java.io.File;
import java.util.UUID;

/* renamed from: o.kX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9169kX {
    private final InterfaceC9164kS b;
    private final C9224lZ d;
    private final InterfaceC9164kS e;

    public C9169kX(Context context, File file, drO<UUID> dro, File file2, drO<UUID> dro2, C9224lZ c9224lZ, InterfaceC9200lB interfaceC9200lB) {
        this.d = c9224lZ;
        this.e = new C9167kV(file, dro, interfaceC9200lB);
        this.b = new C9167kV(file2, dro2, interfaceC9200lB);
    }

    public /* synthetic */ C9169kX(Context context, File file, drO dro, File file2, drO dro2, C9224lZ c9224lZ, InterfaceC9200lB interfaceC9200lB, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? new File(context.getFilesDir(), "device-id") : file, (i & 4) != 0 ? new drO<UUID>() { // from class: com.bugsnag.android.DeviceIdStore$1
            @Override // o.drO
            /* renamed from: c */
            public final UUID invoke() {
                return UUID.randomUUID();
            }
        } : dro, (i & 8) != 0 ? new File(context.getFilesDir(), "internal-device-id") : file2, (i & 16) != 0 ? new drO<UUID>() { // from class: com.bugsnag.android.DeviceIdStore$2
            @Override // o.drO
            /* renamed from: a */
            public final UUID invoke() {
                return UUID.randomUUID();
            }
        } : dro2, c9224lZ, interfaceC9200lB);
    }

    public final String b() {
        String c = this.e.c(false);
        if (c != null) {
            return c;
        }
        String c2 = this.d.c(false);
        return c2 != null ? c2 : this.e.c(true);
    }

    public final String a() {
        return this.b.c(true);
    }
}
