package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import java.util.ArrayList;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class DeviceSurveyDeviceContainer extends LinearLayout {
    public static final int $stable = 8;
    private List<DeviceSurveyItem> deviceSurveyItems;
    private List<String> selectedItems;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceSurveyDeviceContainer(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceSurveyDeviceContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ DeviceSurveyDeviceContainer(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSurveyDeviceContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindFieldsToSelectors$default(DeviceSurveyDeviceContainer deviceSurveyDeviceContainer, List list, DeviceSurveyLogger deviceSurveyLogger, MutableLiveData mutableLiveData, int i, Object obj) {
        if ((i & 4) != 0) {
            mutableLiveData = null;
        }
        deviceSurveyDeviceContainer.bindFieldsToSelectors(list, deviceSurveyLogger, mutableLiveData);
    }

    public final void bindFieldsToSelectors(List<DeviceSurveyItem> list, DeviceSurveyLogger deviceSurveyLogger, MutableLiveData<List<String>> mutableLiveData) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) deviceSurveyLogger, "");
        this.deviceSurveyItems = list;
        this.selectedItems = new ArrayList();
        for (DeviceSurveyItem deviceSurveyItem : list) {
            addSelector(deviceSurveyItem.getField(), deviceSurveyItem.getId(), deviceSurveyItem.getDisplayText(), deviceSurveyItem.getImageRes(), deviceSurveyLogger, mutableLiveData);
        }
    }

    public final void addSelector(final BooleanViewModel booleanViewModel, int i, String str, Integer num, final DeviceSurveyLogger deviceSurveyLogger, final MutableLiveData<List<String>> mutableLiveData) {
        C8632dsu.c((Object) booleanViewModel, "");
        C8632dsu.c((Object) deviceSurveyLogger, "");
        Context context = getContext();
        C8632dsu.a(context, "");
        final DeviceView deviceView = new DeviceView(context);
        deviceView.setId(i);
        deviceView.setDeviceSelected(booleanViewModel.getValue());
        deviceView.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyDeviceContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceSurveyDeviceContainer.addSelector$lambda$1(DeviceView.this, this, booleanViewModel, mutableLiveData, deviceSurveyLogger, view);
            }
        });
        if (str != null) {
            deviceView.setText(str);
        }
        if (num != null) {
            deviceView.setImageResource(num.intValue());
        }
        addView(deviceView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSelector$lambda$1(DeviceView deviceView, DeviceSurveyDeviceContainer deviceSurveyDeviceContainer, BooleanViewModel booleanViewModel, MutableLiveData mutableLiveData, DeviceSurveyLogger deviceSurveyLogger, View view) {
        C8632dsu.c((Object) deviceView, "");
        C8632dsu.c((Object) deviceSurveyDeviceContainer, "");
        C8632dsu.c((Object) booleanViewModel, "");
        C8632dsu.c((Object) deviceSurveyLogger, "");
        boolean z = !deviceView.getDeviceSelected();
        deviceView.setDeviceSelected(z);
        if (z) {
            List<String> list = deviceSurveyDeviceContainer.selectedItems;
            if (list != null) {
                list.add(booleanViewModel.getId());
            }
        } else {
            List<String> list2 = deviceSurveyDeviceContainer.selectedItems;
            if (list2 != null) {
                list2.remove(booleanViewModel.getId());
            }
        }
        if (mutableLiveData != null) {
            mutableLiveData.setValue(deviceSurveyDeviceContainer.selectedItems);
        }
        booleanViewModel.setValue(z);
        deviceSurveyLogger.logSelectedDevices(deviceSurveyDeviceContainer.getSelectedDevices());
    }

    public final List<String> getSelectedDevices() {
        ArrayList arrayList = new ArrayList();
        List<DeviceSurveyItem> list = this.deviceSurveyItems;
        if (list != null) {
            for (DeviceSurveyItem deviceSurveyItem : list) {
                if (deviceSurveyItem.getField().getValue()) {
                    arrayList.add(deviceSurveyItem.getField().getId());
                }
            }
        }
        return arrayList;
    }
}
