package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.netflix.android.widgetry.widget.tabs.BadgeView;
import com.netflix.android.widgetry.widget.tabs.BottomTabView;
import java.util.ArrayList;
import java.util.List;
import o.C9834xU;

/* renamed from: o.zN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9933zN extends ViewGroup {
    private BottomTabView a;
    protected C9929zJ[] b;
    private final int c;
    protected List<C9936zQ> d;
    private int e;
    private final View.OnClickListener f;
    private b g;
    private final int h;
    private ColorStateList i;
    private ColorStateList j;
    private int k;
    private int l;
    private int[] n;

    /* renamed from: o.zN$b */
    /* loaded from: classes5.dex */
    public interface b {
        boolean b(C9936zQ c9936zQ);
    }

    public int a() {
        return this.k;
    }

    public void setTabClickListener(b bVar) {
        this.g = bVar;
    }

    public void setTabView(BottomTabView bottomTabView) {
        this.a = bottomTabView;
    }

    public C9933zN(Context context) {
        this(context, null);
    }

    public C9933zN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = 0;
        this.l = 0;
        this.d = new ArrayList(5);
        this.c = getResources().getDimensionPixelSize(C9834xU.a.c);
        this.h = getResources().getDimensionPixelSize(C9834xU.a.a);
        this.f = new View.OnClickListener() { // from class: o.zN.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C9936zQ b2 = ((C9929zJ) view).b();
                if (C9933zN.this.g.b(b2)) {
                    C1044Mm.b("BottomNav", "Clicked on tab " + b2.c());
                    C9933zN.this.setSelectedTab(b2);
                }
            }
        };
        this.n = new int[5];
    }

    public void a(List<C9936zQ> list) {
        this.d.clear();
        this.d.addAll(list);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setLabelVisibility(c(size));
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        int min = Math.min(size / (childCount == 0 ? 1 : childCount), this.c);
        int i3 = size - (min * childCount);
        for (int i4 = 0; i4 < childCount; i4++) {
            int[] iArr = this.n;
            iArr[i4] = min;
            if (i3 > 0) {
                iArr[i4] = min + 1;
                i3--;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.n[i6], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i5 += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(ViewCompat.resolveSizeAndState(i5, View.MeasureSpec.makeMeasureSpec(i5, 1073741824), 0), ViewCompat.resolveSizeAndState(this.h, makeMeasureSpec, 0));
    }

    public boolean c(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i2 = i / childCount;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if ((childAt instanceof C9929zJ) && !((C9929zJ) childAt).d(i2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i4 - i2;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i8 = (i3 - i) - i6;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i5);
                } else {
                    childAt.layout(i6, 0, childAt.getMeasuredWidth() + i6, i5);
                }
                i6 += childAt.getMeasuredWidth();
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr == null) {
            return;
        }
        for (C9929zJ c9929zJ : c9929zJArr) {
            c9929zJ.setIconTintList(colorStateList);
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.j = colorStateList;
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr == null) {
            return;
        }
        for (C9929zJ c9929zJ : c9929zJArr) {
            c9929zJ.setTextColor(colorStateList);
        }
    }

    public void setItemBackgroundRes(int i) {
        this.e = i;
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr == null) {
            return;
        }
        for (C9929zJ c9929zJ : c9929zJArr) {
            c9929zJ.setItemBackground(i);
        }
    }

    public void d() {
        this.a.setUpdateSuspended(true);
        removeAllViews();
        if (this.d.size() == 0) {
            this.k = 0;
            this.l = 0;
            this.b = null;
            return;
        }
        this.b = new C9929zJ[this.d.size()];
        for (int i = 0; i < this.d.size(); i++) {
            C9929zJ c9929zJ = new C9929zJ(getContext());
            this.b[i] = c9929zJ;
            c9929zJ.setIconTintList(this.i);
            c9929zJ.setTextColor(this.j);
            c9929zJ.setItemBackground(this.e);
            c9929zJ.d(this.d.get(i));
            c9929zJ.setItemPosition(i);
            c9929zJ.setClickable(true);
            c9929zJ.setOnClickListener(this.f);
            addView(c9929zJ);
        }
        int min = Math.min(this.d.size() - 1, this.l);
        this.l = min;
        this.d.get(min).b(true);
        this.a.setUpdateSuspended(false);
    }

    public void c() {
        int size = this.d.size();
        if (size != this.b.length) {
            d();
            return;
        }
        for (int i = 0; i < size; i++) {
            C9936zQ c9936zQ = this.d.get(i);
            if (c9936zQ.j()) {
                this.k = c9936zQ.b();
                this.l = i;
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            this.a.setUpdateSuspended(true);
            this.b[i2].d(this.d.get(i2));
            this.a.setUpdateSuspended(false);
        }
    }

    public void setLabelVisibility(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C9929zJ) {
                ((C9929zJ) childAt).setLabelVisibility(z);
            }
        }
    }

    public void setSelectedTab(C9936zQ c9936zQ) {
        for (C9936zQ c9936zQ2 : this.d) {
            c9936zQ2.b(c9936zQ2.equals(c9936zQ));
        }
        c();
    }

    public void e(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C9936zQ c9936zQ = this.d.get(i2);
            if (i == c9936zQ.b()) {
                this.k = i;
                this.l = i2;
                c9936zQ.b(true);
                return;
            }
        }
    }

    public BadgeView d(int i) {
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr != null) {
            for (C9929zJ c9929zJ : c9929zJArr) {
                if (c9929zJ.getId() == i) {
                    return c9929zJ.e();
                }
            }
            return null;
        }
        return null;
    }

    public BadgeView a(int i) {
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr != null) {
            for (C9929zJ c9929zJ : c9929zJArr) {
                if (c9929zJ.getId() == i) {
                    return c9929zJ.a();
                }
            }
            return null;
        }
        return null;
    }

    public View b(int i) {
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr != null) {
            for (C9929zJ c9929zJ : c9929zJArr) {
                if (c9929zJ.getId() == i) {
                    return c9929zJ.e;
                }
            }
            return null;
        }
        return null;
    }

    public void setTabImageUrl(int i, String str) {
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr != null) {
            for (C9929zJ c9929zJ : c9929zJArr) {
                if (c9929zJ.getId() == i) {
                    c9929zJ.d(str);
                    return;
                }
            }
        }
    }

    public void setBadgeContentDescription(int i, CharSequence charSequence) {
        C9929zJ[] c9929zJArr = this.b;
        if (c9929zJArr != null) {
            for (C9929zJ c9929zJ : c9929zJArr) {
                if (c9929zJ.getId() == i) {
                    c9929zJ.setBadgeContentDescription(charSequence);
                    return;
                }
            }
        }
    }
}
