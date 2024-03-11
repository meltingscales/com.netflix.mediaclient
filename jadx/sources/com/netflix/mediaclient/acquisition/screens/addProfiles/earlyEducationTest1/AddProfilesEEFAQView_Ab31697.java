package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.acquisition.databinding.AddProfilesEeFaqLayoutAb31697Binding;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEViewModel_Ab31697;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesEEFAQView_Ab31697 extends ConstraintLayout {
    public static final int $stable = 8;
    private final AddProfilesEeFaqLayoutAb31697Binding binding;
    private AddProfilesEEFaqRecyclerViewAdapter_Ab31697 faqAdapter;
    private final RecyclerView faqRecyclerView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddProfilesEEFAQView_Ab31697(Context context) {
        this(context, null, 2, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ AddProfilesEEFAQView_Ab31697(Context context, AttributeSet attributeSet, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddProfilesEEFAQView_Ab31697(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C8632dsu.c((Object) context, "");
        AddProfilesEeFaqLayoutAb31697Binding inflate = AddProfilesEeFaqLayoutAb31697Binding.inflate(LayoutInflater.from(context), this, true);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        RecyclerView recyclerView = inflate.faqRecyclerView;
        C8632dsu.a(recyclerView, "");
        this.faqRecyclerView = recyclerView;
    }

    public final void initFAQView(List<AddProfilesEEViewModel_Ab31697.Faq> list) {
        C8632dsu.c((Object) list, "");
        this.faqRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Context context = getContext();
        C8632dsu.a(context, "");
        AddProfilesEEFaqRecyclerViewAdapter_Ab31697 addProfilesEEFaqRecyclerViewAdapter_Ab31697 = new AddProfilesEEFaqRecyclerViewAdapter_Ab31697(context, list);
        this.faqAdapter = addProfilesEEFaqRecyclerViewAdapter_Ab31697;
        this.faqRecyclerView.setAdapter(addProfilesEEFaqRecyclerViewAdapter_Ab31697);
    }
}
