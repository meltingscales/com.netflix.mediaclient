package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.text.Html;
import android.text.Spanned;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckboxViewModel;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesLifecycleData;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesParsedData;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesViewModel;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.aRN;

/* loaded from: classes3.dex */
public final class AddProfilesEEViewModel_Ab31697 extends AddProfilesViewModel {
    public static final int $stable = 8;
    private final String checkBoxInlineErrorText;
    private final String checkBoxText;
    private final List<Faq> faqList;
    private boolean isCheckBoxSelected;
    private final Spanned reminderText;
    private final String toolTipText;

    public final String getCheckBoxInlineErrorText() {
        return this.checkBoxInlineErrorText;
    }

    public final String getCheckBoxText() {
        return this.checkBoxText;
    }

    public final List<Faq> getFaqList() {
        return this.faqList;
    }

    public final Spanned getReminderText() {
        return this.reminderText;
    }

    public final String getToolTipText() {
        return this.toolTipText;
    }

    public final boolean isCheckBoxSelected() {
        return this.isCheckBoxSelected;
    }

    public final void setCheckBoxSelected(boolean z) {
        this.isCheckBoxSelected = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddProfilesEEViewModel_Ab31697(StringProvider stringProvider, AddProfilesParsedData addProfilesParsedData, AddProfilesLifecycleData addProfilesLifecycleData, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel2, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel3, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel4, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel5, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(stringProvider, addProfilesParsedData, addProfilesLifecycleData, profileEntryEditTextCheckboxViewModel, profileEntryEditTextCheckboxViewModel2, profileEntryEditTextCheckboxViewModel3, profileEntryEditTextCheckboxViewModel4, profileEntryEditTextCheckboxViewModel5, signupNetworkManager, errorMessageViewModel);
        String string;
        List<Faq> j;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) addProfilesParsedData, "");
        C8632dsu.c((Object) addProfilesLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        aRN.a aVar = aRN.e;
        if (aVar.j()) {
            string = stringProvider.getString(R.string.add_profile_checkbox_v2_text);
        } else {
            string = stringProvider.getString(R.string.add_profile_checkbox_text);
        }
        this.checkBoxText = string;
        this.checkBoxInlineErrorText = stringProvider.getString(R.string.add_profile_checkbox_inline_error);
        Spanned fromHtml = Html.fromHtml(stringProvider.getString(R.string.add_profile_reminder));
        C8632dsu.a(fromHtml, "");
        this.reminderText = fromHtml;
        this.toolTipText = stringProvider.getString(R.string.add_profile_faq_question_1);
        j = C8569dql.j(new Faq(stringProvider.getString(R.string.add_profile_faq_question_1), stringProvider.getString(R.string.add_profile_faq_answer_1), true), new Faq(stringProvider.getString(R.string.add_profile_faq_question_2), stringProvider.getString(R.string.add_profile_faq_answer_2), false, 4, null), new Faq(stringProvider.getString(R.string.add_profile_faq_question_3), stringProvider.getString(R.string.add_profile_faq_answer_3), false, 4, null));
        this.faqList = j;
        this.isCheckBoxSelected = !aVar.c();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesViewModel
    public boolean isFormValid() {
        return super.isFormValid() && this.isCheckBoxSelected;
    }

    /* loaded from: classes3.dex */
    public static final class Faq {
        public static final int $stable = 8;
        private final String answer;
        private boolean faqExpanded;
        private final String question;

        public static /* synthetic */ Faq copy$default(Faq faq, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = faq.question;
            }
            if ((i & 2) != 0) {
                str2 = faq.answer;
            }
            if ((i & 4) != 0) {
                z = faq.faqExpanded;
            }
            return faq.copy(str, str2, z);
        }

        public final String component1() {
            return this.question;
        }

        public final String component2() {
            return this.answer;
        }

        public final boolean component3() {
            return this.faqExpanded;
        }

        public final Faq copy(String str, String str2, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            return new Faq(str, str2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Faq) {
                Faq faq = (Faq) obj;
                return C8632dsu.c((Object) this.question, (Object) faq.question) && C8632dsu.c((Object) this.answer, (Object) faq.answer) && this.faqExpanded == faq.faqExpanded;
            }
            return false;
        }

        public final String getAnswer() {
            return this.answer;
        }

        public final boolean getFaqExpanded() {
            return this.faqExpanded;
        }

        public final String getQuestion() {
            return this.question;
        }

        public int hashCode() {
            return (((this.question.hashCode() * 31) + this.answer.hashCode()) * 31) + Boolean.hashCode(this.faqExpanded);
        }

        public final void setFaqExpanded(boolean z) {
            this.faqExpanded = z;
        }

        public String toString() {
            String str = this.question;
            String str2 = this.answer;
            boolean z = this.faqExpanded;
            return "Faq(question=" + str + ", answer=" + str2 + ", faqExpanded=" + z + ")";
        }

        public Faq(String str, String str2, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.question = str;
            this.answer = str2;
            this.faqExpanded = z;
        }

        public /* synthetic */ Faq(String str, String str2, boolean z, int i, C8627dsp c8627dsp) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Bullet {
        public static final int $stable = 0;
        private final String bulletText;
        private final int icon;

        public static /* synthetic */ Bullet copy$default(Bullet bullet, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bullet.icon;
            }
            if ((i2 & 2) != 0) {
                str = bullet.bulletText;
            }
            return bullet.copy(i, str);
        }

        public final int component1() {
            return this.icon;
        }

        public final String component2() {
            return this.bulletText;
        }

        public final Bullet copy(int i, String str) {
            C8632dsu.c((Object) str, "");
            return new Bullet(i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Bullet) {
                Bullet bullet = (Bullet) obj;
                return this.icon == bullet.icon && C8632dsu.c((Object) this.bulletText, (Object) bullet.bulletText);
            }
            return false;
        }

        public final String getBulletText() {
            return this.bulletText;
        }

        public final int getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return (Integer.hashCode(this.icon) * 31) + this.bulletText.hashCode();
        }

        public String toString() {
            int i = this.icon;
            String str = this.bulletText;
            return "Bullet(icon=" + i + ", bulletText=" + str + ")";
        }

        public Bullet(int i, String str) {
            C8632dsu.c((Object) str, "");
            this.icon = i;
            this.bulletText = str;
        }
    }
}
