package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bwv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5343bwv extends ContextWrapper {
    public static final c d = new c(null);
    private final InterfaceC5337bwp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5343bwv(Context context, InterfaceC5337bwp interfaceC5337bwp) {
        super(context);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5337bwp, "");
        this.a = interfaceC5337bwp;
    }

    /* renamed from: o.bwv$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SafeToastContext");
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        Context applicationContext = getBaseContext().getApplicationContext();
        C8632dsu.a(applicationContext, "");
        return new d(this, applicationContext);
    }

    /* renamed from: o.bwv$d */
    /* loaded from: classes4.dex */
    final class d extends ContextWrapper {
        final /* synthetic */ C5343bwv e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C5343bwv c5343bwv, Context context) {
            super(context);
            C8632dsu.c((Object) context, "");
            this.e = c5343bwv;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            C8632dsu.c((Object) str, "");
            if (C8632dsu.c((Object) "window", (Object) str)) {
                C5343bwv c5343bwv = this.e;
                Object systemService = getBaseContext().getSystemService(str);
                C8632dsu.d(systemService);
                return new e(c5343bwv, (WindowManager) systemService);
            }
            return super.getSystemService(str);
        }
    }

    /* renamed from: o.bwv$e */
    /* loaded from: classes4.dex */
    final class e implements WindowManager {
        final /* synthetic */ C5343bwv d;
        private final WindowManager e;

        public e(C5343bwv c5343bwv, WindowManager windowManager) {
            C8632dsu.c((Object) windowManager, "");
            this.d = c5343bwv;
            this.e = windowManager;
        }

        @Override // android.view.WindowManager
        public Display getDefaultDisplay() {
            Display defaultDisplay = this.e.getDefaultDisplay();
            C8632dsu.a(defaultDisplay, "");
            return defaultDisplay;
        }

        @Override // android.view.WindowManager
        public void removeViewImmediate(View view) {
            C8632dsu.c((Object) view, "");
            this.e.removeViewImmediate(view);
        }

        @Override // android.view.ViewManager
        public void addView(View view, ViewGroup.LayoutParams layoutParams) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) layoutParams, "");
            try {
                C5343bwv.d.getLogTag();
                this.e.addView(view, layoutParams);
            } catch (WindowManager.BadTokenException e) {
                c cVar = C5343bwv.d;
                this.d.a.c(e);
            } catch (Throwable unused) {
                c cVar2 = C5343bwv.d;
            }
        }

        @Override // android.view.ViewManager
        public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) layoutParams, "");
            this.e.updateViewLayout(view, layoutParams);
        }

        @Override // android.view.ViewManager
        public void removeView(View view) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) view, "");
            try {
                this.e.removeView(view);
            } catch (Throwable unused) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("SPY-18205 Exception happened when trying to remove a view from SafeToastContext", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
        }
    }
}
