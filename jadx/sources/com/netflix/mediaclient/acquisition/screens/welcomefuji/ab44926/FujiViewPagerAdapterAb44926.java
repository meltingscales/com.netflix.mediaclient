package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardParsedData;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FujiViewPagerAdapterAb44926 extends FragmentStateAdapter {
    public static final int $stable = 8;
    private final List<FujiCardParsedData> cards;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FujiViewPagerAdapterAb44926(Fragment fragment, List<FujiCardParsedData> list) {
        super(fragment);
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) list, "");
        this.cards = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public FujiCardFragmentAb44926 createFragment(int i) {
        return FujiCardFragmentAb44926.Companion.newInstance(this.cards.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cards.size();
    }
}
