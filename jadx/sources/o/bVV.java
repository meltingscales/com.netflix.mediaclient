package o;

import android.content.Context;
import android.util.TypedValue;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.impl.lolomo.rows.RowLoadingCreator$addModelsForNotLoadedRow$1$2;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.AbstractC3073as;
import o.AbstractC3781bKk;
import o.C4022bTi;
import o.C9834xU;
import o.InterfaceC6419ccu;
import o.bSJ;
import o.bSM;
import o.dpR;
import o.drO;

/* loaded from: classes4.dex */
public final class bVV {
    private final bNV a;
    private final bNN b;
    private final Context c;
    private final drO<Integer> d;
    private final drM<bSJ, dpR> e;
    private final int g;
    private final cYB j;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.CHARACTERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            b = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bVV(Context context, bNV bnv, bNN bnn, cYB cyb, drO<Integer> dro, drM<? super bSJ, dpR> drm) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) bnv, "");
        C8632dsu.c((Object) bnn, "");
        C8632dsu.c((Object) cyb, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        this.c = context;
        this.a = bnv;
        this.b = bnn;
        this.j = cyb;
        this.d = dro;
        this.e = drm;
        this.g = InterfaceC6419ccu.b.e.a();
    }

    public void e(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, int i, int i2, C1729aMb c1729aMb) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) c1729aMb, "");
        List<LoMo> c = c4049bUi.r().c();
        int size = c != null ? c.size() : 0;
        List<LoMo> c2 = c4049bUi.r().c();
        if (c2 == null || c2.size() == i) {
            return;
        }
        C3787bKq c3787bKq = new C3787bKq();
        String d = bSS.d(i2);
        c3787bKq.b((CharSequence) ("more-row-load-" + d));
        c3787bKq.c(C4022bTi.a.F);
        bSM.a aVar = bSM.e;
        c3787bKq.c(aVar.b());
        c3787bKq.d(true);
        c3787bKq.a(BrowseExperience.e());
        c3787bKq.d(aVar.a());
        c3787bKq.e(new AbstractC3073as.b() { // from class: o.bVW
            @Override // o.AbstractC3073as.b
            public final int b(int i3, int i4, int i5) {
                int e;
                e = bVV.e(i3, i4, i5);
                return e;
            }
        });
        interfaceC2023aX.add(c3787bKq);
        bKB.d(interfaceC2023aX, new RowLoadingCreator$addModelsForNotLoadedRow$1$2(i2, c1729aMb, this, i, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(InterfaceC2023aX interfaceC2023aX, LoMo loMo, int i, int i2, int i3, int i4, C1729aMb c1729aMb, boolean z, drO<dpR> dro) {
        int i5;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) dro, "");
        i5 = C8657dts.i(i3 + i4, i2);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = dro;
        for (int i6 = i3; i6 < i5; i6++) {
            a(interfaceC2023aX, loMo, i, i6, c1729aMb, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.rows.RowLoadingCreator$loadingShimmers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }

                public final void a() {
                    Ref.ObjectRef<drO<dpR>> objectRef2 = objectRef;
                    drO<dpR> dro2 = objectRef2.d;
                    if (dro2 != null) {
                        dro2.invoke();
                        objectRef2.d = null;
                    }
                }
            });
        }
        if (z) {
            int o2 = c1729aMb.o();
            for (int i7 = 0; i7 < o2; i7++) {
                bKU bku = new bKU();
                bku.d((CharSequence) ("loading-peek-" + i + "-" + (i5 + i7)));
                C1332Xp c1332Xp = C1332Xp.b;
                bku.d(Integer.valueOf((int) TypedValue.applyDimension(1, (float) 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
                interfaceC2023aX.add(bku);
            }
        }
    }

    public final void a(InterfaceC2023aX interfaceC2023aX, LoMo loMo, int i, int i2, C1729aMb c1729aMb, final drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) dro, "");
        if ((loMo != null ? loMo.getType() : null) != LoMoType.POPULAR_GAMES) {
            if ((loMo != null ? loMo.getType() : null) != LoMoType.EDITORIAL_GAMES) {
                if ((loMo != null ? loMo.getType() : null) != LoMoType.RECENTLY_RELEASED_GAMES) {
                    if ((loMo != null ? loMo.getType() : null) != LoMoType.MY_GAMES) {
                        if ((loMo != null ? loMo.getType() : null) != LoMoType.DEFAULT_GAMES) {
                            LoMoType type = loMo != null ? loMo.getType() : null;
                            LoMoType loMoType = LoMoType.IP_BASED_GAMES;
                            if (type != loMoType || C1864aRb.b.a().b()) {
                                if ((loMo != null ? loMo.getType() : null) == loMoType) {
                                    this.b.c(interfaceC2023aX, bSS.d(i, i2), this.c, this.a.b(c1729aMb), new InterfaceC4467bf() { // from class: o.bVZ
                                        @Override // o.InterfaceC4467bf
                                        public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                                            bVV.d(drO.this, abstractC3073as, (AbstractC3179au) obj, i3);
                                        }
                                    });
                                    return;
                                }
                                if ((loMo != null ? loMo.getType() : null) == LoMoType.FEED) {
                                    this.j.b(interfaceC2023aX, loMo, i2, this.d.invoke().intValue(), this.j.e(loMo), this.j.a(loMo), dro);
                                    return;
                                }
                                if ((loMo != null ? loMo.getType() : null) == LoMoType.DOWNLOADS_FOR_YOU && i2 == 0) {
                                    C3787bKq c3787bKq = new C3787bKq();
                                    String d = bSS.d(i, i2);
                                    c3787bKq.b((CharSequence) (d + "-dfy-row-header-shimmer"));
                                    c3787bKq.d(true);
                                    c3787bKq.c(bSM.e.b());
                                    c3787bKq.a(BrowseExperience.e());
                                    c3787bKq.c(true);
                                    c3787bKq.c((Integer) 2);
                                    interfaceC2023aX.add(c3787bKq);
                                }
                                C3787bKq c3787bKq2 = new C3787bKq();
                                c3787bKq2.b((CharSequence) bSS.d(i, i2));
                                c3787bKq2.c(bSM.e.b());
                                c3787bKq2.a(BrowseExperience.e());
                                c3787bKq2.c(true);
                                c3787bKq2.c(new InterfaceC4467bf() { // from class: o.bWa
                                    @Override // o.InterfaceC4467bf
                                    public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                                        bVV.d(drO.this, (C3787bKq) abstractC3073as, (AbstractC3781bKk.a) obj, i3);
                                    }
                                });
                                LoMoType type2 = loMo != null ? loMo.getType() : null;
                                if (type2 != null && b.b[type2.ordinal()] == 1) {
                                    c3787bKq2.b(true);
                                } else {
                                    c3787bKq2.d(true);
                                }
                                interfaceC2023aX.add(c3787bKq2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) bSS.d(i, i2));
        c3780bKj.e(C4022bTi.a.i);
        c3780bKj.c(new Pair<>(Integer.valueOf(this.a.b(c1729aMb)), -2));
        C3787bKq c3787bKq3 = new C3787bKq();
        String d2 = bSS.d(i, i2);
        c3787bKq3.b((CharSequence) (d2 + "-icon"));
        c3787bKq3.d(true);
        c3787bKq3.d(Integer.valueOf(this.c.getResources().getDimensionPixelSize(C9834xU.a.r)));
        bSM.a aVar = bSM.e;
        c3787bKq3.c(aVar.b());
        c3787bKq3.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq3);
        C3787bKq c3787bKq4 = new C3787bKq();
        String d3 = bSS.d(i, i2);
        c3787bKq4.b((CharSequence) (d3 + "-actual-shimmer"));
        c3787bKq4.c(C4022bTi.a.j);
        c3787bKq4.d(true);
        c3787bKq4.c(aVar.b());
        c3787bKq4.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq4);
        c3780bKj.b(new InterfaceC4467bf() { // from class: o.bVY
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                bVV.b(drO.this, (C3780bKj) abstractC3073as, (C2077aZ) obj, i3);
            }
        });
        interfaceC2023aX.add(c3780bKj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drO dro, C3780bKj c3780bKj, C2077aZ c2077aZ, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drO dro, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drO dro, C3787bKq c3787bKq, AbstractC3781bKk.a aVar, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    public final void a(int i, int i2, int i3) {
        if (i3 < i2 && this.g + i >= i3) {
            this.e.invoke(new bSJ.h(i3));
        }
        if (aQS.a.b()) {
            this.e.invoke(new bSJ.o(i));
        }
    }
}
