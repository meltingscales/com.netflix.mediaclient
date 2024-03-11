package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FujiViewPagerAdapter extends FragmentStateAdapter {
    public static final int $stable = 8;
    private final List<FujiCardParsedData> cards;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FujiViewPagerAdapter(Fragment fragment, List<FujiCardParsedData> list) {
        super(fragment);
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) list, "");
        this.cards = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public FujiCardFragment createFragment(int i) {
        return FujiCardFragment.Companion.newInstance(this.cards.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cards.size();
    }
}
