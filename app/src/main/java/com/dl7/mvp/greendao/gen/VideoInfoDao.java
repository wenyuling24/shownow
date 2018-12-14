package com.dl7.mvp.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dl7.shownew.local.table.VideoInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VIDEO_INFO".
*/
public class VideoInfoDao extends AbstractDao<VideoInfo, String> {

    public static final String TABLENAME = "VIDEO_INFO";

    /**
     * Properties of entity VideoInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Vid = new Property(0, String.class, "vid", true, "VID");
        public final static Property Mp4Hd_url = new Property(1, String.class, "mp4Hd_url", false, "MP4_HD_URL");
        public final static Property Cover = new Property(2, String.class, "cover", false, "COVER");
        public final static Property Title = new Property(3, String.class, "title", false, "TITLE");
        public final static Property Sectiontitle = new Property(4, String.class, "sectiontitle", false, "SECTIONTITLE");
        public final static Property Mp4_url = new Property(5, String.class, "mp4_url", false, "MP4_URL");
        public final static Property Length = new Property(6, int.class, "length", false, "LENGTH");
        public final static Property M3u8Hd_url = new Property(7, String.class, "m3u8Hd_url", false, "M3U8_HD_URL");
        public final static Property Ptime = new Property(8, String.class, "ptime", false, "PTIME");
        public final static Property M3u8_url = new Property(9, String.class, "m3u8_url", false, "M3U8_URL");
        public final static Property VideoUrl = new Property(10, String.class, "videoUrl", false, "VIDEO_URL");
        public final static Property TotalSize = new Property(11, long.class, "totalSize", false, "TOTAL_SIZE");
        public final static Property LoadedSize = new Property(12, long.class, "loadedSize", false, "LOADED_SIZE");
        public final static Property DownloadStatus = new Property(13, int.class, "downloadStatus", false, "DOWNLOAD_STATUS");
        public final static Property DownloadSpeed = new Property(14, long.class, "downloadSpeed", false, "DOWNLOAD_SPEED");
        public final static Property IsCollect = new Property(15, boolean.class, "isCollect", false, "IS_COLLECT");
    }


    public VideoInfoDao(DaoConfig config) {
        super(config);
    }
    
    public VideoInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VIDEO_INFO\" (" + //
                "\"VID\" TEXT PRIMARY KEY NOT NULL ," + // 0: vid
                "\"MP4_HD_URL\" TEXT," + // 1: mp4Hd_url
                "\"COVER\" TEXT," + // 2: cover
                "\"TITLE\" TEXT," + // 3: title
                "\"SECTIONTITLE\" TEXT," + // 4: sectiontitle
                "\"MP4_URL\" TEXT," + // 5: mp4_url
                "\"LENGTH\" INTEGER NOT NULL ," + // 6: length
                "\"M3U8_HD_URL\" TEXT," + // 7: m3u8Hd_url
                "\"PTIME\" TEXT," + // 8: ptime
                "\"M3U8_URL\" TEXT," + // 9: m3u8_url
                "\"VIDEO_URL\" TEXT," + // 10: videoUrl
                "\"TOTAL_SIZE\" INTEGER NOT NULL ," + // 11: totalSize
                "\"LOADED_SIZE\" INTEGER NOT NULL ," + // 12: loadedSize
                "\"DOWNLOAD_STATUS\" INTEGER NOT NULL ," + // 13: downloadStatus
                "\"DOWNLOAD_SPEED\" INTEGER NOT NULL ," + // 14: downloadSpeed
                "\"IS_COLLECT\" INTEGER NOT NULL );"); // 15: isCollect
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VIDEO_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VideoInfo entity) {
        stmt.clearBindings();
 
        String vid = entity.getVid();
        if (vid != null) {
            stmt.bindString(1, vid);
        }
 
        String mp4Hd_url = entity.getMp4Hd_url();
        if (mp4Hd_url != null) {
            stmt.bindString(2, mp4Hd_url);
        }
 
        String cover = entity.getCover();
        if (cover != null) {
            stmt.bindString(3, cover);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String sectiontitle = entity.getSectiontitle();
        if (sectiontitle != null) {
            stmt.bindString(5, sectiontitle);
        }
 
        String mp4_url = entity.getMp4_url();
        if (mp4_url != null) {
            stmt.bindString(6, mp4_url);
        }
        stmt.bindLong(7, entity.getLength());
 
        String m3u8Hd_url = entity.getM3u8Hd_url();
        if (m3u8Hd_url != null) {
            stmt.bindString(8, m3u8Hd_url);
        }
 
        String ptime = entity.getPtime();
        if (ptime != null) {
            stmt.bindString(9, ptime);
        }
 
        String m3u8_url = entity.getM3u8_url();
        if (m3u8_url != null) {
            stmt.bindString(10, m3u8_url);
        }
 
        String videoUrl = entity.getVideoUrl();
        if (videoUrl != null) {
            stmt.bindString(11, videoUrl);
        }
        stmt.bindLong(12, entity.getTotalSize());
        stmt.bindLong(13, entity.getLoadedSize());
        stmt.bindLong(14, entity.getDownloadStatus());
        stmt.bindLong(15, entity.getDownloadSpeed());
        stmt.bindLong(16, entity.getIsCollect() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VideoInfo entity) {
        stmt.clearBindings();
 
        String vid = entity.getVid();
        if (vid != null) {
            stmt.bindString(1, vid);
        }
 
        String mp4Hd_url = entity.getMp4Hd_url();
        if (mp4Hd_url != null) {
            stmt.bindString(2, mp4Hd_url);
        }
 
        String cover = entity.getCover();
        if (cover != null) {
            stmt.bindString(3, cover);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String sectiontitle = entity.getSectiontitle();
        if (sectiontitle != null) {
            stmt.bindString(5, sectiontitle);
        }
 
        String mp4_url = entity.getMp4_url();
        if (mp4_url != null) {
            stmt.bindString(6, mp4_url);
        }
        stmt.bindLong(7, entity.getLength());
 
        String m3u8Hd_url = entity.getM3u8Hd_url();
        if (m3u8Hd_url != null) {
            stmt.bindString(8, m3u8Hd_url);
        }
 
        String ptime = entity.getPtime();
        if (ptime != null) {
            stmt.bindString(9, ptime);
        }
 
        String m3u8_url = entity.getM3u8_url();
        if (m3u8_url != null) {
            stmt.bindString(10, m3u8_url);
        }
 
        String videoUrl = entity.getVideoUrl();
        if (videoUrl != null) {
            stmt.bindString(11, videoUrl);
        }
        stmt.bindLong(12, entity.getTotalSize());
        stmt.bindLong(13, entity.getLoadedSize());
        stmt.bindLong(14, entity.getDownloadStatus());
        stmt.bindLong(15, entity.getDownloadSpeed());
        stmt.bindLong(16, entity.getIsCollect() ? 1L: 0L);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public VideoInfo readEntity(Cursor cursor, int offset) {
        VideoInfo entity = new VideoInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // vid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // mp4Hd_url
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // cover
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // title
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // sectiontitle
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // mp4_url
            cursor.getInt(offset + 6), // length
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // m3u8Hd_url
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // ptime
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // m3u8_url
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // videoUrl
            cursor.getLong(offset + 11), // totalSize
            cursor.getLong(offset + 12), // loadedSize
            cursor.getInt(offset + 13), // downloadStatus
            cursor.getLong(offset + 14), // downloadSpeed
            cursor.getShort(offset + 15) != 0 // isCollect
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VideoInfo entity, int offset) {
        entity.setVid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setMp4Hd_url(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCover(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSectiontitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMp4_url(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLength(cursor.getInt(offset + 6));
        entity.setM3u8Hd_url(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPtime(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setM3u8_url(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setVideoUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTotalSize(cursor.getLong(offset + 11));
        entity.setLoadedSize(cursor.getLong(offset + 12));
        entity.setDownloadStatus(cursor.getInt(offset + 13));
        entity.setDownloadSpeed(cursor.getLong(offset + 14));
        entity.setIsCollect(cursor.getShort(offset + 15) != 0);
     }
    
    @Override
    protected final String updateKeyAfterInsert(VideoInfo entity, long rowId) {
        return entity.getVid();
    }
    
    @Override
    public String getKey(VideoInfo entity) {
        if(entity != null) {
            return entity.getVid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(VideoInfo entity) {
        return entity.getVid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
