package o;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;

/* renamed from: o.com  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7046com extends FragmentStateAdapter {
    private final MyListTabItems a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7046com(Fragment fragment, MyListTabItems myListTabItems) {
        super(fragment);
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) myListTabItems, "");
        this.a = myListTabItems;
    }

    public final int d(int i) {
        MyListTabItems.Type type = this.a.c().get(i);
        C8632dsu.a(type, "");
        return C7048cop.d(type);
    }

    public final int b(int i) {
        MyListTabItems.Type type = this.a.c().get(i);
        C8632dsu.a(type, "");
        return C7048cop.e(type);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.c().size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i) {
        MyListFragment.b bVar = MyListFragment.j;
        MyListTabItems.Type type = this.a.c().get(i);
        C8632dsu.a(type, "");
        return bVar.d(type);
    }
}
