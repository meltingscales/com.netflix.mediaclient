package o;

import android.content.Context;
import com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1;
import com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchEpisodesList$1;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Observable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AbstractApplicationC1040Mh;
import o.C1304Wn;
import o.C8632dsu;
import o.InterfaceC1300Wj;
import o.InterfaceC5283bvo;
import o.aCG;

@Singleton
/* renamed from: o.Wn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1304Wn implements InterfaceC1300Wj {
    private final Context c;
    private final InterfaceC8554dpx d;
    private final aDB e;

    @Inject
    public C1304Wn(@ApplicationContext Context context, aDB adb) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) adb, "");
        this.c = context;
        this.e = adb;
        b = dpB.b(new drO<aCG>() { // from class: com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$graphQLRepository$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final aCG invoke() {
                Context context2;
                UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
                InterfaceC5283bvo j = k != null ? k.j() : null;
                if (j == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C8632dsu.a(j, "");
                aCG.e eVar = aCG.b;
                context2 = C1304Wn.this.c;
                return eVar.e(context2, j);
            }
        });
        this.d = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aCG c() {
        return (aCG) this.d.getValue();
    }

    @Override // o.InterfaceC1300Wj
    public Observable<bDW> b(String str) {
        C8632dsu.c((Object) str, "");
        return C7675dBe.e(null, new EpisodeSelectorRepositoryImpl$fetchData$1(str, this, null), 1, null);
    }

    @Override // o.InterfaceC1300Wj
    public Observable<bDW> e(InterfaceC1300Wj.d dVar) {
        C8632dsu.c((Object) dVar, "");
        return C7675dBe.e(null, new EpisodeSelectorRepositoryImpl$fetchEpisodesList$1(dVar, this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.dyI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(o.dyI<? super o.bDW> r19, o.InterfaceC5194buE r20, o.InterfaceC8585dra<? super o.dpR> r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1304Wn.e(o.dyI, o.buE, o.dra):java.lang.Object");
    }
}
