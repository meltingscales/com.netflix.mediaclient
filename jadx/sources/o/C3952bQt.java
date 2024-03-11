package o;

import android.os.Bundle;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$onCleared$1;
import com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$setThumbRating$result$1;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import io.reactivex.Single;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC5100bsQ;
import o.AbstractC8899fS;
import o.AbstractC8918fl;
import o.C3952bQt;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8932fz;
import o.GF;
import o.InterfaceC8585dra;
import o.bNF;
import o.dpR;
import o.drM;
import o.drX;

/* renamed from: o.bQt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3952bQt extends C9943zX<c> {
    public static final a c = new a(null);
    private final Single<AbstractC5100bsQ> b;
    private final bNF e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C3952bQt(@Assisted c cVar, bNF bnf, InterfaceC4360bcz interfaceC4360bcz) {
        super(cVar);
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) bnf, "");
        C8632dsu.c((Object) interfaceC4360bcz, "");
        this.e = bnf;
        this.b = interfaceC4360bcz.b().retry().cache();
    }

    /* renamed from: o.bQt$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp implements InterfaceC8906fZ<C3952bQt, c> {
        private final /* synthetic */ C1644aIy<C3952bQt, c> b;

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public C3952bQt create(AbstractC8979gt abstractC8979gt, c cVar) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) cVar, "");
            return this.b.create(abstractC8979gt, cVar);
        }

        private a() {
            super("GDPViewModel");
            this.b = new C1644aIy<>(C3952bQt.class);
        }

        /* renamed from: initialState */
        public c m3163initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            String string = ((Bundle) b).getString("game_id");
            if (string == null) {
                throw new IllegalArgumentException("gameID not set".toString());
            }
            return new c(string, null, false, 6, null);
        }
    }

    public static /* synthetic */ void e(C3952bQt c3952bQt, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c3952bQt.b(z);
    }

    public final void b(final boolean z) {
        e(new drM<c, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$fetchGameDetail$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3952bQt.c cVar) {
                c(cVar);
                return dpR.c;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$fetchGameDetail$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drM<InterfaceC8585dra<? super C3952bQt.d>, Object> {
                final /* synthetic */ C3952bQt.c b;
                final /* synthetic */ C3952bQt c;
                int d;
                final /* synthetic */ boolean e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C3952bQt c3952bQt, C3952bQt.c cVar, boolean z, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(1, interfaceC8585dra);
                    this.c = c3952bQt;
                    this.b = cVar;
                    this.e = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.c, this.b, this.e, interfaceC8585dra);
                }

                @Override // o.drM
                /* renamed from: d */
                public final Object invoke(InterfaceC8585dra<? super C3952bQt.d> interfaceC8585dra) {
                    return ((AnonymousClass1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    bNF bnf;
                    Single single;
                    e = C8586drb.e();
                    int i = this.d;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        bnf = this.c.e;
                        String a = this.b.a();
                        boolean z = this.e;
                        this.d = 1;
                        obj = bnf.e(a, z, this);
                        if (obj == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    single = this.c.b;
                    return new C3952bQt.d((GameDetails) obj, (AbstractC5100bsQ) single.blockingGet());
                }
            }

            public final void c(C3952bQt.c cVar) {
                C8632dsu.c((Object) cVar, "");
                if (cVar.c() instanceof C8932fz) {
                    return;
                }
                C3952bQt c3952bQt = C3952bQt.this;
                AbstractC8899fS.c(c3952bQt, new AnonymousClass1(c3952bQt, cVar, z, null), GF.d(), null, new drX<C3952bQt.c, AbstractC8918fl<? extends C3952bQt.d>, C3952bQt.c>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$fetchGameDetail$1.2
                    @Override // o.drX
                    /* renamed from: b */
                    public final C3952bQt.c invoke(C3952bQt.c cVar2, AbstractC8918fl<C3952bQt.d> abstractC8918fl) {
                        C8632dsu.c((Object) cVar2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        return C3952bQt.c.copy$default(cVar2, null, abstractC8918fl, false, 5, null);
                    }
                }, 2, null);
            }
        });
    }

    public final void e(String str, int i, int i2, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfo, "");
        C8738dws.e(e(), null, null, new GdpViewModel$setThumbRating$result$1(this, i, trackingInfo, str, i2, null), 3, null);
    }

    public final void h() {
        b(new drM<c, c>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$onThumbsErrorShown$1
            @Override // o.drM
            /* renamed from: a */
            public final C3952bQt.c invoke(C3952bQt.c cVar) {
                C8632dsu.c((Object) cVar, "");
                return C3952bQt.c.copy$default(cVar, null, null, false, 3, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long d(int i, TrackingInfo trackingInfo) {
        return Logger.INSTANCE.startSession(cPU.e.d(i, AppView.thumbButton, AppView.gameDetails, trackingInfo));
    }

    @Override // o.C9943zX, o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        e(GdpViewModel$onCleared$1.a);
        super.d();
    }

    /* renamed from: o.bQt$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8962gc {
        private final String a;
        private final AbstractC8918fl<d> c;
        private final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, String str, AbstractC8918fl abstractC8918fl, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                abstractC8918fl = cVar.c;
            }
            if ((i & 4) != 0) {
                z = cVar.d;
            }
            return cVar.e(str, abstractC8918fl, z);
        }

        public final String a() {
            return this.a;
        }

        public final AbstractC8918fl<d> c() {
            return this.c;
        }

        public final String component1() {
            return this.a;
        }

        public final AbstractC8918fl<d> component2() {
            return this.c;
        }

        public final boolean component3() {
            return this.d;
        }

        public final c e(String str, AbstractC8918fl<d> abstractC8918fl, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) abstractC8918fl, "");
            return new c(str, abstractC8918fl, z);
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c) && this.d == cVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            String str = this.a;
            AbstractC8918fl<d> abstractC8918fl = this.c;
            boolean z = this.d;
            return "State(gameId=" + str + ", asyncResponse=" + abstractC8918fl + ", showThumbsError=" + z + ")";
        }

        public c(String str, AbstractC8918fl<d> abstractC8918fl, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) abstractC8918fl, "");
            this.a = str;
            this.c = abstractC8918fl;
            this.d = z;
        }

        public /* synthetic */ c(String str, AbstractC8918fl abstractC8918fl, boolean z, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? C8974go.e : abstractC8918fl, (i & 4) != 0 ? false : z);
        }

        public final boolean b() {
            return this.c instanceof InterfaceC8881fA;
        }
    }

    /* renamed from: o.bQt$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final AbstractC5100bsQ b;
        private final GameDetails c;

        public final AbstractC5100bsQ b() {
            return this.b;
        }

        public final GameDetails d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            AbstractC5100bsQ abstractC5100bsQ = this.b;
            return (hashCode * 31) + (abstractC5100bsQ == null ? 0 : abstractC5100bsQ.hashCode());
        }

        public String toString() {
            GameDetails gameDetails = this.c;
            AbstractC5100bsQ abstractC5100bsQ = this.b;
            return "ResponseData(gameDetails=" + gameDetails + ", videoGroup=" + abstractC5100bsQ + ")";
        }

        public d(GameDetails gameDetails, AbstractC5100bsQ abstractC5100bsQ) {
            C8632dsu.c((Object) gameDetails, "");
            this.c = gameDetails;
            this.b = abstractC5100bsQ;
        }
    }
}
