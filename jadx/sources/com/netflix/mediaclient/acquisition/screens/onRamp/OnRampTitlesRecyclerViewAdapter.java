package com.netflix.mediaclient.acquisition.screens.onRamp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.databinding.GridItemOnrampTitleBinding;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8632dsu;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class OnRampTitlesRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    private final List<OnRampTitle> data;
    private final OnRampLogger onRampLogger;
    private final MutableLiveData<String> titleSelectionLiveData;

    public final List<OnRampTitle> getData() {
        return this.data;
    }

    public OnRampTitlesRecyclerViewAdapter(List<OnRampTitle> list, MutableLiveData<String> mutableLiveData, OnRampLogger onRampLogger) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) mutableLiveData, "");
        C8632dsu.c((Object) onRampLogger, "");
        this.data = list;
        this.titleSelectionLiveData = mutableLiveData;
        this.onRampLogger = onRampLogger;
    }

    /* loaded from: classes3.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final NetflixImageView imageView;
        private final FrameLayout selectedOverlay;

        public final NetflixImageView getImageView() {
            return this.imageView;
        }

        public final FrameLayout getSelectedOverlay() {
            return this.selectedOverlay;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(GridItemOnrampTitleBinding gridItemOnrampTitleBinding) {
            super(gridItemOnrampTitleBinding.getRoot());
            C8632dsu.c((Object) gridItemOnrampTitleBinding, "");
            NetflixImageView netflixImageView = gridItemOnrampTitleBinding.titleImage;
            C8632dsu.a(netflixImageView, "");
            this.imageView = netflixImageView;
            FrameLayout frameLayout = gridItemOnrampTitleBinding.selectedOverlay;
            C8632dsu.a(frameLayout, "");
            this.selectedOverlay = frameLayout;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        GridItemOnrampTitleBinding inflate = GridItemOnrampTitleBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C8632dsu.a(inflate, "");
        return new ViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        C8632dsu.c((Object) viewHolder, "");
        final OnRampTitle onRampTitle = this.data.get(i);
        viewHolder.getImageView().showImage(new ShowImageRequest().a(onRampTitle.getUrl()).d(Integer.valueOf(C9834xU.c.t)));
        viewHolder.getImageView().setContentDescription(onRampTitle.getTitle());
        View view = viewHolder.itemView;
        C8632dsu.a(view, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.onRamp.OnRampTitlesRecyclerViewAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OnRampTitlesRecyclerViewAdapter.onBindViewHolder$lambda$0(OnRampTitle.this, viewHolder, this, view2);
            }
        });
        view.setClickable(true);
        viewHolder.getSelectedOverlay().setVisibility(onRampTitle.getSelected() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(OnRampTitle onRampTitle, ViewHolder viewHolder, OnRampTitlesRecyclerViewAdapter onRampTitlesRecyclerViewAdapter, View view) {
        C8632dsu.c((Object) onRampTitle, "");
        C8632dsu.c((Object) viewHolder, "");
        C8632dsu.c((Object) onRampTitlesRecyclerViewAdapter, "");
        onRampTitle.setSelected(!onRampTitle.getSelected());
        viewHolder.itemView.setSelected(onRampTitle.getSelected());
        viewHolder.getSelectedOverlay().setVisibility(onRampTitle.getSelected() ? 0 : 8);
        onRampTitlesRecyclerViewAdapter.updateSelections();
        onRampTitlesRecyclerViewAdapter.onRampLogger.logSelectTitle(onRampTitle.getId(), onRampTitle.getSelected());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    public final void updateSelections() {
        MutableLiveData<String> mutableLiveData = this.titleSelectionLiveData;
        List<OnRampTitle> list = this.data;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((OnRampTitle) obj).getSelected()) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        String str = "";
        for (Object obj2 : arrayList) {
            if (i < 0) {
                C8569dql.h();
            }
            OnRampTitle onRampTitle = (OnRampTitle) obj2;
            String str2 = i == 0 ? "" : ",";
            str = str + str2 + onRampTitle.getId();
            i++;
        }
        mutableLiveData.setValue(str);
    }
}
