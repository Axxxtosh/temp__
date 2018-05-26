package com.uriahsolution.sms.data.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;

import com.uriahsolution.sms.data.model.Item;

import java.util.List;

import retrofit2.http.Query;

@Dao
public interface NotificationDao {

    // Returns a list of all users in the database

    @android.arch.persistence.room.Query("SELECT * FROM notification")
    List<Item> getAll();

    // Inserts multiple users
    @Insert
    void insertAll(Item... items);

    // Deletes a single user
    @Delete
    void delete(Item item);

}
