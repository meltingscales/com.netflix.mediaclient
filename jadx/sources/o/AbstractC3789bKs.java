package o;

import android.widget.EditText;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1208Sv;
import o.C3796bKz;

/* renamed from: o.bKs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3789bKs extends AbstractC3336ax<c> {
    private C1208Sv.d b;
    private String c;
    private boolean d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.s;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void e(C1208Sv.d dVar) {
        this.b = dVar;
    }

    public final boolean i() {
        return this.d;
    }

    public final String k() {
        return this.c;
    }

    public final C1208Sv.d l() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        Iterable p;
        List<Pair> h;
        C8632dsu.c((Object) cVar, "");
        super.e((AbstractC3789bKs) cVar);
        cVar.c().setPinChangeListener(this.b);
        int i = 0;
        for (Object obj : cVar.c().d()) {
            if (i < 0) {
                C8569dql.h();
            }
            C9696vK.e((EditText) obj, this.d, C3796bKz.b.b, C3796bKz.b.c);
            i++;
        }
        String str = this.c;
        if (str != null) {
            List<EditText> d = cVar.c().d();
            p = duB.p(str);
            h = C8576dqs.h(d, p);
            for (Pair pair : h) {
                ((EditText) pair.b()).setText(String.valueOf(((Character) pair.c()).charValue()));
            }
        }
        cVar.d();
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.b((AbstractC3789bKs) cVar);
        cVar.a();
    }

    /* renamed from: o.bKs$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(c.class, "pinViewGroup", "getPinViewGroup()Lcom/netflix/mediaclient/android/widget/PinEntryViewGroup;", 0))};
        public static final int d = 8;
        private final dsZ a = bIF.d(this, C3796bKz.a.q, false, 2, null);

        public final C1208Sv c() {
            return (C1208Sv) this.a.getValue(this, c[0]);
        }

        public final void d() {
            c().setFirstTouchEventInterception(true);
        }

        public final void a() {
            for (EditText editText : c().d()) {
                editText.getText().clear();
            }
        }
    }
}
