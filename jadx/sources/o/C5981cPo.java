package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.netflix.model.leafs.ArtworkColors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C5980cPn;
import o.C9834xU;

/* renamed from: o.cPo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5981cPo extends AppCompatSpinner {
    public static final a a = new a(null);
    private static final List<a.b> c;
    private static final Map<String, Integer> d;
    private drM<? super String, dpR> b;
    private boolean e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5981cPo(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5981cPo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final drM<String, dpR> e() {
        return this.b;
    }

    public final void setColorChangedListener(drM<? super String, dpR> drm) {
        this.b = drm;
    }

    public /* synthetic */ C5981cPo(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C9834xU.b.y : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5981cPo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List D;
        C8632dsu.c((Object) context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5980cPn.e.d);
        C8632dsu.a(obtainStyledAttributes, "");
        this.e = obtainStyledAttributes.getBoolean(C5980cPn.e.c, false);
        obtainStyledAttributes.recycle();
        String[] stringArray = context.getResources().getStringArray(this.e ? C5980cPn.b.e : C5980cPn.b.d);
        C8632dsu.a(stringArray, "");
        D = C8563dqf.D(stringArray);
        setAdapter((SpinnerAdapter) new b(context, D, this.e));
        setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: o.cPo.5
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                SpinnerAdapter adapter = C5981cPo.this.getAdapter();
                C8632dsu.d(adapter);
                a.b a2 = ((b) adapter).a(i2);
                drM<String, dpR> e = C5981cPo.this.e();
                if (e != null) {
                    e.invoke(a2.a());
                }
            }
        });
    }

    /* renamed from: o.cPo$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.cPo$a$b */
        /* loaded from: classes4.dex */
        public static final class b {
            private final String a;
            private final int c;
            private final int d;

            public final String a() {
                return this.a;
            }

            public final int c() {
                return this.d;
            }

            public final int d() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return C8632dsu.c((Object) this.a, (Object) bVar.a) && this.d == bVar.d && this.c == bVar.c;
                }
                return false;
            }

            public int hashCode() {
                return (((this.a.hashCode() * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.c);
            }

            public String toString() {
                String str = this.a;
                int i = this.d;
                int i2 = this.c;
                return "ColorDetails(name=" + str + ", color=" + i + ", textColor=" + i2 + ")";
            }

            public b(String str, int i, int i2) {
                C8632dsu.c((Object) str, "");
                this.a = str;
                this.d = i;
                this.c = i2;
            }
        }

        private a() {
        }

        public final List<b> b() {
            return C5981cPo.c;
        }
    }

    static {
        List<a.b> j;
        int d2;
        Map<String, Integer> d3;
        j = C8569dql.j(new a.b("null", -12303292, -1), new a.b("white", -1, ArtworkColors.DEFAULT_BACKGROUND_COLOR), new a.b("black", ArtworkColors.DEFAULT_BACKGROUND_COLOR, -1), new a.b("red", -4849664, -1), new a.b("green", -16726016, ArtworkColors.DEFAULT_BACKGROUND_COLOR), new a.b("blue", -16777016, -1), new a.b("yellow", -1123328, ArtworkColors.DEFAULT_BACKGROUND_COLOR), new a.b("magenta", -2752384, -1), new a.b("cyan", -16736038, ArtworkColors.DEFAULT_BACKGROUND_COLOR));
        c = j;
        d2 = C8572dqo.d(j, 10);
        ArrayList arrayList = new ArrayList(d2);
        int i = 0;
        for (Object obj : j) {
            if (i < 0) {
                C8569dql.h();
            }
            arrayList.add(dpD.a(((a.b) obj).a(), Integer.valueOf(i)));
            i++;
        }
        d3 = dqE.d(arrayList);
        d = d3;
    }

    public final void setSelectionFromColor(String str) {
        int c2;
        c2 = C8657dts.c(d.getOrDefault(str, 0).intValue() + (this.e ? 0 : -1), 0, c.size() - 1);
        setSelection(c2);
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public void setSelection(int i) {
        SpinnerAdapter adapter = getAdapter();
        C8632dsu.d(adapter);
        setBackgroundTintList(ColorStateList.valueOf(((b) adapter).a(i).c()));
        super.setSelection(i);
    }

    /* renamed from: o.cPo$b */
    /* loaded from: classes4.dex */
    public static final class b extends ArrayAdapter<String> {
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, List<String> list, boolean z) {
            super(context, 17367049, list);
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) list, "");
            this.c = z;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C8632dsu.c((Object) viewGroup, "");
            View view2 = super.getView(i, view, viewGroup);
            C8632dsu.a(view2, "");
            TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
            if (textView != null) {
                textView.setTextColor(a(i).d());
            }
            return view2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            C8632dsu.c((Object) viewGroup, "");
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            a.b a = a(i);
            dropDownView.setBackgroundColor(a.c());
            C8632dsu.d(dropDownView);
            ((TextView) dropDownView).setTextColor(a.d());
            return dropDownView;
        }

        public final a.b a(int i) {
            int c;
            if (!this.c) {
                i++;
            }
            a aVar = C5981cPo.a;
            List<a.b> b = aVar.b();
            c = C8657dts.c(i, 0, aVar.b().size() - 1);
            return b.get(c);
        }
    }
}
