package com.michaelmagdy.ebookshop.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "categories_table")
public class Category {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "category_name")
    private String categoryName;

    @ColumnInfo(name = "category_description")
    private String categoryDescription;

    public Category() {
    }

    public Category(int id, String categoryName, String categoryDescription) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;

    }


    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;

    }


    @Override
    public String toString() {
        return this.categoryName;
    }
}
