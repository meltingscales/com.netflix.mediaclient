package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import android.text.Html;
import android.text.Spanned;
import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModel;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;
import o.duD;

/* loaded from: classes3.dex */
public final class SecondaryLanguageViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final List<String> existingLanguages;
    private final String headingText;
    private final InterfaceC8554dpx headingTextWithName$delegate;
    private final List<LanguageData> languages;
    private final SecondaryLanguageLifecycleData lifecycleData;
    private final SecondaryLanguageParsedData parsedData;
    private final List<LanguageData> preferredLanguage;
    private final StringField secondaryLanguages;
    private final MutableLiveData<String> selectedLanguagesLiveData;
    private final StepsViewModel stepsViewModel;
    private final StringProvider stringProvider;
    private final InterfaceC8554dpx subheadingString$delegate;

    public final String getHeadingText() {
        return this.headingText;
    }

    public final List<LanguageData> getLanguages() {
        return this.languages;
    }

    public final List<LanguageData> getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public final StringField getSecondaryLanguages() {
        return this.secondaryLanguages;
    }

    public final MutableLiveData<String> getSelectedLanguagesLiveData() {
        return this.selectedLanguagesLiveData;
    }

    public final StepsViewModel getStepsViewModel() {
        return this.stepsViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecondaryLanguageViewModel(StringProvider stringProvider, SecondaryLanguageLifecycleData secondaryLanguageLifecycleData, SecondaryLanguageParsedData secondaryLanguageParsedData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) secondaryLanguageLifecycleData, "");
        C8632dsu.c((Object) secondaryLanguageParsedData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.stringProvider = stringProvider;
        this.lifecycleData = secondaryLanguageLifecycleData;
        this.parsedData = secondaryLanguageParsedData;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("");
        this.selectedLanguagesLiveData = mutableLiveData;
        this.stepsViewModel = secondaryLanguageParsedData.getStepsViewModel();
        this.headingText = stringProvider.getString(R.string.secondary_language_header);
        b = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$headingTextWithName$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final String invoke() {
                SecondaryLanguageParsedData secondaryLanguageParsedData2;
                StringProvider stringProvider2;
                secondaryLanguageParsedData2 = SecondaryLanguageViewModel.this.parsedData;
                String profileName = secondaryLanguageParsedData2.getProfileName();
                if (profileName != null && profileName.length() != 0) {
                    stringProvider2 = SecondaryLanguageViewModel.this.stringProvider;
                    return stringProvider2.getFormatter(R.string.profile_onboarding_secondary_language_header).d(SignupConstants.Field.PROFILE_NAME, profileName).c();
                }
                return SecondaryLanguageViewModel.this.getHeadingText();
            }
        });
        this.headingTextWithName$delegate = b;
        b2 = dpB.b(new drO<Spanned>() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$subheadingString$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Spanned invoke() {
                StringProvider stringProvider2;
                stringProvider2 = SecondaryLanguageViewModel.this.stringProvider;
                return Html.fromHtml(stringProvider2.getString(R.string.secondary_language_subheader), 0);
            }
        });
        this.subheadingString$delegate = b2;
        this.languages = secondaryLanguageParsedData.getAllLanguages();
        this.preferredLanguage = secondaryLanguageParsedData.getPreferredLanguages();
        this.secondaryLanguages = secondaryLanguageParsedData.getSecondaryLanguages();
        String existingLanguages = secondaryLanguageParsedData.getExistingLanguages();
        this.existingLanguages = existingLanguages != null ? duD.d((CharSequence) existingLanguages, new String[]{","}, false, 0, 6, (Object) null) : null;
    }

    public final String getHeadingTextWithName() {
        Object value = this.headingTextWithName$delegate.getValue();
        C8632dsu.a(value, "");
        return (String) value;
    }

    public final Spanned getSubheadingString() {
        Object value = this.subheadingString$delegate.getValue();
        C8632dsu.a(value, "");
        return (Spanned) value;
    }

    public final MutableLiveData<Boolean> getSecondaryLanguageLoading() {
        return this.lifecycleData.getNextActionLoading();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        r0 = o.duD.d((java.lang.CharSequence) r2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> secondaryLanguagesList() {
        /*
            r12 = this;
            com.netflix.android.moneyball.fields.StringField r0 = r12.secondaryLanguages
            r1 = 0
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.getValue()
            goto Lb
        La:
            r0 = r1
        Lb:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L13
            java.lang.String r0 = (java.lang.String) r0
            r2 = r0
            goto L14
        L13:
            r2 = r1
        L14:
            java.util.List<com.netflix.mediaclient.acquisition.screens.secondaryLanguages.LanguageData> r3 = r12.preferredLanguage
            java.lang.String r4 = ","
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1 r9 = new o.drM<com.netflix.mediaclient.acquisition.screens.secondaryLanguages.LanguageData, java.lang.CharSequence>() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1
                static {
                    /*
                        com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1 r0 = new com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  
  (r0 I:com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1)
 com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1.INSTANCE com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1.<init>():void");
                }

                @Override // o.drM
                public final java.lang.CharSequence invoke(com.netflix.mediaclient.acquisition.screens.secondaryLanguages.LanguageData r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r2, r0)
                        java.lang.String r2 = r2.getId()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1.invoke(com.netflix.mediaclient.acquisition.screens.secondaryLanguages.LanguageData):java.lang.CharSequence");
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(com.netflix.mediaclient.acquisition.screens.secondaryLanguages.LanguageData r1) {
                    /*
                        r0 = this;
                        com.netflix.mediaclient.acquisition.screens.secondaryLanguages.LanguageData r1 = (com.netflix.mediaclient.acquisition.screens.secondaryLanguages.LanguageData) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel$secondaryLanguagesList$preferredLanguages$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r10 = 30
            r11 = 0
            java.lang.String r0 = o.C8570dqm.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r3 = ","
            if (r2 == 0) goto L53
            int r4 = r2.length()
            if (r4 != 0) goto L30
            goto L53
        L30:
            com.netflix.android.moneyball.fields.StringField r4 = r12.secondaryLanguages
            if (r4 != 0) goto L35
            goto L83
        L35:
            if (r4 == 0) goto L3c
            java.lang.Object r5 = r4.getValue()
            goto L3d
        L3c:
            r5 = r1
        L3d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r3)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            r4.setValue(r0)
            goto L83
        L53:
            java.util.List<java.lang.String> r4 = r12.existingLanguages
            if (r4 == 0) goto L7b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L5e
            goto L7b
        L5e:
            com.netflix.android.moneyball.fields.StringField r4 = r12.secondaryLanguages
            if (r4 != 0) goto L63
            goto L83
        L63:
            java.util.List<java.lang.String> r5 = r12.existingLanguages
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r3)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            r4.setValue(r0)
            goto L83
        L7b:
            com.netflix.android.moneyball.fields.StringField r4 = r12.secondaryLanguages
            if (r4 != 0) goto L80
            goto L83
        L80:
            r4.setValue(r0)
        L83:
            if (r2 == 0) goto Lb3
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.util.List r0 = o.C8684dus.e(r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto Lb3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L9c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L9c
            r1.add(r2)
            goto L9c
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModel.secondaryLanguagesList():java.util.List");
    }

    public final List<SecondaryLanguage> languagesData() {
        List g;
        int d;
        boolean z;
        g = C8576dqs.g((Collection) this.parsedData.getPreferredLanguages(), (Iterable) this.parsedData.getAllLanguages());
        HashSet hashSet = new HashSet();
        ArrayList<LanguageData> arrayList = new ArrayList();
        for (Object obj : g) {
            if (hashSet.add(((LanguageData) obj).getId())) {
                arrayList.add(obj);
            }
        }
        d = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d);
        for (LanguageData languageData : arrayList) {
            String id = languageData.getId();
            String name = languageData.getName();
            boolean preferredLang = languageData.getPreferredLang();
            List<String> list = this.existingLanguages;
            if (list != null) {
                boolean contains = list.contains(languageData.getId());
                z = true;
                if (contains) {
                    arrayList2.add(new SecondaryLanguage(id, name, preferredLang, z));
                }
            }
            z = false;
            arrayList2.add(new SecondaryLanguage(id, name, preferredLang, z));
        }
        return arrayList2;
    }

    public final String getCtaButtonText() {
        return this.stringProvider.getString(R.string.orderfinal_button_continue);
    }

    public final void submitSecondaryLanguage(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        performAction(this.parsedData.getNextAction(), getSecondaryLanguageLoading(), networkRequestResponseListener);
    }
}
