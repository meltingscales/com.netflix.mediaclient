package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.bXh */
/* loaded from: classes4.dex */
public final class C4129bXh {

    /* renamed from: o.bXh$a */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.ROAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoMoType.TOP_TEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoMoType.CHARACTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoMoType.CONTINUE_WATCHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoMoType.BILLBOARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            c = iArr;
        }
    }

    public static /* synthetic */ void d(C4001bSo c4001bSo, InterfaceC9638uF interfaceC9638uF, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = d();
        }
        e(c4001bSo, interfaceC9638uF, i);
    }

    public static final void e(C4001bSo c4001bSo, final InterfaceC9638uF interfaceC9638uF, final int i) {
        C8632dsu.c((Object) c4001bSo, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        final List<C4003bSq> e = c4001bSo.e();
        if (e == null || e.isEmpty()) {
            return;
        }
        C8187dfe.c(new Runnable() { // from class: o.bXj
            @Override // java.lang.Runnable
            public final void run() {
                C4129bXh.a(e, i, interfaceC9638uF);
            }
        });
    }

    public static final void a(List list, int i, InterfaceC9638uF interfaceC9638uF) {
        List j;
        C8632dsu.c((Object) interfaceC9638uF, "");
        j = C8576dqs.j((Iterable) list, i);
        ArrayList<C4003bSq> arrayList = new ArrayList();
        for (Object obj : j) {
            List<C4002bSp> e = ((C4003bSq) obj).e();
            if (!(e == null || e.isEmpty())) {
                arrayList.add(obj);
            }
        }
        for (C4003bSq c4003bSq : arrayList) {
            d(c4003bSq, interfaceC9638uF);
        }
    }

    private static final void d(C4003bSq c4003bSq, InterfaceC9638uF interfaceC9638uF) {
        VideoInfo.TallPanelArt a2;
        VideoInfo.TopTenBoxart b;
        BillboardSummary f;
        BillboardAsset horizontalBackground;
        BillboardSummary f2;
        BillboardAsset logo;
        BillboardSummary f3;
        BillboardAsset background;
        List<C4002bSp> e = c4003bSq.e();
        LoMoType type = c4003bSq.b().getType();
        if (e == null || e.isEmpty() || type == null) {
            return;
        }
        int i = 0;
        for (Object obj : e) {
            if (i < 0) {
                C8569dql.h();
            }
            C4002bSp c4002bSp = (C4002bSp) obj;
            InterfaceC5149btM evidence = c4002bSp.a().getEvidence();
            String str = null;
            a(interfaceC9638uF, evidence != null ? evidence.getImageUrl() : null);
            int i2 = a.c[type.ordinal()];
            if (i2 == 1) {
                InterfaceC5223buh video = c4002bSp.a().getVideo();
                InterfaceC5216bua interfaceC5216bua = video instanceof InterfaceC5216bua ? (InterfaceC5216bua) video : null;
                if (interfaceC5216bua != null && (a2 = interfaceC5216bua.a()) != null) {
                    str = a2.getUrl();
                }
                a(interfaceC9638uF, str);
            } else if (i2 == 2) {
                InterfaceC5223buh video2 = c4002bSp.a().getVideo();
                InterfaceC5217bub interfaceC5217bub = video2 instanceof InterfaceC5217bub ? (InterfaceC5217bub) video2 : null;
                if (interfaceC5217bub != null && (b = interfaceC5217bub.b()) != null) {
                    str = b.getUrl();
                }
                a(interfaceC9638uF, str);
            } else if (i2 == 3 || i2 == 4) {
                a(interfaceC9638uF, c4002bSp.a().getVideo().getBoxshotUrl());
            } else if (i2 == 5) {
                InterfaceC5223buh video3 = c4002bSp.a().getVideo();
                InterfaceC5180btr interfaceC5180btr = video3 instanceof InterfaceC5180btr ? (InterfaceC5180btr) video3 : null;
                a(interfaceC9638uF, (interfaceC5180btr == null || (f3 = interfaceC5180btr.f()) == null || (background = f3.getBackground()) == null) ? null : background.getUrl());
                InterfaceC5223buh video4 = c4002bSp.a().getVideo();
                InterfaceC5180btr interfaceC5180btr2 = video4 instanceof InterfaceC5180btr ? (InterfaceC5180btr) video4 : null;
                a(interfaceC9638uF, (interfaceC5180btr2 == null || (f2 = interfaceC5180btr2.f()) == null || (logo = f2.getLogo()) == null) ? null : logo.getUrl());
                InterfaceC5223buh video5 = c4002bSp.a().getVideo();
                InterfaceC5180btr interfaceC5180btr3 = video5 instanceof InterfaceC5180btr ? (InterfaceC5180btr) video5 : null;
                if (interfaceC5180btr3 != null && (f = interfaceC5180btr3.f()) != null && (horizontalBackground = f.getHorizontalBackground()) != null) {
                    str = horizontalBackground.getUrl();
                }
                a(interfaceC9638uF, str);
            }
            i++;
        }
    }

    private static final void a(InterfaceC9638uF interfaceC9638uF, String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (g) {
                return;
            }
            SubscribersKt.subscribeBy$default(interfaceC9638uF.d(C9646uN.d.a().e(str).b()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.LolomoImagesPrefetchHelperKt$cacheImage$1
                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }
            }, (drM) null, 2, (Object) null);
        }
    }

    private static final int d() {
        return C8150deu.h() ? 6 : 3;
    }
}
