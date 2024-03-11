package com.netflix.mediaclient.acquisition.screens.onRamp;

import android.text.Spanned;
import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModel;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.util.ArrayList;
import java.util.List;
import o.C1333Xq;
import o.C1866aRd;
import o.C8168dfL;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.duD;

/* loaded from: classes3.dex */
public class OnRampViewModel extends AbstractNetworkViewModel2 {
    public static final int PHONE_COLUMN_COUNT = 3;
    public static final int TABLET_COLUMN_COUNT = 6;
    private final CharSequence buttonFinishedText;
    private final C1333Xq buttonLabelFormatter;
    private final String chooseText;
    private final int columnCount;
    private final OnRampLifecycleData lifecycleData;
    private final OnRampParsedData parsedData;
    private final String profileName;
    private MutableLiveData<String> selectedTitlesLiveData;
    private final StepsViewModel stepsViewModel;
    private final CharSequence subheaderText;
    private final StringField titleSelections;
    private final List<OnRampTitle> titlesData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final CharSequence getButtonFinishedText() {
        return this.buttonFinishedText;
    }

    public String getChooseText() {
        return this.chooseText;
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public final MutableLiveData<String> getSelectedTitlesLiveData() {
        return this.selectedTitlesLiveData;
    }

    public final StepsViewModel getStepsViewModel() {
        return this.stepsViewModel;
    }

    public final CharSequence getSubheaderText() {
        return this.subheaderText;
    }

    public final StringField getTitleSelections() {
        return this.titleSelections;
    }

    public final List<OnRampTitle> getTitlesData() {
        return this.titlesData;
    }

    public final void setSelectedTitlesLiveData(MutableLiveData<String> mutableLiveData) {
        C8632dsu.c((Object) mutableLiveData, "");
        this.selectedTitlesLiveData = mutableLiveData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnRampViewModel(StringProvider stringProvider, OnRampLifecycleData onRampLifecycleData, OnRampParsedData onRampParsedData, boolean z, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        String string;
        String string2;
        int d;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) onRampLifecycleData, "");
        C8632dsu.c((Object) onRampParsedData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.lifecycleData = onRampLifecycleData;
        this.parsedData = onRampParsedData;
        this.columnCount = z ? 6 : 3;
        this.stepsViewModel = onRampParsedData.getStepsViewModel();
        String headerSubtitleKey = onRampParsedData.getHeaderSubtitleKey();
        Spanned c = C8168dfL.c((headerSubtitleKey == null || (string = stringProvider.getString(headerSubtitleKey)) == null) ? stringProvider.getString(R.string.onramp_subheader_cleanup) : string);
        C8632dsu.a(c, "");
        this.subheaderText = c;
        if (C1866aRd.d.c().e()) {
            string2 = stringProvider.getString(R.string.profile_onboarding_onramp_header_no_name);
        } else if (C8168dfL.h(onRampParsedData.getProfileName())) {
            string2 = stringProvider.getFormatter(R.string.onramp_header).d("name", onRampParsedData.getProfileName()).c();
            C8632dsu.d((Object) string2);
        } else {
            string2 = stringProvider.getString(R.string.onramp_header_no_name);
        }
        this.chooseText = string2;
        this.buttonFinishedText = stringProvider.getString(R.string.profile_onboarding_finished_label);
        this.profileName = onRampParsedData.getProfileName();
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("");
        this.selectedTitlesLiveData = mutableLiveData;
        this.titleSelections = onRampParsedData.getSelections();
        List<VideoParsedData> videos = onRampParsedData.getVideos();
        d = C8572dqo.d(videos, 10);
        ArrayList arrayList = new ArrayList(d);
        for (VideoParsedData videoParsedData : videos) {
            arrayList.add(new OnRampTitle(videoParsedData.getVideoId(), videoParsedData.getUrl(), videoParsedData.getTitle(), false, 8, null));
        }
        this.titlesData = arrayList;
        this.buttonLabelFormatter = stringProvider.getFormatter(R.string.profile_onboarding_onramp_button_label);
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public final MutableLiveData<Boolean> getOnRampLoading() {
        return this.lifecycleData.getNextActionLoading();
    }

    public final List<String> getTitleSelectionsList() {
        List<String> d;
        StringField stringField = this.titleSelections;
        Object value = stringField != null ? stringField.getValue() : null;
        String str = value instanceof String ? (String) value : null;
        if (str != null) {
            d = duD.d((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
            return d;
        }
        return null;
    }

    public final String getButtonText(int i) {
        String c = this.buttonLabelFormatter.d("count", Integer.valueOf(i)).c();
        C8632dsu.a(c, "");
        return c;
    }

    public final void performNextAction(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        performActionRequestAndBypassGenericListeners(this.parsedData.getNextAction(), getOnRampLoading(), networkRequestResponseListener);
    }

    public final void performActionRequestAndBypassGenericListeners(ActionField actionField, MutableLiveData<Boolean> mutableLiveData, NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) mutableLiveData, "");
        C8632dsu.c((Object) networkRequestResponseListener, "");
        Boolean value = mutableLiveData.getValue();
        Boolean bool = Boolean.TRUE;
        if (C8632dsu.c(value, bool) || actionField == null) {
            return;
        }
        mutableLiveData.setValue(bool);
        getSignupNetworkManager().performActionRequest(actionField, getMoneyBallActionModeOverride(), networkRequestResponseListener);
    }
}
