package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.PlayContextImp;
import java.lang.ref.WeakReference;
import java.util.List;
import o.AbstractC1212Sz;
import o.bFB;
import o.bFX;

/* renamed from: o.bEe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3609bEe extends AbstractC9944zY<bFV> implements bEG {
    public static final a a = new a(null);
    private String b;
    private bFB c;
    private AbstractC1212Sz.c d;
    private LinearLayoutManager e;
    private final ViewGroup f;
    private final RecyclerView g;
    private final View h;
    private final bEH i;

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
    }

    @Override // o.AbstractC9944zY
    /* renamed from: i */
    public RecyclerView e() {
        return this.g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3609bEe(ViewGroup viewGroup, bEH beh) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.f = viewGroup;
        this.i = beh;
        View e = C9703vR.e(viewGroup, com.netflix.mediaclient.ui.R.i.bs, 0, 2, null);
        this.h = e;
        View findViewById = e.findViewById(16908298);
        C8632dsu.a(findViewById, "");
        this.g = (RecyclerView) findViewById;
        e().setFocusable(false);
    }

    /* renamed from: o.bEe$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("EpisodesListContentUIView");
        }
    }

    @Override // o.bEG
    public void f() {
        RecyclerView.LayoutManager layoutManager = e().getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        e().setAdapter(this.c);
        e().setLayoutManager(this.e);
        RecyclerView.LayoutManager layoutManager2 = e().getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.onRestoreInstanceState(onSaveInstanceState);
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e().setVisibility(8);
    }

    @Override // o.bEG
    public void d(List<InterfaceC5227bul> list, int i, String str) {
        Configuration configuration;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        this.b = str;
        Resources resources = this.f.getResources();
        b((resources == null || (configuration = resources.getConfiguration()) == null) ? 1 : configuration.orientation);
        bFB bfb = this.c;
        if (bfb != null) {
            bfb.b(list, i);
        }
    }

    @Override // o.bEG
    public void a(int i, int i2) {
        if (i == i2 - 20) {
            b((C3609bEe) bFX.e.b);
        }
    }

    @Override // o.bEG
    public void d(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = e().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
        }
    }

    @Override // o.bEG
    public int h() {
        bFB bfb = this.c;
        if (bfb != null) {
            return bfb.getItemCount();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // o.bEG
    public void b(int i) {
        LinearLayoutManager linearLayoutManager = this.e;
        int findFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : -1;
        ?? r8 = i == 1 ? 1 : 0;
        this.e = new LinearLayoutManager(this.f.getContext(), r8, false);
        e().setLayoutManager(this.e);
        c cVar = new c(this.b, r8, this.i);
        this.d = cVar;
        bFB bfb = this.c;
        if (bfb == null) {
            this.c = new bFB(cVar, new d(this));
            e().setAdapter(this.c);
        } else {
            if (bfb != null) {
                bfb.d(cVar);
            }
            bFB bfb2 = this.c;
            if (bfb2 != null) {
                bfb2.a(r8 ^ 1);
            }
        }
        e().getRecycledViewPool().clear();
        if (findFirstVisibleItemPosition != -1) {
            d(findFirstVisibleItemPosition, 0);
        }
    }

    /* renamed from: o.bEe$d */
    /* loaded from: classes4.dex */
    public static final class d implements bFB.a {
        private final WeakReference<bEG> c;

        public d(bEG beg) {
            C8632dsu.c((Object) beg, "");
            this.c = new WeakReference<>(beg);
        }

        @Override // o.bFB.a
        public void e(int i, int i2) {
            bEG beg = this.c.get();
            if (beg != null) {
                beg.a(i, i2);
            }
        }
    }

    /* renamed from: o.bEe$c */
    /* loaded from: classes4.dex */
    public static final class c implements AbstractC1212Sz.c {
        private final bEH a;
        private final String b;
        private final boolean c;

        public c(String str, boolean z, bEH beh) {
            this.b = str;
            this.c = z;
            this.a = beh;
        }

        @Override // o.AbstractC1212Sz.c
        public View d(View view) {
            C8632dsu.c((Object) view, "");
            Context context = view.getContext();
            C8632dsu.a(context, "");
            return new bFC(context, com.netflix.mediaclient.ui.R.i.T, this.b, this.c ? 3 : 4, PlayContextImp.h.getTrackId(), this.a);
        }
    }
}
