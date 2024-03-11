package com.netflix.mediaclient.ui.settings;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.ChangedValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.partner.PartnerInstallType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackSpecificationDiagnostics;
import com.netflix.mediaclient.service.user.SmartLockMonitor;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.bandwidthsetting.BandwidthPreference;
import com.netflix.mediaclient.ui.bandwidthsetting.ManualBwChoice;
import com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.settings.SettingsFragment;
import com.netflix.mediaclient.util.l10n.BidiMarker;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.AbstractC5166btd;
import o.C1044Mm;
import o.C1204Sr;
import o.C1613aHu;
import o.C1809aPa;
import o.C1825aPq;
import o.C3983bRx;
import o.C5020bqq;
import o.C5365bxQ;
import o.C8054ddD;
import o.C8055ddE;
import o.C8141del;
import o.C8150deu;
import o.C8151dev;
import o.C8153dex;
import o.C8157dfA;
import o.C8159dfC;
import o.C8168dfL;
import o.C8176dfT;
import o.C8206dfx;
import o.C8308dht;
import o.C8310dhv;
import o.C9834xU;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC4208baF;
import o.InterfaceC4251baw;
import o.InterfaceC5203buN;
import o.InterfaceC5204buO;
import o.InterfaceC7089cpd;
import o.InterfaceC7091cpf;
import o.InterfaceC7221csC;
import o.InterfaceC7303ctf;
import o.InterfaceC7306cti;
import o.InterfaceC7407cvd;
import o.aGT;
import o.aIB;
import o.aOV;
import o.bZN;
import o.cUB;
import o.cUG;
import o.cUM;
import o.cUP;
import o.cUS;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class SettingsFragment extends cUG implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Inject
    public C8308dht adChoicesHelper;
    private e c;
    private Dialog d;
    @Inject
    public InterfaceC7407cvd downloadedForYou;
    @Inject
    public InterfaceC7221csC downloadsFeatures;
    @Inject
    public aGT localDiscovery;
    @Inject
    public bZN localDiscoveryConsentUi;
    @Inject
    public InterfaceC7089cpd notificationPermissionHelper;
    @Inject
    public InterfaceC7091cpf notificationPermissionLaunchHelper;
    @Inject
    public InterfaceC7306cti offlineActivityApi;
    @Inject
    public InterfaceC7303ctf offlineApi;
    private final CompositeDisposable a = new CompositeDisposable();
    private final b e = new b();
    private final AbstractC5166btd b = new AbstractC5166btd() { // from class: com.netflix.mediaclient.ui.settings.SettingsFragment.2
        @Override // o.AbstractC5166btd, o.InterfaceC4209baG
        public void d(Status status) {
            InterfaceC4208baF offlineAgentOrNull;
            NetflixActivity j = SettingsFragment.this.j();
            if (j == null || (offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(j)) == null) {
                return;
            }
            offlineAgentOrNull.d(SettingsFragment.this.b);
            SettingsFragment.this.a(j);
        }

        @Override // o.InterfaceC4209baG
        public boolean c() {
            return C8054ddD.l(SettingsFragment.this.getActivity());
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum StorageLocation {
        INTERNAL,
        EXTERNAL
    }

    /* loaded from: classes4.dex */
    public interface e {
        String c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(Preference preference) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean i(Preference preference) {
        return false;
    }

    private void j(ServiceManager serviceManager) {
    }

    public static Fragment a() {
        return new SettingsFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetflixActivity netflixActivity) {
        Preference findPreference = findPreference("pref.downloads.remove_all");
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("pref.downloads");
        if (preferenceGroup != null && findPreference != null) {
            preferenceGroup.removePreference(findPreference);
        }
        InterfaceC4208baF t = netflixActivity.getServiceManager().t();
        if (t != null) {
            t.t();
        }
    }

    @Override // o.cUG, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (e) C8141del.e(activity, e.class);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e.c(this.notificationPermissionHelper);
        this.e.a(bundle);
        aIB.b(C(), new aIB.e() { // from class: o.cVj
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                SettingsFragment.this.i(serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ServiceManager serviceManager) {
        m();
        l();
        d(serviceManager);
        n();
        r();
        f(serviceManager);
    }

    private void r() {
        this.a.add(this.adChoicesHelper.b(AbstractApplicationC1040Mh.getInstance().i().e()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.cVd
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingsFragment.this.e((String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final String str) {
        if (str.isEmpty()) {
            return;
        }
        Preference findPreference = findPreference("pref.privacy.ad_choices");
        findPreference.setVisible(true);
        findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cUU
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean b2;
                b2 = SettingsFragment.this.b(str, preference);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(String str, Preference preference) {
        cUB.a(str, this);
        return true;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.e.d();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.e.b();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a.dispose();
        super.onDestroyView();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.e.d(bundle);
    }

    protected void i() {
        addPreferencesFromResource(this.downloadsFeatures.a() ? R.n.a : R.n.b);
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void onCreatePreferences(Bundle bundle, String str) {
        getPreferenceManager().setSharedPreferencesMode(0);
        getPreferenceManager().setSharedPreferencesName("nfxpref");
        i();
        Preference findPreference = findPreference("pref.downloads.video_quality");
        if (findPreference instanceof ListPreference) {
            e((ListPreference) findPreference);
        }
        g();
        s();
        t();
        if (C8153dex.p()) {
            findPreference("pref.dogfood.debug-menu").setVisible(true);
        }
        Preference findPreference2 = findPreference("pref.qa.debugonly");
        Preference findPreference3 = findPreference("pref.screen");
        if ((findPreference3 instanceof PreferenceGroup) && findPreference2 != null) {
            ((PreferenceGroup) findPreference3).removePreference(findPreference2);
        }
        if (C8159dfC.b()) {
            y();
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView listView = getListView();
        if (listView != null) {
            listView.setItemAnimator(null);
            listView.addItemDecoration(new DividerItemDecoration(listView.getContext(), 1));
        }
        h();
    }

    private void y() {
        C1044Mm.e("SettingsFragment", "removing qa.debugonly preferences for partner build");
        Preference findPreference = findPreference("pref.qa.debugonly");
        Preference findPreference2 = findPreference("ui.castAppId");
        boolean z = findPreference instanceof PreferenceGroup;
        if (z && findPreference2 != null) {
            C1044Mm.e("SettingsFragment", "removing ui.castAppId");
            ((PreferenceGroup) findPreference).removePreference(findPreference2);
        }
        Preference findPreference3 = findPreference("ui.bootParams");
        if (z && findPreference3 != null) {
            C1044Mm.e("SettingsFragment", "removing ui.bootParams");
            ((PreferenceGroup) findPreference).removePreference(findPreference3);
        }
        Preference findPreference4 = findPreference("ui.reset_license_sync_time");
        if (z && findPreference4 != null) {
            C1044Mm.e("SettingsFragment", "removing ui.reset_license_sync_time");
            ((PreferenceGroup) findPreference).removePreference(findPreference4);
        }
        Preference findPreference5 = findPreference("ui.reset_bootloader");
        if (z && findPreference5 != null) {
            C1044Mm.e("SettingsFragment", "removing ui.reset_bootloader");
            ((PreferenceGroup) findPreference).removePreference(findPreference5);
        }
        Preference findPreference6 = findPreference("ui.site");
        if (z && findPreference6 != null) {
            C1044Mm.e("SettingsFragment", "removing ui.site");
            ((PreferenceGroup) findPreference).removePreference(findPreference6);
        }
        Preference findPreference7 = findPreference("ui.allowpip");
        if (!z || findPreference7 == null) {
            return;
        }
        C1044Mm.e("SettingsFragment", "removing ui.allowpip");
        ((PreferenceGroup) findPreference).removePreference(findPreference7);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void onDisplayPreferenceDialog(Preference preference) {
        if (preference instanceof BandwidthPreference) {
            C5365bxQ e2 = C5365bxQ.e();
            e2.setTargetFragment(this, 0);
            e2.show(requireFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
            return;
        }
        super.onDisplayPreferenceDialog(preference);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("nf_play_no_wifi_warning".equals(str)) {
            C8157dfA.d((Context) getActivity(), "nf_play_no_wifi_warning", false);
        }
    }

    private void l() {
        C1613aHu.h(getActivity());
        v();
    }

    private void h(final ServiceManager serviceManager) {
        NetflixSwitchPreference netflixSwitchPreference;
        if (serviceManager.t() == null || (netflixSwitchPreference = (NetflixSwitchPreference) findPreference("pref.downloads.wifi_only")) == null) {
            return;
        }
        netflixSwitchPreference.setChecked(serviceManager.t().o());
        netflixSwitchPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: o.cUX
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                boolean c;
                c = SettingsFragment.this.c(serviceManager, preference, obj);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(ServiceManager serviceManager, Preference preference, Object obj) {
        FragmentActivity requireActivity;
        Intent intent;
        Boolean bool = (Boolean) obj;
        serviceManager.t().c(bool.booleanValue());
        if (!bool.booleanValue() && (intent = (requireActivity = requireActivity()).getIntent()) != null && intent.hasExtra(NetflixActivity.EXTRA_DL_PLAYABLE_ID)) {
            requireActivity.setResult(-1, intent);
            requireActivity.finish();
        }
        CLv2Utils.INSTANCE.e(new Focus(AppView.wifiOnlyDownloadsSetting, null), new ChangeValueCommand(bool));
        return true;
    }

    protected void c(ServiceManager serviceManager) {
        NetflixSwitchPreference netflixSwitchPreference;
        FragmentActivity activity = getActivity();
        if (activity != null && this.downloadsFeatures.a()) {
            Preference findPreference = findPreference("pref.downloads.smart");
            if (findPreference != null) {
                findPreference.setIntent(this.downloadedForYou.c(activity));
                return;
            }
            return;
        }
        if (!this.downloadsFeatures.d()) {
            findPreference("pref.downloads.smart").setVisible(false);
        }
        final InterfaceC4251baw p = serviceManager.p();
        if (p == null || (netflixSwitchPreference = (NetflixSwitchPreference) findPreference("pref.downloads.smart")) == null || serviceManager.t() == null) {
            return;
        }
        netflixSwitchPreference.setChecked(p.b());
        netflixSwitchPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: o.cVs
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                boolean c;
                c = SettingsFragment.c(InterfaceC4251baw.this, preference, obj);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(InterfaceC4251baw interfaceC4251baw, Preference preference, Object obj) {
        Boolean bool = (Boolean) obj;
        interfaceC4251baw.d(bool.booleanValue());
        CLv2Utils.INSTANCE.b(new Focus(AppView.smartDownloadsSetting, null), (Command) new ChangeValueCommand(Boolean.valueOf(bool.booleanValue())), false);
        return true;
    }

    private void g() {
        if (!C1613aHu.d(getContext())) {
            u();
            return;
        }
        Preference findPreference = findPreference("nf.bw_save");
        if (findPreference == null) {
            u();
            return;
        }
        b(getContext(), findPreference);
        findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVg
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean e2;
                e2 = SettingsFragment.e(preference);
                return e2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(Preference preference) {
        C1044Mm.e("SettingsFragment", "Debug: player type. preference:" + preference);
        return true;
    }

    private void u() {
        C1044Mm.e("SettingsFragment", "removing bandwidth settings");
        Preference findPreference = findPreference("nf.bw_save");
        Preference findPreference2 = findPreference("video.playback");
        if ((findPreference2 instanceof PreferenceGroup) && findPreference != null) {
            ((PreferenceGroup) findPreference2).removePreference(findPreference);
        }
        f();
    }

    protected void f() {
        ((PreferenceScreen) findPreference("pref.screen")).removePreference(findPreference("video.playback"));
    }

    private void v() {
        C1044Mm.e("SettingsFragment", "removing WiFiOnly settings");
        Preference findPreference = findPreference("nf_play_no_wifi_warning");
        Preference findPreference2 = findPreference("video.playback");
        if (!(findPreference2 instanceof PreferenceGroup) || findPreference == null) {
            return;
        }
        ((PreferenceGroup) findPreference2).removePreference(findPreference);
    }

    private void b(final ServiceManager serviceManager) {
        Preference findPreference = findPreference("pref.downloads.remove_all");
        if (serviceManager.t() == null || findPreference == null) {
            return;
        }
        if (this.offlineApi.a().f() < 1) {
            ((PreferenceGroup) findPreference("pref.downloads")).removePreference(findPreference);
        } else {
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVi
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean c;
                    c = SettingsFragment.this.c(serviceManager, preference);
                    return c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(final ServiceManager serviceManager, Preference preference) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            e eVar = this.c;
            Dialog b2 = this.offlineApi.b(activity, new DialogInterface.OnClickListener() { // from class: o.cVa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SettingsFragment.this.c(serviceManager, dialogInterface, i);
                }
            }, eVar != null ? eVar.c() : "");
            this.d = b2;
            b2.show();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ServiceManager serviceManager, DialogInterface dialogInterface, int i) {
        InterfaceC4208baF t = serviceManager.t();
        if (t != null) {
            t.e((InterfaceC4208baF) this.b);
            t.g();
            DownloadButton.d();
        }
        dialogInterface.dismiss();
    }

    private void e(final ServiceManager serviceManager) {
        aOV g = serviceManager.g();
        if (serviceManager.t() == null || g == null) {
            return;
        }
        Preference findPreference = findPreference("pref.downloads");
        Preference findPreference2 = findPreference("pref.downloads.video_quality");
        if (findPreference == null || findPreference2 == null) {
            C1044Mm.e("SettingsFragment", "downloads downloadCategoryPref or downloadQualityPref is null");
        } else if (!(findPreference instanceof PreferenceGroup)) {
            C1044Mm.e("SettingsFragment", "downloadCategoryPref not a group pref");
        } else if (!(findPreference2 instanceof ListPreference)) {
            C1044Mm.e("SettingsFragment", "downloads downloadQualityPref not a list pref");
        } else {
            final ListPreference listPreference = (ListPreference) findPreference2;
            C1044Mm.e("SettingsFragment", "Debug: downloads video quality");
            listPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: o.cUT
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    boolean d;
                    d = SettingsFragment.this.d(listPreference, serviceManager, preference, obj);
                    return d;
                }
            });
            c(serviceManager.t(), listPreference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(ListPreference listPreference, ServiceManager serviceManager, Preference preference, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            str.hashCode();
            if (str.equals("DEFAULT")) {
                C1044Mm.e("SettingsFragment", "Set downloads video quality to default");
                listPreference.setSummary(getText(R.o.iE));
                b(DownloadVideoQuality.DEFAULT, serviceManager);
            } else if (str.equals("BEST")) {
                C1044Mm.e("SettingsFragment", "Set downloads video quality to best");
                listPreference.setSummary(getText(R.o.iy));
                b(DownloadVideoQuality.BEST, serviceManager);
            } else {
                C1044Mm.d("SettingsFragment", "Received unexpected value for downloads video quality " + str);
            }
            CLv2Utils.INSTANCE.e(new Focus(AppView.downloadVideoQualitySetting, null), new ChangeValueCommand(str));
            return true;
        }
        C1044Mm.d("SettingsFragment", "Received unexpected NON string value for downloads video quality " + obj);
        return true;
    }

    private void b(DownloadVideoQuality downloadVideoQuality, ServiceManager serviceManager) {
        if (serviceManager.t() != null) {
            serviceManager.t().e(downloadVideoQuality);
        }
    }

    private void e(ListPreference listPreference) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(C8176dfT.c(requireContext(), getString(R.o.iE), getString(R.o.iB)));
        arrayList2.add(DownloadVideoQuality.DEFAULT.a());
        arrayList.add(C8176dfT.c(requireContext(), getString(R.o.iy), getString(R.o.iA)));
        arrayList2.add(DownloadVideoQuality.BEST.a());
        listPreference.setEntries((CharSequence[]) arrayList.toArray(new CharSequence[0]));
        listPreference.setEntryValues((CharSequence[]) arrayList2.toArray(new CharSequence[0]));
    }

    private void c(InterfaceC4208baF interfaceC4208baF, ListPreference listPreference) {
        DownloadVideoQuality m = interfaceC4208baF.m();
        Preference findPreference = findPreference("pref.downloads.video_quality");
        int i = AnonymousClass5.e[m.ordinal()];
        if (i == 1) {
            listPreference.setValue(DownloadVideoQuality.BEST.a());
            findPreference.setSummary(getText(R.o.iy));
        } else if (i == 2 || i == 3) {
            listPreference.setValue(DownloadVideoQuality.DEFAULT.a());
            findPreference.setSummary(getText(R.o.iE));
        }
    }

    private boolean p() {
        try {
            C1044Mm.e("SettingsFragment", "Verifies that the device supports GCM");
            return C8150deu.a((Context) getActivity());
        } catch (Throwable th) {
            C1044Mm.e("SettingsFragment", "Device does NOT supports GCM", th);
            return false;
        }
    }

    private boolean q() {
        return C1825aPq.b(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (!p()) {
            C1044Mm.e("SettingsFragment", "Notifications are NOT supported!");
            x();
            return;
        }
        C1044Mm.e("SettingsFragment", "Enable notifications");
        boolean q = q();
        NetflixSwitchPreference netflixSwitchPreference = (NetflixSwitchPreference) findPreference("nf_notification_enable");
        if (netflixSwitchPreference != null) {
            if (ConfigFastPropertyFeatureControlConfig.Companion.j()) {
                a(netflixSwitchPreference, q);
                return;
            } else {
                b(netflixSwitchPreference, q);
                return;
            }
        }
        x();
    }

    private void a(NetflixSwitchPreference netflixSwitchPreference, final boolean z) {
        netflixSwitchPreference.setSummary(R.o.fN);
        netflixSwitchPreference.setChecked(z && this.notificationPermissionHelper.b());
        netflixSwitchPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: o.cVk
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                boolean b2;
                b2 = SettingsFragment.this.b(z, preference, obj);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(boolean z, Preference preference, Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Logger.INSTANCE.logEvent(new Selected(AppView.allowNotificationsSetting, null, booleanValue ? CommandValue.AllowNotificationsCommand : CommandValue.DontAllowNotificationsCommand, null));
            if (booleanValue) {
                if (!z) {
                    this.notificationPermissionHelper.a(AppView.settings);
                }
                if (this.notificationPermissionHelper.b()) {
                    return true;
                }
                this.notificationPermissionLaunchHelper.a();
            } else {
                this.notificationPermissionLaunchHelper.a();
            }
            return false;
        }
        InterfaceC1593aHa.b("Notification Pref customNotificationPrefs newValue -> " + obj);
        InterfaceC1598aHf.a("Notification Pref onPreferenceChange newValue is not a Boolean object");
        return false;
    }

    private void b(NetflixSwitchPreference netflixSwitchPreference, boolean z) {
        netflixSwitchPreference.setChecked(z);
        netflixSwitchPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: o.cUV
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                boolean c;
                c = SettingsFragment.this.c(preference, obj);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(Preference preference, Object obj) {
        C1044Mm.e("SettingsFragment", "Notification enabled clicked");
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                C1044Mm.e("SettingsFragment", "Register for notifications");
                Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN");
                intent.putExtra(NetflixActivity.EXTRA_SOURCE, AppView.settings.name());
                intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
                LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent);
            } else {
                C1044Mm.e("SettingsFragment", "Unregister from notifications");
                Intent intent2 = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT");
                intent2.addCategory("com.netflix.mediaclient.intent.category.PUSH");
                intent2.putExtra(NetflixActivity.EXTRA_SOURCE, AppView.settings.name());
                LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent2);
            }
            CLv2Utils.INSTANCE.e(new Focus(AppView.allowNotificationsSetting, null), new ChangeValueCommand(Boolean.valueOf(booleanValue)));
            return true;
        }
        InterfaceC1593aHa.b("Notification Pref customNotificationPrefs newValue -> " + obj);
        InterfaceC1598aHf.a("Notification Pref onPreferenceChange newValue is not a Boolean object");
        return false;
    }

    private void x() {
        NetflixSwitchPreference netflixSwitchPreference = (NetflixSwitchPreference) findPreference("nf_notification_enable");
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("pref.notification");
        if (preferenceGroup != null) {
            if (netflixSwitchPreference != null) {
                preferenceGroup.removePreference(netflixSwitchPreference);
            }
            preferenceScreen.removePreference(preferenceGroup);
        }
    }

    private void n() {
        C1044Mm.a("SettingsFragment", "Local discovery %d", Integer.valueOf(this.localDiscovery.hashCode()));
        if (this.localDiscovery.e()) {
            o();
            return;
        }
        C1044Mm.e("SettingsFragment", "Local discovery consent dialog is not required or dialog was not displayed");
        Preference findPreference = findPreference("pref.network");
        if (findPreference != null) {
            getPreferenceScreen().removePreference(findPreference);
        }
    }

    private void o() {
        C1044Mm.e("SettingsFragment", "Local discovery consent dialog was previously showed to user, make it visible");
        NetflixSwitchPreference netflixSwitchPreference = (NetflixSwitchPreference) findPreference("pref.network.local_discovery");
        if (netflixSwitchPreference == null) {
            return;
        }
        netflixSwitchPreference.setChecked(this.localDiscovery.c());
        netflixSwitchPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: o.cVc
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                boolean e2;
                e2 = SettingsFragment.this.e(preference, obj);
                return e2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(Preference preference, Object obj) {
        this.localDiscoveryConsentUi.d(C().composeViewOverlayManager);
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            this.localDiscovery.c(bool.booleanValue());
            Logger.INSTANCE.logEvent(new ChangedValue(AppView.localNetworkPermissionSetting, null, bool, bool.booleanValue() ? CommandValue.AllowLocalNetworkPermissionCommand : CommandValue.DenyLocalNetworkPermissionCommand, null));
            return true;
        }
        C1044Mm.e("SettingsFragment", "KEY_NETWORK_LOCAL_DISCOVERY_CONSENT switch did not returned boolean, but %s", obj);
        return true;
    }

    private void d(ServiceManager serviceManager) {
        if (serviceManager.H()) {
            a(serviceManager);
            b(serviceManager);
            e(serviceManager);
            h(serviceManager);
            c(serviceManager);
            return;
        }
        Preference findPreference = findPreference("pref.downloads");
        if (findPreference != null) {
            getPreferenceScreen().removePreference(findPreference);
        }
    }

    private void a(ServiceManager serviceManager) {
        C1044Mm.e("SettingsFragment", "handleDownloadsStorageSelectorSetting");
        final InterfaceC4208baF t = serviceManager.t();
        if (t == null) {
            C1044Mm.e("SettingsFragment", "handleDownloadsStorageSelectorSetting offlineAgent is null");
            return;
        }
        final Preference findPreference = findPreference("pref.downloads.storage_selector");
        if (findPreference == null) {
            C1044Mm.d("SettingsFragment", "handleDownloadsStorageSelectorSetting dl location pref is null");
            return;
        }
        boolean a = t.l().a(t.l().b());
        C1044Mm.c("SettingsFragment", "currentStorageRemovable=%b", Boolean.valueOf(a));
        findPreference.setSummary(a ? R.o.iF : R.o.ip);
        t.t();
        findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVo
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean e2;
                e2 = SettingsFragment.this.e(t, findPreference, preference);
                return e2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(final InterfaceC4208baF interfaceC4208baF, final Preference preference, Preference preference2) {
        if (this.offlineApi.a().i()) {
            new AlertDialog.Builder(requireContext(), C9834xU.o.c).setMessage(R.o.iP).setPositiveButton(R.o.hT, new DialogInterface.OnClickListener() { // from class: o.cVp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SettingsFragment.this.b(dialogInterface, i);
                }
            }).setNegativeButton(R.o.cL, new DialogInterface.OnClickListener() { // from class: o.cUW
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).create().show();
        } else {
            InterfaceC5204buO l = interfaceC4208baF.l();
            if (l.c() <= 0) {
                C1044Mm.e("SettingsFragment", "osvList size=%d", Integer.valueOf(l.c()));
                return true;
            }
            interfaceC4208baF.t();
            int b2 = l.b();
            C1044Mm.c("SettingsFragment", "currentlySelected=%d", Integer.valueOf(b2));
            int c = l.c();
            CharSequence[] charSequenceArr = new CharSequence[c];
            for (int i = 0; i < l.c(); i++) {
                InterfaceC5203buN c2 = l.c(i);
                charSequenceArr[i] = C8176dfT.c(requireContext(), getString(c2.n() ? R.o.iF : R.o.ip), getString(R.o.im, C8176dfT.d(getActivity(), c2.c())));
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C9834xU.o.c);
            if (c == 1) {
                CharSequence e2 = C8176dfT.e(requireContext(), getString(R.o.by), getString(R.o.bz));
                C1204Sr c1204Sr = new C1204Sr(requireContext());
                int dimension = (int) getResources().getDimension(R.b.N);
                c1204Sr.setPadding(dimension, dimension, dimension, (int) getResources().getDimension(C9834xU.a.m));
                c1204Sr.setText(e2);
                builder.setCustomTitle(c1204Sr);
                builder.setPositiveButton(R.o.f13253fi, (DialogInterface.OnClickListener) null);
            } else {
                String string = getString(R.o.ig);
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(new TextAppearanceSpan(getActivity(), C9834xU.o.n), 0, string.length(), 0);
                spannableString.setSpan(new StyleSpan(1), 0, string.length(), 33);
                builder.setTitle(spannableString);
                builder.setPositiveButton(R.o.cL, (DialogInterface.OnClickListener) null);
            }
            builder.setSingleChoiceItems(charSequenceArr, b2, new DialogInterface.OnClickListener() { // from class: o.cUY
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SettingsFragment.this.c(interfaceC4208baF, preference, dialogInterface, i2);
                }
            }).create().show();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        FragmentActivity activity = getActivity();
        if (!C8054ddD.l(activity)) {
            activity.startActivity(this.offlineActivityApi.d((Activity) activity));
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(InterfaceC4208baF interfaceC4208baF, Preference preference, DialogInterface dialogInterface, int i) {
        String name;
        boolean a = interfaceC4208baF.l().a(i);
        C1044Mm.c("SettingsFragment", "selected=%d isRemovable=%b", Integer.valueOf(i), Boolean.valueOf(a));
        preference.setSummary(a ? R.o.iF : R.o.ip);
        preference.setIcon(a ? R.e.ab : R.e.K);
        interfaceC4208baF.a(i);
        dialogInterface.dismiss();
        if (getActivity() != null) {
            if (getListView() != null && getListView().getAdapter() != null) {
                getListView().getAdapter().notifyDataSetChanged();
            }
            if (a) {
                w();
                CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                Focus focus = new Focus(AppView.downloadLocationSetting, null);
                if (a) {
                    name = StorageLocation.EXTERNAL.name();
                } else {
                    name = StorageLocation.INTERNAL.name();
                }
                cLv2Utils.e(focus, new ChangeValueCommand(name));
            }
        }
    }

    public void b(Context context, boolean z) {
        Preference findPreference = findPreference("nf.bw_save");
        if (findPreference == null) {
            return;
        }
        if (z) {
            C5020bqq.e(context);
        }
        b(context, findPreference);
    }

    private void b(Context context, Preference preference) {
        if (context == null || preference == null) {
            return;
        }
        preference.setSummary(b(context));
    }

    private static int b(Context context) {
        return C1613aHu.b(context) ? R.o.cH : a(ManualBwChoice.d(C1613aHu.e(context)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.settings.SettingsFragment$5  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ManualBwChoice.values().length];
            b = iArr;
            try {
                iArr[ManualBwChoice.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ManualBwChoice.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ManualBwChoice.UNLIMITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DownloadVideoQuality.values().length];
            e = iArr2;
            try {
                iArr2[DownloadVideoQuality.BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[DownloadVideoQuality.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[DownloadVideoQuality.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static int a(ManualBwChoice manualBwChoice) {
        int i = R.o.cH;
        int i2 = AnonymousClass5.b[manualBwChoice.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i : R.o.cJ : R.o.cF : R.o.cK;
    }

    private void w() {
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            C1044Mm.a("SettingsFragment", "requestExternalStoragePermission, requesting permission");
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return;
        }
        C1044Mm.a("SettingsFragment", "requestExternalStoragePermission, already has permission");
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C1044Mm.a("SettingsFragment", "onRequestPermissionResult, requestCode: " + i);
        if (i != 1) {
            C1044Mm.c("SettingsFragment", "unknown permission request code: %d", Integer.valueOf(i));
        } else if (iArr.length > 0 && iArr[0] == 0) {
            C1044Mm.a("SettingsFragment", "permission is granted");
        } else if (iArr.length <= 0 || iArr[0] != -1) {
        } else {
            C1044Mm.c("SettingsFragment", "onRequestPermissionsResult, shouldShowRationale=%b", Boolean.valueOf(shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")));
            aIB.b(C(), new aIB.e() { // from class: o.cVt
                @Override // o.aIB.e
                public final void run(ServiceManager serviceManager) {
                    SettingsFragment.this.g(serviceManager);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(ServiceManager serviceManager) {
        InterfaceC4208baF t = serviceManager.t();
        if (t != null) {
            C1044Mm.a("SettingsFragment", "onRequestPermissionsResult, permission denied, reverting to internal storage");
            t.a(0);
            Preference findPreference = findPreference("pref.downloads.storage_selector");
            if (findPreference != null) {
                findPreference.setSummary(R.o.ip);
            }
        }
    }

    private void f(final ServiceManager serviceManager) {
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        String h = C8055ddE.h(activity);
        if (h == null) {
            h = getString(R.o.gL);
        }
        int c = C8055ddE.c(activity);
        final StringBuilder sb = new StringBuilder();
        sb.append(getString(R.o.gF));
        sb.append(": ");
        sb.append(h);
        if (c > 0) {
            sb.append(" (");
            sb.append(getString(R.o.gJ));
            sb.append(" ");
            sb.append(c);
            sb.append("), ");
        }
        sb.append(getString(R.o.fp));
        sb.append(": ");
        sb.append(C8054ddD.c());
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null && strArr.length > 0) {
            sb.append(", ");
            sb.append(strArr[0]);
        }
        sb.append("\n");
        sb.append(getString(R.o.et));
        sb.append(": ");
        sb.append(Build.MODEL);
        sb.append("\n");
        aOV J2 = serviceManager.J();
        boolean e2 = PartnerInstallType.e(J2.B());
        String string = getString(R.o.dW);
        BidiMarker bidiMarker = BidiMarker.FORCED_RTL;
        sb.append(C8310dhv.c(string, bidiMarker));
        sb.append(": ");
        sb.append(e2 ? 1 : 0);
        String n = J2.n();
        if (C8168dfL.h(n)) {
            sb.append(", ");
            sb.append(getString(R.o.cQ));
            sb.append(": ");
            sb.append(n);
            b(activity, sb);
        }
        sb.append(", ");
        sb.append(C8310dhv.c(getString(R.o.fW), bidiMarker));
        sb.append(": ");
        sb.append(C8159dfC.f() ? 1 : 0);
        sb.append("\n");
        String X = J2.X();
        if (C8168dfL.h(X)) {
            sb.append(C8310dhv.c(getString(R.o.cM), bidiMarker));
            sb.append(": ");
            sb.append(X);
            sb.append("\n");
        }
        sb.append(C8310dhv.c(getString(R.o.cG), bidiMarker));
        sb.append(": ");
        sb.append(Build.DISPLAY);
        sb.append("\n");
        sb.append(C8310dhv.c(getString(R.o.dH), bidiMarker));
        sb.append(": ");
        sb.append(serviceManager.k().m());
        C8206dfx c8206dfx = C8206dfx.e;
        if (C8206dfx.a()) {
            String externalForm = J2.j().a("").toExternalForm();
            String b2 = J2.j().b("");
            sb.append("\n");
            sb.append("api: ");
            sb.append(externalForm);
            sb.append("\n");
            sb.append("nq api: ");
            sb.append("/nq/androidui/samurai/~8.105.0/api");
            sb.append("\n");
            sb.append("config: ");
            sb.append(b2);
            sb.append("\n");
            sb.append("playback: ");
            sb.append("/nq/android/playback/~1.0.0");
            sb.append("\n");
            sb.append("playback logs: ");
            sb.append("/nq/android/api/~7.1.0");
            sb.append("\n");
        }
        Preference findPreference = findPreference("ui.about.device");
        findPreference.setSummary(sb.toString());
        findPreference.setIcon(C8150deu.h() ? R.e.u : R.e.w);
        if (C8206dfx.a()) {
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVn
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean e3;
                    e3 = SettingsFragment.this.e(sb, preference);
                    return e3;
                }
            });
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.o.bJ));
        sb2.append(": ");
        sb2.append(serviceManager.w());
        if (SmartLockMonitor.INSTANCE.d()) {
            String string2 = requireContext().getString(R.o.gn);
            sb2.append('\n');
            sb2.append(string2);
        }
        Preference findPreference2 = findPreference("ui.account");
        findPreference2.setSummary(sb2.toString());
        final NetflixActivity netflixActivity = (NetflixActivity) getActivity();
        findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVr
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean a;
                a = SettingsFragment.a(NetflixActivity.this, preference);
                return a;
            }
        });
        Preference findPreference3 = findPreference("ui.diagnosis.download");
        if (findPreference3 != null) {
            if (!serviceManager.H() && !C8153dex.h() && !C8151dev.h()) {
                findPreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVq
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        boolean a;
                        a = SettingsFragment.this.a(activity, serviceManager, preference);
                        return a;
                    }
                });
            } else {
                ((PreferenceCategory) findPreference("ui.diagnosis")).removePreference(findPreference3);
            }
        }
        j(serviceManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(StringBuilder sb, Preference preference) {
        Context context = getContext();
        if (context != null) {
            ClipData newPlainText = ClipData.newPlainText("netflix about", sb.toString());
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", false);
            newPlainText.getDescription().setExtras(persistableBundle);
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(newPlainText);
            C8054ddD.a(context, "Copied to clipboard", 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(NetflixActivity netflixActivity, Preference preference) {
        return new C3983bRx(netflixActivity).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(Activity activity, ServiceManager serviceManager, Preference preference) {
        this.offlineApi.a((cUS) activity, serviceManager);
        return false;
    }

    private void b(Context context, StringBuilder sb) {
        String e2 = C8157dfA.e(context, "channelIdSource", (String) null);
        if (C8168dfL.g(e2)) {
            C1809aPa.d(context);
            e2 = C8157dfA.e(context, "channelIdSource", (String) null);
        }
        if (C8168dfL.h(e2)) {
            sb.append(" (");
            sb.append(e2);
            sb.append(")");
        }
    }

    private void t() {
        Preference findPreference;
        Preference findPreference2 = findPreference(getString(R.o.ll));
        if (getActivity() != null) {
            findPreference2.setIntent(cUM.c(getActivity()));
        }
        findPreference("pref.privacy").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVf
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean g;
                g = SettingsFragment.this.g(preference);
                return g;
            }
        });
        Preference findPreference3 = findPreference("pref.group.legal");
        if ((findPreference3 instanceof PreferenceGroup) && (findPreference = findPreference("pref.cfour.dnsspi")) != null) {
            if (C8153dex.m()) {
                findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVh
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        boolean h;
                        h = SettingsFragment.this.h(preference);
                        return h;
                    }
                });
            } else {
                ((PreferenceGroup) findPreference3).removePreference(findPreference);
            }
        }
        findPreference("pref.privacy.cookies").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVm
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean f;
                f = SettingsFragment.this.f(preference);
                return f;
            }
        });
        findPreference("pref.terms").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVl
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean j;
                j = SettingsFragment.this.j(preference);
                return j;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean g(Preference preference) {
        cUB.a("http://www.netflix.com/privacy", this);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean h(Preference preference) {
        cUB.a("https://www.netflix.com/dnsspi", this);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean f(Preference preference) {
        cUB.a("https://www.netflix.com/privacy#cookies", this);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean j(Preference preference) {
        cUB.a("https://www.netflix.com/termsofuse", this);
        return false;
    }

    private void s() {
        Preference findPreference = findPreference("ui.diagnosis.network");
        if (getActivity() != null) {
            findPreference.setIntent(DiagnosisActivity.b(getActivity()));
        }
        findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVe
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean i;
                i = SettingsFragment.i(preference);
                return i;
            }
        });
        k();
        findPreference("ui.diagnosis.speed.test").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cVb
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean k;
                k = SettingsFragment.this.k(preference);
                return k;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean k(Preference preference) {
        cUB.a("https://fast.com/", this);
        return false;
    }

    private void k() {
        Preference findPreference = findPreference("ui.diagnosis.playback_specification");
        if (findPreference == null) {
            return;
        }
        if (!Config_FastProperty_PlaybackSpecificationDiagnostics.Companion.d()) {
            Preference findPreference2 = findPreference("ui.diagnosis");
            if (findPreference2 instanceof PreferenceGroup) {
                ((PreferenceGroup) findPreference2).removePreference(findPreference);
                return;
            }
            return;
        }
        if (getActivity() != null) {
            findPreference.setIntent(cUP.b(getActivity()));
        }
        findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: o.cUZ
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                boolean b2;
                b2 = SettingsFragment.b(preference);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetflixActivity C() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new IllegalStateException("fragment has a null activity");
        }
        return (NetflixActivity) activity;
    }

    protected NetflixActivity j() {
        return (NetflixActivity) getActivity();
    }

    private void h() {
        NetflixActivity j = j();
        if (j != null) {
            j.endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
        }
    }

    /* loaded from: classes4.dex */
    public class b {
        private Boolean a;
        private InterfaceC7089cpd e;

        /* JADX INFO: Access modifiers changed from: private */
        public void c(InterfaceC7089cpd interfaceC7089cpd) {
            this.e = interfaceC7089cpd;
        }

        private b() {
            this.e = null;
            this.a = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Bundle bundle) {
            if (bundle == null || !ConfigFastPropertyFeatureControlConfig.Companion.j()) {
                return;
            }
            this.a = (Boolean) bundle.getSerializable("PREVIOUS_NOTIFICATION_ENABLED_KEY");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (ConfigFastPropertyFeatureControlConfig.Companion.j()) {
                e();
                aIB.b(SettingsFragment.this.C(), new aIB.e() { // from class: o.cVu
                    @Override // o.aIB.e
                    public final void run(ServiceManager serviceManager) {
                        SettingsFragment.b.this.e(serviceManager);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(ServiceManager serviceManager) {
            c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.e == null) {
                InterfaceC1597aHe.e("NotificationPrefUiUpdater onStop: notificationPermissionHelper needs to be set");
            } else if (ConfigFastPropertyFeatureControlConfig.Companion.j()) {
                this.a = Boolean.valueOf(this.e.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Bundle bundle) {
            if (ConfigFastPropertyFeatureControlConfig.Companion.j()) {
                bundle.putSerializable("PREVIOUS_NOTIFICATION_ENABLED_KEY", this.a);
            }
        }

        private void e() {
            if (this.e == null) {
                InterfaceC1597aHe.e("updateNotificationSettingsUi: notificationPermissionHelper is null");
                return;
            }
            NetflixSwitchPreference netflixSwitchPreference = (NetflixSwitchPreference) SettingsFragment.this.findPreference("nf_notification_enable");
            if (netflixSwitchPreference != null) {
                netflixSwitchPreference.setOnPreferenceChangeListener(null);
            }
            SettingsFragment.this.m();
        }

        private void c() {
            InterfaceC7089cpd interfaceC7089cpd = this.e;
            if (interfaceC7089cpd == null) {
                InterfaceC1597aHe.e("NotificationPrefUiUpdater registerIfNotificationPermissionIsChanged: notificationPermissionHelper needs to be set");
                return;
            }
            boolean b = interfaceC7089cpd.b();
            Boolean bool = this.a;
            if (bool == null || bool.booleanValue() == b) {
                return;
            }
            if (b) {
                this.e.a(AppView.settings);
            } else {
                this.e.c(AppView.settings);
            }
        }
    }
}
