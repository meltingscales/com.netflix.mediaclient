package o;

import kotlin.KotlinNothingValueException;

/* renamed from: o.dFv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7800dFv extends AbstractC7712dCo {
    private final dEU c;
    private final dFP d;

    @Override // o.InterfaceC7717dCt
    public dFP n() {
        return this.d;
    }

    public C7800dFv(dEU deu, AbstractC7773dEv abstractC7773dEv) {
        C8632dsu.c((Object) deu, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        this.c = deu;
        this.d = abstractC7773dEv.d();
    }

    @Override // o.InterfaceC7717dCt
    public int h(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public int f() {
        dEU deu = this.c;
        String j = deu.j();
        try {
            return duA.d(j);
        } catch (IllegalArgumentException unused) {
            dEU.d(deu, "Failed to parse type 'UInt' for input '" + j + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public long j() {
        dEU deu = this.c;
        String j = deu.j();
        try {
            return duA.e(j);
        } catch (IllegalArgumentException unused) {
            dEU.d(deu, "Failed to parse type 'ULong' for input '" + j + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public byte a() {
        dEU deu = this.c;
        String j = deu.j();
        try {
            return duA.a(j);
        } catch (IllegalArgumentException unused) {
            dEU.d(deu, "Failed to parse type 'UByte' for input '" + j + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public short o() {
        dEU deu = this.c;
        String j = deu.j();
        try {
            return duA.i(j);
        } catch (IllegalArgumentException unused) {
            dEU.d(deu, "Failed to parse type 'UShort' for input '" + j + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
