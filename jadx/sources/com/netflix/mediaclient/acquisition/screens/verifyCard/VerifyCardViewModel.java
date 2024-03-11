package com.netflix.mediaclient.acquisition.screens.verifyCard;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import o.C8566dqi;
import o.C8632dsu;
import o.C8674dui;
import o.C9726vo;
import o.dpR;
import o.drX;

/* loaded from: classes3.dex */
public final class VerifyCardViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final Map<String, String> acsPostParams;
    private final String acsUrl;
    private final NetworkRequestResponseListener backRequestLogger;
    private final String headingText;
    private final VerifyCardLifecycleData lifecycleData;
    private final String moneyBallActionModeOverride;
    private final VerifyCardParsedData parsedData;
    private byte[] postData;
    private final NetworkRequestResponseListener startMemebershipRequestLogger;
    private final int subHeadingStringId;
    private final List<String> subheadingText;

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final String getHeadingText() {
        return this.headingText;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2
    public String getMoneyBallActionModeOverride() {
        return this.moneyBallActionModeOverride;
    }

    public final byte[] getPostData() {
        return this.postData;
    }

    public final List<String> getSubheadingText() {
        return this.subheadingText;
    }

    public final void setPostData(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        this.postData = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyCardViewModel(SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, VerifyCardLifecycleData verifyCardLifecycleData, NetworkRequestResponseListener networkRequestResponseListener, NetworkRequestResponseListener networkRequestResponseListener2, StringProvider stringProvider, VerifyCardParsedData verifyCardParsedData) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        List<String> e;
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) verifyCardLifecycleData, "");
        C8632dsu.c((Object) networkRequestResponseListener, "");
        C8632dsu.c((Object) networkRequestResponseListener2, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) verifyCardParsedData, "");
        this.lifecycleData = verifyCardLifecycleData;
        this.startMemebershipRequestLogger = networkRequestResponseListener;
        this.backRequestLogger = networkRequestResponseListener2;
        this.parsedData = verifyCardParsedData;
        this.moneyBallActionModeOverride = SignupConstants.Mode.VERIFY_CARD;
        this.headingText = stringProvider.getString(R.string.title_verify_card_context);
        int i = verifyCardParsedData.is3DSCharge() ? R.string.label_verify_card_below : R.string.label_verify_card_below_nocharge;
        this.subHeadingStringId = i;
        e = C8566dqi.e(stringProvider.getString(i));
        this.subheadingText = e;
        this.acsUrl = verifyCardParsedData.getAcsUrl();
        this.acsPostParams = verifyCardParsedData.getAcsPostParams();
        this.postData = buildPostData();
    }

    private final void performStartMembershipRequest() {
        performAction(this.parsedData.getNextAction(), this.lifecycleData.getStartMemebershipLoading(), this.startMemebershipRequestLogger);
    }

    public final void performBackActionRequest() {
        performAction(this.parsedData.getPrevAction(), getBackRequestLoading(), this.backRequestLogger);
    }

    public final void onReceivePaRes(String str, String str2) {
        C9726vo.d(this.parsedData.getPaRes(), str, new drX<StringField, String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardViewModel$onReceivePaRes$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(StringField stringField, String str3) {
                invoke2(stringField, str3);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(StringField stringField, String str3) {
                C8632dsu.c((Object) stringField, "");
                C8632dsu.c((Object) str3, "");
                stringField.setValue(str3);
            }
        });
        C9726vo.d(this.parsedData.getMd(), str2, new drX<StringField, String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardViewModel$onReceivePaRes$2
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(StringField stringField, String str3) {
                invoke2(stringField, str3);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(StringField stringField, String str3) {
                C8632dsu.c((Object) stringField, "");
                C8632dsu.c((Object) str3, "");
                stringField.setValue(str3);
            }
        });
        performStartMembershipRequest();
    }

    public final MutableLiveData<Boolean> getBackRequestLoading() {
        return this.lifecycleData.getBackRequestLoading();
    }

    private final byte[] buildPostData() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.acsPostParams.entrySet()) {
            String encode = URLEncoder.encode(entry.getValue(), "UTF-8");
            sb.append("&" + entry.getKey() + "=" + encode);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        byte[] bytes = sb2.getBytes(C8674dui.i);
        C8632dsu.a(bytes, "");
        return bytes;
    }
}
