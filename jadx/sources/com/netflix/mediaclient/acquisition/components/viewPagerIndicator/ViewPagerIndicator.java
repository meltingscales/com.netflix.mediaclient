package com.netflix.mediaclient.acquisition.components.viewPagerIndicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.netflix.mediaclient.acquisition.R;
import java.util.ArrayList;
import java.util.List;
import o.C1333Xq;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ViewPagerIndicator extends LinearLayout {
    public static final int $stable = 8;
    private int currentlySelected;
    private final List<View> dotIndicators;
    private int indicatorDrawable;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerIndicator(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ ViewPagerIndicator(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.dotIndicators = new ArrayList();
        this.indicatorDrawable = R.drawable.fuji_pager_dot;
        setOrientation(0);
        setGravity(17);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewPagerIndicator);
        this.indicatorDrawable = obtainStyledAttributes.getResourceId(R.styleable.FormViewEditText_android_text, this.indicatorDrawable);
        obtainStyledAttributes.recycle();
    }

    public final void setupWithViewPager(final ViewPager2 viewPager2) {
        C8632dsu.c((Object) viewPager2, "");
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount == 0) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        C1333Xq d = C1333Xq.d(R.string.page_indicator_content_description);
        final int i = 0;
        while (i < itemCount) {
            View inflate = from.inflate(R.layout.viewpager_indicator_circle, (ViewGroup) this, false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.dotIndicator);
            imageView.setImageResource(this.indicatorDrawable);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.viewPagerIndicator.ViewPagerIndicator$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPagerIndicator.setupWithViewPager$lambda$2$lambda$1(ViewPager2.this, i, view);
                }
            });
            int i2 = i + 1;
            imageView.setContentDescription(d.d("number", Integer.valueOf(i2)).c());
            imageView.setTag(Integer.valueOf(i));
            List<View> list = this.dotIndicators;
            C8632dsu.d(imageView);
            list.add(imageView);
            addView(inflate);
            i = i2;
        }
        this.dotIndicators.get(this.currentlySelected).setActivated(true);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.netflix.mediaclient.acquisition.components.viewPagerIndicator.ViewPagerIndicator$setupWithViewPager$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i3) {
                List list2;
                int i4;
                Object f;
                List list3;
                Object f2;
                list2 = ViewPagerIndicator.this.dotIndicators;
                i4 = ViewPagerIndicator.this.currentlySelected;
                f = C8576dqs.f((List<? extends Object>) list2, i4);
                View view = (View) f;
                if (view != null) {
                    view.setActivated(false);
                }
                list3 = ViewPagerIndicator.this.dotIndicators;
                f2 = C8576dqs.f((List<? extends Object>) list3, i3);
                View view2 = (View) f2;
                if (view2 != null) {
                    view2.setActivated(true);
                }
                ViewPagerIndicator.this.currentlySelected = i3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupWithViewPager$lambda$2$lambda$1(ViewPager2 viewPager2, int i, View view) {
        C8632dsu.c((Object) viewPager2, "");
        viewPager2.setCurrentItem(i);
    }
}
