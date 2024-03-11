package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.ShowedLess;
import com.netflix.cl.model.event.discrete.ShowedMore;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.databinding.AddProfilesEeFaqItemLayoutAb31697Binding;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEViewModel_Ab31697;
import java.util.List;
import o.C1204Sr;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesEEFaqRecyclerViewAdapter_Ab31697 extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    private final Context context;
    private final List<AddProfilesEEViewModel_Ab31697.Faq> faqList;

    public AddProfilesEEFaqRecyclerViewAdapter_Ab31697(Context context, List<AddProfilesEEViewModel_Ab31697.Faq> list) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) list, "");
        this.context = context;
        this.faqList = list;
    }

    /* loaded from: classes3.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final C1204Sr answerTexView;
        private final ImageView iconImageView;
        private final C1204Sr questionTexView;

        public final C1204Sr getAnswerTexView() {
            return this.answerTexView;
        }

        public final ImageView getIconImageView() {
            return this.iconImageView;
        }

        public final C1204Sr getQuestionTexView() {
            return this.questionTexView;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(AddProfilesEeFaqItemLayoutAb31697Binding addProfilesEeFaqItemLayoutAb31697Binding) {
            super(addProfilesEeFaqItemLayoutAb31697Binding.getRoot());
            C8632dsu.c((Object) addProfilesEeFaqItemLayoutAb31697Binding, "");
            C1204Sr c1204Sr = addProfilesEeFaqItemLayoutAb31697Binding.question;
            C8632dsu.a(c1204Sr, "");
            this.questionTexView = c1204Sr;
            C1204Sr c1204Sr2 = addProfilesEeFaqItemLayoutAb31697Binding.answer;
            C8632dsu.a(c1204Sr2, "");
            this.answerTexView = c1204Sr2;
            ImageView imageView = addProfilesEeFaqItemLayoutAb31697Binding.icon;
            C8632dsu.a(imageView, "");
            this.iconImageView = imageView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        AddProfilesEeFaqItemLayoutAb31697Binding inflate = AddProfilesEeFaqItemLayoutAb31697Binding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C8632dsu.a(inflate, "");
        return new ViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        Object f;
        C8632dsu.c((Object) viewHolder, "");
        f = C8576dqs.f((List<? extends Object>) this.faqList, i);
        final AddProfilesEEViewModel_Ab31697.Faq faq = (AddProfilesEEViewModel_Ab31697.Faq) f;
        if (faq != null) {
            viewHolder.getQuestionTexView().setText(faq.getQuestion());
            viewHolder.getAnswerTexView().setText(faq.getAnswer());
            viewHolder.getIconImageView().setImageDrawable(getDrawableInColor(R.drawable.ic_test1_earlyedu_chevron_right));
            if (faq.getFaqExpanded()) {
                viewHolder.getIconImageView().setImageDrawable(getDrawableInColor(R.drawable.ic_test1_earlyedu_chevron_down));
                viewHolder.getAnswerTexView().setVisibility(0);
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFaqRecyclerViewAdapter_Ab31697$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddProfilesEEFaqRecyclerViewAdapter_Ab31697.onBindViewHolder$lambda$0(AddProfilesEEViewModel_Ab31697.Faq.this, viewHolder, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AddProfilesEEViewModel_Ab31697.Faq faq, ViewHolder viewHolder, AddProfilesEEFaqRecyclerViewAdapter_Ab31697 addProfilesEEFaqRecyclerViewAdapter_Ab31697, View view) {
        C8632dsu.c((Object) viewHolder, "");
        C8632dsu.c((Object) addProfilesEEFaqRecyclerViewAdapter_Ab31697, "");
        if (faq.getFaqExpanded()) {
            viewHolder.getIconImageView().setImageDrawable(addProfilesEEFaqRecyclerViewAdapter_Ab31697.getDrawableInColor(R.drawable.ic_test1_earlyedu_chevron_right));
            viewHolder.getAnswerTexView().setVisibility(8);
            faq.setFaqExpanded(false);
            Logger.INSTANCE.logEvent(new ShowedLess(AppView.addProfile, null, CommandValue.ShowLessCommand, null));
            return;
        }
        viewHolder.getIconImageView().setImageDrawable(addProfilesEEFaqRecyclerViewAdapter_Ab31697.getDrawableInColor(R.drawable.ic_test1_earlyedu_chevron_down));
        viewHolder.getAnswerTexView().setVisibility(0);
        faq.setFaqExpanded(true);
        Logger.INSTANCE.logEvent(new ShowedMore(AppView.addProfile, null, CommandValue.ShowMoreCommand, null));
    }

    public final Drawable getDrawableInColor(int i) {
        Drawable drawable = this.context.getDrawable(i);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(this.context, R.color.early_education_blue));
        }
        return drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.faqList.size();
    }
}
