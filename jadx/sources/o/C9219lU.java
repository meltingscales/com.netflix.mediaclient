package o;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.lU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9219lU {
    public static final c c = new c(null);
    private final C9258mG a;
    private final InterfaceC9200lB b;
    private final InterfaceC9217lS d;
    private final InterfaceC9217lS e;
    private final Set<InterfaceC9217lS> h;
    private final InterfaceC9217lS i;

    public final InterfaceC9217lS d() {
        return this.d;
    }

    public C9219lU(Set<? extends InterfaceC9217lS> set, C9258mG c9258mG, InterfaceC9200lB interfaceC9200lB) {
        Set<InterfaceC9217lS> W;
        this.a = c9258mG;
        this.b = interfaceC9200lB;
        InterfaceC9217lS d = d("com.bugsnag.android.NdkPlugin", c9258mG.g().e());
        this.d = d;
        InterfaceC9217lS d2 = d("com.bugsnag.android.AnrPlugin", c9258mG.g().d());
        this.e = d2;
        InterfaceC9217lS d3 = d("com.bugsnag.android.BugsnagReactNativePlugin", c9258mG.g().b());
        this.i = d3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        if (d != null) {
            linkedHashSet.add(d);
        }
        if (d2 != null) {
            linkedHashSet.add(d2);
        }
        if (d3 != null) {
            linkedHashSet.add(d3);
        }
        W = C8576dqs.W(linkedHashSet);
        this.h = W;
    }

    /* renamed from: o.lU$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    private final InterfaceC9217lS d(String str, boolean z) {
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance != null) {
                return (InterfaceC9217lS) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.Plugin");
        } catch (ClassNotFoundException unused) {
            if (z) {
                InterfaceC9200lB interfaceC9200lB = this.b;
                interfaceC9200lB.b("Plugin '" + str + "' is not on the classpath - functionality will not be enabled.");
            }
            return null;
        } catch (Throwable th) {
            InterfaceC9200lB interfaceC9200lB2 = this.b;
            interfaceC9200lB2.c("Failed to load plugin '" + str + '\'', th);
            return null;
        }
    }

    public final void a(C9191kt c9191kt) {
        for (InterfaceC9217lS interfaceC9217lS : this.h) {
            try {
                d(interfaceC9217lS, c9191kt);
            } catch (Throwable th) {
                InterfaceC9200lB interfaceC9200lB = this.b;
                interfaceC9200lB.c("Failed to load plugin " + interfaceC9217lS + ", continuing with initialisation.", th);
            }
        }
    }

    public final void a(C9191kt c9191kt, boolean z) {
        b(c9191kt, z);
        if (z) {
            InterfaceC9217lS interfaceC9217lS = this.d;
            if (interfaceC9217lS == null) {
                return;
            }
            interfaceC9217lS.load(c9191kt);
            return;
        }
        InterfaceC9217lS interfaceC9217lS2 = this.d;
        if (interfaceC9217lS2 == null) {
            return;
        }
        interfaceC9217lS2.unload();
    }

    public final void b(C9191kt c9191kt, boolean z) {
        if (z) {
            InterfaceC9217lS interfaceC9217lS = this.e;
            if (interfaceC9217lS == null) {
                return;
            }
            interfaceC9217lS.load(c9191kt);
            return;
        }
        InterfaceC9217lS interfaceC9217lS2 = this.e;
        if (interfaceC9217lS2 == null) {
            return;
        }
        interfaceC9217lS2.unload();
    }

    public final InterfaceC9217lS e(Class<?> cls) {
        Object obj;
        Iterator<T> it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c(((InterfaceC9217lS) obj).getClass(), cls)) {
                break;
            }
        }
        return (InterfaceC9217lS) obj;
    }

    private final void d(InterfaceC9217lS interfaceC9217lS, C9191kt c9191kt) {
        String name = interfaceC9217lS.getClass().getName();
        C9226lb g = this.a.g();
        if (C8632dsu.c((Object) name, (Object) "com.bugsnag.android.NdkPlugin")) {
            if (g.e()) {
                interfaceC9217lS.load(c9191kt);
            }
        } else if (C8632dsu.c((Object) name, (Object) "com.bugsnag.android.AnrPlugin")) {
            if (g.d()) {
                interfaceC9217lS.load(c9191kt);
            }
        } else {
            interfaceC9217lS.load(c9191kt);
        }
    }
}
