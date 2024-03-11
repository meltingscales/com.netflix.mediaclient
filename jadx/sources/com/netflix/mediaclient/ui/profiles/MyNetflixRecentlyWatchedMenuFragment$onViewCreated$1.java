package com.netflix.mediaclient.ui.profiles;

import com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuFragment$onViewCreated$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractC5911cMy;
import o.C8187dfe;
import o.C8632dsu;
import o.cMC;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class MyNetflixRecentlyWatchedMenuFragment$onViewCreated$1 extends Lambda implements drM<AbstractC5911cMy, dpR> {
    final /* synthetic */ MyNetflixRecentlyWatchedMenuFragment b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetflixRecentlyWatchedMenuFragment$onViewCreated$1(MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment) {
        super(1);
        this.b = myNetflixRecentlyWatchedMenuFragment;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(AbstractC5911cMy abstractC5911cMy) {
        a(abstractC5911cMy);
        return dpR.c;
    }

    public final void a(final AbstractC5911cMy abstractC5911cMy) {
        C8632dsu.c((Object) abstractC5911cMy, "");
        this.b.dismiss();
        final MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment = this.b;
        C8187dfe.c(new Runnable() { // from class: o.cMI
            @Override // java.lang.Runnable
            public final void run() {
                MyNetflixRecentlyWatchedMenuFragment$onViewCreated$1.c(AbstractC5911cMy.this, myNetflixRecentlyWatchedMenuFragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC5911cMy abstractC5911cMy, MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment) {
        cMC cmc;
        cMC cmc2;
        cMC cmc3;
        cMC cmc4;
        C8632dsu.c((Object) abstractC5911cMy, "");
        C8632dsu.c((Object) myNetflixRecentlyWatchedMenuFragment, "");
        cMC cmc5 = null;
        if (C8632dsu.c(abstractC5911cMy, AbstractC5911cMy.e.a)) {
            cmc4 = myNetflixRecentlyWatchedMenuFragment.a;
            if (cmc4 == null) {
                C8632dsu.d("");
            } else {
                cmc5 = cmc4;
            }
            cmc5.c();
        } else if (C8632dsu.c(abstractC5911cMy, AbstractC5911cMy.d.b)) {
            cmc3 = myNetflixRecentlyWatchedMenuFragment.a;
            if (cmc3 == null) {
                C8632dsu.d("");
            } else {
                cmc5 = cmc3;
            }
            cmc5.a();
        } else if (C8632dsu.c(abstractC5911cMy, AbstractC5911cMy.a.e)) {
            cmc2 = myNetflixRecentlyWatchedMenuFragment.a;
            if (cmc2 == null) {
                C8632dsu.d("");
            } else {
                cmc5 = cmc2;
            }
            cmc5.e();
        } else if (C8632dsu.c(abstractC5911cMy, AbstractC5911cMy.b.e)) {
            cmc = myNetflixRecentlyWatchedMenuFragment.a;
            if (cmc == null) {
                C8632dsu.d("");
            } else {
                cmc5 = cmc;
            }
            cmc5.b();
        }
    }
}
