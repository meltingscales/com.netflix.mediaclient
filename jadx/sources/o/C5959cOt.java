package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cOt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5959cOt extends BaseVerticalRecyclerViewAdapter<BaseVerticalRecyclerViewAdapter.d> {
    public static final e b = new e(null);
    private final List<InterfaceC5153btQ> f;

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int d(int i) {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5959cOt(Context context) {
        super(context, new C1729aMb(0, C4000bSn.e(context), 1.0f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.25f, 0, null, true, false, false, 0, 0, 1, false, 0, null, 0, 0, false, 8320664, null));
        C8632dsu.c((Object) context, "");
        this.f = new ArrayList();
        h();
    }

    /* renamed from: o.cOt$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("LolopiAdapter");
        }
    }

    public final void b(InterfaceC5147btK interfaceC5147btK) {
        if (interfaceC5147btK != null) {
            this.f.clear();
            this.f.addAll(interfaceC5147btK.getListOfListOfProfileIcons());
            f();
        }
    }

    public final C1729aMb j() {
        C1729aMb a = a(0);
        C8632dsu.a(a, "");
        return a;
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int e() {
        List<InterfaceC5153btQ> list = this.f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int a(boolean z) {
        return e();
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public AbstractC9900yh<?> c(Context context, C1729aMb c1729aMb, int i) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1729aMb, "");
        return new C5965cOz(context, c1729aMb, i, c(i));
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public BaseVerticalRecyclerViewAdapter.d a(ViewGroup viewGroup, C1729aMb c1729aMb) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) c1729aMb, "");
        if (c1729aMb.p() == 0) {
            return c(viewGroup, c1729aMb);
        }
        throw new IllegalArgumentException("LolopiAdapter.onCreateViewHolder should not reach the else block. A view type not implemented?");
    }

    private final C5964cOy c(ViewGroup viewGroup, C1729aMb c1729aMb) {
        cOH a = cOH.a(this.d, viewGroup, false);
        C8632dsu.a(a, "");
        return new C5964cOy(a, c1729aMb);
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public void d(BaseVerticalRecyclerViewAdapter.d dVar, int i, AbstractC9900yh<?> abstractC9900yh, Parcelable parcelable) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) abstractC9900yh, "");
        if (dVar instanceof C5964cOy) {
            if (getItemViewType(i) == 0) {
                a((C5964cOy) dVar, i, abstractC9900yh, parcelable);
                return;
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k2 = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("LolopiAdapter.onBindViewHolder should not reach the else block. A view type not implemented?", null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                th2 = c1596aHd.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar2.a();
            if (a != null) {
                a.e(c1596aHd, th2);
                return;
            } else {
                dVar2.e().b(c1596aHd, th2);
                return;
            }
        }
        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd2 = new C1596aHd("LolopiAdapter.onBindViewHolder, holder was not LolopiRowViewHolder?", null, null, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd2.a;
        if (errorType2 != null) {
            c1596aHd2.e.put("errorType", errorType2.c());
            String b3 = c1596aHd2.b();
            if (b3 != null) {
                String c2 = errorType2.c();
                c1596aHd2.a(c2 + " " + b3);
            }
        }
        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
            th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
        } else if (c1596aHd2.b() != null) {
            th = new Throwable(c1596aHd2.b());
        } else {
            th = c1596aHd2.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar3.a();
        if (a2 != null) {
            a2.e(c1596aHd2, th);
        } else {
            dVar3.e().b(c1596aHd2, th);
        }
    }

    private final InterfaceC5153btQ c(int i) {
        if (i < e()) {
            return this.f.get(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(o.C5964cOy r11, int r12, o.AbstractC9900yh<?> r13, android.os.Parcelable r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5959cOt.a(o.cOy, int, o.yh, android.os.Parcelable):void");
    }
}
