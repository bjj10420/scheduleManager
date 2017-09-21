package com.example.schedulemanager.vo;

/**
 * 하나의 활동을 나타내는 단위 VO
 */
public class ActivityVO {
    String categoryName;
    String activityName;
    String isFavorite;
    byte[] imageData;

    public ActivityVO() {
    }

    public ActivityVO(String categoryName, String activityName, String isFavorite, byte[] imageData) {
        this.categoryName = categoryName;
        this.activityName = activityName;
        this.isFavorite = isFavorite;
        this.imageData = imageData;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String isFavorite() {
        return isFavorite;
    }

    public void setFavorite(String favorite) {
        isFavorite = favorite;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
}
