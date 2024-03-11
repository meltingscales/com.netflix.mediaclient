package o;

import android.os.Process;
import com.netflix.mediaclient.ui.player.IPlayerFragment;

/* renamed from: o.czF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7595czF extends C7592czC {
    private final int f;
    private final int g;
    private final int i;

    /* renamed from: o  reason: collision with root package name */
    private Thread f13790o;

    @Override // o.C7592czC
    protected c e() {
        return this.c;
    }

    public C7595czF(IPlayerFragment iPlayerFragment) {
        super(iPlayerFragment);
        this.f = 12;
        this.i = 12;
        this.g = 300;
        C1044Mm.e(C7592czC.d, "PostPlayWithAnimation");
        d();
    }

    private void d() {
        int p = C8150deu.p(this.a.d());
        this.c = new c(500, 0, 0, 1.0f, C9870yD.b(this.a.d(), 12), C9870yD.b(this.a.d(), 12), C9870yD.b(this.a.d(), 300) / p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.czF$c */
    /* loaded from: classes4.dex */
    public static class c {
        private int a;
        private float b;
        private int c;
        private int d;
        private int e;
        private int g;
        private float j;

        public int a() {
            return this.e;
        }

        public float b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public float g() {
            return this.j;
        }

        public c(int i, int i2, int i3, float f, int i4, int i5, float f2) {
            this.e = i;
            this.c = i2;
            this.g = i3;
            this.j = f;
            this.a = i4;
            this.d = i5;
            this.b = f2;
        }
    }

    /* renamed from: o.czF$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        private c a;
        private Runnable b;
        private boolean c;
        private final int d;

        private float a(float f, float f2, float f3) {
            return f * f2 * f3;
        }

        private a(c cVar, Runnable runnable) {
            this.d = 20;
            if (cVar == null) {
                throw new IllegalArgumentException("Parameters can not be null");
            }
            this.a = cVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Process.setThreadPriority(-1);
            long currentTimeMillis = System.currentTimeMillis();
            float a = this.a.a() / 20;
            float abs = Math.abs(this.a.f() - this.a.d()) / a;
            float abs2 = Math.abs(this.a.e() - this.a.c()) / a;
            float abs3 = Math.abs(this.a.g() - this.a.b()) / a;
            int i = this.a.f() > this.a.d() ? -1 : 1;
            int i2 = this.a.e() > this.a.c() ? -1 : 1;
            int i3 = this.a.g() >= this.a.b() ? 1 : -1;
            this.c = true;
            boolean z2 = false;
            int i4 = 0;
            while (this.c) {
                C1044Mm.e(C7592czC.d, "in loop");
                if (System.currentTimeMillis() - currentTimeMillis >= this.a.a()) {
                    C1044Mm.e(C7592czC.d, "Exit!");
                    this.c = z2;
                } else {
                    i4++;
                    float f = i4;
                    long j = currentTimeMillis;
                    C7595czF.this.e(this.a.e() + ((int) a(abs2, f, i2)), this.a.f() + ((int) a(abs, f, i)), this.a.g() - ((f * abs3) * i3));
                    try {
                        C1044Mm.e(C7592czC.d, "Sleep");
                        Thread.sleep(20L);
                        z = false;
                    } catch (InterruptedException unused) {
                        C1044Mm.e(C7592czC.d, "Interupped");
                        z = false;
                        this.c = false;
                    }
                    z2 = z;
                    currentTimeMillis = j;
                }
            }
            C7595czF.this.e(this.a.c(), this.a.d(), this.a.b());
            Runnable runnable = this.b;
            if (runnable != null) {
                C7595czF.this.a.b(runnable);
            }
        }
    }

    @Override // o.C7592czC, o.InterfaceC7594czE
    public void c() {
        c(this.h);
        c(this.j);
        aJY ajy = this.h;
        if (ajy != null) {
            ajy.setBackgroundResource(com.netflix.mediaclient.ui.R.e.aP);
            this.h.setPadding(1, 1, 1, 1);
        }
        this.e = a();
        Thread thread = new Thread(new a(e(), null));
        this.f13790o = thread;
        thread.start();
    }
}
