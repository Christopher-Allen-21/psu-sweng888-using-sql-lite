package models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ProductDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "products_database";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "products";

    private static final String KEY_ID = "id";

    private static final String KEY_NAME = "name";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_SELLER = "seller";
    private static final String KEY_PRICE = "price";
    private static final String KEY_PICTURE = "picture";

    public ProductDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String QUERY_CREATE_PRODUCTS_TABLE = "CREATE TABLE " + TABLE_NAME + "(" +
                KEY_ID + " INTEGER PRIMARY KEY, " +
                KEY_NAME + " TEXT," +
                KEY_DESCRIPTION + " TEXT," +
                KEY_SELLER + " TEXT," +
                KEY_PRICE + " DOUBLE," +
                KEY_PICTURE + " TEXT" +
                ")";

        db.execSQL(QUERY_CREATE_PRODUCTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
