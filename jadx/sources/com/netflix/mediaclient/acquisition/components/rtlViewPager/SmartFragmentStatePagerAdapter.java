package com.netflix.mediaclient.acquisition.components.rtlViewPager;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import o.C8632dsu;

/* loaded from: classes6.dex */
public abstract class SmartFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    public static final int $stable = 8;
    private final SparseArray<Fragment> registeredFragments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartFragmentStatePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        C8632dsu.c((Object) fragmentManager, "");
        this.registeredFragments = new SparseArray<>();
    }

    public final int getRegisteredFragmentsCount() {
        return this.registeredFragments.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Fragment instantiateItem(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C8632dsu.d(instantiateItem);
        Fragment fragment = (Fragment) instantiateItem;
        this.registeredFragments.put(i, fragment);
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c(obj, "");
        this.registeredFragments.remove(i);
        super.destroyItem(viewGroup, i, obj);
    }

    public final Fragment getRegisteredFragment(int i) {
        return this.registeredFragments.get(i);
    }

    public final int getKey(int i) {
        return this.registeredFragments.keyAt(i);
    }
}
