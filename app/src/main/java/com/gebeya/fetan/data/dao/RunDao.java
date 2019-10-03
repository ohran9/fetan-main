package com.gebeya.fetan.data.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.gebeya.fetan.data.model.Run;

import java.util.List;

@Dao
public interface RunDao {

    @Insert
    void addRun(Run run);

    @Query("SELECT * FROM runs")
    List<Run> getAll();
}