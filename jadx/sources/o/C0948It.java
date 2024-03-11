package o;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.It  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0948It extends AbstractC0941Im implements InterfaceC0952Ix {
    public static final e e = new e(null);
    private Float c;

    public final Float a() {
        return this.c;
    }

    /* renamed from: o.It$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FloatFalcorLeafItem");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            a("Failed to parse element for FloatFalcorLeafItem: " + jsonElement);
            return;
        }
        try {
            this.c = Float.valueOf(jsonElement.getAsFloat());
        } catch (UnsupportedOperationException unused) {
            a("Failed to parse the falkor response for FloatFalcorLeafItem");
        }
    }

    private final void a(String str) {
        Throwable th;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd b = new C1596aHd(str, null, null, false, null, false, false, 126, null).b(ErrorType.m).b(false);
        ErrorType errorType = b.a;
        if (errorType != null) {
            b.e.put("errorType", errorType.c());
            String b2 = b.b();
            if (b2 != null) {
                String c = errorType.c();
                b.a(c + " " + b2);
            }
        }
        if (b.b() != null && b.i != null) {
            th = new Throwable(b.b(), b.i);
        } else if (b.b() != null) {
            th = new Throwable(b.b());
        } else {
            th = b.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(b, th);
        } else {
            dVar.e().b(b, th);
        }
    }
}
