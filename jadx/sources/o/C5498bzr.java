package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import o.C5503bzw;

/* renamed from: o.bzr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5498bzr extends ArrayAdapter<String> {
    private final List<String> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5498bzr(Context context, int i, List<String> list) {
        super(context, i, list);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) list, "");
        this.b = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(C5503bzw.d.k, viewGroup, false);
        }
        ((TextView) view.findViewById(C5503bzw.c.h)).setText(this.b.get(i));
        C8632dsu.d(view);
        return view;
    }
}
