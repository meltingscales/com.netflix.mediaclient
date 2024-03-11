package o;

import com.netflix.android.org.json.zip.JSONzip;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5271bvc;
import o.C5528cAt;
import o.C5530cAv;
import o.C5533cAy;
import o.C8572dqo;
import o.C8632dsu;
import o.cHK;
import o.dpR;
import o.drM;

/* renamed from: o.cAy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5533cAy extends AbstractC8899fS<C5530cAv> {
    public static final a a = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C5533cAy(@Assisted C5530cAv c5530cAv) {
        super(c5530cAv, null, 2, null);
        C8632dsu.c((Object) c5530cAv, "");
    }

    /* renamed from: o.cAy$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp implements InterfaceC8906fZ<C5533cAy, C5530cAv> {
        private final /* synthetic */ C1644aIy<C5533cAy, C5530cAv> d;

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public C5533cAy create(AbstractC8979gt abstractC8979gt, C5530cAv c5530cAv) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c5530cAv, "");
            return this.d.create(abstractC8979gt, c5530cAv);
        }

        private a() {
            super("PostPlayPreviewsViewModel");
            this.d = new C1644aIy<>(C5533cAy.class);
        }

        /* renamed from: initialState */
        public C5530cAv m3170initialState(AbstractC8979gt abstractC8979gt) {
            List i;
            List i2;
            C8632dsu.c((Object) abstractC8979gt, "");
            i = C8569dql.i();
            i2 = C8569dql.i();
            return new C5530cAv(i, new C5524cAp(new AbstractC5271bvc.c("postplay-previews-empty-list-id", i2)));
        }
    }

    public final void b(final List<C5528cAt> list, final C5524cAp c5524cAp) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c5524cAp, "");
        b(new drM<C5530cAv, C5530cAv>() { // from class: com.netflix.mediaclient.ui.player.postplay.data.PostPlayPreviewsViewModel$updatePreviews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C5530cAv invoke(C5530cAv c5530cAv) {
                C8632dsu.c((Object) c5530cAv, "");
                return c5530cAv.a(list, c5524cAp);
            }
        });
    }

    public final void a(final cHK.e eVar) {
        C8632dsu.c((Object) eVar, "");
        e(new drM<C5530cAv, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.data.PostPlayPreviewsViewModel$updateMyListStateForPreviews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5530cAv c5530cAv) {
                d(c5530cAv);
                return dpR.c;
            }

            public final void d(C5530cAv c5530cAv) {
                int d;
                boolean n;
                C5528cAt a2;
                C8632dsu.c((Object) c5530cAv, "");
                List<C5528cAt> e = c5530cAv.e();
                cHK.e eVar2 = eVar;
                d = C8572dqo.d(e, 10);
                final ArrayList arrayList = new ArrayList(d);
                for (C5528cAt c5528cAt : e) {
                    if (C8632dsu.c((Object) eVar2.e(), (Object) String.valueOf(c5528cAt.c().getVideoId()))) {
                        n = eVar2.d();
                    } else {
                        n = c5528cAt.n();
                    }
                    a2 = c5528cAt.a((r30 & 1) != 0 ? c5528cAt.l : 0, (r30 & 2) != 0 ? c5528cAt.h : 0, (r30 & 4) != 0 ? c5528cAt.j : null, (r30 & 8) != 0 ? c5528cAt.a : null, (r30 & 16) != 0 ? c5528cAt.c : null, (r30 & 32) != 0 ? c5528cAt.i : 0, (r30 & 64) != 0 ? c5528cAt.k : 0, (r30 & 128) != 0 ? c5528cAt.d : null, (r30 & JSONzip.end) != 0 ? c5528cAt.g : 0, (r30 & 512) != 0 ? c5528cAt.n : null, (r30 & 1024) != 0 ? c5528cAt.f : null, (r30 & 2048) != 0 ? c5528cAt.e : null, (r30 & 4096) != 0 ? c5528cAt.m : null, (r30 & 8192) != 0 ? c5528cAt.b : n);
                    arrayList.add(a2);
                }
                C5533cAy.this.b(new drM<C5530cAv, C5530cAv>() { // from class: com.netflix.mediaclient.ui.player.postplay.data.PostPlayPreviewsViewModel$updateMyListStateForPreviews$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: d */
                    public final C5530cAv invoke(C5530cAv c5530cAv2) {
                        C8632dsu.c((Object) c5530cAv2, "");
                        return C5530cAv.copy$default(c5530cAv2, arrayList, null, 2, null);
                    }
                });
            }
        });
    }
}
