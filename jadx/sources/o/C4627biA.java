package o;

import android.content.Context;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.TrackGroup;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4636biJ;

/* renamed from: o.biA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4627biA extends AbstractC4669biq {
    private static AtomicInteger b;
    private static C4671bis c;

    @Override // o.AbstractC4669biq, o.InterfaceC4665bim
    public /* bridge */ /* synthetic */ List c() {
        return super.c();
    }

    @Override // o.AbstractC4669biq, o.InterfaceC4665bim
    public /* bridge */ /* synthetic */ List d(long j, long j2) {
        return super.d(j, j2);
    }

    @Override // o.AbstractC4669biq
    public /* bridge */ /* synthetic */ List d(List list) {
        return super.d(list);
    }

    @Override // o.AbstractC4669biq, o.InterfaceC4665bim
    public /* bridge */ /* synthetic */ List e(TrackGroup trackGroup, long j) {
        return super.e(trackGroup, j);
    }

    @Override // o.AbstractC4669biq, o.InterfaceC4665bim
    public /* bridge */ /* synthetic */ void e(InterfaceC4662bij interfaceC4662bij, List list, List list2, long j, long j2, boolean z, C4636biJ.d dVar) {
        super.e(interfaceC4662bij, list, list2, j, j2, z, dVar);
    }

    public C4627biA(Context context, InterfaceC4663bik interfaceC4663bik, InterfaceC4793bmb interfaceC4793bmb, PriorityTaskManager priorityTaskManager) {
        super(d(context), interfaceC4663bik, interfaceC4793bmb, priorityTaskManager);
    }

    private static C4677biy d(Context context) {
        int b2 = b();
        return C4677biy.a(context, "fragment", 131072, b2, a(b2));
    }

    public static C4671bis d() {
        C4671bis a;
        synchronized (C4627biA.class) {
            a = a(b());
        }
        return a;
    }

    private static C4671bis a(int i) {
        C4671bis c4671bis;
        synchronized (C4627biA.class) {
            if (c == null) {
                c = new C4671bis(i);
            }
            c4671bis = c;
        }
        return c4671bis;
    }

    private static int b() {
        synchronized (C4627biA.class) {
            AtomicInteger atomicInteger = b;
            if (atomicInteger != null) {
                return atomicInteger.get();
            }
            long b2 = C8054ddD.b();
            int min = (int) Math.min(((float) b2) * 0.25f, 1.048576E8f);
            if (min < 10485760) {
                min = 0;
            }
            C1044Mm.a("nf_cache", "Available disk space in bytes = %d Saving fragment Cache Size = %d", Long.valueOf(b2), Integer.valueOf(min));
            b = new AtomicInteger(min);
            return min;
        }
    }
}
