package com.netflix.mediaclient.ui.mylist.impl.tab;

import androidx.viewpager2.widget.ViewPager2;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$setupTab$viewPager$1$1;
import kotlin.jvm.internal.Lambda;
import o.C7056cox;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class MyListFragmentTab$setupTab$viewPager$1$1 extends Lambda implements drM<C7056cox, dpR> {
    final /* synthetic */ ViewPager2 c;
    final /* synthetic */ MyListFragmentTab e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListFragmentTab$setupTab$viewPager$1$1(ViewPager2 viewPager2, MyListFragmentTab myListFragmentTab) {
        super(1);
        this.c = viewPager2;
        this.e = myListFragmentTab;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(C7056cox c7056cox) {
        d(c7056cox);
        return dpR.c;
    }

    public final void d(final C7056cox c7056cox) {
        C8632dsu.c((Object) c7056cox, "");
        final ViewPager2 viewPager2 = this.c;
        final MyListFragmentTab myListFragmentTab = this.e;
        viewPager2.postDelayed(new Runnable() { // from class: o.coi
            @Override // java.lang.Runnable
            public final void run() {
                MyListFragmentTab$setupTab$viewPager$1$1.b(ViewPager2.this, c7056cox, myListFragmentTab);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewPager2 viewPager2, C7056cox c7056cox, MyListFragmentTab myListFragmentTab) {
        C8632dsu.c((Object) c7056cox, "");
        C8632dsu.c((Object) myListFragmentTab, "");
        viewPager2.setCurrentItem(c7056cox.d(), true);
        myListFragmentTab.N();
    }
}
