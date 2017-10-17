package com.example.schedulemanager.panel.managerpanel;


import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import com.example.schedulemanager.R;
import com.example.schedulemanager.helper.DBHelper;
import com.example.schedulemanager.helper.EventHelper;
import com.example.schedulemanager.helper.UIHelper;
import com.example.schedulemanager.vo.ActivityVO;

import static com.example.schedulemanager.helper.DataHelper.dataHelper;
import static com.example.schedulemanager.helper.EventHelper.eventHelper;
import static com.example.schedulemanager.helper.UIHelper.uiHelper;

public class ManagerPanelEvent implements View.OnClickListener{

    ManagerPanel managerPanel;

    public ManagerPanelEvent(ManagerPanel managerPanel) {
        this.managerPanel = managerPanel;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.managerCloseBtn:
                managerCloseBtnEvent();
                break;

            default:
                menubarTitleItemClickEvent(view);
        }
    }

    private void managerCloseBtnEvent() {
        managerPanelLayoutOff();
        etcLayoutON();
        redrawMainFavoritePanel();
        resetMainFavoritePanelEvents();
    }

    private void resetMainFavoritePanelEvents() {
        eventHelper.setDragEvents();
    }

    private void redrawMainFavoritePanel() {
        uiHelper.clearButtonPanel();
        uiHelper.newInitButtonPanel(dataHelper.getActivities());
    }

    private void etcLayoutON() {
        eventHelper.getEtcPanel().setEtcLayoutVisible(true);
    }

    private void managerPanelLayoutOff() {
        managerPanel.setManagerLayoutVisible(false);
    }

    private void menubarTitleItemClickEvent(View view) {
        ViewGroup viewParent = (ViewGroup) view.getParent();
        View detailView = viewParent.getChildAt(viewParent.indexOfChild(view) + 1);
        detailView.setVisibility(detailView.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
    }

    private void updateActivitiesMap(boolean isFaovriteChecked, ActivityVO activityVO) {
        activityVO.setFavorite(isFaovriteChecked ? "T" : "F");
    }

    private void updateDBFavoriteData(boolean isFaovriteChecked, String activityName) {
        DBHelper.dbHelper.updateFavoriteChecked(activityName, isFaovriteChecked ? "T" : "F");
    }

    public void checkBoxEvent(boolean b, ActivityVO activityVO) {
        updateDBFavoriteData(b, activityVO.getActivityName());
        updateActivitiesMap(b, activityVO);
    }
}