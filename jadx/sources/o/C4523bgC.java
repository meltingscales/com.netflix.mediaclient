package o;

import com.google.gson.Gson;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4523bgC implements InterfaceC5266bvX {
    private final InterfaceC5266bvX e;

    public C4523bgC(InterfaceC5266bvX interfaceC5266bvX) {
        this.e = interfaceC5266bvX;
    }

    public AbstractC4566bgt c(C5331bwj c5331bwj, long j) {
        C5335bwn b = b(c5331bwj.a(), c5331bwj.b(), c5331bwj.d(), c5331bwj.h(), c5331bwj.g(), j, c5331bwj.c(), c5331bwj.j(), c5331bwj.e(), c5331bwj.i());
        if (b != null) {
            AbstractC4566bgt d = d(b.c());
            if (d != null) {
                d.b(b.a());
                return d;
            }
            return d;
        }
        return null;
    }

    public void d(C5331bwj c5331bwj, AbstractC4566bgt abstractC4566bgt, long j) {
        a(new C5335bwn(c5331bwj, j, b(abstractC4566bgt)));
    }

    private static String b(AbstractC4566bgt abstractC4566bgt) {
        return ((Gson) C1332Xp.b(Gson.class)).toJson(abstractC4566bgt);
    }

    private static AbstractC4566bgt d(String str) {
        try {
            return (AbstractC4566bgt) ((Gson) C1332Xp.b(Gson.class)).fromJson(str, (Class<Object>) AbstractC4566bgt.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o.InterfaceC5266bvX
    public C5335bwn b(long j, int i, int i2, boolean z, boolean z2, long j2, String str, String str2, String str3, String str4) {
        try {
            return this.e.b(j, i, i2, z, z2, j2, str, str2, str3, str4);
        } catch (Exception e) {
            C1044Mm.b("PersistedManifestDaoWrapper", e, "unable to query manifest DB", new Object[0]);
            return null;
        }
    }

    @Override // o.InterfaceC5266bvX
    public void a(C5335bwn c5335bwn) {
        try {
            this.e.a(c5335bwn);
        } catch (Exception e) {
            C1044Mm.b("PersistedManifestDaoWrapper", e, "unable to insert manifest DB", new Object[0]);
        }
    }

    @Override // o.InterfaceC5266bvX
    public int a(long j) {
        try {
            return this.e.a(j);
        } catch (Exception e) {
            C1044Mm.b("PersistedManifestDaoWrapper", e, "unable to delete manifest DB", new Object[0]);
            return 0;
        }
    }

    @Override // o.InterfaceC5266bvX
    public int d(long j) {
        try {
            return this.e.d(j);
        } catch (Exception e) {
            C1044Mm.b("PersistedManifestDaoWrapper", e, "unable to delete expired manifest DB", new Object[0]);
            return 0;
        }
    }

    @Override // o.InterfaceC5266bvX
    public int d() {
        try {
            return this.e.d();
        } catch (Exception e) {
            C1044Mm.b("PersistedManifestDaoWrapper", e, "unable to clear manifest DB", new Object[0]);
            return 0;
        }
    }
}
