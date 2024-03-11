package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import o.C8781dyh;
import o.dpR;

/* renamed from: o.dyh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8781dyh extends AbstractC8788dyo {
    private volatile C8781dyh _immediate;
    private final C8781dyh a;
    private final boolean b;
    private final String c;
    private final Handler e;

    @Override // o.dxN
    /* renamed from: e */
    public C8781dyh c() {
        return this.a;
    }

    /* renamed from: o.dyh$b */
    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        final /* synthetic */ InterfaceC8743dwx a;
        final /* synthetic */ C8781dyh b;

        public b(InterfaceC8743dwx interfaceC8743dwx, C8781dyh c8781dyh) {
            this.a = interfaceC8743dwx;
            this.b = c8781dyh;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.e(this.b, dpR.c);
        }
    }

    private C8781dyh(Handler handler, String str, boolean z) {
        super(null);
        this.e = handler;
        this.c = str;
        this.b = z;
        this._immediate = z ? this : null;
        C8781dyh c8781dyh = this._immediate;
        if (c8781dyh == null) {
            c8781dyh = new C8781dyh(handler, str, true);
            this._immediate = c8781dyh;
        }
        this.a = c8781dyh;
    }

    public /* synthetic */ C8781dyh(Handler handler, String str, int i, C8627dsp c8627dsp) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C8781dyh(Handler handler, String str) {
        this(handler, str, false);
    }

    @Override // o.dwQ
    public boolean isDispatchNeeded(dqZ dqz) {
        return (this.b && C8632dsu.c(Looper.myLooper(), this.e.getLooper())) ? false : true;
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        if (this.e.post(runnable)) {
            return;
        }
        a(dqz, runnable);
    }

    @Override // o.AbstractC8788dyo, o.InterfaceC8748dxb
    public InterfaceC8760dxn e(long j, final Runnable runnable, dqZ dqz) {
        long d;
        Handler handler = this.e;
        d = C8657dts.d(j, 4611686018427387903L);
        if (handler.postDelayed(runnable, d)) {
            return new InterfaceC8760dxn() { // from class: o.dym
                @Override // o.InterfaceC8760dxn
                public final void co_() {
                    C8781dyh.a(C8781dyh.this, runnable);
                }
            };
        }
        a(dqz, runnable);
        return dxR.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C8781dyh c8781dyh, Runnable runnable) {
        c8781dyh.e.removeCallbacks(runnable);
    }

    private final void a(dqZ dqz, Runnable runnable) {
        dxG.c(dqz, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C8752dxf.a().dispatch(dqz, runnable);
    }

    @Override // o.dxN, o.dwQ
    public String toString() {
        String d = d();
        if (d == null) {
            String str = this.c;
            if (str == null) {
                str = this.e.toString();
            }
            if (this.b) {
                return str + ".immediate";
            }
            return str;
        }
        return d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8781dyh) && ((C8781dyh) obj).e == this.e;
    }

    public int hashCode() {
        return System.identityHashCode(this.e);
    }

    @Override // o.InterfaceC8748dxb
    public void b(long j, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        long d;
        final b bVar = new b(interfaceC8743dwx, this);
        Handler handler = this.e;
        d = C8657dts.d(j, 4611686018427387903L);
        if (handler.postDelayed(bVar, d)) {
            interfaceC8743dwx.a(new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void c(Throwable th) {
                    Handler handler2;
                    handler2 = C8781dyh.this.e;
                    handler2.removeCallbacks(bVar);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }
            });
        } else {
            a(interfaceC8743dwx.getContext(), bVar);
        }
    }
}
