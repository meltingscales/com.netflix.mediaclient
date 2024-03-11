package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.arch.core.util.Function;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class aWW {
    protected Context a;
    protected final ArrayList<AbstractC2065aYo<?>> b;
    protected aWP c;
    protected InterfaceC5129bst d;
    protected aVJ e;
    protected C2012aWp h;

    public void b() {
    }

    public abstract void b(String str, String str2, String str3);

    public void e() {
    }

    public Context f() {
        return this.a;
    }

    public void g() {
    }

    public InterfaceC5129bst k() {
        return this.d;
    }

    public aWP m() {
        return this.c;
    }

    public aVJ o() {
        return this.e;
    }

    aWW() {
        this.b = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aWW(Context context, C2012aWp c2012aWp, InterfaceC5129bst interfaceC5129bst) {
        this();
        this.a = context;
        this.d = interfaceC5129bst;
        this.h = c2012aWp;
        this.e = c2012aWp.g();
        this.c = c2012aWp.f();
    }

    public C2013aWq r() {
        C2012aWp c2012aWp = this.h;
        if (c2012aWp != null) {
            return c2012aWp.n();
        }
        return null;
    }

    public Handler n() {
        return this.h.i();
    }

    public Looper l() {
        return this.h.h();
    }

    public AbstractC2065aYo<?>[] j() {
        AbstractC2065aYo<?>[] abstractC2065aYoArr;
        synchronized (this.b) {
            abstractC2065aYoArr = (AbstractC2065aYo[]) this.b.toArray(new AbstractC2065aYo[0]);
        }
        return abstractC2065aYoArr;
    }

    public void t() {
        final AbstractC2065aYo<?> h = h();
        a(false, new Function() { // from class: o.aXc
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                Boolean e;
                e = aWW.e(AbstractC2065aYo.this, (AbstractC2065aYo) obj);
                return e;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean e(AbstractC2065aYo abstractC2065aYo, AbstractC2065aYo abstractC2065aYo2) {
        return Boolean.valueOf(!abstractC2065aYo2.a(abstractC2065aYo));
    }

    public AbstractC2065aYo<?> d(String str) {
        synchronized (this.b) {
            Iterator<AbstractC2065aYo<?>> it = this.b.iterator();
            while (it.hasNext()) {
                AbstractC2065aYo<?> next = it.next();
                if (next.a(str)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2065aYo<?> h() {
        C2012aWp c2012aWp = this.h;
        if (c2012aWp != null) {
            return c2012aWp.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String i() {
        AbstractC2065aYo<?> h = h();
        return h != null ? h.t() : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SessionMdxTarget<?> b(String str) {
        AbstractC2065aYo<?> d = d(str);
        if (d != null) {
            return d.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(boolean z) {
        a(z, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z, Function<AbstractC2065aYo<?>, Boolean> function) {
        synchronized (this.b) {
            Iterator<AbstractC2065aYo<?>> it = this.b.iterator();
            while (it.hasNext()) {
                AbstractC2065aYo<?> next = it.next();
                if (function == null || function.apply(next).booleanValue()) {
                    SessionMdxTarget c = next.c();
                    if (c != null) {
                        C1044Mm.c("AbsMdxStack", "resetAllDeviceState, %s %s", c.t(), c.k());
                        c.Q();
                        if (c.N()) {
                        }
                    }
                    if (z) {
                        it.remove();
                    }
                }
            }
        }
    }
}
