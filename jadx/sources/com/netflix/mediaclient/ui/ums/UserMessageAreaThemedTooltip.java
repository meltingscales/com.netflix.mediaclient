package com.netflix.mediaclient.ui.ums;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.R;
import o.C1204Sr;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.bEZ;

/* loaded from: classes5.dex */
public final class UserMessageAreaThemedTooltip extends ConstraintLayout {
    private final View a;
    private final NetflixImageView b;
    private final C1204Sr c;
    private final bEZ d;
    private final ImageView e;
    private final ImageView g;
    private TooltipDirection h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserMessageAreaThemedTooltip(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserMessageAreaThemedTooltip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final C1204Sr a() {
        return this.c;
    }

    public final TooltipDirection b() {
        return this.h;
    }

    public final ImageView c() {
        return this.g;
    }

    public /* synthetic */ UserMessageAreaThemedTooltip(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMessageAreaThemedTooltip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        bEZ a = bEZ.a(LayoutInflater.from(context), this);
        C8632dsu.a(a, "");
        this.d = a;
        ImageView imageView = a.a;
        C8632dsu.a(imageView, "");
        this.g = imageView;
        ImageView imageView2 = a.d;
        C8632dsu.a(imageView2, "");
        this.e = imageView2;
        C1204Sr c1204Sr = a.b;
        C8632dsu.a(c1204Sr, "");
        this.c = c1204Sr;
        NetflixImageView netflixImageView = a.e;
        C8632dsu.a(netflixImageView, "");
        this.b = netflixImageView;
        View view = a.c;
        C8632dsu.a(view, "");
        this.a = view;
        this.h = TooltipDirection.a;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.b.Y);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, resources.getDimensionPixelSize(R.b.ah));
        setMaxWidth(resources.getDimensionPixelSize(R.b.Z));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class TooltipDirection {
        private static final /* synthetic */ TooltipDirection[] b;
        private static final /* synthetic */ InterfaceC8598drn c;
        public static final TooltipDirection e = new TooltipDirection("UP", 0);
        public static final TooltipDirection a = new TooltipDirection("DOWN", 1);

        private static final /* synthetic */ TooltipDirection[] e() {
            return new TooltipDirection[]{e, a};
        }

        public static TooltipDirection valueOf(String str) {
            return (TooltipDirection) Enum.valueOf(TooltipDirection.class, str);
        }

        public static TooltipDirection[] values() {
            return (TooltipDirection[]) b.clone();
        }

        private TooltipDirection(String str, int i) {
        }

        static {
            TooltipDirection[] e2 = e();
            b = e2;
            c = C8600drp.e(e2);
        }
    }

    public final void setTooltipDirection(TooltipDirection tooltipDirection) {
        C8632dsu.c((Object) tooltipDirection, "");
        this.h = tooltipDirection;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.clear(R.g.gM, 4);
        constraintSet.clear(R.g.gM, 3);
        TooltipDirection tooltipDirection2 = TooltipDirection.e;
        if (tooltipDirection == tooltipDirection2) {
            constraintSet.connect(R.g.gM, 4, R.g.gD, 3);
        } else if (tooltipDirection == TooltipDirection.a) {
            constraintSet.connect(R.g.gM, 3, R.g.gD, 4);
        }
        constraintSet.applyTo(this);
        this.g.setRotation(tooltipDirection == tooltipDirection2 ? 180.0f : 0.0f);
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
        this.b.setOnClickListener(onClickListener);
        this.g.setOnClickListener(onClickListener);
    }

    public final void setCloseClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }
}
