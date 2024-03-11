package o;

import android.util.Log;

/* renamed from: o.ai  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2543ai implements InterfaceC4626bi {
    private String a;
    private final String b;
    private long e;

    private void c() {
        this.e = -1L;
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2543ai(String str) {
        this.b = str;
        c();
    }

    @Override // o.InterfaceC4626bi
    public void b(String str) {
        if (this.e != -1) {
            throw new IllegalStateException("Timer was already started");
        }
        this.e = System.nanoTime();
        this.a = str;
    }

    @Override // o.InterfaceC4626bi
    public void a() {
        if (this.e == -1) {
            throw new IllegalStateException("Timer was not started");
        }
        String str = this.b;
        Log.d(str, String.format(this.a + ": %.3fms", Float.valueOf(((float) (System.nanoTime() - this.e)) / 1000000.0f)));
        c();
    }
}
