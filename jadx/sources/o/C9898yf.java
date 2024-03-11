package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import java.util.Random;
import o.AbstractC9900yh;
import o.C9834xU;
import o.C9912yt;

/* renamed from: o.yf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9898yf extends BaseVerticalRecyclerViewAdapter<c> {
    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int d(int i) {
        return 0;
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int e() {
        return 20;
    }

    public C9898yf(Activity activity, C1729aMb c1729aMb) {
        super(activity, c1729aMb);
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int a(boolean z) {
        return e();
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public AbstractC9900yh c(Context context, C1729aMb c1729aMb, int i) {
        return new b(context, c1729aMb, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    /* renamed from: e */
    public c a(ViewGroup viewGroup, C1729aMb c1729aMb) {
        return new c(this.d.inflate(C9834xU.i.g, viewGroup, false), c1729aMb, C9834xU.g.C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    /* renamed from: b */
    public void d(c cVar, int i, AbstractC9900yh abstractC9900yh, Parcelable parcelable) {
        cVar.b.setAdapter(abstractC9900yh);
        abstractC9900yh.e(cVar.b, cVar);
        if (parcelable != null) {
            cVar.a.onRestoreInstanceState(parcelable);
        }
    }

    /* renamed from: o.yf$c */
    /* loaded from: classes2.dex */
    public static class c extends BaseVerticalRecyclerViewAdapter.e<Object> {
        private static Random c = new Random(System.currentTimeMillis());
        private final TextView d;

        @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.e
        public void a(Object obj) {
        }

        private c(View view, C1729aMb c1729aMb, int i) {
            super(view, c1729aMb, i);
            TextView textView = (TextView) view.findViewById(C9834xU.g.z);
            this.d = textView;
            textView.setText(c());
            textView.setBackgroundResource(c1729aMb.h() ? C9834xU.c.t : C9834xU.c.s);
        }

        private String c() {
            StringBuilder sb = new StringBuilder("..........");
            for (int i = 0; i < c.nextInt(20); i++) {
                sb.append(".");
            }
            return sb.toString();
        }
    }

    /* renamed from: o.yf$b */
    /* loaded from: classes2.dex */
    static class b extends AbstractC9900yh<d> {
        private C9912yt a;

        @Override // o.AbstractC9900yh
        /* renamed from: c */
        public void b(d dVar, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 20;
        }

        private b(Context context, C1729aMb c1729aMb, int i) {
            super(context, c1729aMb, i);
            this.a = new C9912yt(context, this, true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public d onCreateViewHolder(ViewGroup viewGroup, int i) {
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setId(C9834xU.g.A);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (d().b()) {
                return new e(viewGroup, imageView, this, C9834xU.g.A);
            }
            return new d(viewGroup, imageView, this, C9834xU.g.A);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.a.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.a.a();
        }

        @Override // o.AbstractC9900yh, androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: e */
        public void onViewRecycled(d dVar) {
            super.c((b) dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.yf$d */
    /* loaded from: classes2.dex */
    public static class d extends AbstractC9900yh.c implements C9912yt.a {
        protected AnimatedVectorDrawable c;
        protected ImageView d;

        @Override // o.C9912yt.a
        public boolean ak_() {
            return true;
        }

        @Override // o.C9912yt.a
        /* renamed from: f */
        public ImageView h() {
            return this.d;
        }

        @Override // o.C9912yt.a
        public Rect g() {
            return null;
        }

        @Override // o.C9912yt.a
        public AnimatedVectorDrawable i() {
            return this.c;
        }

        private d(ViewGroup viewGroup, View view, InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(viewGroup, view, interfaceC1732aMe, i);
            this.d = (ImageView) view.findViewById(i);
            this.c = (AnimatedVectorDrawable) ContextCompat.getDrawable(viewGroup.getContext(), interfaceC1732aMe.d().h() ? C9834xU.j.c : C9834xU.j.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.yf$e */
    /* loaded from: classes2.dex */
    public static class e extends d {
        private e(ViewGroup viewGroup, View view, InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(viewGroup, view, interfaceC1732aMe, i);
            ((d) this).c = (AnimatedVectorDrawable) ContextCompat.getDrawable(viewGroup.getContext(), interfaceC1732aMe.d().h() ? C9834xU.j.a : C9834xU.j.e);
        }

        @Override // o.C9898yf.d, o.C9912yt.a
        public Rect g() {
            return new Rect(0, 0, this.itemView.getWidth(), this.itemView.getWidth());
        }
    }
}
