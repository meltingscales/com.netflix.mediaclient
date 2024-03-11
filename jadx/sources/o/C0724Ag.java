package o;

import com.netflix.clcs.codegen.type.CLCSImageFormat;
import com.netflix.clcs.codegen.type.CLCSImageResolutionMode;
import com.netflix.clcs.codegen.type.StringFormat;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C0741Ax;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Ag  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0724Ag implements InterfaceC8990hD<a> {
    private final boolean b;
    private final CLCSImageFormat d;
    private final StringFormat e;
    private final CLCSImageResolutionMode f;
    private final String g;
    private final String h;
    private final List<DR> i;
    private final String j;
    public static final b c = new b(null);
    public static final int a = 8;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "ee3e18b6-98b7-4bf6-9705-1b04ffe2f206";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0724Ag) {
            C0724Ag c0724Ag = (C0724Ag) obj;
            return C8632dsu.c((Object) this.h, (Object) c0724Ag.h) && C8632dsu.c((Object) this.j, (Object) c0724Ag.j) && C8632dsu.c(this.i, c0724Ag.i) && C8632dsu.c((Object) this.g, (Object) c0724Ag.g) && this.e == c0724Ag.e && this.f == c0724Ag.f && this.d == c0724Ag.d;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "InterstitialScreenUpdate";
    }

    public final List<DR> g() {
        return this.i;
    }

    public final CLCSImageFormat h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.h.hashCode();
        String str = this.j;
        int hashCode2 = str == null ? 0 : str.hashCode();
        List<DR> list = this.i;
        int hashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.g;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.d.hashCode();
    }

    public final StringFormat i() {
        return this.e;
    }

    public final String j() {
        return this.g;
    }

    public final CLCSImageResolutionMode k() {
        return this.f;
    }

    public final String l() {
        return this.h;
    }

    public final String n() {
        return this.j;
    }

    public String toString() {
        String str = this.h;
        String str2 = this.j;
        List<DR> list = this.i;
        String str3 = this.g;
        StringFormat stringFormat = this.e;
        CLCSImageResolutionMode cLCSImageResolutionMode = this.f;
        CLCSImageFormat cLCSImageFormat = this.d;
        return "InterstitialScreenUpdateMutation(serverState=" + str + ", serverScreenUpdate=" + str2 + ", inputFields=" + list + ", locale=" + str3 + ", format=" + stringFormat + ", resolutionMode=" + cLCSImageResolutionMode + ", imageFormat=" + cLCSImageFormat + ")";
    }

    public C0724Ag(String str, String str2, List<DR> list, String str3, StringFormat stringFormat, CLCSImageResolutionMode cLCSImageResolutionMode, CLCSImageFormat cLCSImageFormat) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) stringFormat, "");
        C8632dsu.c((Object) cLCSImageResolutionMode, "");
        C8632dsu.c((Object) cLCSImageFormat, "");
        this.h = str;
        this.j = str2;
        this.i = list;
        this.g = str3;
        this.e = stringFormat;
        this.f = cLCSImageResolutionMode;
        this.d = cLCSImageFormat;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        return c.c();
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C0742Ay.a.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C0741Ax.d.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, EH.d.a()).e(C0805Dg.b.a()).d();
    }

    /* renamed from: o.Ag$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8990hD.b {
        private final d a;

        public final d c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.a;
            return "Data(clcsScreenUpdate=" + dVar + ")";
        }

        public a(d dVar) {
            this.a = dVar;
        }
    }

    /* renamed from: o.Ag$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final String a;
        private final c d;
        private final j e;

        public final String a() {
            return this.a;
        }

        public final j d() {
            return this.e;
        }

        public final c e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.d;
            int hashCode2 = cVar == null ? 0 : cVar.hashCode();
            j jVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            c cVar = this.d;
            j jVar = this.e;
            return "ClcsScreenUpdate(__typename=" + str + ", onCLCSScreenUpdateEffect=" + cVar + ", onCLCSScreenUpdateTransition=" + jVar + ")";
        }

        public d(String str, c cVar, j jVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = cVar;
            this.e = jVar;
        }
    }

    /* renamed from: o.Ag$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final e d;

        public final e b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.d, ((c) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            e eVar = this.d;
            return "OnCLCSScreenUpdateEffect(effect=" + eVar + ")";
        }

        public c(e eVar) {
            C8632dsu.c((Object) eVar, "");
            this.d = eVar;
        }
    }

    /* renamed from: o.Ag$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final String c;
        private final C0753Bi e;

        public final String a() {
            return this.c;
        }

        public final C0753Bi c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0753Bi c0753Bi = this.e;
            return "Effect(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public e(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.c = str;
            this.e = c0753Bi;
        }
    }

    /* renamed from: o.Ag$j */
    /* loaded from: classes2.dex */
    public static final class j {
        private final Boolean c;
        private final i d;

        public final i c() {
            return this.d;
        }

        public final Boolean d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c(this.d, jVar.d) && C8632dsu.c(this.c, jVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Boolean bool = this.c;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            i iVar = this.d;
            Boolean bool = this.c;
            return "OnCLCSScreenUpdateTransition(screen=" + iVar + ", replaceCurrentScreen=" + bool + ")";
        }

        public j(i iVar, Boolean bool) {
            C8632dsu.c((Object) iVar, "");
            this.d = iVar;
            this.c = bool;
        }
    }

    /* renamed from: o.Ag$i */
    /* loaded from: classes2.dex */
    public static final class i {
        private final String a;
        private final BR e;

        public final String a() {
            return this.a;
        }

        public final BR d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.a, (Object) iVar.a) && C8632dsu.c(this.e, iVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            BR br = this.e;
            return "Screen(__typename=" + str + ", screenFragment=" + br + ")";
        }

        public i(String str, BR br) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) br, "");
            this.a = str;
            this.e = br;
        }
    }

    /* renamed from: o.Ag$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final String c() {
            return "mutation InterstitialScreenUpdate($serverState: CLCSServerState!, $serverScreenUpdate: CLCSServerScreenUpdate, $inputFields: [CLCSInputField!], $locale: String, $format: StringFormat!, $resolutionMode: CLCSImageResolutionMode!, $imageFormat: CLCSImageFormat!) { clcsScreenUpdate(serverState: $serverState, serverScreenUpdate: $serverScreenUpdate, inputFields: $inputFields) { __typename ... on CLCSScreenUpdateEffect { effect { __typename ...EffectRecursion } } ... on CLCSScreenUpdateTransition { screen { __typename ...ScreenFragment } replaceCurrentScreen } } }  fragment LocalizedStringFragment on LocalizedString { __typename value(locale: $locale) }  fragment AlertDialogActionFragment on AlertDialogAction { __typename label { __typename ...LocalizedStringFragment } }  fragment AlertDialogFragment on AlertDialog { __typename title { __typename ...LocalizedStringFragment } message { __typename ...LocalizedStringFragment } dismissAction { __typename ...AlertDialogActionFragment } secondaryAction { __typename ...AlertDialogActionFragment } errorCode }  fragment StringValidationFragment on CLCSStringValidation { __typename check { __typename ... on CLCSStringValueCheckLength { minLength maxLength } ... on CLCSStringValueCheckPattern { pattern } } errorMessage { __typename ...LocalizedStringFragment } }  fragment StringFieldFragment on CLCSStringField { __typename id persistedCacheKey initialValue validations { __typename ...StringValidationFragment } }  fragment BooleanFieldFragment on CLCSBooleanField { __typename id persistedCacheKey boolInitialValue: initialValue mustBeTrue errorMessage { __typename ...LocalizedStringFragment } }  fragment FieldFragment on CLCSField { __typename ...StringFieldFragment ...BooleanFieldFragment }  fragment EffectFields on CLCSEffect { __typename errorHandling { __typename ... on CLCSEffectErrorHandlingAlert { alert { __typename ...AlertDialogFragment } } } ... on CLCSDismiss { loggingCommand } ... on CLCSSubmitAction { loggingCommand serverAction inputFieldRequirements { __typename field { __typename ...FieldFragment } required } } ... on CLCSSendFeedback { serverFeedback inputFields { __typename ...FieldFragment } } ... on CLCSOpenWebView { uri useAutoLogin useEmbeddedWebView } ... on CLCSRecordRdidCtaConsent { rdidCtaConsentState { __typename consentId displayedAt isDenied } } ... on CLCSClientLogging { type data { __typename viewName contextName trackingInfo } } ... on CLCSClientDebugLogging { debugData } ... on CLCSInAppNavigation { location { __typename universal } } ... on CLCSRequestScreenUpdate { serverScreenUpdate inputFieldRequirements { __typename field { __typename ...FieldFragment } required } loggingCommand loggingAction } ... on CLCSNavigateBack { loggingCommand loggingAction navigationMarker } ... on CLCSLogOut { loggingCommand } }  fragment EffectRecursion on CLCSEffect { __typename ...EffectFields ... on CLCSCompositeEffect { effects { __typename ...EffectFields } } }  fragment ImageFragment on CLCSImage { __typename width height url(resolutionMode: $resolutionMode, format: $imageFormat) }  fragment DesignSpaceSizeFragment on CLCSDesignSpaceSize { __typename token }  fragment PaddingSizeFragment on CLCSPaddingSize { __typename top { __typename ...DesignSpaceSizeFragment } bottom { __typename ...DesignSpaceSizeFragment } start { __typename ...DesignSpaceSizeFragment } end { __typename ...DesignSpaceSizeFragment } }  fragment ColorFragment on CLCSDesignColor { __typename token }  fragment BorderWidthFragment on CLCSDesignBorderWidth { __typename token }  fragment BorderRadiusFragment on CLCSDesignBorderRadius { __typename token }  fragment ContainerStyleFragment on CLCSContainerStyle { __typename padding { __typename top bottom start end } paddingSize { __typename ...PaddingSizeFragment } paddingSizeResponsive { __typename xs { __typename ...PaddingSizeFragment } s { __typename ...PaddingSizeFragment } m { __typename ...PaddingSizeFragment } l { __typename ...PaddingSizeFragment } xl { __typename ...PaddingSizeFragment } } backgroundColor { __typename ...ColorFragment } borderColor { __typename ...ColorFragment } borderWidth { __typename top { __typename ...BorderWidthFragment } bottom { __typename ...BorderWidthFragment } start { __typename ...BorderWidthFragment } end { __typename ...BorderWidthFragment } } borderRadius { __typename topStart { __typename ...BorderRadiusFragment } topEnd { __typename ...BorderRadiusFragment } bottomStart { __typename ...BorderRadiusFragment } bottomEnd { __typename ...BorderRadiusFragment } } }  fragment ModalFragment on CLCSModal { __typename presentation backgroundImage { __typename ...ImageFragment } style { __typename ...ContainerStyleFragment } closeButtonType onClose { __typename ...EffectRecursion } content { __typename key } }  fragment BannerFragment on CLCSBanner { __typename style { __typename ...ContainerStyleFragment } content { __typename key } }  fragment ToastFragment on CLCSToast { __typename trackingInfo loggingViewName style { __typename ...ContainerStyleFragment } position timerMs onTimerComplete { __typename ...EffectRecursion } content { __typename key } }  fragment VerticalStackFragment on CLCSVerticalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment HorizontalStackFragment on CLCSHorizontalStack { __typename contentJustification contentSpacing contentSpacingSize { __typename ...DesignSpaceSizeFragment } contentStretch itemAlignment style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment TemplateItemFragment on CLCSTemplateItem { __typename ... on CLCSTemplateItemFlexible { order size } ... on CLCSTemplateItemNumColumns { order numColumns } }  fragment LayoutFragment on CLCSLayout { __typename direction directionResponsive { __typename xs s m l xl } contentJustification contentJustificationResponsive { __typename xs s m l xl } itemAlignment itemAlignmentResponsive { __typename xs s m l xl } template { __typename ...TemplateItemFragment } templateResponsive { __typename xs { __typename ...TemplateItemFragment } small: s { __typename ...TemplateItemFragment } m { __typename ...TemplateItemFragment } l { __typename ...TemplateItemFragment } xl { __typename ...TemplateItemFragment } } columnSpacing { __typename ...DesignSpaceSizeFragment } columnSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } rowSpacing { __typename ...DesignSpaceSizeFragment } rowSpacingResponsive { __typename xs { __typename ...DesignSpaceSizeFragment } s { __typename ...DesignSpaceSizeFragment } m { __typename ...DesignSpaceSizeFragment } l { __typename ...DesignSpaceSizeFragment } xl { __typename ...DesignSpaceSizeFragment } } style { __typename ...ContainerStyleFragment } children { __typename key } }  fragment DesignIconFragment on CLCSDesignIcon { __typename token }  fragment ButtonLikeFragment on CLCSButtonLike { __typename label { __typename ...LocalizedStringFragment } buttonSize: size type icon { __typename ...DesignIconFragment } onPress { __typename ...EffectRecursion } }  fragment ButtonFragment on CLCSButton { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName ...ButtonLikeFragment }  fragment IconFragment on CLCSIcon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } iconSize: size color { __typename ...ColorFragment } }  fragment ImageComponentFragment on CLCSImageComponent { __typename accessibilityDescription { __typename ...LocalizedStringFragment } image { __typename ...ImageFragment } imageResponsive { __typename xs { __typename ...ImageFragment } s { __typename ...ImageFragment } m { __typename ...ImageFragment } l { __typename ...ImageFragment } xl { __typename ...ImageFragment } } }  fragment TypographyFragment on CLCSDesignTypography { __typename token }  fragment LocalizedFormattedStringFragment on LocalizedFormattedString { __typename value(locale: $locale, format: $format) }  fragment TextFragment on CLCSText { __typename accessibilityDescription { __typename ...LocalizedStringFragment } typography { __typename ...TypographyFragment } typographyResponsive { __typename xs { __typename ...TypographyFragment } s { __typename ...TypographyFragment } m { __typename ...TypographyFragment } l { __typename ...TypographyFragment } xl { __typename ...TypographyFragment } } color { __typename ...ColorFragment } alignment alignmentResponsive { __typename xs s m l xl } plainContent { __typename ...LocalizedStringFragment } richContent { __typename ...LocalizedFormattedStringFragment } }  fragment HorizontalDividerFragment on CLCSHorizontalDivider { __typename color { __typename ...ColorFragment } }  fragment SpacerFragment on CLCSSpacer { __typename size designSize { __typename ...DesignSpaceSizeFragment } }  fragment InputFragment on CLCSInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo field { __typename ...StringFieldFragment } inputSize: size inputType: type icon { __typename ...DesignIconFragment } placeholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment PhoneInputFragment on CLCSPhoneInput { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName countries { __typename code name { __typename ...LocalizedStringFragment } phoneCodePrefix } countryCodeField { __typename ...StringFieldFragment } phoneNumberField { __typename ...StringFieldFragment } inputSize: size inputStyle: style phoneNumberPlaceholder { __typename ...LocalizedStringFragment } onChange { __typename ...EffectRecursion } onFocus { __typename ...EffectRecursion } initialErrorMessage { __typename ...LocalizedStringFragment } }  fragment CheckboxFragment on CLCSCheckbox { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName label { __typename ...LocalizedStringFragment } field { __typename ...BooleanFieldFragment } onChange { __typename ...EffectRecursion } }  fragment PinEntryFragment on CLCSPinEntry { __typename accessibilityDescription { __typename ...LocalizedStringFragment } trackingInfo loggingViewName typography { __typename ...TypographyFragment } textColor { __typename ...ColorFragment } length pinEntrySize: size field { __typename ...StringFieldFragment } onChange { __typename ...EffectRecursion } }  fragment StaticListFragment on CLCSStaticList { __typename items { __typename icon { __typename accessibilityDescription { __typename ...LocalizedStringFragment } icon { __typename ...DesignIconFragment } color { __typename ...ColorFragment } size } title { __typename ...LocalizedFormattedStringFragment } body { __typename ...LocalizedFormattedStringFragment } } listType: type }  fragment SelectableCardFragment on CLCSSelectableCard { __typename content { __typename key } field { __typename ...StringFieldFragment } value button { __typename ...ButtonLikeFragment } buttonSelected { __typename ...ButtonLikeFragment } style { __typename ...ContainerStyleFragment } styleSelected { __typename ...ContainerStyleFragment } }  fragment InputCopyLinkFragment on CLCSInputCopyLink { __typename trackingInfo button { __typename ...ButtonLikeFragment } accessibilityDescription { __typename ...LocalizedStringFragment } loggingViewName inputSize: size text { __typename ...LocalizedStringFragment } copyText }  fragment ComponentFragment on CLCSComponent { __typename key ...ModalFragment ...BannerFragment ...ToastFragment ...VerticalStackFragment ...HorizontalStackFragment ...LayoutFragment ...ButtonFragment ...IconFragment ...ImageComponentFragment ...TextFragment ...HorizontalDividerFragment ...SpacerFragment ...InputFragment ...PhoneInputFragment ...CheckboxFragment ...PinEntryFragment ...StaticListFragment ...SelectableCardFragment ...InputCopyLinkFragment ... on CLCSInterstitialLegacyUMA { payload } }  fragment ScreenFragment on CLCSScreen { __typename serverState componentTree { __typename nodes { __typename ...ComponentFragment } root { __typename key } initialFocusKey } theme onBackControl { __typename ...EffectRecursion } onRender { __typename ...EffectRecursion } onUnload { __typename ...EffectRecursion } trackingInfo loggingViewName fieldInitialization { __typename field { __typename ...FieldFragment } valueProvider } navigationMarker }";
        }

        private b() {
        }
    }
}
