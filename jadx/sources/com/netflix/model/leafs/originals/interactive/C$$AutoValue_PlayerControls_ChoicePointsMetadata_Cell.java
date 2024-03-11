package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell extends PlayerControls.ChoicePointsMetadata.Cell {
    private final List<SourceRect> buttons;
    private final List<SourceRect> choicePosition;
    private final PlayerControls.ChoicePointsMetadata.Cell.Focus focus;
    private final PlayerControls.ChoicePointsMetadata.Cell.MainView mainView;
    private final SourceRect rect;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell
    public List<SourceRect> buttons() {
        return this.buttons;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell
    public List<SourceRect> choicePosition() {
        return this.choicePosition;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell
    public PlayerControls.ChoicePointsMetadata.Cell.Focus focus() {
        return this.focus;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell
    public PlayerControls.ChoicePointsMetadata.Cell.MainView mainView() {
        return this.mainView;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell
    public SourceRect rect() {
        return this.rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell(SourceRect sourceRect, List<SourceRect> list, List<SourceRect> list2, PlayerControls.ChoicePointsMetadata.Cell.MainView mainView, PlayerControls.ChoicePointsMetadata.Cell.Focus focus) {
        this.rect = sourceRect;
        this.buttons = list;
        this.choicePosition = list2;
        this.mainView = mainView;
        this.focus = focus;
    }

    public String toString() {
        return "Cell{rect=" + this.rect + ", buttons=" + this.buttons + ", choicePosition=" + this.choicePosition + ", mainView=" + this.mainView + ", focus=" + this.focus + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.Cell) {
            PlayerControls.ChoicePointsMetadata.Cell cell = (PlayerControls.ChoicePointsMetadata.Cell) obj;
            SourceRect sourceRect = this.rect;
            if (sourceRect != null ? sourceRect.equals(cell.rect()) : cell.rect() == null) {
                List<SourceRect> list = this.buttons;
                if (list != null ? list.equals(cell.buttons()) : cell.buttons() == null) {
                    List<SourceRect> list2 = this.choicePosition;
                    if (list2 != null ? list2.equals(cell.choicePosition()) : cell.choicePosition() == null) {
                        PlayerControls.ChoicePointsMetadata.Cell.MainView mainView = this.mainView;
                        if (mainView != null ? mainView.equals(cell.mainView()) : cell.mainView() == null) {
                            PlayerControls.ChoicePointsMetadata.Cell.Focus focus = this.focus;
                            if (focus == null) {
                                if (cell.focus() == null) {
                                    return true;
                                }
                            } else if (focus.equals(cell.focus())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        SourceRect sourceRect = this.rect;
        int hashCode = sourceRect == null ? 0 : sourceRect.hashCode();
        List<SourceRect> list = this.buttons;
        int hashCode2 = list == null ? 0 : list.hashCode();
        List<SourceRect> list2 = this.choicePosition;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        PlayerControls.ChoicePointsMetadata.Cell.MainView mainView = this.mainView;
        int hashCode4 = mainView == null ? 0 : mainView.hashCode();
        PlayerControls.ChoicePointsMetadata.Cell.Focus focus = this.focus;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (focus != null ? focus.hashCode() : 0);
    }
}
