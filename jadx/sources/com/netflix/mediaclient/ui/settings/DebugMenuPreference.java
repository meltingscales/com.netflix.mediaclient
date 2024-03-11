package com.netflix.mediaclient.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.settings.DebugMenuPreference;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import java.util.Optional;
import o.C8054ddD;
import o.C8632dsu;
import o.C9737vz;

/* loaded from: classes4.dex */
public final class DebugMenuPreference extends Preference {

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public interface e {
        Optional<DebugMenuItems> e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugMenuPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(final PreferenceViewHolder preferenceViewHolder) {
        C8632dsu.c((Object) preferenceViewHolder, "");
        super.onBindViewHolder(preferenceViewHolder);
        setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cUJ
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean e2;
                e2 = DebugMenuPreference.e(DebugMenuPreference.this, preferenceViewHolder, preference);
                return e2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(DebugMenuPreference debugMenuPreference, PreferenceViewHolder preferenceViewHolder, Preference preference) {
        C8632dsu.c((Object) debugMenuPreference, "");
        C8632dsu.c((Object) preferenceViewHolder, "");
        if (C8054ddD.l(debugMenuPreference.getContext())) {
            return false;
        }
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(debugMenuPreference.getContext(), NetflixActivity.class);
        if (netflixActivity != null) {
            Optional<DebugMenuItems> e2 = ((e) EntryPointAccessors.fromActivity(netflixActivity, e.class)).e();
            if (e2.isPresent()) {
                View findViewById = preferenceViewHolder.findViewById(R.g.aP);
                PopupMenu popupMenu = new PopupMenu(findViewById.getContext(), findViewById);
                Menu menu = popupMenu.getMenu();
                C8632dsu.a(menu, "");
                DebugMenuItems debugMenuItems = e2.get();
                C8632dsu.a(debugMenuItems, "");
                debugMenuItems.e(menu);
                menu.setGroupVisible(1337, false);
                popupMenu.show();
                return true;
            }
            return true;
        }
        return true;
    }
}
