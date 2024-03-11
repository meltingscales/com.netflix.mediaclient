package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bQQ extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        bOP b = bOP.b(layoutInflater, viewGroup, false);
        C8632dsu.a(b, "");
        b.c.e.setImageResource(C3895bOq.a.d);
        b.c.b.setText(getString(C3895bOq.e.W));
        b.c.a.setText(getString(C3895bOq.e.f13527J));
        b.c.d.setVisibility(0);
        NestedScrollView b2 = b.b();
        C8632dsu.a(b2, "");
        return b2;
    }
}
