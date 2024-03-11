package o;

import com.netflix.clcs.codegen.type.CLCSImageFormat;
import com.netflix.clcs.codegen.type.CLCSImageResolutionMode;
import com.netflix.clcs.codegen.type.StringFormat;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C0734Aq;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Aj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0727Aj implements InterfaceC8999hM<d> {
    public static final c a = new c(null);
    public static final int b = 8;
    private final String c;
    private final boolean d;
    private final StringFormat e;
    private final String f;
    private final CLCSImageFormat g;
    private final List<DR> i;
    private final CLCSImageResolutionMode j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "36bc49cd-6b41-4e39-abe5-cafc818e3dcf";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0727Aj) {
            C0727Aj c0727Aj = (C0727Aj) obj;
            return C8632dsu.c((Object) this.f, (Object) c0727Aj.f) && this.e == c0727Aj.e && this.j == c0727Aj.j && this.g == c0727Aj.g && C8632dsu.c((Object) this.c, (Object) c0727Aj.c) && C8632dsu.c(this.i, c0727Aj.i);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "InterstitialHook";
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        String str = this.f;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.e.hashCode();
        int hashCode3 = this.j.hashCode();
        int hashCode4 = this.g.hashCode();
        int hashCode5 = this.c.hashCode();
        List<DR> list = this.i;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final CLCSImageFormat i() {
        return this.g;
    }

    public final StringFormat j() {
        return this.e;
    }

    public final List<DR> k() {
        return this.i;
    }

    public final CLCSImageResolutionMode n() {
        return this.j;
    }

    public String toString() {
        String str = this.f;
        StringFormat stringFormat = this.e;
        CLCSImageResolutionMode cLCSImageResolutionMode = this.j;
        CLCSImageFormat cLCSImageFormat = this.g;
        String str2 = this.c;
        List<DR> list = this.i;
        return "InterstitialHookQuery(locale=" + str + ", format=" + stringFormat + ", resolutionMode=" + cLCSImageResolutionMode + ", imageFormat=" + cLCSImageFormat + ", flowName=" + str2 + ", parameters=" + list + ")";
    }

    public C0727Aj(String str, StringFormat stringFormat, CLCSImageResolutionMode cLCSImageResolutionMode, CLCSImageFormat cLCSImageFormat, String str2, List<DR> list) {
        C8632dsu.c((Object) stringFormat, "");
        C8632dsu.c((Object) cLCSImageResolutionMode, "");
        C8632dsu.c((Object) cLCSImageFormat, "");
        C8632dsu.c((Object) str2, "");
        this.f = str;
        this.e = stringFormat;
        this.j = cLCSImageResolutionMode;
        this.g = cLCSImageFormat;
        this.c = str2;
        this.i = list;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        return a.e();
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C0738Au.c.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C0734Aq.a.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, EO.b.b()).e(C0802Dd.a.c()).d();
    }

    /* renamed from: o.Aj$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final a e;

        public final a d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.e, ((d) obj).e);
        }

        public int hashCode() {
            a aVar = this.e;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.e;
            return "Data(clcsHook=" + aVar + ")";
        }

        public d(a aVar) {
            this.e = aVar;
        }
    }

    /* renamed from: o.Aj$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;
        private final BR d;

        public final String b() {
            return this.a;
        }

        public final BR d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            BR br = this.d;
            return "ClcsHook(__typename=" + str + ", screenFragment=" + br + ")";
        }

        public a(String str, BR br) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) br, "");
            this.a = str;
            this.d = br;
        }
    }

    /* renamed from: o.Aj$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final String e() {
            return "query InterstitialHook($locale: String, $format: StringFormat!, $resolutionMode: CLCSImageResolutionMode!, $imageFormat: CLCSImageFormat!, $flowName: String!, $parameters: [CLCSInputField!]) { clcsHook(flowName: $flowName, parameters: $parameters) { __typename ...ScreenFragment } }  fragment ImageFragment on CLCSImage { __typename width height url(resolutionMode: $resolutionMode, format: $imageFormat) }  fragment DesignSpaceSizeFragment on CLCSDesignSpaceSize { __typename token }  fragment PaddingSizeFragment on CLCSPaddingSize { __typename top { __typename ...DesignSpaceSizeFragment } bottom { __typename ...DesignSpaceSizeFragment } start { __typename ...DesignSpaceSizeFragment } end { __typename ...DesignSpaceSizeFragment } }  fragment ColorFragment on CLCSDesignColor { __typename token }  fragment BorderWidthFragment on CLCSDesignBorderWidth { __typename token }  fragment BorderRadiusFragment on CLCSDesignBorderRadius { __typename token }  fragment ContainerStyleFragment on CLCSContainerStyle { __typename padding { __typename top bottom start end } paddingSize { __typename ...PaddingSizeFragment } paddingSizeResponsive { __typename xs { __typename ...PaddingSizeFragment } s { __typename ...PaddingSizeFragment } m { __typename ...PaddingSizeFragment } l { __typename ...PaddingSizeFragment } xl { __typename ...PaddingSizeFragment } } backgroundColor { __typename ...ColorFragment } borderColor { __typename ...ColorFragment } borderWidth { __typename top { __typename ...BorderWidthFragment } bottom { __typename ...BorderWidthFragment } start { __typename ...BorderWidthFragment } end { __typename ...BorderWidthFragment } } borderRadius { __typename topStart { __typename ...BorderRadiusFragment } topEnd { __typename ...BorderRadiusFragment } bottomStart { __typename ...BorderRadiusFragment } bottomEnd { __typename ...BorderRadiusFragment } } }  fragment LocalizedStringFragment on LocalizedString { __typename value(locale: $locale) }  fragment AlertDialogActionFragment on AlertDialogAction { __typename label { __typename ...LocalizedStringFragment } }  fragment AlertDialogFragment on AlertDialog { __typename title { __typename ...LocalizedStringFragment } message { __typename ...LocalizedStringFragment } dismissAction { __typename ...AlertDialogActionFragment } secondaryAction { __typename ...AlertDialogActionFragment } errorCode }  fragment StringValidationFragment on CLCSStringValidation { __typename check { __typename ... on CLCSStringValueCheckLength { minLength maxLength } ... on CLCSStringValueCheckPattern { pattern } } errorMessage { __typename ...LocalizedStringFragment } }  fragment StringFieldFragment on CLCSStringField { __typename id persistedCacheKey initialValue validations { __typename ...StringValidationFragment } }  fragment BooleanFieldFragment on CLCSBooleanField { __typename id persistedCacheKey boolInitialValue: initialValue mustBeTrue errorMessage { __typename ...LocalizedStringFragment } }  fragment FieldFragment on CLCSField { __typename ...StringFieldFragment ...BooleanFieldFragment }  fragment EffectFields on CLCSEffect { __typename errorHandling { __typename ... on CLCSEffectErrorHandlingAlert { alert { __typename ...AlertDialogFragment } } } ... on CLCSDismiss { loggingCommand } ... on CLCSSubmitAction { loggingCommand serverAction inputFieldRequirements { __typename field { __typename ...FieldFragment } required } } ... on CLCSSendFeedback { serverFeedback inputFields { __typename ...FieldFragment } } ... on CLCSOpenWebView { uri useAutoLogin useEmbeddedWebView } ... on CLCSRecordRdidCtaConsent { rdidCtaConsentState { __typename consentId displayedAt isDenied } } ... on CLCSClientLogging { type data { __typename viewName contextName trackingInfo } } ... on CLCSClientDebugLogging { debugData } ... on CLCSInAppNavigation { location { __typename universal } } ... on CLCSRequestScreenUpdate { serverScreenUpdate inputFieldRequirements { __typename field { __typename ...FieldFragment } required } loggingCommand loggingAction } ... on CLCSNavigateBack { loggingCommand loggingAction navigationMarker } ... on CLCSLogOut { loggingCommand } }  fragment EffectRecursion on CLCSEffect { __typename ...EffectFields ... on CLCSCompositeEffect { effects { __typename ...EffectFields } } }  fragment ModalFragment on CLCSModal { __typename presentation backgroundImage { __typename ...ImageFragment } style { __typename ...ContainerStyleFragment } closeButtonType onClose { __typename ...EffectRecursion } content { __typename key } }  fragment BannerFragment on CLCSBanner { __typename style { __typename ...ContainerStyleFragment } content { __typename key } }  fragment ToastFragment on CLCSToast { __typename trackingInfo loggingViewName style { __typename ...ContainerStyleFragment } position timerMs onTimerComplete { __typename ...EffectRecursion } content { __typename key } }  fragment VerticalStackFragment on CLCSVerticalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment HorizontalStackFragment on CLCSHorizontalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment TemplateItemFragment on CLCSTemplateItem { __typename ... on CLCSTemplateItemFlexible { order size } ... on CLCSTemplateItemNumColumns { order numColumns } }  fragment LayoutFragment on CLCSLayout { __typename direction directionResponsive { __typename xs s m l xl } contentJustification contentJustificationResponsive { __typename xs s m l xl } itemAlignment itemAlignmentResponsive { __typename xs s m l xl } template { __typename ...TemplateItemFragment } templateResponsive { __typename xs { __typename ...TemplateItemFragment } small: s { __typename ...TemplateItemFragment } m { __typename ...TemplateItemFragment } l { __typename ...TemplateItemFragment } xl { __typename ...TemplateItemFragment } } columnSpacing { __typename ...DesignSpaceSizeFragment } columnSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } rowSpacing { __typename ...DesignSpaceSizeFragment } rowSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment DesignIconFragment on CLCSDesignIcon { __typename token }  fragment ButtonLikeFragment on CLCSButtonLike { __typename label { __typename ...LocalizedStringFragment } buttonSize: size type icon { __typename ...DesignIconFragment } onPress { __typename ...EffectRecursion } }  fragment ButtonFragment on CLCSButton { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName ...ButtonLikeFragment }  fragment IconFragment on CLCSIcon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } iconSize: size color { __typename ...ColorFragment } }  fragment ImageComponentFragment on CLCSImageComponent { __typename accessibilityDescription { __typename ...LocalizedStringFragment } image { __typename ...ImageFragment } imageResponsive { __typename xs { __typename ...ImageFragment } s { __typename ...ImageFragment } m { __typename ...ImageFragment } l { __typename ...ImageFragment } xl { __typename ...ImageFragment } } }  fragment TypographyFragment on CLCSDesignTypography { __typename token }  fragment LocalizedFormattedStringFragment on LocalizedFormattedString { __typename value(locale: $locale, format: $format) }  fragment TextFragment on CLCSText { __typename accessibilityDescription { __typename ...LocalizedStringFragment } typography { __typename ...TypographyFragment } typographyResponsive { __typename xs { __typename ...TypographyFragment } s { __typename ...TypographyFragment } m { __typename ...TypographyFragment } l { __typename ...TypographyFragment } xl { __typename ...TypographyFragment } } color { __typename ...ColorFragment } alignment alignmentResponsive { __typename xs s m l xl } plainContent { __typename ...LocalizedStringFragment } richContent { __typename ...LocalizedFormattedStringFragment } }  fragment HorizontalDividerFragment on CLCSHorizontalDivider { __typename color { __typename ...ColorFragment } }  fragment SpacerFragment on CLCSSpacer { __typename size designSize { __typename ...DesignSpaceSizeFragment } }  fragment InputFragment on CLCSInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo field { __typename ...StringFieldFragment } inputSize: size inputType: type icon { __typename ...DesignIconFragment } placeholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment PhoneInputFragment on CLCSPhoneInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName countries { __typename code name { __typename ...LocalizedStringFragment } phoneCodePrefix } countryCodeField { __typename ...StringFieldFragment } phoneNumberField { __typename ...StringFieldFragment } inputSize: size inputStyle: style phoneNumberPlaceholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } onFocus { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment CheckboxFragment on CLCSCheckbox { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName label { __typename ...LocalizedStringFragment } field { __typename ...BooleanFieldFragment } onChange { __typename ...EffectRecursion } }  fragment PinEntryFragment on CLCSPinEntry { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName typography { __typename ...TypographyFragment } textColor { __typename ...ColorFragment } length pinEntrySize: size field { __typename ...StringFieldFragment } onChange { __typename ...EffectRecursion } }  fragment StaticListFragment on CLCSStaticList { __typename items { __typename icon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } color { __typename ...ColorFragment } size } title { __typename ...LocalizedFormattedStringFragment } body { __typename ...LocalizedFormattedStringFragment } } listType: type }  fragment SelectableCardFragment on CLCSSelectableCard { __typename content { __typename key } field { __typename ...StringFieldFragment } value button { __typename ...ButtonLikeFragment } buttonSelected { __typename ...ButtonLikeFragment } style { __typename ...ContainerStyleFragment } styleSelected { __typename ...ContainerStyleFragment } }  fragment InputCopyLinkFragment on CLCSInputCopyLink { __typename trackingInfo button { __typename ...ButtonLikeFragment } accessibilityDescription { __typename ...LocalizedStringFragment } loggingViewName inputSize: size text { __typename ...LocalizedStringFragment } copyText }  fragment ComponentFragment on CLCSComponent { __typename key ...ModalFragment ...BannerFragment ...ToastFragment ...VerticalStackFragment ...HorizontalStackFragment ...LayoutFragment ...ButtonFragment ...IconFragment ...ImageComponentFragment ...TextFragment ...HorizontalDividerFragment ...SpacerFragment ...InputFragment ...PhoneInputFragment ...CheckboxFragment ...PinEntryFragment ...StaticListFragment ...SelectableCardFragment ...InputCopyLinkFragment ... on CLCSInterstitialLegacyUMA { payload } }  fragment ScreenFragment on CLCSScreen { __typename serverState componentTree { __typename nodes { __typename ...ComponentFragment } root { __typename key } initialFocusKey } theme onBackControl { __typename ...EffectRecursion } onRender { __typename ...EffectRecursion } onUnload { __typename ...EffectRecursion } trackingInfo loggingViewName fieldInitialization { __typename field { __typename ...FieldFragment } valueProvider } navigationMarker }";
        }

        private c() {
        }
    }
}
