package o;

import android.icu.text.SimpleDateFormat;
import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7939dav;

/* renamed from: o.dbz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7996dbz extends AbstractC3336ax<a> {
    public static final b c = new b(null);
    public SimpleDateFormat b;
    private View.OnClickListener d;
    private String f;

    @Override // o.AbstractC3073as
    public int a() {
        return C7939dav.a.G;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final String k() {
        return this.f;
    }

    public final View.OnClickListener l() {
        return this.d;
    }

    public final void l_(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    /* renamed from: o.dbz$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ReleaseCountdownModel");
        }
    }

    public final SimpleDateFormat i() {
        SimpleDateFormat simpleDateFormat = this.b;
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        r1 = o.C8542dpl.e(r1);
     */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC7996dbz.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r7, r0)
            o.dbE r0 = r7.b()
            android.view.View$OnClickListener r1 = r6.d
            r0.setOnClickListener(r1)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r0.setClickable(r1)
            o.dbE r0 = r7.b()
            java.lang.String r1 = r6.f
            r2 = 0
            if (r1 == 0) goto L45
            android.icu.text.SimpleDateFormat r4 = r6.i()     // Catch: java.text.ParseException -> L3b
            java.util.Date r1 = r4.parse(r1)     // Catch: java.text.ParseException -> L3b
            if (r1 == 0) goto L39
            j$.time.Instant r1 = o.C8541dpk.a(r1)     // Catch: java.text.ParseException -> L3b
            if (r1 == 0) goto L39
            long r4 = r1.b()     // Catch: java.text.ParseException -> L3b
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.text.ParseException -> L3b
            goto L3f
        L39:
            r1 = 0
            goto L3f
        L3b:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        L3f:
            if (r1 == 0) goto L45
            long r2 = r1.longValue()
        L45:
            r0.setTimeInMs(r2)
            o.dbE r7 = r7.b()
            r7.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7996dbz.e(o.dbz$a):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.b().a();
        C7949dbE b2 = aVar.b();
        b2.setOnClickListener(null);
        b2.setClickable(false);
    }

    /* renamed from: o.dbz$a */
    /* loaded from: classes5.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "countdownView", "getCountdownView()Lcom/netflix/mediaclient/ui/upnextfeed/impl/models/ReleaseCountdownView;", 0))};
        private final dsZ a = bIF.c(this, C7939dav.d.e, true);

        public final C7949dbE b() {
            return (C7949dbE) this.a.getValue(this, e[0]);
        }
    }
}
