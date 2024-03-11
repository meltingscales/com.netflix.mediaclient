package com.netflix.mediaclient.rowconfig.layoutmanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.aLX;

/* loaded from: classes3.dex */
public class FillerGridLayoutManager extends GridLayoutManager {
    private static final boolean d = false;
    private final boolean c;
    public static final b a = new b(null);
    private static final int e = aLX.a.c;
    private static final int b = aLX.a.g;

    public /* synthetic */ FillerGridLayoutManager(Context context, int i, int i2, boolean z, boolean z2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FillerGridLayoutManager(Context context, int i, int i2, boolean z, boolean z2) {
        super(context, i, i2, z);
        C8632dsu.c((Object) context, "");
        this.c = z2;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("FillerGridLayoutManager");
        }

        public final int e() {
            return FillerGridLayoutManager.e;
        }

        public final int c() {
            return FillerGridLayoutManager.b;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int height;
        int size;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getId() == b) {
                childAt.getLayoutParams().height = 0;
            }
        }
        super.onLayoutChildren(recycler, state);
        if (d) {
            a.getLogTag();
        }
        int childCount2 = getChildCount();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2 != null && childAt2.getId() == b) {
                childAt2.getLayoutParams().height = 0;
                i3++;
                Float c = c(childAt2);
                if (c == null) {
                    continue;
                } else if (c.floatValue() <= 0.0f) {
                    throw new IllegalStateException("Filler's weight need to be a positive number");
                } else {
                    i2++;
                    f += c.floatValue();
                }
            }
        }
        if (i2 > 0 && i2 != i3) {
            throw new IllegalStateException("When using filler's weight all the fillers in the layout need a weight");
        }
        if (i3 > 0) {
            ArrayList<View> arrayList = new ArrayList();
            if (this.c) {
                height = getHeight();
            } else {
                height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            }
            int childCount3 = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount3; i6++) {
                View childAt3 = getChildAt(i6);
                if (childAt3 != null) {
                    if (childAt3.getId() == b) {
                        arrayList.add(childAt3);
                    } else {
                        float y = childAt3.getY();
                        float translationY = childAt3.getTranslationY();
                        float height2 = childAt3.getHeight();
                        ViewGroup.LayoutParams layoutParams = childAt3.getLayoutParams();
                        float f2 = y + translationY + height2 + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? marginLayoutParams.bottomMargin : 0);
                        if (f2 > i5) {
                            i5 = (int) f2;
                        }
                    }
                }
            }
            if (height > i5) {
                int i7 = height - i5;
                for (View view : arrayList) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (f > 0.0f) {
                        float f3 = (i7 * 1.0f) / f;
                        Float c2 = c(view);
                        if (c2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        size = (int) (f3 * c2.floatValue());
                    } else {
                        size = i7 / arrayList.size();
                    }
                    layoutParams2.height = size;
                }
                super.onLayoutChildren(recycler, state);
                if (d) {
                    a.getLogTag();
                }
            }
        }
    }

    private final Float c(View view) {
        return (Float) view.getTag(e);
    }
}
