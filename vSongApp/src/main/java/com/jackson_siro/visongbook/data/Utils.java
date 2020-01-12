package com.jackson_siro.visongbook.data;

public class Utils {

    //DATABASE NAME
    public static final String DATABASE_NAME = "vSongDatabase";
    public static final int DATABASE_VERSION = 3;

    //DATABASE STRINGS
    public static final String TBL_BOOKS = "as_books";
    public static final String TBL_SONGS = "as_songs";
    public static final String TBL_USERS = "as_users";

    public static final String BOOKID = "bookid";
    public static final String CATEGORYID = "categoryid";
    public static final String NUMBER = "number";
    public static final String ALIAS = "alias";
    public static final String TITLE = "title";
    public static final String TAGS = "tags";
    public static final String QCOUNT = "qcount";
    public static final String POSITION = "position";
    public static final String CONTENT = "content";
    public static final String BACKPATH = "backpath";
    public static final String WHAT = "metawhat";
    public static final String WHEN = "metawhen";
    public static final String WHERE = "metawhere";
    public static final String WHO = "metawho";

    public static final String SONGID = "songid";
    public static final String POSTID = "postid";
    public static final String BASETYPE = "basetype";
    public static final String ACOUNT = "acount";
    public static final String ISFAV = "isfav";
    public static final String NETTHUMBS = "netthumbs";
    public static final String VIEWS = "views";
    public static final String CREATED = "created";
    public static final String UPDATED = "updated";
    public static final String USERID = "userid";
    public static final String POINTS = "points";
    public static final String FLAGS = "flags";
    public static final String EMAIL = "email";
    public static final String HANDLE = "handle";
    public static final String AVATARBLOBID = "avatarblobid";
    public static final String AVATARWIDTH = "avatarwidth";
    public static final String AVATARHEIGHT = "avatarheight";

    //CREATE CATEGORIES TABLE SQL
    public static final String CREATE_BOOKS_TABLE_SQL =
            "CREATE TABLE " + TBL_BOOKS + " ("
                    + BOOKID + " INTEGER PRIMARY KEY, "
                    + CATEGORYID + " INTEGER, "
                    + TITLE + " TEXT, "
                    + TAGS + " TEXT, "
                    + QCOUNT + " INTEGER, "
                    + POSITION + " INTEGER, "
                    + CONTENT + " TEXT, "
                    + BACKPATH + " TEXT);";

    //CREATE POSTS TABLE SQL
    public static final String CREATE_SONGS_TABLE_SQL =
            "CREATE TABLE " + TBL_SONGS + " ("
                    + SONGID + " INTEGER PRIMARY KEY, "
                    + POSTID + " INTEGER, "
                    + BOOKID + " INTEGER, "
                    + CATEGORYID + " INTEGER, "
                    + BASETYPE + " TEXT, "
                    + NUMBER + " INTEGER, "
                    + ALIAS + " TEXT, "
                    + TITLE + " TEXT, "
                    + TAGS + " TEXT, "
                    + CONTENT + " TEXT, "
                    + CREATED + " TEXT, "
                    + UPDATED + " TEXT, "
                    + WHAT + " TEXT, "
                    + WHEN + " TEXT, "
                    + WHERE + " TEXT, "
                    + WHO + " TEXT, "
                    + NETTHUMBS + " INTEGER, "
                    + ISFAV + " INTEGER, "
                    + VIEWS + " INTEGER, "
                    + ACOUNT + " INTEGER, "
                    + USERID + " INTEGER);";

    //CREATE USERS TABLE SQL
    public static final String CREATE_USERS_TABLE_SQL =
            "CREATE TABLE " + TBL_USERS + " ("
                    + USERID + " INTEGER PRIMARY KEY, "
                    + HANDLE + " TEXT, "
                    + POINTS + " TEXT, "
                    + FLAGS + " TEXT, "
                    + EMAIL + " TEXT, "
                    + AVATARBLOBID + " INTEGER, "
                    + AVATARWIDTH + " INTEGER, "
                    + AVATARHEIGHT + " INTEGER);";

    public static final String SONG_SELECT_SQL =
            "SELECT " + SONGID + ", " + TBL_SONGS + "." + BOOKID + ", " + NUMBER + ", " + ALIAS + ", " + TBL_SONGS + "." + TITLE + ", "
                    + TBL_SONGS + "." + TAGS + ", " + TBL_SONGS + "." + CONTENT + ", " + TBL_BOOKS + "." + TITLE + ", " + ISFAV + ", "
                    + CREATED + ", " + UPDATED + " FROM " + TBL_SONGS
                    + " INNER JOIN " + TBL_BOOKS + " ON " + TBL_BOOKS + "." + CATEGORYID + "=" + TBL_SONGS + "." + CATEGORYID;

    public static final String NOTE_SELECT_SQL =
            "SELECT " + SONGID + ", " + BOOKID + ", " + NUMBER + ", " + ALIAS + ", " + TITLE + ", " + TAGS + ", " + CONTENT + ", "
                    + ISFAV + ", " + CREATED + ", " + UPDATED + " FROM " + TBL_SONGS;
}