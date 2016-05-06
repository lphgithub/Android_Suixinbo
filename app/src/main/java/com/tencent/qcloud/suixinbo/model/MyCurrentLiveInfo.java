package com.tencent.qcloud.suixinbo.model;

/**
 * Created by admin on 16/4/22.
 */
public class MyCurrentLiveInfo {
    private static int members;
    private static int admires;
    private static String title;
    private static double lat1;
    private static double long1;
    private static String address;

    public static int RoomNum;

    public static String hostID;

    public static int currentRequestCount = 0;

    public static int getCurrentRequestCount() {
        return currentRequestCount;
    }

    public static int getIndexView() {
        return indexView;
    }

    public static void setIndexView(int indexView) {
        MyCurrentLiveInfo.indexView = indexView;
    }

    public static int indexView = 0;

    public static void setCurrentRequestCount(int currentRequestCount) {
        MyCurrentLiveInfo.currentRequestCount = currentRequestCount;
    }

    public static String getHostID() {
        return hostID;
    }

    public static void setHostID(String hostID) {
        MyCurrentLiveInfo.hostID = hostID;
    }

    public static int getMembers() {
        return members;
    }

    public static void setMembers(int members) {
        MyCurrentLiveInfo.members = members;
    }

    public static int getAdmires() {
        return admires;
    }

    public static void setAdmires(int admires) {
        MyCurrentLiveInfo.admires = admires;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        MyCurrentLiveInfo.title = title;
    }

    public static double getLat1() {
        return lat1;
    }

    public static void setLat1(double lat1) {
        MyCurrentLiveInfo.lat1 = lat1;
    }

    public static double getLong1() {
        return long1;
    }

    public static void setLong1(double long1) {
        MyCurrentLiveInfo.long1 = long1;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        MyCurrentLiveInfo.address = address;
    }

    public static int getRoomNum() {
        return RoomNum;
    }

    public static void setRoomNum(int roomNum) {
        RoomNum = roomNum;
    }


    public static String getChatRoomId() {
        return "" + RoomNum;
    }
}
