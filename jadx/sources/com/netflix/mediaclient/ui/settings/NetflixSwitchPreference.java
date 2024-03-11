package com.netflix.mediaclient.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.PreferenceViewHolder;
import androidx.preference.SwitchPreference;
import com.netflix.mediaclient.ui.R;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class NetflixSwitchPreference extends SwitchPreference {
    private final d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        this.d = new d();
    }

    /* loaded from: classes4.dex */
    final class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C8632dsu.c((Object) compoundButton, "");
            if (!NetflixSwitchPreference.this.callChangeListener(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                NetflixSwitchPreference.this.setChecked(z);
            }
        }
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        C8632dsu.c((Object) preferenceViewHolder, "");
        super.onBindViewHolder(preferenceViewHolder);
        View findViewById = preferenceViewHolder.findViewById(R.g.dS);
        C8632dsu.d(findViewById);
        SwitchCompat switchCompat = (SwitchCompat) findViewById;
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(this.mChecked);
        switchCompat.setOnCheckedChangeListener(this.d);
    }
}
