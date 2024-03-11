package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.acquisition.databinding.ItemPreferredLanguageBinding;
import com.netflix.mediaclient.acquisition.databinding.ItemSecondaryLanguageBinding;
import com.netflix.mediaclient.acquisition.databinding.ItemSecondaryLanguageDarkBinding;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;
import o.C1204Sr;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;

/* loaded from: classes3.dex */
public final class SecondaryLanguageRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public static final int VIEW_TYPE_ALL_LANG = 2;
    public static final int VIEW_TYPE_PREFERRED_LANG = 1;
    private final List<SecondaryLanguage> data;
    private final MutableLiveData<String> secondaryLanguagesLiveData;
    private final boolean useDarkTheme;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final List<SecondaryLanguage> getData() {
        return this.data;
    }

    public SecondaryLanguageRecyclerViewAdapter(List<SecondaryLanguage> list, MutableLiveData<String> mutableLiveData, boolean z) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) mutableLiveData, "");
        this.data = list;
        this.secondaryLanguagesLiveData = mutableLiveData;
        this.useDarkTheme = z;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        public static /* synthetic */ void getVIEW_TYPE_PREFERRED_LANG$annotations() {
        }

        private Companion() {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class BaseViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        public abstract void bind(int i, List<SecondaryLanguage> list, MutableLiveData<String> mutableLiveData);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(View view) {
            super(view);
            C8632dsu.c((Object) view, "");
        }
    }

    /* loaded from: classes3.dex */
    public static final class AllLangViewHolder extends BaseViewHolder {
        public static final int $stable = 8;
        private final CheckBox checkbox;
        private final TextView languageText;
        private final ViewGroup layout;

        public final CheckBox getCheckbox() {
            return this.checkbox;
        }

        public final TextView getLanguageText() {
            return this.languageText;
        }

        public final ViewGroup getLayout() {
            return this.layout;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllLangViewHolder(CheckBox checkBox, TextView textView, ViewGroup viewGroup, View view) {
            super(view);
            C8632dsu.c((Object) checkBox, "");
            C8632dsu.c((Object) textView, "");
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) view, "");
            this.checkbox = checkBox;
            this.languageText = textView;
            this.layout = viewGroup;
        }

        @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter.BaseViewHolder
        public void bind(final int i, final List<SecondaryLanguage> list, final MutableLiveData<String> mutableLiveData) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) mutableLiveData, "");
            this.languageText.setText(list.get(i).getCapitalizedLanguage());
            this.checkbox.setChecked(list.get(i).getSelected());
            this.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter$AllLangViewHolder$$ExternalSyntheticLambda0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    SecondaryLanguageRecyclerViewAdapter.AllLangViewHolder.bind$lambda$1(list, i, this, mutableLiveData, compoundButton, z);
                }
            });
            View view = this.itemView;
            C8632dsu.a(view, "");
            view.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter$AllLangViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SecondaryLanguageRecyclerViewAdapter.AllLangViewHolder.bind$lambda$2(list, i, this, mutableLiveData, view2);
                }
            });
            view.setClickable(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(List list, int i, AllLangViewHolder allLangViewHolder, MutableLiveData mutableLiveData, CompoundButton compoundButton, boolean z) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) allLangViewHolder, "");
            C8632dsu.c((Object) mutableLiveData, "");
            ((SecondaryLanguage) list.get(i)).setSelected(z);
            allLangViewHolder.updateSelections(list, mutableLiveData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(List list, int i, AllLangViewHolder allLangViewHolder, MutableLiveData mutableLiveData, View view) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) allLangViewHolder, "");
            C8632dsu.c((Object) mutableLiveData, "");
            ((SecondaryLanguage) list.get(i)).setSelected(!((SecondaryLanguage) list.get(i)).getSelected());
            allLangViewHolder.updateSelections(list, mutableLiveData);
            allLangViewHolder.checkbox.setChecked(((SecondaryLanguage) list.get(i)).getSelected());
        }

        public final void updateSelections(List<SecondaryLanguage> list, MutableLiveData<String> mutableLiveData) {
            String d;
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) mutableLiveData, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SecondaryLanguage) obj).getSelected()) {
                    arrayList.add(obj);
                }
            }
            d = C8576dqs.d(arrayList, ",", null, null, 0, null, new drM<SecondaryLanguage, CharSequence>() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter$AllLangViewHolder$updateSelections$2
                @Override // o.drM
                public final CharSequence invoke(SecondaryLanguage secondaryLanguage) {
                    C8632dsu.c((Object) secondaryLanguage, "");
                    return secondaryLanguage.getId();
                }
            }, 30, null);
            mutableLiveData.setValue(d);
        }
    }

    /* loaded from: classes3.dex */
    public static final class PreferredLangViewHolder extends BaseViewHolder {
        public static final int $stable = C1204Sr.d;
        private final C1204Sr preferredLanguageText;

        public final C1204Sr getPreferredLanguageText() {
            return this.preferredLanguageText;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public PreferredLangViewHolder(com.netflix.mediaclient.acquisition.databinding.ItemPreferredLanguageBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r3, r0)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r3.getRoot()
                o.C8632dsu.a(r1, r0)
                r2.<init>(r1)
                o.Sr r3 = r3.preferredLanguageText
                o.C8632dsu.a(r3, r0)
                r2.preferredLanguageText = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter.PreferredLangViewHolder.<init>(com.netflix.mediaclient.acquisition.databinding.ItemPreferredLanguageBinding):void");
        }

        @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter.BaseViewHolder
        public void bind(int i, List<SecondaryLanguage> list, MutableLiveData<String> mutableLiveData) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) mutableLiveData, "");
            this.preferredLanguageText.setText(list.get(i).getCapitalizedLanguage());
        }
    }

    /* loaded from: classes3.dex */
    public static final class PreferredLangDarkViewHolder extends BaseViewHolder {
        public static final int $stable = 8;
        private final CheckBox checkbox;
        private final C1204Sr languageText;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public PreferredLangDarkViewHolder(com.netflix.mediaclient.acquisition.databinding.ItemSecondaryLanguageDarkBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r3, r0)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r3.getRoot()
                o.C8632dsu.a(r1, r0)
                r2.<init>(r1)
                android.widget.CheckBox r1 = r3.secondaryLanguageCheckBox
                o.C8632dsu.a(r1, r0)
                r2.checkbox = r1
                o.Sr r3 = r3.secondaryLanguageText
                o.C8632dsu.a(r3, r0)
                r2.languageText = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter.PreferredLangDarkViewHolder.<init>(com.netflix.mediaclient.acquisition.databinding.ItemSecondaryLanguageDarkBinding):void");
        }

        @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageRecyclerViewAdapter.BaseViewHolder
        public void bind(int i, List<SecondaryLanguage> list, MutableLiveData<String> mutableLiveData) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) mutableLiveData, "");
            this.checkbox.setChecked(true);
            this.checkbox.setEnabled(false);
            this.languageText.setText(list.get(i).getCapitalizedLanguage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            if (this.useDarkTheme) {
                ItemSecondaryLanguageDarkBinding inflate = ItemSecondaryLanguageDarkBinding.inflate(from, viewGroup, false);
                C8632dsu.a(inflate, "");
                return new PreferredLangDarkViewHolder(inflate);
            }
            ItemPreferredLanguageBinding inflate2 = ItemPreferredLanguageBinding.inflate(from, viewGroup, false);
            C8632dsu.a(inflate2, "");
            return new PreferredLangViewHolder(inflate2);
        } else if (this.useDarkTheme) {
            ItemSecondaryLanguageDarkBinding inflate3 = ItemSecondaryLanguageDarkBinding.inflate(from, viewGroup, false);
            C8632dsu.a(inflate3, "");
            CheckBox checkBox = inflate3.secondaryLanguageCheckBox;
            C8632dsu.a(checkBox, "");
            C1204Sr c1204Sr = inflate3.secondaryLanguageText;
            C8632dsu.a(c1204Sr, "");
            ConstraintLayout constraintLayout = inflate3.secondaryLanguageLayout;
            C8632dsu.a(constraintLayout, "");
            ConstraintLayout root = inflate3.getRoot();
            C8632dsu.a(root, "");
            return new AllLangViewHolder(checkBox, c1204Sr, constraintLayout, root);
        } else {
            ItemSecondaryLanguageBinding inflate4 = ItemSecondaryLanguageBinding.inflate(from, viewGroup, false);
            C8632dsu.a(inflate4, "");
            CheckBox checkBox2 = inflate4.secondaryLanguageCheckBox;
            C8632dsu.a(checkBox2, "");
            C1204Sr c1204Sr2 = inflate4.secondaryLanguageText;
            C8632dsu.a(c1204Sr2, "");
            ConstraintLayout constraintLayout2 = inflate4.secondaryLanguageLayout;
            C8632dsu.a(constraintLayout2, "");
            ConstraintLayout root2 = inflate4.getRoot();
            C8632dsu.a(root2, "");
            return new AllLangViewHolder(checkBox2, c1204Sr2, constraintLayout2, root2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.data.get(i).getPreferredLang() ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        C8632dsu.c((Object) baseViewHolder, "");
        baseViewHolder.bind(i, this.data, this.secondaryLanguagesLiveData);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }
}
