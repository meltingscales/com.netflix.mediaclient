package o;

import com.netflix.clcs.codegen.type.CLCSImageFormat;
import com.netflix.clcs.codegen.type.CLCSImageResolutionMode;
import com.netflix.clcs.codegen.type.StringFormat;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C0736As;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Ah  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0725Ah implements InterfaceC8999hM<a> {
    public static final b a = new b(null);
    public static final int d = 8;
    private final DU b;
    private final StringFormat c;
    private final boolean e;
    private final CLCSImageResolutionMode f;
    private final String g;
    private final CLCSImageFormat h;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "8e10a68a-040a-45e4-8760-b0d92756b3f3";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0725Ah) {
            C0725Ah c0725Ah = (C0725Ah) obj;
            return C8632dsu.c((Object) this.g, (Object) c0725Ah.g) && this.c == c0725Ah.c && this.f == c0725Ah.f && this.h == c0725Ah.h && C8632dsu.c(this.b, c0725Ah.b);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "InterstitialForUnspecifiedLocationQuery";
    }

    public final CLCSImageFormat g() {
        return this.h;
    }

    public final DU h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.g;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.f.hashCode();
        int hashCode4 = this.h.hashCode();
        DU du = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (du != null ? du.hashCode() : 0);
    }

    public final StringFormat i() {
        return this.c;
    }

    public final String j() {
        return this.g;
    }

    public final CLCSImageResolutionMode o() {
        return this.f;
    }

    public String toString() {
        String str = this.g;
        StringFormat stringFormat = this.c;
        CLCSImageResolutionMode cLCSImageResolutionMode = this.f;
        CLCSImageFormat cLCSImageFormat = this.h;
        DU du = this.b;
        return "InterstitialForUnspecifiedLocationQuery(locale=" + str + ", format=" + stringFormat + ", resolutionMode=" + cLCSImageResolutionMode + ", imageFormat=" + cLCSImageFormat + ", commonParameters=" + du + ")";
    }

    public C0725Ah(String str, StringFormat stringFormat, CLCSImageResolutionMode cLCSImageResolutionMode, CLCSImageFormat cLCSImageFormat, DU du) {
        C8632dsu.c((Object) stringFormat, "");
        C8632dsu.c((Object) cLCSImageResolutionMode, "");
        C8632dsu.c((Object) cLCSImageFormat, "");
        this.g = str;
        this.c = stringFormat;
        this.f = cLCSImageResolutionMode;
        this.h = cLCSImageFormat;
        this.b = du;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        return a.e();
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C0737At.c.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C0736As.a.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, EO.b.b()).e(C0801Dc.c.a()).d();
    }

    /* renamed from: o.Ah$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final c a;

        public final c c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.a;
            return "Data(clcsInterstitialUnspecifiedLocation=" + cVar + ")";
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    /* renamed from: o.Ah$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final String d;
        private final BR e;

        public final BR a() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            BR br = this.e;
            return "ClcsInterstitialUnspecifiedLocation(__typename=" + str + ", screenFragment=" + br + ")";
        }

        public c(String str, BR br) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) br, "");
            this.d = str;
            this.e = br;
        }
    }

    /* renamed from: o.Ah$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final String e() {
            return "query InterstitialForUnspecifiedLocationQuery($locale: String, $format: StringFormat!, $resolutionMode: CLCSImageResolutionMode!, $imageFormat: CLCSImageFormat!, $commonParameters: CLCSInterstitialCommonParameters) { clcsInterstitialUnspecifiedLocation(commonParameters: $commonParameters) { __typename ...ScreenFragment } }  fragment ImageFragment on CLCSImage { __typename width height url(resolutionMode: $resolutionMode, format: $imageFormat) }  fragment DesignSpaceSizeFragment on CLCSDesignSpaceSize { __typename token }  fragment PaddingSizeFragment on CLCSPaddingSize { __typename top { __typename ...DesignSpaceSizeFragment } bottom { __typename ...DesignSpaceSizeFragment } start { __typename ...DesignSpaceSizeFragment } end { __typename ...DesignSpaceSizeFragment } }  fragment ColorFragment on CLCSDesignColor { __typename token }  fragment BorderWidthFragment on CLCSDesignBorderWidth { __typename token }  fragment BorderRadiusFragment on CLCSDesignBorderRadius { __typename token }  fragment ContainerStyleFragment on CLCSContainerStyle { __typename padding { __typename top bottom start end } paddingSize { __typename ...PaddingSizeFragment } paddingSizeResponsive { __typename xs { __typename ...PaddingSizeFragment } s { __typename ...PaddingSizeFragment } m { __typename ...PaddingSizeFragment } l { __typename ...PaddingSizeFragment } xl { __typename ...PaddingSizeFragment } } backgroundColor { __typename ...ColorFragment } borderColor { __typename ...ColorFragment } borderWidth { __typename top { __typename ...BorderWidthFragment } bottom { __typename ...BorderWidthFragment } start { __typename ...BorderWidthFragment } end { __typename ...BorderWidthFragment } } borderRadius { __typename topStart { __typename ...BorderRadiusFragment } topEnd { __typename ...BorderRadiusFragment } bottomStart { __typename ...BorderRadiusFragment } bottomEnd { __typename ...BorderRadiusFragment } } }  fragment LocalizedStringFragment on LocalizedString { __typename value(locale: $locale) }  fragment AlertDialogActionFragment on AlertDialogAction { __typename label { __typename ...LocalizedStringFragment } }  fragment AlertDialogFragment on AlertDialog { __typename title { __typename ...LocalizedStringFragment } message { __typename ...LocalizedStringFragment } dismissAction { __typename ...AlertDialogActionFragment } secondaryAction { __typename ...AlertDialogActionFragment } errorCode }  fragment StringValidationFragment on CLCSStringValidation { __typename check { __typename ... on CLCSStringValueCheckLength { minLength maxLength } ... on CLCSStringValueCheckPattern { pattern } } errorMessage { __typename ...LocalizedStringFragment } }  fragment StringFieldFragment on CLCSStringField { __typename id persistedCacheKey initialValue validations { __typename ...StringValidationFragment } }  fragment BooleanFieldFragment on CLCSBooleanField { __typename id persistedCacheKey boolInitialValue: initialValue mustBeTrue errorMessage { __typename ...LocalizedStringFragment } }  fragment FieldFragment on CLCSField { __typename ...StringFieldFragment ...BooleanFieldFragment }  fragment EffectFields on CLCSEffect { __typename errorHandling { __typename ... on CLCSEffectErrorHandlingAlert { alert { __typename ...AlertDialogFragment } } } ... on CLCSDismiss { loggingCommand } ... on CLCSSubmitAction { loggingCommand serverAction inputFieldRequirements { __typename field { __typename ...FieldFragment } required } } ... on CLCSSendFeedback { serverFeedback inputFields { __typename ...FieldFragment } } ... on CLCSOpenWebView { uri useAutoLogin useEmbeddedWebView } ... on CLCSRecordRdidCtaConsent { rdidCtaConsentState { __typename consentId displayedAt isDenied } } ... on CLCSClientLogging { type data { __typename viewName contextName trackingInfo } } ... on CLCSClientDebugLogging { debugData } ... on CLCSInAppNavigation { location { __typename universal } } ... on CLCSRequestScreenUpdate { serverScreenUpdate inputFieldRequirements { __typename field { __typename ...FieldFragment } required } loggingCommand loggingAction } ... on CLCSNavigateBack { loggingCommand loggingAction navigationMarker } ... on CLCSLogOut { loggingCommand } }  fragment EffectRecursion on CLCSEffect { __typename ...EffectFields ... on CLCSCompositeEffect { effects { __typename ...EffectFields } } }  fragment ModalFragment on CLCSModal { __typename presentation backgroundImage { __typename ...ImageFragment } style { __typename ...ContainerStyleFragment } closeButtonType onClose { __typename ...EffectRecursion } content { __typename key } }  fragment BannerFragment on CLCSBanner { __typename style { __typename ...ContainerStyleFragment } content { __typename key } }  fragment ToastFragment on CLCSToast { __typename trackingInfo loggingViewName style { __typename ...ContainerStyleFragment } position timerMs onTimerComplete { __typename ...EffectRecursion } content { __typename key } }  fragment VerticalStackFragment on CLCSVerticalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment HorizontalStackFragment on CLCSHorizontalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment TemplateItemFragment on CLCSTemplateItem { __typename ... on CLCSTemplateItemFlexible { order size } ... on CLCSTemplateItemNumColumns { order numColumns } }  fragment LayoutFragment on CLCSLayout { __typename direction directionResponsive { __typename xs s m l xl } contentJustification contentJustificationResponsive { __typename xs s m l xl } itemAlignment itemAlignmentResponsive { __typename xs s m l xl } template { __typename ...TemplateItemFragment } templateResponsive { __typename xs { __typename ...TemplateItemFragment } small: s { __typename ...TemplateItemFragment } m { __typename ...TemplateItemFragment } l { __typename ...TemplateItemFragment } xl { __typename ...TemplateItemFragment } } columnSpacing { __typename ...DesignSpaceSizeFragment } columnSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } rowSpacing { __typename ...DesignSpaceSizeFragment } rowSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment DesignIconFragment on CLCSDesignIcon { __typename token }  fragment ButtonLikeFragment on CLCSButtonLike { __typename label { __typename ...LocalizedStringFragment } buttonSize: size type icon { __typename ...DesignIconFragment } onPress { __typename ...EffectRecursion } }  fragment ButtonFragment on CLCSButton { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName ...ButtonLikeFragment }  fragment IconFragment on CLCSIcon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } iconSize: size color { __typename ...ColorFragment } }  fragment ImageComponentFragment on CLCSImageComponent { __typename accessibilityDescription { __typename ...LocalizedStringFragment } image { __typename ...ImageFragment } imageResponsive { __typename xs { __typename ...ImageFragment } s { __typename ...ImageFragment } m { __typename ...ImageFragment } l { __typename ...ImageFragment } xl { __typename ...ImageFragment } } }  fragment TypographyFragment on CLCSDesignTypography { __typename token }  fragment LocalizedFormattedStringFragment on LocalizedFormattedString { __typename value(locale: $locale, format: $format) }  fragment TextFragment on CLCSText { __typename accessibilityDescription { __typename ...LocalizedStringFragment } typography { __typename ...TypographyFragment } typographyResponsive { __typename xs { __typename ...TypographyFragment } s { __typename ...TypographyFragment } m { __typename ...TypographyFragment } l { __typename ...TypographyFragment } xl { __typename ...TypographyFragment } } color { __typename ...ColorFragment } alignment alignmentResponsive { __typename xs s m l xl } plainContent { __typename ...LocalizedStringFragment } richContent { __typename ...LocalizedFormattedStringFragment } }  fragment HorizontalDividerFragment on CLCSHorizontalDivider { __typename color { __typename ...ColorFragment } }  fragment SpacerFragment on CLCSSpacer { __typename size designSize { __typename ...DesignSpaceSizeFragment } }  fragment InputFragment on CLCSInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo field { __typename ...StringFieldFragment } inputSize: size inputType: type icon { __typename ...DesignIconFragment } placeholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment PhoneInputFragment on CLCSPhoneInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName countries { __typename code name { __typename ...LocalizedStringFragment } phoneCodePrefix } countryCodeField { __typename ...StringFieldFragment } phoneNumberField { __typename ...StringFieldFragment } inputSize: size inputStyle: style phoneNumberPlaceholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } onFocus { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment CheckboxFragment on CLCSCheckbox { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName label { __typename ...LocalizedStringFragment } field { __typename ...BooleanFieldFragment } onChange { __typename ...EffectRecursion } }  fragment PinEntryFragment on CLCSPinEntry { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName typography { __typename ...TypographyFragment } textColor { __typename ...ColorFragment } length pinEntrySize: size field { __typename ...StringFieldFragment } onChange { __typename ...EffectRecursion } }  fragment StaticListFragment on CLCSStaticList { __typename items { __typename icon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } color { __typename ...ColorFragment } size } title { __typename ...LocalizedFormattedStringFragment } body { __typename ...LocalizedFormattedStringFragment } } listType: type }  fragment SelectableCardFragment on CLCSSelectableCard { __typename content { __typename key } field { __typename ...StringFieldFragment } value button { __typename ...ButtonLikeFragment } buttonSelected { __typename ...ButtonLikeFragment } style { __typename ...ContainerStyleFragment } styleSelected { __typename ...ContainerStyleFragment } }  fragment InputCopyLinkFragment on CLCSInputCopyLink { __typename trackingInfo button { __typename ...ButtonLikeFragment } accessibilityDescription { __typename ...LocalizedStringFragment } loggingViewName inputSize: size text { __typename ...LocalizedStringFragment } copyText }  fragment ComponentFragment on CLCSComponent { __typename key ...ModalFragment ...BannerFragment ...ToastFragment ...VerticalStackFragment ...HorizontalStackFragment ...LayoutFragment ...ButtonFragment ...IconFragment ...ImageComponentFragment ...TextFragment ...HorizontalDividerFragment ...SpacerFragment ...InputFragment ...PhoneInputFragment ...CheckboxFragment ...PinEntryFragment ...StaticListFragment ...SelectableCardFragment ...InputCopyLinkFragment ... on CLCSInterstitialLegacyUMA { payload } }  fragment ScreenFragment on CLCSScreen { __typename serverState componentTree { __typename nodes { __typename ...ComponentFragment } root { __typename key } initialFocusKey } theme onBackControl { __typename ...EffectRecursion } onRender { __typename ...EffectRecursion } onUnload { __typename ...EffectRecursion } trackingInfo loggingViewName fieldInitialization { __typename field { __typename ...FieldFragment } valueProvider } navigationMarker }";
        }

        private b() {
        }
    }
}
