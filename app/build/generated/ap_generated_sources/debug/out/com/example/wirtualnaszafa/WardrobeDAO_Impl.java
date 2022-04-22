package com.example.wirtualnaszafa;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WardrobeDAO_Impl implements WardrobeDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WardrobeDB> __insertionAdapterOfWardrobeDB;

  private final EntityDeletionOrUpdateAdapter<WardrobeDB> __deletionAdapterOfWardrobeDB;

  private final EntityDeletionOrUpdateAdapter<WardrobeDB> __updateAdapterOfWardrobeDB;

  public WardrobeDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWardrobeDB = new EntityInsertionAdapter<WardrobeDB>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `WardrobeDB` (`id`,`path`,`tag`,`color`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WardrobeDB value) {
        stmt.bindLong(1, value.getId());
        if (value.getPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPath());
        }
        if (value.getTag() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTag());
        }
        if (value.getColor() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getColor());
        }
      }
    };
    this.__deletionAdapterOfWardrobeDB = new EntityDeletionOrUpdateAdapter<WardrobeDB>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `WardrobeDB` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WardrobeDB value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfWardrobeDB = new EntityDeletionOrUpdateAdapter<WardrobeDB>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `WardrobeDB` SET `id` = ?,`path` = ?,`tag` = ?,`color` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WardrobeDB value) {
        stmt.bindLong(1, value.getId());
        if (value.getPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPath());
        }
        if (value.getTag() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTag());
        }
        if (value.getColor() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getColor());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public void insert(final WardrobeDB wardrobeDB) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWardrobeDB.insert(wardrobeDB);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final WardrobeDB wardrobeDB) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWardrobeDB.handle(wardrobeDB);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final WardrobeDB wardrobeDB) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfWardrobeDB.handle(wardrobeDB);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<WardrobeDB> getAll() {
    final String _sql = "SELECT * FROM WardrobeDB";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfTag = CursorUtil.getColumnIndexOrThrow(_cursor, "tag");
      final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
      final List<WardrobeDB> _result = new ArrayList<WardrobeDB>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WardrobeDB _item;
        _item = new WardrobeDB();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        _item.setPath(_tmpPath);
        final String _tmpTag;
        if (_cursor.isNull(_cursorIndexOfTag)) {
          _tmpTag = null;
        } else {
          _tmpTag = _cursor.getString(_cursorIndexOfTag);
        }
        _item.setTag(_tmpTag);
        final String _tmpColor;
        if (_cursor.isNull(_cursorIndexOfColor)) {
          _tmpColor = null;
        } else {
          _tmpColor = _cursor.getString(_cursorIndexOfColor);
        }
        _item.setColor(_tmpColor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> findPath() {
    final String _sql = "SELECT path FROM WardrobeDB";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
