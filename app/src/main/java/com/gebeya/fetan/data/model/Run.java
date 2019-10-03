package com.gebeya.fetan.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "runs")
public class Run {

    @ColumnInfo
    public double distance;

    @ColumnInfo
    public int time;

    @ColumnInfo(name = "created_at")
    public String createAt;


}
