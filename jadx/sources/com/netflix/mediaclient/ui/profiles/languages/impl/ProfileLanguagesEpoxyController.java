package com.netflix.mediaclient.ui.profiles.languages.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.CompoundButton;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.ui.profiles.languages.api.LanguageSelectorType;
import com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesEpoxyController;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.C2808an;
import o.C3759bJp;
import o.C3774bKd;
import o.C3796bKz;
import o.C3814bLq;
import o.C5967cPa;
import o.C8141del;
import o.C8168dfL;
import o.C8313dhy;
import o.C8566dqi;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C8927fu;
import o.C9834xU;
import o.C9935zP;
import o.bJM;
import o.bKD;
import o.cOR;
import o.cOU;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class ProfileLanguagesEpoxyController extends TypedEpoxyController<LanguagesState> {
    private static int a = 1;
    private static int c = 0;
    private static byte e$ss2$123 = 24;
    private final Context context;
    private final C9935zP eventBusFactory;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[LanguageSelectorType.values().length];
            try {
                iArr[LanguageSelectorType.DISPLAY_LANGUAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LanguageSelectorType.CONTENT_LANGUAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLanguagesEpoxyController(Context context, C9935zP c9935zP) {
        super(C8141del.a() ? C2808an.b : C2808an.a(), C8141del.a() ? C2808an.b : C2808an.a());
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        this.context = context;
        this.eventBusFactory = c9935zP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1$lambda$0(ProfileLanguagesEpoxyController profileLanguagesEpoxyController, View view) {
        C8632dsu.c((Object) profileLanguagesEpoxyController, "");
        profileLanguagesEpoxyController.eventBusFactory.b(cOU.class, cOU.e.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(LanguagesState languagesState) {
        int i = 2 % 2;
        int i2 = c + 69;
        a = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) languagesState, "");
        List<C8313dhy> c2 = languagesState.getLocalesList().c();
        if (!(languagesState.getLocalesList() instanceof C8927fu)) {
            if (c2 == null || c2.isEmpty()) {
                C3774bKd c3774bKd = new C3774bKd();
                c3774bKd.c((CharSequence) "loading");
                c3774bKd.d(C3796bKz.g.m);
                add(c3774bKd);
                return;
            }
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) "language-description");
            Context context = this.context;
            int descriptiveText = getDescriptiveText(languagesState.getType());
            String string = context.getString(descriptiveText);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(descriptiveText);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            c3814bLq.d((CharSequence) string);
            c3814bLq.d(C5967cPa.d.c);
            add(c3814bLq);
            int i4 = e.d[languagesState.getType().ordinal()];
            if (i4 == 1) {
                buildRadioGroupModel(languagesState, c2, this);
                int i5 = a + 57;
                c = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            int i7 = a + 79;
            c = i7 % 128;
            int i8 = i7 % 2;
            if (i4 != 2) {
                return;
            }
            buildMultiSelectionModel(languagesState, c2, this);
            return;
        }
        bJM bjm = new bJM();
        bjm.b((CharSequence) "error-retry");
        bjm.c((CharSequence) C8168dfL.d(C9834xU.h.j));
        bjm.d((CharSequence) C8168dfL.d(C9834xU.h.f));
        bjm.a(new View.OnClickListener() { // from class: o.cOP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileLanguagesEpoxyController.buildModels$lambda$1$lambda$0(ProfileLanguagesEpoxyController.this, view);
            }
        });
        add(bjm);
    }

    private final int getDescriptiveText(LanguageSelectorType languageSelectorType) {
        int i = e.d[languageSelectorType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C5967cPa.a.c;
            }
            throw new NoWhenBranchMatchedException();
        }
        return C5967cPa.a.d;
    }

    private final void buildRadioGroupModel(LanguagesState languagesState, final List<C8313dhy> list, ProfileLanguagesEpoxyController profileLanguagesEpoxyController) {
        int d;
        final List<C8313dhy> profileLocaleList = languagesState.getProfileLocaleList();
        bKD bkd = new bKD();
        bkd.c((CharSequence) "languages-radiogroup");
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C8313dhy c8313dhy : list) {
            arrayList.add(c8313dhy.e());
        }
        bkd.b((List<String>) arrayList);
        bkd.b(C5967cPa.d.e);
        Iterator<C8313dhy> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (profileLocaleList.contains(it.next())) {
                break;
            } else {
                i++;
            }
        }
        bkd.a(Integer.valueOf(i));
        bkd.a((drM<? super Integer, dpR>) new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesEpoxyController$buildRadioGroupModel$1$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                b(num);
                return dpR.c;
            }

            public final void b(Integer num) {
                C9935zP c9935zP;
                List e2;
                List<C8313dhy> list2 = list;
                C8632dsu.d(num);
                C8313dhy c8313dhy2 = list2.get(num.intValue());
                c9935zP = this.eventBusFactory;
                boolean contains = profileLocaleList.contains(c8313dhy2);
                e2 = C8566dqi.e(c8313dhy2);
                c9935zP.b(cOU.class, new cOU.b(contains, e2));
            }
        });
        profileLanguagesEpoxyController.add(bkd);
    }

    private final void buildMultiSelectionModel(LanguagesState languagesState, List<C8313dhy> list, final ProfileLanguagesEpoxyController profileLanguagesEpoxyController) {
        List<C8313dhy> profileLocaleList = languagesState.getProfileLocaleList();
        final List<C8313dhy> initialLocalesList = languagesState.getInitialLocalesList();
        List<C8313dhy> userSelections = languagesState.getUserSelections();
        if (userSelections == null || userSelections.isEmpty()) {
            userSelections = initialLocalesList;
        }
        final ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                C8569dql.h();
            }
            final C8313dhy c8313dhy = (C8313dhy) obj;
            boolean contains = userSelections.contains(c8313dhy);
            if (contains) {
                arrayList.add(c8313dhy);
            }
            C3759bJp c3759bJp = new C3759bJp();
            c3759bJp.e((CharSequence) ("checkbox-" + i));
            c3759bJp.c(C5967cPa.d.a);
            c3759bJp.b((CharSequence) c8313dhy.e());
            c3759bJp.c(contains);
            c3759bJp.a(!profileLocaleList.contains(c8313dhy));
            c3759bJp.b(new CompoundButton.OnCheckedChangeListener() { // from class: o.cOQ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ProfileLanguagesEpoxyController.buildMultiSelectionModel$lambda$9$lambda$8$lambda$7(arrayList, c8313dhy, profileLanguagesEpoxyController, initialLocalesList, compoundButton, z);
                }
            });
            profileLanguagesEpoxyController.add(c3759bJp);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildMultiSelectionModel$lambda$9$lambda$8$lambda$7(List list, C8313dhy c8313dhy, ProfileLanguagesEpoxyController profileLanguagesEpoxyController, List list2, CompoundButton compoundButton, boolean z) {
        List U;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c8313dhy, "");
        C8632dsu.c((Object) profileLanguagesEpoxyController, "");
        C8632dsu.c((Object) list2, "");
        if (z) {
            list.add(c8313dhy);
        } else {
            list.remove(c8313dhy);
        }
        C9935zP c9935zP = profileLanguagesEpoxyController.eventBusFactory;
        boolean a2 = cOR.e.a(list2, list);
        U = C8576dqs.U(list);
        c9935zP.b(cOU.class, new cOU.b(a2, U));
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$123);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
