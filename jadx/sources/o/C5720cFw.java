package o;

import com.netflix.mediaclient.ui.player.v2.repository.PreplayRepositoryImpl_Ab53071$fetchPrePlayExperienceData$1;
import com.netflix.mediaclient.ui.player.v2.repository.PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Single;
import o.C5713cFp;

/* renamed from: o.cFw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5720cFw extends C5713cFp {
    public static final c a = new c(null);
    private final aDB b;
    private final aCG c;
    private final aLP d;

    /* renamed from: o.cFw$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5720cFw(aLP alp, aCG acg, aDB adb) {
        super(alp);
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        this.d = alp;
        this.c = acg;
        this.b = adb;
    }

    @Override // o.C5713cFp
    public Single<C5713cFp.d> d(String str) {
        C8632dsu.c((Object) str, "");
        return C7680dBj.e(null, new PreplayRepositoryImpl_Ab53071$fetchPrePlayExperienceData$1(str, this, null), 1, null);
    }

    @Override // o.C5713cFp
    public Single<C5713cFp.d> c(String str, PlayContext playContext, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) playContext, "");
        return C7680dBj.e(null, new PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1(str, this, playContext, str2, str3, null), 1, null);
    }
}
