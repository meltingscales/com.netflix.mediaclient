package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8632dsu;
import o.InterfaceC0952Ix;
import o.InterfaceC5193buD;

/* loaded from: classes6.dex */
public final class DpLiteDetailsFalkorLeaf extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5193buD {
    private final String quickDrawI18nRating;
    private final boolean quickDrawInQueue;
    private final RecommendedTrailer quickDrawRecommendedTrailer;
    private String year;
    private final String quickDrawYear = this.year;
    private String certificationValue;
    private final String quickDrawCertificationValue = this.certificationValue;
    private String certificationBoardId;
    private final String quickDrawCertificationBoardId = this.certificationBoardId;
    private String certificationLevel;
    private final String quickDrawCertificationLevel = this.certificationLevel;
    private String certificationRatingId;
    private final String quickDrawCertificationRatingId = this.certificationRatingId;
    private String seasonNumLabel;
    private final String quickDrawSeasonNumLabel = this.seasonNumLabel;
    private String synopsis;
    private final String quickDrawSynopsis = this.synopsis;
    private int displayRuntime;
    private final int quickDrawRuntime = this.displayRuntime;
    private boolean isInteractiveContent;
    private final boolean quickDrawIsInteractiveContent = this.isInteractiveContent;

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationBoardId() {
        return this.quickDrawCertificationBoardId;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationLevel() {
        return this.quickDrawCertificationLevel;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationRatingId() {
        return this.quickDrawCertificationRatingId;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationValue() {
        return this.quickDrawCertificationValue;
    }

    public String getQuickDrawI18nRating() {
        return this.quickDrawI18nRating;
    }

    @Override // o.InterfaceC5193buD
    public boolean getQuickDrawInQueue() {
        return this.quickDrawInQueue;
    }

    public boolean getQuickDrawIsInteractiveContent() {
        return this.quickDrawIsInteractiveContent;
    }

    public RecommendedTrailer getQuickDrawRecommendedTrailer() {
        return this.quickDrawRecommendedTrailer;
    }

    @Override // o.InterfaceC5193buD
    public int getQuickDrawRuntime() {
        return this.quickDrawRuntime;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawSeasonNumLabel() {
        return this.quickDrawSeasonNumLabel;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawSynopsis() {
        return this.quickDrawSynopsis;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawYear() {
        return this.quickDrawYear;
    }

    public DpLiteDetailsFalkorLeaf() {
        throw new IllegalStateException("This is volatile information that should not be accessed from this leaf");
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                switch (key.hashCode()) {
                    case -1423648832:
                        if (key.equals("certLevel")) {
                            this.certificationLevel = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -1414541907:
                        if (key.equals("certValue")) {
                            this.certificationValue = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -856796708:
                        if (key.equals("certRatingId")) {
                            this.certificationRatingId = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 3704893:
                        if (key.equals(SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR)) {
                            this.year = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 434072408:
                        if (key.equals("isInteractive")) {
                            this.isInteractiveContent = value.getAsBoolean();
                            break;
                        } else {
                            continue;
                        }
                    case 1550009336:
                        if (key.equals("runTime")) {
                            this.displayRuntime = value.getAsInt();
                            break;
                        } else {
                            continue;
                        }
                    case 1818081699:
                        if (key.equals("seasonNum")) {
                            this.seasonNumLabel = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 1828656532:
                        if (key.equals("synopsis")) {
                            this.synopsis = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 1950217181:
                        if (key.equals("certBoardId")) {
                            this.certificationBoardId = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }
}
