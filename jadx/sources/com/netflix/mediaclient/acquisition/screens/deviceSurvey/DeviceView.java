package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class DeviceView extends FrameLayout {
    private final View checkMark;
    private final View deviceContent;
    private final ImageView deviceIcon;
    private boolean deviceSelected;
    private final C1204Sr deviceText;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int SELECTED_COLOR = C9834xU.c.e;
    private static final int DEFAULT_COLOR = C9834xU.c.m;

    public final boolean getDeviceSelected() {
        return this.deviceSelected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceView(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(C9834xU.a.C);
        setLayoutParams(layoutParams);
        View inflate = View.inflate(context, R.layout.device_survey_device_choice, this);
        View findViewById = inflate.findViewById(R.id.deviceImage);
        C8632dsu.a(findViewById, "");
        this.deviceIcon = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.deviceText);
        C8632dsu.a(findViewById2, "");
        this.deviceText = (C1204Sr) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.deviceContent);
        C8632dsu.a(findViewById3, "");
        this.deviceContent = findViewById3;
        View findViewById4 = inflate.findViewById(R.id.check_mark);
        C8632dsu.a(findViewById4, "");
        this.checkMark = findViewById4;
        setBackgroundResource(R.drawable.device_survey_background_default);
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final int getSELECTED_COLOR() {
            return DeviceView.SELECTED_COLOR;
        }

        public final int getDEFAULT_COLOR() {
            return DeviceView.DEFAULT_COLOR;
        }
    }

    public final void setDeviceSelected(boolean z) {
        this.deviceSelected = z;
        if (z) {
            this.deviceContent.setBackgroundResource(R.drawable.device_survey_background_selected);
            ImageView imageView = this.deviceIcon;
            Context context = getContext();
            int i = SELECTED_COLOR;
            imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(context, i)));
            this.deviceText.setTextColor(ContextCompat.getColor(getContext(), i));
            this.checkMark.setVisibility(0);
            return;
        }
        this.deviceContent.setBackgroundResource(R.drawable.device_survey_background_default);
        ImageView imageView2 = this.deviceIcon;
        Context context2 = getContext();
        int i2 = DEFAULT_COLOR;
        imageView2.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(context2, i2)));
        this.deviceText.setTextColor(ContextCompat.getColor(getContext(), i2));
        this.checkMark.setVisibility(4);
    }

    public final void setText(String str) {
        C8632dsu.c((Object) str, "");
        this.deviceText.setText(str);
    }

    public final void setImageResource(int i) {
        this.deviceIcon.setImageResource(i);
    }
}
