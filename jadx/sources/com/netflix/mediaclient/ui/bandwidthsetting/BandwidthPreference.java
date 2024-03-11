package com.netflix.mediaclient.ui.bandwidthsetting;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;

/* loaded from: classes4.dex */
public class BandwidthPreference extends DialogPreference {
    public BandwidthPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPersistent(false);
    }

    public BandwidthPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setPersistent(false);
    }
}
