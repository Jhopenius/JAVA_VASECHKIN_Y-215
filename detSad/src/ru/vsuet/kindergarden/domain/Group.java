package ru.vsuet.kindergarden.domain;

import java.util.ArrayList;
import java.util.List;
public class Group {

    private List<Kid> kids;
    private String title;
    private int groupId;

    public Group (String title, int groupId) {
        this.title = title;
        this.groupId = groupId;
        this.kids = new ArrayList<>();
    }

    public void addKid(Kid kid) {
        kids.add(kid);
    }

    public void removeKid(Kid kid) {
        kids.removeIf(k -> k.getFIO().equalsIgnoreCase(kid.getFIO()));
    }

    public int getGroupId() {
        return groupId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<Kid> getKids() {
        return new ArrayList<>(kids);
    }

    @Override
    public String toString() {
        return "Group: " + '\n' + "Title : " + title + ", GroupId : " + groupId;
    }
}
