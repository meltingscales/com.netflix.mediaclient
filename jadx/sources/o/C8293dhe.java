package o;

import android.graphics.Bitmap;

/* renamed from: o.dhe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8293dhe implements InterfaceC8229dgT {
    private final C8227dgR a;
    private final String b;
    private final InterfaceC8230dgU d;
    private final C8228dgS e;

    public C8293dhe(InterfaceC8230dgU interfaceC8230dgU, String str) {
        C8632dsu.c((Object) interfaceC8230dgU, "");
        this.d = interfaceC8230dgU;
        this.b = str;
        this.e = new C8228dgS();
        this.a = new C8227dgR(interfaceC8230dgU);
    }

    private final boolean a() {
        boolean d;
        boolean d2;
        boolean d3;
        boolean d4;
        String str = this.b;
        if (str == null) {
            return true;
        }
        d = duD.d((CharSequence) str, (CharSequence) ".webp", false, 2, (Object) null);
        if (d) {
            return true;
        }
        d2 = duD.d((CharSequence) this.b, (CharSequence) ".png", false, 2, (Object) null);
        if (d2) {
            return true;
        }
        d3 = duD.d((CharSequence) this.b, (CharSequence) ".jpg", false, 2, (Object) null);
        if (d3) {
            return true;
        }
        d4 = duD.d((CharSequence) this.b, (CharSequence) ".jpeg", false, 2, (Object) null);
        return d4;
    }

    @Override // o.InterfaceC8229dgT
    public Bitmap b(byte[] bArr, int i, int i2, Bitmap.Config config) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) config, "");
        if (a()) {
            Bitmap b = this.e.b(bArr, i, i2, config);
            return (b != null || this.d.d()) ? b : this.a.b(bArr, i, i2, config);
        }
        Bitmap b2 = !this.d.d() ? this.a.b(bArr, i, i2, config) : null;
        return b2 == null ? this.e.b(bArr, i, i2, config) : b2;
    }
}
