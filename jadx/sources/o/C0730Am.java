package o;

import com.netflix.clcs.codegen.type.CLCSImageFormat;
import com.netflix.clcs.codegen.type.CLCSImageResolutionMode;
import com.netflix.clcs.codegen.type.StringFormat;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.AD;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Am  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0730Am implements InterfaceC8990hD<c> {
    public static final a a = new a(null);
    public static final int e = 8;
    private final boolean b;
    private final CLCSImageFormat c;
    private final StringFormat d;
    private final List<DR> f;
    private final CLCSImageResolutionMode g;
    private final String h;
    private final String i;
    private final String j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "bdec830f-75c8-4596-bfca-4d7ab0029961";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0730Am) {
            C0730Am c0730Am = (C0730Am) obj;
            return C8632dsu.c((Object) this.h, (Object) c0730Am.h) && C8632dsu.c((Object) this.i, (Object) c0730Am.i) && C8632dsu.c(this.f, c0730Am.f) && C8632dsu.c((Object) this.j, (Object) c0730Am.j) && this.d == c0730Am.d && this.g == c0730Am.g && this.c == c0730Am.c;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "InterstitialSubmitAction";
    }

    public final List<DR> g() {
        return this.f;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.h.hashCode();
        int hashCode2 = this.i.hashCode();
        List<DR> list = this.f;
        int hashCode3 = list == null ? 0 : list.hashCode();
        String str = this.j;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.g.hashCode()) * 31) + this.c.hashCode();
    }

    public final CLCSImageFormat i() {
        return this.c;
    }

    public final StringFormat j() {
        return this.d;
    }

    public final String l() {
        return this.h;
    }

    public final CLCSImageResolutionMode n() {
        return this.g;
    }

    public final String o() {
        return this.i;
    }

    public String toString() {
        String str = this.h;
        String str2 = this.i;
        List<DR> list = this.f;
        String str3 = this.j;
        StringFormat stringFormat = this.d;
        CLCSImageResolutionMode cLCSImageResolutionMode = this.g;
        CLCSImageFormat cLCSImageFormat = this.c;
        return "InterstitialSubmitActionMutation(serverState=" + str + ", serverAction=" + str2 + ", inputFields=" + list + ", locale=" + str3 + ", format=" + stringFormat + ", resolutionMode=" + cLCSImageResolutionMode + ", imageFormat=" + cLCSImageFormat + ")";
    }

    public C0730Am(String str, String str2, List<DR> list, String str3, StringFormat stringFormat, CLCSImageResolutionMode cLCSImageResolutionMode, CLCSImageFormat cLCSImageFormat) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) stringFormat, "");
        C8632dsu.c((Object) cLCSImageResolutionMode, "");
        C8632dsu.c((Object) cLCSImageFormat, "");
        this.h = str;
        this.i = str2;
        this.f = list;
        this.j = str3;
        this.d = stringFormat;
        this.g = cLCSImageResolutionMode;
        this.c = cLCSImageFormat;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        return a.d();
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        AA.d.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(AD.d.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, EH.d.a()).e(C0807Di.b.c()).d();
    }

    /* renamed from: o.Am$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final e c;

        public final e e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.c, ((c) obj).c);
        }

        public int hashCode() {
            e eVar = this.c;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.c;
            return "Data(clcsFlowSubmitAction=" + eVar + ")";
        }

        public c(e eVar) {
            this.c = eVar;
        }
    }

    /* renamed from: o.Am$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final C0755Bk a;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final C0755Bk c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0755Bk c0755Bk = this.a;
            return "ClcsFlowSubmitAction(__typename=" + str + ", flowSubmitActionOutcomeFragment=" + c0755Bk + ")";
        }

        public e(String str, C0755Bk c0755Bk) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0755Bk, "");
            this.e = str;
            this.a = c0755Bk;
        }
    }

    /* renamed from: o.Am$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final String d() {
            return "mutation InterstitialSubmitAction($serverState: CLCSServerState!, $serverAction: CLCSServerAction!, $inputFields: [CLCSInputField!], $locale: String, $format: StringFormat!, $resolutionMode: CLCSImageResolutionMode!, $imageFormat: CLCSImageFormat!) { clcsFlowSubmitAction(serverState: $serverState, serverAction: $serverAction, inputFields: $inputFields) { __typename ...FlowSubmitActionOutcomeFragment } }  fragment ImageFragment on CLCSImage { __typename width height url(resolutionMode: $resolutionMode, format: $imageFormat) }  fragment DesignSpaceSizeFragment on CLCSDesignSpaceSize { __typename token }  fragment PaddingSizeFragment on CLCSPaddingSize { __typename top { __typename ...DesignSpaceSizeFragment } bottom { __typename ...DesignSpaceSizeFragment } start { __typename ...DesignSpaceSizeFragment } end { __typename ...DesignSpaceSizeFragment } }  fragment ColorFragment on CLCSDesignColor { __typename token }  fragment BorderWidthFragment on CLCSDesignBorderWidth { __typename token }  fragment BorderRadiusFragment on CLCSDesignBorderRadius { __typename token }  fragment ContainerStyleFragment on CLCSContainerStyle { __typename padding { __typename top bottom start end } paddingSize { __typename ...PaddingSizeFragment } paddingSizeResponsive { __typename xs { __typename ...PaddingSizeFragment } s { __typename ...PaddingSizeFragment } m { __typename ...PaddingSizeFragment } l { __typename ...PaddingSizeFragment } xl { __typename ...PaddingSizeFragment } } backgroundColor { __typename ...ColorFragment } borderColor { __typename ...ColorFragment } borderWidth { __typename top { __typename ...BorderWidthFragment } bottom { __typename ...BorderWidthFragment } start { __typename ...BorderWidthFragment } end { __typename ...BorderWidthFragment } } borderRadius { __typename topStart { __typename ...BorderRadiusFragment } topEnd { __typename ...BorderRadiusFragment } bottomStart { __typename ...BorderRadiusFragment } bottomEnd { __typename ...BorderRadiusFragment } } }  fragment LocalizedStringFragment on LocalizedString { __typename value(locale: $locale) }  fragment AlertDialogActionFragment on AlertDialogAction { __typename label { __typename ...LocalizedStringFragment } }  fragment AlertDialogFragment on AlertDialog { __typename title { __typename ...LocalizedStringFragment } message { __typename ...LocalizedStringFragment } dismissAction { __typename ...AlertDialogActionFragment } secondaryAction { __typename ...AlertDialogActionFragment } errorCode }  fragment StringValidationFragment on CLCSStringValidation { __typename check { __typename ... on CLCSStringValueCheckLength { minLength maxLength } ... on CLCSStringValueCheckPattern { pattern } } errorMessage { __typename ...LocalizedStringFragment } }  fragment StringFieldFragment on CLCSStringField { __typename id persistedCacheKey initialValue validations { __typename ...StringValidationFragment } }  fragment BooleanFieldFragment on CLCSBooleanField { __typename id persistedCacheKey boolInitialValue: initialValue mustBeTrue errorMessage { __typename ...LocalizedStringFragment } }  fragment FieldFragment on CLCSField { __typename ...StringFieldFragment ...BooleanFieldFragment }  fragment EffectFields on CLCSEffect { __typename errorHandling { __typename ... on CLCSEffectErrorHandlingAlert { alert { __typename ...AlertDialogFragment } } } ... on CLCSDismiss { loggingCommand } ... on CLCSSubmitAction { loggingCommand serverAction inputFieldRequirements { __typename field { __typename ...FieldFragment } required } } ... on CLCSSendFeedback { serverFeedback inputFields { __typename ...FieldFragment } } ... on CLCSOpenWebView { uri useAutoLogin useEmbeddedWebView } ... on CLCSRecordRdidCtaConsent { rdidCtaConsentState { __typename consentId displayedAt isDenied } } ... on CLCSClientLogging { type data { __typename viewName contextName trackingInfo } } ... on CLCSClientDebugLogging { debugData } ... on CLCSInAppNavigation { location { __typename universal } } ... on CLCSRequestScreenUpdate { serverScreenUpdate inputFieldRequirements { __typename field { __typename ...FieldFragment } required } loggingCommand loggingAction } ... on CLCSNavigateBack { loggingCommand loggingAction navigationMarker } ... on CLCSLogOut { loggingCommand } }  fragment EffectRecursion on CLCSEffect { __typename ...EffectFields ... on CLCSCompositeEffect { effects { __typename ...EffectFields } } }  fragment ModalFragment on CLCSModal { __typename presentation backgroundImage { __typename ...ImageFragment } style { __typename ...ContainerStyleFragment } closeButtonType onClose { __typename ...EffectRecursion } content { __typename key } }  fragment BannerFragment on CLCSBanner { __typename style { __typename ...ContainerStyleFragment } content { __typename key } }  fragment ToastFragment on CLCSToast { __typename trackingInfo loggingViewName style { __typename ...ContainerStyleFragment } position timerMs onTimerComplete { __typename ...EffectRecursion } content { __typename key } }  fragment VerticalStackFragment on CLCSVerticalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment HorizontalStackFragment on CLCSHorizontalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment TemplateItemFragment on CLCSTemplateItem { __typename ... on CLCSTemplateItemFlexible { order size } ... on CLCSTemplateItemNumColumns { order numColumns } }  fragment LayoutFragment on CLCSLayout { __typename direction directionResponsive { __typename xs s m l xl } contentJustification contentJustificationResponsive { __typename xs s m l xl } itemAlignment itemAlignmentResponsive { __typename xs s m l xl } template { __typename ...TemplateItemFragment } templateResponsive { __typename xs { __typename ...TemplateItemFragment } small: s { __typename ...TemplateItemFragment } m { __typename ...TemplateItemFragment } l { __typename ...TemplateItemFragment } xl { __typename ...TemplateItemFragment } } columnSpacing { __typename ...DesignSpaceSizeFragment } columnSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } rowSpacing { __typename ...DesignSpaceSizeFragment } rowSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment DesignIconFragment on CLCSDesignIcon { __typename token }  fragment ButtonLikeFragment on CLCSButtonLike { __typename label { __typename ...LocalizedStringFragment } buttonSize: size type icon { __typename ...DesignIconFragment } onPress { __typename ...EffectRecursion } }  fragment ButtonFragment on CLCSButton { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName ...ButtonLikeFragment }  fragment IconFragment on CLCSIcon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } iconSize: size color { __typename ...ColorFragment } }  fragment ImageComponentFragment on CLCSImageComponent { __typename accessibilityDescription { __typename ...LocalizedStringFragment } image { __typename ...ImageFragment } imageResponsive { __typename xs { __typename ...ImageFragment } s { __typename ...ImageFragment } m { __typename ...ImageFragment } l { __typename ...ImageFragment } xl { __typename ...ImageFragment } } }  fragment TypographyFragment on CLCSDesignTypography { __typename token }  fragment LocalizedFormattedStringFragment on LocalizedFormattedString { __typename value(locale: $locale, format: $format) }  fragment TextFragment on CLCSText { __typename accessibilityDescription { __typename ...LocalizedStringFragment } typography { __typename ...TypographyFragment } typographyResponsive { __typename xs { __typename ...TypographyFragment } s { __typename ...TypographyFragment } m { __typename ...TypographyFragment } l { __typename ...TypographyFragment } xl { __typename ...TypographyFragment } } color { __typename ...ColorFragment } alignment alignmentResponsive { __typename xs s m l xl } plainContent { __typename ...LocalizedStringFragment } richContent { __typename ...LocalizedFormattedStringFragment } }  fragment HorizontalDividerFragment on CLCSHorizontalDivider { __typename color { __typename ...ColorFragment } }  fragment SpacerFragment on CLCSSpacer { __typename size designSize { __typename ...DesignSpaceSizeFragment } }  fragment InputFragment on CLCSInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo field { __typename ...StringFieldFragment } inputSize: size inputType: type icon { __typename ...DesignIconFragment } placeholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment PhoneInputFragment on CLCSPhoneInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName countries { __typename code name { __typename ...LocalizedStringFragment } phoneCodePrefix } countryCodeField { __typename ...StringFieldFragment } phoneNumberField { __typename ...StringFieldFragment } inputSize: size inputStyle: style phoneNumberPlaceholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } onFocus { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment CheckboxFragment on CLCSCheckbox { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName label { __typename ...LocalizedStringFragment } field { __typename ...BooleanFieldFragment } onChange { __typename ...EffectRecursion } }  fragment PinEntryFragment on CLCSPinEntry { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName typography { __typename ...TypographyFragment } textColor { __typename ...ColorFragment } length pinEntrySize: size field { __typename ...StringFieldFragment } onChange { __typename ...EffectRecursion } }  fragment StaticListFragment on CLCSStaticList { __typename items { __typename icon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } color { __typename ...ColorFragment } size } title { __typename ...LocalizedFormattedStringFragment } body { __typename ...LocalizedFormattedStringFragment } } listType: type }  fragment SelectableCardFragment on CLCSSelectableCard { __typename content { __typename key } field { __typename ...StringFieldFragment } value button { __typename ...ButtonLikeFragment } buttonSelected { __typename ...ButtonLikeFragment } style { __typename ...ContainerStyleFragment } styleSelected { __typename ...ContainerStyleFragment } }  fragment InputCopyLinkFragment on CLCSInputCopyLink { __typename trackingInfo button { __typename ...ButtonLikeFragment } accessibilityDescription { __typename ...LocalizedStringFragment } loggingViewName inputSize: size text { __typename ...LocalizedStringFragment } copyText }  fragment ComponentFragment on CLCSComponent { __typename key ...ModalFragment ...BannerFragment ...ToastFragment ...VerticalStackFragment ...HorizontalStackFragment ...LayoutFragment ...ButtonFragment ...IconFragment ...ImageComponentFragment ...TextFragment ...HorizontalDividerFragment ...SpacerFragment ...InputFragment ...PhoneInputFragment ...CheckboxFragment ...PinEntryFragment ...StaticListFragment ...SelectableCardFragment ...InputCopyLinkFragment ... on CLCSInterstitialLegacyUMA { payload } }  fragment ScreenFragment on CLCSScreen { __typename serverState componentTree { __typename nodes { __typename ...ComponentFragment } root { __typename key } initialFocusKey } theme onBackControl { __typename ...EffectRecursion } onRender { __typename ...EffectRecursion } onUnload { __typename ...EffectRecursion } trackingInfo loggingViewName fieldInitialization { __typename field { __typename ...FieldFragment } valueProvider } navigationMarker }  fragment FlowSubmitActionOutcomeFragment on CLCSFlowSubmitActionOutcome { __typename ... on CLCSScreen { ...ScreenFragment } ... on CLCSFlowComplete { account { __typename ownerGuid } } }";
        }

        private a() {
        }
    }
}
