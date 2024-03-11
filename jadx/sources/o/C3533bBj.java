package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTasteData;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteViewModel$fetchCollectTasteTitlesData$1;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteViewModel$fireCollectTasteInteractionTag$1;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteViewModel$refreshBulkRaterRow$1;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteViewModel$setRating$1;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.RefreshState;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractC8918fl;
import o.C1346Yd;
import o.C3528bBe;
import o.C8632dsu;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;

/* renamed from: o.bBj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3533bBj extends AbstractC8899fS<C3528bBe> {
    public static final e e = new e(null);
    private final Lazy<InterfaceC3993bSg> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C3533bBj(@Assisted C3528bBe c3528bBe, Lazy<InterfaceC3993bSg> lazy) {
        super(c3528bBe, null, 2, null);
        C8632dsu.c((Object) c3528bBe, "");
        C8632dsu.c((Object) lazy, "");
        this.a = lazy;
    }

    /* renamed from: o.bBj$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp implements InterfaceC8906fZ<C3533bBj, C3528bBe> {
        private final /* synthetic */ C1644aIy<C3533bBj, C3528bBe> b;

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public C3533bBj create(AbstractC8979gt abstractC8979gt, C3528bBe c3528bBe) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c3528bBe, "");
            return this.b.create(abstractC8979gt, c3528bBe);
        }

        private e() {
            super("CollectTasteViewModel");
            this.b = new C1644aIy<>(C3533bBj.class);
        }

        /* renamed from: initialState */
        public C3528bBe m3158initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            CollectTasteData c = c(abstractC8979gt);
            if (c == null) {
                throw new IllegalArgumentException("collect taste data not set".toString());
            }
            return new C3528bBe(c, null, null, 6, null);
        }

        private final CollectTasteData c(AbstractC8979gt abstractC8979gt) {
            C8632dsu.d(abstractC8979gt);
            Bundle arguments = ((C8925fs) abstractC8979gt).e().getArguments();
            if (arguments != null) {
                return (CollectTasteData) arguments.getParcelable("collect_taste_data");
            }
            return null;
        }
    }

    /* renamed from: o.bBj$d */
    /* loaded from: classes4.dex */
    public static final class d extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ String c;
        final /* synthetic */ drM d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.c cVar, drM drm, String str) {
            super(cVar);
            this.d = drm;
            this.c = str;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            e eVar = C3533bBj.e;
            this.d.invoke(th);
        }
    }

    public final void e(int i) {
        AbstractC8899fS.c(this, new CollectTasteViewModel$fetchCollectTasteTitlesData$1(this, i, null), GF.d(), null, new drX<C3528bBe, AbstractC8918fl<? extends Pair<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, ? extends List<? extends C1346Yd.e>>>, C3528bBe>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteViewModel$fetchCollectTasteTitlesData$2
            @Override // o.drX
            /* renamed from: d */
            public final C3528bBe invoke(C3528bBe c3528bBe, AbstractC8918fl<? extends Pair<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, ? extends List<C1346Yd.e>>> abstractC8918fl) {
                C8632dsu.c((Object) c3528bBe, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                return C3528bBe.copy$default(c3528bBe, null, abstractC8918fl, null, 5, null);
            }
        }, 2, null);
    }

    public final void f() {
        AbstractC8899fS.c(this, new CollectTasteViewModel$refreshBulkRaterRow$1(this, null), GF.d(), null, new drX<C3528bBe, AbstractC8918fl<? extends RefreshState>, C3528bBe>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteViewModel$refreshBulkRaterRow$2
            @Override // o.drX
            /* renamed from: d */
            public final C3528bBe invoke(C3528bBe c3528bBe, AbstractC8918fl<? extends RefreshState> abstractC8918fl) {
                C8632dsu.c((Object) c3528bBe, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                return C3528bBe.copy$default(c3528bBe, null, null, abstractC8918fl, 3, null);
            }
        }, 2, null);
    }

    public final void e(aLP alp, String str) {
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) str, "");
        C8738dws.e(e(), null, null, new CollectTasteViewModel$fireCollectTasteInteractionTag$1(alp, str, null), 3, null);
    }

    @SuppressLint({"CheckResult"})
    public final void a(aLP alp, int i, String str, int i2, drM<? super Throwable, dpR> drm) {
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        C8738dws.e(e(), new d(CoroutineExceptionHandler.Key, drm, str), null, new CollectTasteViewModel$setRating$1(drm, alp, str, i2, i, null), 2, null);
    }
}
