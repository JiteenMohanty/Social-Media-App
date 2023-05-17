package com.example.socialmedia.Model;

public class StoryModel {
    int story, storyType, profile_image;
    String userName;


    public StoryModel(int story, int storyType, int profile_image, String userName) {
        this.story = story;
        this.storyType = storyType;
        this.profile_image = profile_image;
        this.userName = userName;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }

    public int getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
