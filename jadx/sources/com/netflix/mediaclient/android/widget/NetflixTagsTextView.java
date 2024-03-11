package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.os.Trace;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1204Sr;
import o.C8141del;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C9834xU;
import o.C9879yM;
import o.GF;
import o.InterfaceC8585dra;
import o.RC;
import o.dwU;

@AndroidEntryPoint(C1204Sr.class)
/* loaded from: classes3.dex */
public final class NetflixTagsTextView extends RC {
    public static final d a = new d(null);
    public static final int b = 8;
    @Inject
    public Lazy<dwU> appScope;
    private final AttributeSet e;
    private final C9879yM<SpannableStringBuilder> f;
    private final int g;
    private int i;
    private List<String> j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetflixTagsTextView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetflixTagsTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final int a() {
        return this.i;
    }

    public final void setAppScope(Lazy<dwU> lazy) {
        C8632dsu.c((Object) lazy, "");
        this.appScope = lazy;
    }

    public /* synthetic */ NetflixTagsTextView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C9834xU.b.y : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixTagsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List<String> i2;
        C8632dsu.c((Object) context, "");
        this.e = attributeSet;
        this.g = i;
        i2 = C8569dql.i();
        this.j = i2;
        this.f = new C9879yM<>();
        Trace.beginSection("NetflixTagsTextView.init");
        setSpannableFactory(new Spannable.Factory() { // from class: com.netflix.mediaclient.android.widget.NetflixTagsTextView.4
            @Override // android.text.Spannable.Factory
            public Spannable newSpannable(CharSequence charSequence) {
                Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
                if (spannable == null) {
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    return SpannableString.valueOf(charSequence);
                }
                return spannable;
            }
        });
        setMaxLines(1);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C9834xU.b.w, typedValue, true);
        setSeparatorColor(typedValue.data);
        Trace.endSection();
    }

    public final void setSeparatorColor(int i) {
        if (this.i != i) {
            this.i = i;
            if (!this.j.isEmpty()) {
                setTags(this.j);
            }
        }
    }

    public final Lazy<dwU> e() {
        Lazy<dwU> lazy = this.appScope;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    private final dwU h() {
        Lifecycle lifecycle;
        LifecycleCoroutineScope coroutineScope;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            dwU dwu = e().get();
            C8632dsu.a(dwu, "");
            return dwu;
        }
        return coroutineScope;
    }

    public final void setTags(List<String> list) {
        C8632dsu.c((Object) list, "");
        Trace.beginSection("NetflixTagsTextView.setTags");
        if (!C8632dsu.c(list, this.j)) {
            this.j = list;
            setText((CharSequence) null);
            d(getMeasuredWidth());
        }
        Trace.endSection();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        Trace.beginSection("NetflixTagsTextView.onSizeChanged");
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            d(i);
        }
        Trace.endSection();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    private final void d(int i) {
        if (i == 0 || this.j.isEmpty() || C8141del.a()) {
            return;
        }
        dwU h = h();
        GF gf = GF.e;
        Context context = getContext();
        C8632dsu.a(context, "");
        C8737dwr.c(h, gf.d(context).c(), null, new NetflixTagsTextView$measureAndSetTagsAsync$1(i, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(int i, InterfaceC8585dra<? super SpannableStringBuilder> interfaceC8585dra) {
        return this.f.c(new NetflixTagsTextView$getMeasuredTagsSpannable$2(this, i, null), interfaceC8585dra);
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("NetflixTagsTextView");
        }
    }
}
